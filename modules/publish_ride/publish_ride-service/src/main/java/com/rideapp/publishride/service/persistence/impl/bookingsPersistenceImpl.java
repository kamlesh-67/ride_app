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

import com.rideapp.publishride.exception.NoSuchbookingsException;
import com.rideapp.publishride.model.bookings;
import com.rideapp.publishride.model.bookingsTable;
import com.rideapp.publishride.model.impl.bookingsImpl;
import com.rideapp.publishride.model.impl.bookingsModelImpl;
import com.rideapp.publishride.service.persistence.bookingsPersistence;
import com.rideapp.publishride.service.persistence.bookingsUtil;
import com.rideapp.publishride.service.persistence.impl.constants.RideappPersistenceConstants;

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
 * The persistence implementation for the bookings service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = bookingsPersistence.class)
public class bookingsPersistenceImpl
	extends BasePersistenceImpl<bookings> implements bookingsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>bookingsUtil</code> to access the bookings persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		bookingsImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public bookingsPersistenceImpl() {
		setModelClass(bookings.class);

		setModelImplClass(bookingsImpl.class);
		setModelPKClass(long.class);

		setTable(bookingsTable.INSTANCE);
	}

	/**
	 * Caches the bookings in the entity cache if it is enabled.
	 *
	 * @param bookings the bookings
	 */
	@Override
	public void cacheResult(bookings bookings) {
		entityCache.putResult(
			bookingsImpl.class, bookings.getPrimaryKey(), bookings);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the bookingses in the entity cache if it is enabled.
	 *
	 * @param bookingses the bookingses
	 */
	@Override
	public void cacheResult(List<bookings> bookingses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (bookingses.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (bookings bookings : bookingses) {
			if (entityCache.getResult(
					bookingsImpl.class, bookings.getPrimaryKey()) == null) {

				cacheResult(bookings);
			}
		}
	}

	/**
	 * Clears the cache for all bookingses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(bookingsImpl.class);

		finderCache.clearCache(bookingsImpl.class);
	}

	/**
	 * Clears the cache for the bookings.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(bookings bookings) {
		entityCache.removeResult(bookingsImpl.class, bookings);
	}

	@Override
	public void clearCache(List<bookings> bookingses) {
		for (bookings bookings : bookingses) {
			entityCache.removeResult(bookingsImpl.class, bookings);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(bookingsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(bookingsImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new bookings with the primary key. Does not add the bookings to the database.
	 *
	 * @param bookingsId the primary key for the new bookings
	 * @return the new bookings
	 */
	@Override
	public bookings create(long bookingsId) {
		bookings bookings = new bookingsImpl();

		bookings.setNew(true);
		bookings.setPrimaryKey(bookingsId);

		bookings.setCompanyId(CompanyThreadLocal.getCompanyId());

		return bookings;
	}

	/**
	 * Removes the bookings with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bookingsId the primary key of the bookings
	 * @return the bookings that was removed
	 * @throws NoSuchbookingsException if a bookings with the primary key could not be found
	 */
	@Override
	public bookings remove(long bookingsId) throws NoSuchbookingsException {
		return remove((Serializable)bookingsId);
	}

	/**
	 * Removes the bookings with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the bookings
	 * @return the bookings that was removed
	 * @throws NoSuchbookingsException if a bookings with the primary key could not be found
	 */
	@Override
	public bookings remove(Serializable primaryKey)
		throws NoSuchbookingsException {

		Session session = null;

		try {
			session = openSession();

			bookings bookings = (bookings)session.get(
				bookingsImpl.class, primaryKey);

			if (bookings == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchbookingsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(bookings);
		}
		catch (NoSuchbookingsException noSuchEntityException) {
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
	protected bookings removeImpl(bookings bookings) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(bookings)) {
				bookings = (bookings)session.get(
					bookingsImpl.class, bookings.getPrimaryKeyObj());
			}

			if (bookings != null) {
				session.delete(bookings);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (bookings != null) {
			clearCache(bookings);
		}

		return bookings;
	}

	@Override
	public bookings updateImpl(bookings bookings) {
		boolean isNew = bookings.isNew();

		if (!(bookings instanceof bookingsModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(bookings.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(bookings);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in bookings proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom bookings implementation " +
					bookings.getClass());
		}

		bookingsModelImpl bookingsModelImpl = (bookingsModelImpl)bookings;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (bookings.getCreateDate() == null)) {
			if (serviceContext == null) {
				bookings.setCreateDate(date);
			}
			else {
				bookings.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!bookingsModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				bookings.setModifiedDate(date);
			}
			else {
				bookings.setModifiedDate(serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(bookings);
			}
			else {
				bookings = (bookings)session.merge(bookings);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(bookingsImpl.class, bookings, false, true);

		if (isNew) {
			bookings.setNew(false);
		}

		bookings.resetOriginalValues();

		return bookings;
	}

	/**
	 * Returns the bookings with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the bookings
	 * @return the bookings
	 * @throws NoSuchbookingsException if a bookings with the primary key could not be found
	 */
	@Override
	public bookings findByPrimaryKey(Serializable primaryKey)
		throws NoSuchbookingsException {

		bookings bookings = fetchByPrimaryKey(primaryKey);

		if (bookings == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchbookingsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return bookings;
	}

	/**
	 * Returns the bookings with the primary key or throws a <code>NoSuchbookingsException</code> if it could not be found.
	 *
	 * @param bookingsId the primary key of the bookings
	 * @return the bookings
	 * @throws NoSuchbookingsException if a bookings with the primary key could not be found
	 */
	@Override
	public bookings findByPrimaryKey(long bookingsId)
		throws NoSuchbookingsException {

		return findByPrimaryKey((Serializable)bookingsId);
	}

	/**
	 * Returns the bookings with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bookingsId the primary key of the bookings
	 * @return the bookings, or <code>null</code> if a bookings with the primary key could not be found
	 */
	@Override
	public bookings fetchByPrimaryKey(long bookingsId) {
		return fetchByPrimaryKey((Serializable)bookingsId);
	}

	/**
	 * Returns all the bookingses.
	 *
	 * @return the bookingses
	 */
	@Override
	public List<bookings> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bookingses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>bookingsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bookingses
	 * @param end the upper bound of the range of bookingses (not inclusive)
	 * @return the range of bookingses
	 */
	@Override
	public List<bookings> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the bookingses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>bookingsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bookingses
	 * @param end the upper bound of the range of bookingses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bookingses
	 */
	@Override
	public List<bookings> findAll(
		int start, int end, OrderByComparator<bookings> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the bookingses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>bookingsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bookingses
	 * @param end the upper bound of the range of bookingses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of bookingses
	 */
	@Override
	public List<bookings> findAll(
		int start, int end, OrderByComparator<bookings> orderByComparator,
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

		List<bookings> list = null;

		if (useFinderCache) {
			list = (List<bookings>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_BOOKINGS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_BOOKINGS;

				sql = sql.concat(bookingsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<bookings>)QueryUtil.list(
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
	 * Removes all the bookingses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (bookings bookings : findAll()) {
			remove(bookings);
		}
	}

	/**
	 * Returns the number of bookingses.
	 *
	 * @return the number of bookingses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_BOOKINGS);

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
		return "bookingsId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_BOOKINGS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return bookingsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the bookings persistence.
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

		_setbookingsUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setbookingsUtilPersistence(null);

		entityCache.removeCache(bookingsImpl.class.getName());
	}

	private void _setbookingsUtilPersistence(
		bookingsPersistence bookingsPersistence) {

		try {
			Field field = bookingsUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, bookingsPersistence);
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

	private static final String _SQL_SELECT_BOOKINGS =
		"SELECT bookings FROM bookings bookings";

	private static final String _SQL_COUNT_BOOKINGS =
		"SELECT COUNT(bookings) FROM bookings bookings";

	private static final String _ORDER_BY_ENTITY_ALIAS = "bookings.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No bookings exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		bookingsPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}