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

package com.rideapp.publishride.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.rideapp.publishride.model.bookings;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the bookings service. This utility wraps <code>com.rideapp.publishride.service.persistence.impl.bookingsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see bookingsPersistence
 * @generated
 */
public class bookingsUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(bookings bookings) {
		getPersistence().clearCache(bookings);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, bookings> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<bookings> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<bookings> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<bookings> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<bookings> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static bookings update(bookings bookings) {
		return getPersistence().update(bookings);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static bookings update(
		bookings bookings, ServiceContext serviceContext) {

		return getPersistence().update(bookings, serviceContext);
	}

	/**
	 * Caches the bookings in the entity cache if it is enabled.
	 *
	 * @param bookings the bookings
	 */
	public static void cacheResult(bookings bookings) {
		getPersistence().cacheResult(bookings);
	}

	/**
	 * Caches the bookingses in the entity cache if it is enabled.
	 *
	 * @param bookingses the bookingses
	 */
	public static void cacheResult(List<bookings> bookingses) {
		getPersistence().cacheResult(bookingses);
	}

	/**
	 * Creates a new bookings with the primary key. Does not add the bookings to the database.
	 *
	 * @param bookingsId the primary key for the new bookings
	 * @return the new bookings
	 */
	public static bookings create(long bookingsId) {
		return getPersistence().create(bookingsId);
	}

	/**
	 * Removes the bookings with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bookingsId the primary key of the bookings
	 * @return the bookings that was removed
	 * @throws NoSuchbookingsException if a bookings with the primary key could not be found
	 */
	public static bookings remove(long bookingsId)
		throws com.rideapp.publishride.exception.NoSuchbookingsException {

		return getPersistence().remove(bookingsId);
	}

	public static bookings updateImpl(bookings bookings) {
		return getPersistence().updateImpl(bookings);
	}

	/**
	 * Returns the bookings with the primary key or throws a <code>NoSuchbookingsException</code> if it could not be found.
	 *
	 * @param bookingsId the primary key of the bookings
	 * @return the bookings
	 * @throws NoSuchbookingsException if a bookings with the primary key could not be found
	 */
	public static bookings findByPrimaryKey(long bookingsId)
		throws com.rideapp.publishride.exception.NoSuchbookingsException {

		return getPersistence().findByPrimaryKey(bookingsId);
	}

	/**
	 * Returns the bookings with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bookingsId the primary key of the bookings
	 * @return the bookings, or <code>null</code> if a bookings with the primary key could not be found
	 */
	public static bookings fetchByPrimaryKey(long bookingsId) {
		return getPersistence().fetchByPrimaryKey(bookingsId);
	}

	/**
	 * Returns all the bookingses.
	 *
	 * @return the bookingses
	 */
	public static List<bookings> findAll() {
		return getPersistence().findAll();
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
	public static List<bookings> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<bookings> findAll(
		int start, int end, OrderByComparator<bookings> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<bookings> findAll(
		int start, int end, OrderByComparator<bookings> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the bookingses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of bookingses.
	 *
	 * @return the number of bookingses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static bookingsPersistence getPersistence() {
		return _persistence;
	}

	private static volatile bookingsPersistence _persistence;

}