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

import com.rideapp.publishride.exception.NoSuchridesException;
import com.rideapp.publishride.model.impl.ridesImpl;
import com.rideapp.publishride.model.impl.ridesModelImpl;
import com.rideapp.publishride.model.rides;
import com.rideapp.publishride.model.ridesTable;
import com.rideapp.publishride.service.persistence.impl.constants.RideappPersistenceConstants;
import com.rideapp.publishride.service.persistence.ridesPersistence;
import com.rideapp.publishride.service.persistence.ridesUtil;

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
 * The persistence implementation for the rides service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ridesPersistence.class)
public class ridesPersistenceImpl
	extends BasePersistenceImpl<rides> implements ridesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ridesUtil</code> to access the rides persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ridesImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public ridesPersistenceImpl() {
		setModelClass(rides.class);

		setModelImplClass(ridesImpl.class);
		setModelPKClass(long.class);

		setTable(ridesTable.INSTANCE);
	}

	/**
	 * Caches the rides in the entity cache if it is enabled.
	 *
	 * @param rides the rides
	 */
	@Override
	public void cacheResult(rides rides) {
		entityCache.putResult(ridesImpl.class, rides.getPrimaryKey(), rides);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the rideses in the entity cache if it is enabled.
	 *
	 * @param rideses the rideses
	 */
	@Override
	public void cacheResult(List<rides> rideses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (rideses.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (rides rides : rideses) {
			if (entityCache.getResult(ridesImpl.class, rides.getPrimaryKey()) ==
					null) {

				cacheResult(rides);
			}
		}
	}

	/**
	 * Clears the cache for all rideses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ridesImpl.class);

		finderCache.clearCache(ridesImpl.class);
	}

	/**
	 * Clears the cache for the rides.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(rides rides) {
		entityCache.removeResult(ridesImpl.class, rides);
	}

	@Override
	public void clearCache(List<rides> rideses) {
		for (rides rides : rideses) {
			entityCache.removeResult(ridesImpl.class, rides);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ridesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(ridesImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new rides with the primary key. Does not add the rides to the database.
	 *
	 * @param ridesId the primary key for the new rides
	 * @return the new rides
	 */
	@Override
	public rides create(long ridesId) {
		rides rides = new ridesImpl();

		rides.setNew(true);
		rides.setPrimaryKey(ridesId);

		rides.setCompanyId(CompanyThreadLocal.getCompanyId());

		return rides;
	}

	/**
	 * Removes the rides with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ridesId the primary key of the rides
	 * @return the rides that was removed
	 * @throws NoSuchridesException if a rides with the primary key could not be found
	 */
	@Override
	public rides remove(long ridesId) throws NoSuchridesException {
		return remove((Serializable)ridesId);
	}

	/**
	 * Removes the rides with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the rides
	 * @return the rides that was removed
	 * @throws NoSuchridesException if a rides with the primary key could not be found
	 */
	@Override
	public rides remove(Serializable primaryKey) throws NoSuchridesException {
		Session session = null;

		try {
			session = openSession();

			rides rides = (rides)session.get(ridesImpl.class, primaryKey);

			if (rides == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchridesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(rides);
		}
		catch (NoSuchridesException noSuchEntityException) {
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
	protected rides removeImpl(rides rides) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(rides)) {
				rides = (rides)session.get(
					ridesImpl.class, rides.getPrimaryKeyObj());
			}

			if (rides != null) {
				session.delete(rides);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (rides != null) {
			clearCache(rides);
		}

		return rides;
	}

	@Override
	public rides updateImpl(rides rides) {
		boolean isNew = rides.isNew();

		if (!(rides instanceof ridesModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(rides.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(rides);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in rides proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom rides implementation " +
					rides.getClass());
		}

		ridesModelImpl ridesModelImpl = (ridesModelImpl)rides;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (rides.getCreateDate() == null)) {
			if (serviceContext == null) {
				rides.setCreateDate(date);
			}
			else {
				rides.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!ridesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				rides.setModifiedDate(date);
			}
			else {
				rides.setModifiedDate(serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(rides);
			}
			else {
				rides = (rides)session.merge(rides);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(ridesImpl.class, rides, false, true);

		if (isNew) {
			rides.setNew(false);
		}

		rides.resetOriginalValues();

		return rides;
	}

	/**
	 * Returns the rides with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the rides
	 * @return the rides
	 * @throws NoSuchridesException if a rides with the primary key could not be found
	 */
	@Override
	public rides findByPrimaryKey(Serializable primaryKey)
		throws NoSuchridesException {

		rides rides = fetchByPrimaryKey(primaryKey);

		if (rides == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchridesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return rides;
	}

	/**
	 * Returns the rides with the primary key or throws a <code>NoSuchridesException</code> if it could not be found.
	 *
	 * @param ridesId the primary key of the rides
	 * @return the rides
	 * @throws NoSuchridesException if a rides with the primary key could not be found
	 */
	@Override
	public rides findByPrimaryKey(long ridesId) throws NoSuchridesException {
		return findByPrimaryKey((Serializable)ridesId);
	}

	/**
	 * Returns the rides with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ridesId the primary key of the rides
	 * @return the rides, or <code>null</code> if a rides with the primary key could not be found
	 */
	@Override
	public rides fetchByPrimaryKey(long ridesId) {
		return fetchByPrimaryKey((Serializable)ridesId);
	}

	/**
	 * Returns all the rideses.
	 *
	 * @return the rideses
	 */
	@Override
	public List<rides> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the rideses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ridesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rideses
	 * @param end the upper bound of the range of rideses (not inclusive)
	 * @return the range of rideses
	 */
	@Override
	public List<rides> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the rideses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ridesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rideses
	 * @param end the upper bound of the range of rideses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rideses
	 */
	@Override
	public List<rides> findAll(
		int start, int end, OrderByComparator<rides> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the rideses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ridesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rideses
	 * @param end the upper bound of the range of rideses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of rideses
	 */
	@Override
	public List<rides> findAll(
		int start, int end, OrderByComparator<rides> orderByComparator,
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

		List<rides> list = null;

		if (useFinderCache) {
			list = (List<rides>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_RIDES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_RIDES;

				sql = sql.concat(ridesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<rides>)QueryUtil.list(
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
	 * Removes all the rideses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (rides rides : findAll()) {
			remove(rides);
		}
	}

	/**
	 * Returns the number of rideses.
	 *
	 * @return the number of rideses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_RIDES);

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
		return "ridesId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_RIDES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ridesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the rides persistence.
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

		_setridesUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setridesUtilPersistence(null);

		entityCache.removeCache(ridesImpl.class.getName());
	}

	private void _setridesUtilPersistence(ridesPersistence ridesPersistence) {
		try {
			Field field = ridesUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, ridesPersistence);
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

	private static final String _SQL_SELECT_RIDES =
		"SELECT rides FROM rides rides";

	private static final String _SQL_COUNT_RIDES =
		"SELECT COUNT(rides) FROM rides rides";

	private static final String _ORDER_BY_ENTITY_ALIAS = "rides.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No rides exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		ridesPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}