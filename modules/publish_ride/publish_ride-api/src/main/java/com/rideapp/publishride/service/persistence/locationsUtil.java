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

import com.rideapp.publishride.model.locations;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the locations service. This utility wraps <code>com.rideapp.publishride.service.persistence.impl.locationsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see locationsPersistence
 * @generated
 */
public class locationsUtil {

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
	public static void clearCache(locations locations) {
		getPersistence().clearCache(locations);
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
	public static Map<Serializable, locations> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<locations> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<locations> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<locations> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<locations> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static locations update(locations locations) {
		return getPersistence().update(locations);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static locations update(
		locations locations, ServiceContext serviceContext) {

		return getPersistence().update(locations, serviceContext);
	}

	/**
	 * Caches the locations in the entity cache if it is enabled.
	 *
	 * @param locations the locations
	 */
	public static void cacheResult(locations locations) {
		getPersistence().cacheResult(locations);
	}

	/**
	 * Caches the locationses in the entity cache if it is enabled.
	 *
	 * @param locationses the locationses
	 */
	public static void cacheResult(List<locations> locationses) {
		getPersistence().cacheResult(locationses);
	}

	/**
	 * Creates a new locations with the primary key. Does not add the locations to the database.
	 *
	 * @param locationsId the primary key for the new locations
	 * @return the new locations
	 */
	public static locations create(long locationsId) {
		return getPersistence().create(locationsId);
	}

	/**
	 * Removes the locations with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param locationsId the primary key of the locations
	 * @return the locations that was removed
	 * @throws NoSuchlocationsException if a locations with the primary key could not be found
	 */
	public static locations remove(long locationsId)
		throws com.rideapp.publishride.exception.NoSuchlocationsException {

		return getPersistence().remove(locationsId);
	}

	public static locations updateImpl(locations locations) {
		return getPersistence().updateImpl(locations);
	}

	/**
	 * Returns the locations with the primary key or throws a <code>NoSuchlocationsException</code> if it could not be found.
	 *
	 * @param locationsId the primary key of the locations
	 * @return the locations
	 * @throws NoSuchlocationsException if a locations with the primary key could not be found
	 */
	public static locations findByPrimaryKey(long locationsId)
		throws com.rideapp.publishride.exception.NoSuchlocationsException {

		return getPersistence().findByPrimaryKey(locationsId);
	}

	/**
	 * Returns the locations with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param locationsId the primary key of the locations
	 * @return the locations, or <code>null</code> if a locations with the primary key could not be found
	 */
	public static locations fetchByPrimaryKey(long locationsId) {
		return getPersistence().fetchByPrimaryKey(locationsId);
	}

	/**
	 * Returns all the locationses.
	 *
	 * @return the locationses
	 */
	public static List<locations> findAll() {
		return getPersistence().findAll();
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
	public static List<locations> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<locations> findAll(
		int start, int end, OrderByComparator<locations> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<locations> findAll(
		int start, int end, OrderByComparator<locations> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the locationses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of locationses.
	 *
	 * @return the number of locationses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static locationsPersistence getPersistence() {
		return _persistence;
	}

	private static volatile locationsPersistence _persistence;

}