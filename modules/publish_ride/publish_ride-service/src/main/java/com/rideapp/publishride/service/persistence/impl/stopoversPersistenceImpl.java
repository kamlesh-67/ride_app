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

import com.rideapp.publishride.exception.NoSuchstopoversException;
import com.rideapp.publishride.model.impl.stopoversImpl;
import com.rideapp.publishride.model.impl.stopoversModelImpl;
import com.rideapp.publishride.model.stopovers;
import com.rideapp.publishride.model.stopoversTable;
import com.rideapp.publishride.service.persistence.impl.constants.RideappPersistenceConstants;
import com.rideapp.publishride.service.persistence.stopoversPersistence;
import com.rideapp.publishride.service.persistence.stopoversUtil;

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
 * The persistence implementation for the stopovers service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = stopoversPersistence.class)
public class stopoversPersistenceImpl
	extends BasePersistenceImpl<stopovers> implements stopoversPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>stopoversUtil</code> to access the stopovers persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		stopoversImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public stopoversPersistenceImpl() {
		setModelClass(stopovers.class);

		setModelImplClass(stopoversImpl.class);
		setModelPKClass(long.class);

		setTable(stopoversTable.INSTANCE);
	}

	/**
	 * Caches the stopovers in the entity cache if it is enabled.
	 *
	 * @param stopovers the stopovers
	 */
	@Override
	public void cacheResult(stopovers stopovers) {
		entityCache.putResult(
			stopoversImpl.class, stopovers.getPrimaryKey(), stopovers);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the stopoverses in the entity cache if it is enabled.
	 *
	 * @param stopoverses the stopoverses
	 */
	@Override
	public void cacheResult(List<stopovers> stopoverses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (stopoverses.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (stopovers stopovers : stopoverses) {
			if (entityCache.getResult(
					stopoversImpl.class, stopovers.getPrimaryKey()) == null) {

				cacheResult(stopovers);
			}
		}
	}

	/**
	 * Clears the cache for all stopoverses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(stopoversImpl.class);

		finderCache.clearCache(stopoversImpl.class);
	}

	/**
	 * Clears the cache for the stopovers.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(stopovers stopovers) {
		entityCache.removeResult(stopoversImpl.class, stopovers);
	}

	@Override
	public void clearCache(List<stopovers> stopoverses) {
		for (stopovers stopovers : stopoverses) {
			entityCache.removeResult(stopoversImpl.class, stopovers);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(stopoversImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(stopoversImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new stopovers with the primary key. Does not add the stopovers to the database.
	 *
	 * @param stopoversId the primary key for the new stopovers
	 * @return the new stopovers
	 */
	@Override
	public stopovers create(long stopoversId) {
		stopovers stopovers = new stopoversImpl();

		stopovers.setNew(true);
		stopovers.setPrimaryKey(stopoversId);

		stopovers.setCompanyId(CompanyThreadLocal.getCompanyId());

		return stopovers;
	}

	/**
	 * Removes the stopovers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param stopoversId the primary key of the stopovers
	 * @return the stopovers that was removed
	 * @throws NoSuchstopoversException if a stopovers with the primary key could not be found
	 */
	@Override
	public stopovers remove(long stopoversId) throws NoSuchstopoversException {
		return remove((Serializable)stopoversId);
	}

	/**
	 * Removes the stopovers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the stopovers
	 * @return the stopovers that was removed
	 * @throws NoSuchstopoversException if a stopovers with the primary key could not be found
	 */
	@Override
	public stopovers remove(Serializable primaryKey)
		throws NoSuchstopoversException {

		Session session = null;

		try {
			session = openSession();

			stopovers stopovers = (stopovers)session.get(
				stopoversImpl.class, primaryKey);

			if (stopovers == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchstopoversException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(stopovers);
		}
		catch (NoSuchstopoversException noSuchEntityException) {
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
	protected stopovers removeImpl(stopovers stopovers) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(stopovers)) {
				stopovers = (stopovers)session.get(
					stopoversImpl.class, stopovers.getPrimaryKeyObj());
			}

			if (stopovers != null) {
				session.delete(stopovers);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (stopovers != null) {
			clearCache(stopovers);
		}

		return stopovers;
	}

	@Override
	public stopovers updateImpl(stopovers stopovers) {
		boolean isNew = stopovers.isNew();

		if (!(stopovers instanceof stopoversModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(stopovers.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(stopovers);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in stopovers proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom stopovers implementation " +
					stopovers.getClass());
		}

		stopoversModelImpl stopoversModelImpl = (stopoversModelImpl)stopovers;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (stopovers.getCreateDate() == null)) {
			if (serviceContext == null) {
				stopovers.setCreateDate(date);
			}
			else {
				stopovers.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!stopoversModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				stopovers.setModifiedDate(date);
			}
			else {
				stopovers.setModifiedDate(serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(stopovers);
			}
			else {
				stopovers = (stopovers)session.merge(stopovers);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(stopoversImpl.class, stopovers, false, true);

		if (isNew) {
			stopovers.setNew(false);
		}

		stopovers.resetOriginalValues();

		return stopovers;
	}

	/**
	 * Returns the stopovers with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the stopovers
	 * @return the stopovers
	 * @throws NoSuchstopoversException if a stopovers with the primary key could not be found
	 */
	@Override
	public stopovers findByPrimaryKey(Serializable primaryKey)
		throws NoSuchstopoversException {

		stopovers stopovers = fetchByPrimaryKey(primaryKey);

		if (stopovers == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchstopoversException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return stopovers;
	}

	/**
	 * Returns the stopovers with the primary key or throws a <code>NoSuchstopoversException</code> if it could not be found.
	 *
	 * @param stopoversId the primary key of the stopovers
	 * @return the stopovers
	 * @throws NoSuchstopoversException if a stopovers with the primary key could not be found
	 */
	@Override
	public stopovers findByPrimaryKey(long stopoversId)
		throws NoSuchstopoversException {

		return findByPrimaryKey((Serializable)stopoversId);
	}

	/**
	 * Returns the stopovers with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param stopoversId the primary key of the stopovers
	 * @return the stopovers, or <code>null</code> if a stopovers with the primary key could not be found
	 */
	@Override
	public stopovers fetchByPrimaryKey(long stopoversId) {
		return fetchByPrimaryKey((Serializable)stopoversId);
	}

	/**
	 * Returns all the stopoverses.
	 *
	 * @return the stopoverses
	 */
	@Override
	public List<stopovers> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the stopoverses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>stopoversModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of stopoverses
	 * @param end the upper bound of the range of stopoverses (not inclusive)
	 * @return the range of stopoverses
	 */
	@Override
	public List<stopovers> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the stopoverses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>stopoversModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of stopoverses
	 * @param end the upper bound of the range of stopoverses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of stopoverses
	 */
	@Override
	public List<stopovers> findAll(
		int start, int end, OrderByComparator<stopovers> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the stopoverses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>stopoversModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of stopoverses
	 * @param end the upper bound of the range of stopoverses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of stopoverses
	 */
	@Override
	public List<stopovers> findAll(
		int start, int end, OrderByComparator<stopovers> orderByComparator,
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

		List<stopovers> list = null;

		if (useFinderCache) {
			list = (List<stopovers>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_STOPOVERS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_STOPOVERS;

				sql = sql.concat(stopoversModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<stopovers>)QueryUtil.list(
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
	 * Removes all the stopoverses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (stopovers stopovers : findAll()) {
			remove(stopovers);
		}
	}

	/**
	 * Returns the number of stopoverses.
	 *
	 * @return the number of stopoverses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_STOPOVERS);

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
		return "stopoversId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_STOPOVERS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return stopoversModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the stopovers persistence.
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

		_setstopoversUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setstopoversUtilPersistence(null);

		entityCache.removeCache(stopoversImpl.class.getName());
	}

	private void _setstopoversUtilPersistence(
		stopoversPersistence stopoversPersistence) {

		try {
			Field field = stopoversUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, stopoversPersistence);
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

	private static final String _SQL_SELECT_STOPOVERS =
		"SELECT stopovers FROM stopovers stopovers";

	private static final String _SQL_COUNT_STOPOVERS =
		"SELECT COUNT(stopovers) FROM stopovers stopovers";

	private static final String _ORDER_BY_ENTITY_ALIAS = "stopovers.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No stopovers exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		stopoversPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}