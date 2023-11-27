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

import com.rideapp.publishride.exception.NoSuchvehicalsException;
import com.rideapp.publishride.model.impl.vehicalsImpl;
import com.rideapp.publishride.model.impl.vehicalsModelImpl;
import com.rideapp.publishride.model.vehicals;
import com.rideapp.publishride.model.vehicalsTable;
import com.rideapp.publishride.service.persistence.impl.constants.RideappPersistenceConstants;
import com.rideapp.publishride.service.persistence.vehicalsPersistence;
import com.rideapp.publishride.service.persistence.vehicalsUtil;

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
 * The persistence implementation for the vehicals service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = vehicalsPersistence.class)
public class vehicalsPersistenceImpl
	extends BasePersistenceImpl<vehicals> implements vehicalsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>vehicalsUtil</code> to access the vehicals persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		vehicalsImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public vehicalsPersistenceImpl() {
		setModelClass(vehicals.class);

		setModelImplClass(vehicalsImpl.class);
		setModelPKClass(long.class);

		setTable(vehicalsTable.INSTANCE);
	}

	/**
	 * Caches the vehicals in the entity cache if it is enabled.
	 *
	 * @param vehicals the vehicals
	 */
	@Override
	public void cacheResult(vehicals vehicals) {
		entityCache.putResult(
			vehicalsImpl.class, vehicals.getPrimaryKey(), vehicals);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the vehicalses in the entity cache if it is enabled.
	 *
	 * @param vehicalses the vehicalses
	 */
	@Override
	public void cacheResult(List<vehicals> vehicalses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (vehicalses.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (vehicals vehicals : vehicalses) {
			if (entityCache.getResult(
					vehicalsImpl.class, vehicals.getPrimaryKey()) == null) {

				cacheResult(vehicals);
			}
		}
	}

	/**
	 * Clears the cache for all vehicalses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(vehicalsImpl.class);

		finderCache.clearCache(vehicalsImpl.class);
	}

	/**
	 * Clears the cache for the vehicals.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(vehicals vehicals) {
		entityCache.removeResult(vehicalsImpl.class, vehicals);
	}

	@Override
	public void clearCache(List<vehicals> vehicalses) {
		for (vehicals vehicals : vehicalses) {
			entityCache.removeResult(vehicalsImpl.class, vehicals);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(vehicalsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(vehicalsImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new vehicals with the primary key. Does not add the vehicals to the database.
	 *
	 * @param vehicalsId the primary key for the new vehicals
	 * @return the new vehicals
	 */
	@Override
	public vehicals create(long vehicalsId) {
		vehicals vehicals = new vehicalsImpl();

		vehicals.setNew(true);
		vehicals.setPrimaryKey(vehicalsId);

		vehicals.setCompanyId(CompanyThreadLocal.getCompanyId());

		return vehicals;
	}

	/**
	 * Removes the vehicals with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vehicalsId the primary key of the vehicals
	 * @return the vehicals that was removed
	 * @throws NoSuchvehicalsException if a vehicals with the primary key could not be found
	 */
	@Override
	public vehicals remove(long vehicalsId) throws NoSuchvehicalsException {
		return remove((Serializable)vehicalsId);
	}

	/**
	 * Removes the vehicals with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vehicals
	 * @return the vehicals that was removed
	 * @throws NoSuchvehicalsException if a vehicals with the primary key could not be found
	 */
	@Override
	public vehicals remove(Serializable primaryKey)
		throws NoSuchvehicalsException {

		Session session = null;

		try {
			session = openSession();

			vehicals vehicals = (vehicals)session.get(
				vehicalsImpl.class, primaryKey);

			if (vehicals == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchvehicalsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(vehicals);
		}
		catch (NoSuchvehicalsException noSuchEntityException) {
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
	protected vehicals removeImpl(vehicals vehicals) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vehicals)) {
				vehicals = (vehicals)session.get(
					vehicalsImpl.class, vehicals.getPrimaryKeyObj());
			}

			if (vehicals != null) {
				session.delete(vehicals);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (vehicals != null) {
			clearCache(vehicals);
		}

		return vehicals;
	}

	@Override
	public vehicals updateImpl(vehicals vehicals) {
		boolean isNew = vehicals.isNew();

		if (!(vehicals instanceof vehicalsModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(vehicals.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(vehicals);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in vehicals proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom vehicals implementation " +
					vehicals.getClass());
		}

		vehicalsModelImpl vehicalsModelImpl = (vehicalsModelImpl)vehicals;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (vehicals.getCreateDate() == null)) {
			if (serviceContext == null) {
				vehicals.setCreateDate(date);
			}
			else {
				vehicals.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!vehicalsModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				vehicals.setModifiedDate(date);
			}
			else {
				vehicals.setModifiedDate(serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(vehicals);
			}
			else {
				vehicals = (vehicals)session.merge(vehicals);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(vehicalsImpl.class, vehicals, false, true);

		if (isNew) {
			vehicals.setNew(false);
		}

		vehicals.resetOriginalValues();

		return vehicals;
	}

	/**
	 * Returns the vehicals with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vehicals
	 * @return the vehicals
	 * @throws NoSuchvehicalsException if a vehicals with the primary key could not be found
	 */
	@Override
	public vehicals findByPrimaryKey(Serializable primaryKey)
		throws NoSuchvehicalsException {

		vehicals vehicals = fetchByPrimaryKey(primaryKey);

		if (vehicals == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchvehicalsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return vehicals;
	}

	/**
	 * Returns the vehicals with the primary key or throws a <code>NoSuchvehicalsException</code> if it could not be found.
	 *
	 * @param vehicalsId the primary key of the vehicals
	 * @return the vehicals
	 * @throws NoSuchvehicalsException if a vehicals with the primary key could not be found
	 */
	@Override
	public vehicals findByPrimaryKey(long vehicalsId)
		throws NoSuchvehicalsException {

		return findByPrimaryKey((Serializable)vehicalsId);
	}

	/**
	 * Returns the vehicals with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vehicalsId the primary key of the vehicals
	 * @return the vehicals, or <code>null</code> if a vehicals with the primary key could not be found
	 */
	@Override
	public vehicals fetchByPrimaryKey(long vehicalsId) {
		return fetchByPrimaryKey((Serializable)vehicalsId);
	}

	/**
	 * Returns all the vehicalses.
	 *
	 * @return the vehicalses
	 */
	@Override
	public List<vehicals> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicalses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>vehicalsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of vehicalses
	 * @param end the upper bound of the range of vehicalses (not inclusive)
	 * @return the range of vehicalses
	 */
	@Override
	public List<vehicals> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vehicalses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>vehicalsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of vehicalses
	 * @param end the upper bound of the range of vehicalses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vehicalses
	 */
	@Override
	public List<vehicals> findAll(
		int start, int end, OrderByComparator<vehicals> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vehicalses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>vehicalsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of vehicalses
	 * @param end the upper bound of the range of vehicalses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of vehicalses
	 */
	@Override
	public List<vehicals> findAll(
		int start, int end, OrderByComparator<vehicals> orderByComparator,
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

		List<vehicals> list = null;

		if (useFinderCache) {
			list = (List<vehicals>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_VEHICALS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_VEHICALS;

				sql = sql.concat(vehicalsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<vehicals>)QueryUtil.list(
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
	 * Removes all the vehicalses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (vehicals vehicals : findAll()) {
			remove(vehicals);
		}
	}

	/**
	 * Returns the number of vehicalses.
	 *
	 * @return the number of vehicalses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_VEHICALS);

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
		return "vehicalsId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_VEHICALS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return vehicalsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vehicals persistence.
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

		_setvehicalsUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setvehicalsUtilPersistence(null);

		entityCache.removeCache(vehicalsImpl.class.getName());
	}

	private void _setvehicalsUtilPersistence(
		vehicalsPersistence vehicalsPersistence) {

		try {
			Field field = vehicalsUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, vehicalsPersistence);
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

	private static final String _SQL_SELECT_VEHICALS =
		"SELECT vehicals FROM vehicals vehicals";

	private static final String _SQL_COUNT_VEHICALS =
		"SELECT COUNT(vehicals) FROM vehicals vehicals";

	private static final String _ORDER_BY_ENTITY_ALIAS = "vehicals.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No vehicals exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		vehicalsPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}