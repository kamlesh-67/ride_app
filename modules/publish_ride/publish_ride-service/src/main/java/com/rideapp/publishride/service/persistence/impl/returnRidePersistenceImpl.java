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

import com.rideapp.publishride.exception.NoSuchreturnRideException;
import com.rideapp.publishride.model.impl.returnRideImpl;
import com.rideapp.publishride.model.impl.returnRideModelImpl;
import com.rideapp.publishride.model.returnRide;
import com.rideapp.publishride.model.returnRideTable;
import com.rideapp.publishride.service.persistence.impl.constants.RideappPersistenceConstants;
import com.rideapp.publishride.service.persistence.returnRidePersistence;
import com.rideapp.publishride.service.persistence.returnRideUtil;

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
 * The persistence implementation for the return ride service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = returnRidePersistence.class)
public class returnRidePersistenceImpl
	extends BasePersistenceImpl<returnRide> implements returnRidePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>returnRideUtil</code> to access the return ride persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		returnRideImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public returnRidePersistenceImpl() {
		setModelClass(returnRide.class);

		setModelImplClass(returnRideImpl.class);
		setModelPKClass(long.class);

		setTable(returnRideTable.INSTANCE);
	}

	/**
	 * Caches the return ride in the entity cache if it is enabled.
	 *
	 * @param returnRide the return ride
	 */
	@Override
	public void cacheResult(returnRide returnRide) {
		entityCache.putResult(
			returnRideImpl.class, returnRide.getPrimaryKey(), returnRide);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the return rides in the entity cache if it is enabled.
	 *
	 * @param returnRides the return rides
	 */
	@Override
	public void cacheResult(List<returnRide> returnRides) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (returnRides.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (returnRide returnRide : returnRides) {
			if (entityCache.getResult(
					returnRideImpl.class, returnRide.getPrimaryKey()) == null) {

				cacheResult(returnRide);
			}
		}
	}

	/**
	 * Clears the cache for all return rides.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(returnRideImpl.class);

		finderCache.clearCache(returnRideImpl.class);
	}

	/**
	 * Clears the cache for the return ride.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(returnRide returnRide) {
		entityCache.removeResult(returnRideImpl.class, returnRide);
	}

	@Override
	public void clearCache(List<returnRide> returnRides) {
		for (returnRide returnRide : returnRides) {
			entityCache.removeResult(returnRideImpl.class, returnRide);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(returnRideImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(returnRideImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new return ride with the primary key. Does not add the return ride to the database.
	 *
	 * @param returnRideId the primary key for the new return ride
	 * @return the new return ride
	 */
	@Override
	public returnRide create(long returnRideId) {
		returnRide returnRide = new returnRideImpl();

		returnRide.setNew(true);
		returnRide.setPrimaryKey(returnRideId);

		returnRide.setCompanyId(CompanyThreadLocal.getCompanyId());

		return returnRide;
	}

	/**
	 * Removes the return ride with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param returnRideId the primary key of the return ride
	 * @return the return ride that was removed
	 * @throws NoSuchreturnRideException if a return ride with the primary key could not be found
	 */
	@Override
	public returnRide remove(long returnRideId)
		throws NoSuchreturnRideException {

		return remove((Serializable)returnRideId);
	}

	/**
	 * Removes the return ride with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the return ride
	 * @return the return ride that was removed
	 * @throws NoSuchreturnRideException if a return ride with the primary key could not be found
	 */
	@Override
	public returnRide remove(Serializable primaryKey)
		throws NoSuchreturnRideException {

		Session session = null;

		try {
			session = openSession();

			returnRide returnRide = (returnRide)session.get(
				returnRideImpl.class, primaryKey);

			if (returnRide == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchreturnRideException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(returnRide);
		}
		catch (NoSuchreturnRideException noSuchEntityException) {
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
	protected returnRide removeImpl(returnRide returnRide) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(returnRide)) {
				returnRide = (returnRide)session.get(
					returnRideImpl.class, returnRide.getPrimaryKeyObj());
			}

			if (returnRide != null) {
				session.delete(returnRide);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (returnRide != null) {
			clearCache(returnRide);
		}

		return returnRide;
	}

	@Override
	public returnRide updateImpl(returnRide returnRide) {
		boolean isNew = returnRide.isNew();

		if (!(returnRide instanceof returnRideModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(returnRide.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(returnRide);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in returnRide proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom returnRide implementation " +
					returnRide.getClass());
		}

		returnRideModelImpl returnRideModelImpl =
			(returnRideModelImpl)returnRide;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (returnRide.getCreateDate() == null)) {
			if (serviceContext == null) {
				returnRide.setCreateDate(date);
			}
			else {
				returnRide.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!returnRideModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				returnRide.setModifiedDate(date);
			}
			else {
				returnRide.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(returnRide);
			}
			else {
				returnRide = (returnRide)session.merge(returnRide);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(returnRideImpl.class, returnRide, false, true);

		if (isNew) {
			returnRide.setNew(false);
		}

		returnRide.resetOriginalValues();

		return returnRide;
	}

	/**
	 * Returns the return ride with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the return ride
	 * @return the return ride
	 * @throws NoSuchreturnRideException if a return ride with the primary key could not be found
	 */
	@Override
	public returnRide findByPrimaryKey(Serializable primaryKey)
		throws NoSuchreturnRideException {

		returnRide returnRide = fetchByPrimaryKey(primaryKey);

		if (returnRide == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchreturnRideException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return returnRide;
	}

	/**
	 * Returns the return ride with the primary key or throws a <code>NoSuchreturnRideException</code> if it could not be found.
	 *
	 * @param returnRideId the primary key of the return ride
	 * @return the return ride
	 * @throws NoSuchreturnRideException if a return ride with the primary key could not be found
	 */
	@Override
	public returnRide findByPrimaryKey(long returnRideId)
		throws NoSuchreturnRideException {

		return findByPrimaryKey((Serializable)returnRideId);
	}

	/**
	 * Returns the return ride with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param returnRideId the primary key of the return ride
	 * @return the return ride, or <code>null</code> if a return ride with the primary key could not be found
	 */
	@Override
	public returnRide fetchByPrimaryKey(long returnRideId) {
		return fetchByPrimaryKey((Serializable)returnRideId);
	}

	/**
	 * Returns all the return rides.
	 *
	 * @return the return rides
	 */
	@Override
	public List<returnRide> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the return rides.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>returnRideModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of return rides
	 * @param end the upper bound of the range of return rides (not inclusive)
	 * @return the range of return rides
	 */
	@Override
	public List<returnRide> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the return rides.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>returnRideModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of return rides
	 * @param end the upper bound of the range of return rides (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of return rides
	 */
	@Override
	public List<returnRide> findAll(
		int start, int end, OrderByComparator<returnRide> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the return rides.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>returnRideModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of return rides
	 * @param end the upper bound of the range of return rides (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of return rides
	 */
	@Override
	public List<returnRide> findAll(
		int start, int end, OrderByComparator<returnRide> orderByComparator,
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

		List<returnRide> list = null;

		if (useFinderCache) {
			list = (List<returnRide>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_RETURNRIDE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_RETURNRIDE;

				sql = sql.concat(returnRideModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<returnRide>)QueryUtil.list(
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
	 * Removes all the return rides from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (returnRide returnRide : findAll()) {
			remove(returnRide);
		}
	}

	/**
	 * Returns the number of return rides.
	 *
	 * @return the number of return rides
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_RETURNRIDE);

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
		return "returnRideId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_RETURNRIDE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return returnRideModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the return ride persistence.
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

		_setreturnRideUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setreturnRideUtilPersistence(null);

		entityCache.removeCache(returnRideImpl.class.getName());
	}

	private void _setreturnRideUtilPersistence(
		returnRidePersistence returnRidePersistence) {

		try {
			Field field = returnRideUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, returnRidePersistence);
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

	private static final String _SQL_SELECT_RETURNRIDE =
		"SELECT returnRide FROM returnRide returnRide";

	private static final String _SQL_COUNT_RETURNRIDE =
		"SELECT COUNT(returnRide) FROM returnRide returnRide";

	private static final String _ORDER_BY_ENTITY_ALIAS = "returnRide.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No returnRide exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		returnRidePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}