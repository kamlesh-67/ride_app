/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rideapp.publishride.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.rideapp.publishride.exception.NoSuchlocationsException;
import com.rideapp.publishride.model.impl.locationsImpl;
import com.rideapp.publishride.model.impl.locationsModelImpl;
import com.rideapp.publishride.model.locations;
import com.rideapp.publishride.model.locationsTable;
import com.rideapp.publishride.service.persistence.impl.constants.RideappPersistenceConstants;
import com.rideapp.publishride.service.persistence.locationsPersistence;
import com.rideapp.publishride.service.persistence.locationsUtil;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the locations service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = locationsPersistence.class)
public class locationsPersistenceImpl
	extends BasePersistenceImpl<locations> implements locationsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>locationsUtil</code> to access the locations persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		locationsImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public locationsPersistenceImpl() {
		setModelClass(locations.class);

		setModelImplClass(locationsImpl.class);
		setModelPKClass(long.class);

		setTable(locationsTable.INSTANCE);
	}

	/**
	 * Caches the locations in the entity cache if it is enabled.
	 *
	 * @param locations the locations
	 */
	@Override
	public void cacheResult(locations locations) {
		entityCache.putResult(
			locationsImpl.class, locations.getPrimaryKey(), locations);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the locationses in the entity cache if it is enabled.
	 *
	 * @param locationses the locationses
	 */
	@Override
	public void cacheResult(List<locations> locationses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (locationses.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (locations locations : locationses) {
			if (entityCache.getResult(
					locationsImpl.class, locations.getPrimaryKey()) == null) {

				cacheResult(locations);
			}
		}
	}

	/**
	 * Clears the cache for all locationses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(locationsImpl.class);

		finderCache.clearCache(locationsImpl.class);
	}

	/**
	 * Clears the cache for the locations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(locations locations) {
		entityCache.removeResult(locationsImpl.class, locations);
	}

	@Override
	public void clearCache(List<locations> locationses) {
		for (locations locations : locationses) {
			entityCache.removeResult(locationsImpl.class, locations);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(locationsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(locationsImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new locations with the primary key. Does not add the locations to the database.
	 *
	 * @param locationsId the primary key for the new locations
	 * @return the new locations
	 */
	@Override
	public locations create(long locationsId) {
		locations locations = new locationsImpl();

		locations.setNew(true);
		locations.setPrimaryKey(locationsId);

		locations.setCompanyId(CompanyThreadLocal.getCompanyId());

		return locations;
	}

	/**
	 * Removes the locations with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param locationsId the primary key of the locations
	 * @return the locations that was removed
	 * @throws NoSuchlocationsException if a locations with the primary key could not be found
	 */
	@Override
	public locations remove(long locationsId) throws NoSuchlocationsException {
		return remove((Serializable)locationsId);
	}

	/**
	 * Removes the locations with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the locations
	 * @return the locations that was removed
	 * @throws NoSuchlocationsException if a locations with the primary key could not be found
	 */
	@Override
	public locations remove(Serializable primaryKey)
		throws NoSuchlocationsException {

		Session session = null;

		try {
			session = openSession();

			locations locations = (locations)session.get(
				locationsImpl.class, primaryKey);

			if (locations == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchlocationsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(locations);
		}
		catch (NoSuchlocationsException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected locations removeImpl(locations locations) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(locations)) {
				locations = (locations)session.get(
					locationsImpl.class, locations.getPrimaryKeyObj());
			}

			if (locations != null) {
				session.delete(locations);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (locations != null) {
			clearCache(locations);
		}

		return locations;
	}

	@Override
	public locations updateImpl(locations locations) {
		boolean isNew = locations.isNew();

		if (!(locations instanceof locationsModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(locations.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(locations);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in locations proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom locations implementation " +
					locations.getClass());
		}

		locationsModelImpl locationsModelImpl = (locationsModelImpl)locations;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (locations.getCreateDate() == null)) {
			if (serviceContext == null) {
				locations.setCreateDate(date);
			}
			else {
				locations.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!locationsModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				locations.setModifiedDate(date);
			}
			else {
				locations.setModifiedDate(serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(locations);
			}
			else {
				locations = (locations)session.merge(locations);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(locationsImpl.class, locations, false, true);

		if (isNew) {
			locations.setNew(false);
		}

		locations.resetOriginalValues();

		return locations;
	}

	/**
	 * Returns the locations with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the locations
	 * @return the locations
	 * @throws NoSuchlocationsException if a locations with the primary key could not be found
	 */
	@Override
	public locations findByPrimaryKey(Serializable primaryKey)
		throws NoSuchlocationsException {

		locations locations = fetchByPrimaryKey(primaryKey);

		if (locations == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchlocationsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return locations;
	}

	/**
	 * Returns the locations with the primary key or throws a <code>NoSuchlocationsException</code> if it could not be found.
	 *
	 * @param locationsId the primary key of the locations
	 * @return the locations
	 * @throws NoSuchlocationsException if a locations with the primary key could not be found
	 */
	@Override
	public locations findByPrimaryKey(long locationsId)
		throws NoSuchlocationsException {

		return findByPrimaryKey((Serializable)locationsId);
	}

	/**
	 * Returns the locations with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param locationsId the primary key of the locations
	 * @return the locations, or <code>null</code> if a locations with the primary key could not be found
	 */
	@Override
	public locations fetchByPrimaryKey(long locationsId) {
		return fetchByPrimaryKey((Serializable)locationsId);
	}

	/**
	 * Returns all the locationses.
	 *
	 * @return the locationses
	 */
	@Override
	public List<locations> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the locationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>locationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of locationses
	 * @param end the upper bound of the range of locationses (not inclusive)
	 * @return the range of locationses
	 */
	@Override
	public List<locations> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the locationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>locationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of locationses
	 * @param end the upper bound of the range of locationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of locationses
	 */
	@Override
	public List<locations> findAll(
		int start, int end, OrderByComparator<locations> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the locationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>locationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of locationses
	 * @param end the upper bound of the range of locationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of locationses
	 */
	@Override
	public List<locations> findAll(
		int start, int end, OrderByComparator<locations> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<locations> list = null;

		if (useFinderCache) {
			list = (List<locations>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_LOCATIONS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_LOCATIONS;

				sql = sql.concat(locationsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<locations>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the locationses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (locations locations : findAll()) {
			remove(locations);
		}
	}

	/**
	 * Returns the number of locationses.
	 *
	 * @return the number of locationses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_LOCATIONS);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "locationsId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_LOCATIONS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return locationsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the locations persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_setlocationsUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setlocationsUtilPersistence(null);

		entityCache.removeCache(locationsImpl.class.getName());
	}

	private void _setlocationsUtilPersistence(
		locationsPersistence locationsPersistence) {

		try {
			Field field = locationsUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, locationsPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = RideappPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = RideappPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = RideappPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_LOCATIONS =
		"SELECT locations FROM locations locations";

	private static final String _SQL_COUNT_LOCATIONS =
		"SELECT COUNT(locations) FROM locations locations";

	private static final String _ORDER_BY_ENTITY_ALIAS = "locations.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No locations exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		locationsPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}