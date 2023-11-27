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

import com.rideapp.publishride.model.returnRide;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the return ride service. This utility wraps <code>com.rideapp.publishride.service.persistence.impl.returnRidePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see returnRidePersistence
 * @generated
 */
public class returnRideUtil {

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
	public static void clearCache(returnRide returnRide) {
		getPersistence().clearCache(returnRide);
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
	public static Map<Serializable, returnRide> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<returnRide> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<returnRide> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<returnRide> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<returnRide> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static returnRide update(returnRide returnRide) {
		return getPersistence().update(returnRide);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static returnRide update(
		returnRide returnRide, ServiceContext serviceContext) {

		return getPersistence().update(returnRide, serviceContext);
	}

	/**
	 * Caches the return ride in the entity cache if it is enabled.
	 *
	 * @param returnRide the return ride
	 */
	public static void cacheResult(returnRide returnRide) {
		getPersistence().cacheResult(returnRide);
	}

	/**
	 * Caches the return rides in the entity cache if it is enabled.
	 *
	 * @param returnRides the return rides
	 */
	public static void cacheResult(List<returnRide> returnRides) {
		getPersistence().cacheResult(returnRides);
	}

	/**
	 * Creates a new return ride with the primary key. Does not add the return ride to the database.
	 *
	 * @param returnRideId the primary key for the new return ride
	 * @return the new return ride
	 */
	public static returnRide create(long returnRideId) {
		return getPersistence().create(returnRideId);
	}

	/**
	 * Removes the return ride with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param returnRideId the primary key of the return ride
	 * @return the return ride that was removed
	 * @throws NoSuchreturnRideException if a return ride with the primary key could not be found
	 */
	public static returnRide remove(long returnRideId)
		throws com.rideapp.publishride.exception.NoSuchreturnRideException {

		return getPersistence().remove(returnRideId);
	}

	public static returnRide updateImpl(returnRide returnRide) {
		return getPersistence().updateImpl(returnRide);
	}

	/**
	 * Returns the return ride with the primary key or throws a <code>NoSuchreturnRideException</code> if it could not be found.
	 *
	 * @param returnRideId the primary key of the return ride
	 * @return the return ride
	 * @throws NoSuchreturnRideException if a return ride with the primary key could not be found
	 */
	public static returnRide findByPrimaryKey(long returnRideId)
		throws com.rideapp.publishride.exception.NoSuchreturnRideException {

		return getPersistence().findByPrimaryKey(returnRideId);
	}

	/**
	 * Returns the return ride with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param returnRideId the primary key of the return ride
	 * @return the return ride, or <code>null</code> if a return ride with the primary key could not be found
	 */
	public static returnRide fetchByPrimaryKey(long returnRideId) {
		return getPersistence().fetchByPrimaryKey(returnRideId);
	}

	/**
	 * Returns all the return rides.
	 *
	 * @return the return rides
	 */
	public static List<returnRide> findAll() {
		return getPersistence().findAll();
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
	public static List<returnRide> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<returnRide> findAll(
		int start, int end, OrderByComparator<returnRide> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<returnRide> findAll(
		int start, int end, OrderByComparator<returnRide> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the return rides from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of return rides.
	 *
	 * @return the number of return rides
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static returnRidePersistence getPersistence() {
		return _persistence;
	}

	private static volatile returnRidePersistence _persistence;

}