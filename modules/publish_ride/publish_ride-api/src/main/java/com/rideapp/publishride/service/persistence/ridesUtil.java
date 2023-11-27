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

import com.rideapp.publishride.model.rides;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the rides service. This utility wraps <code>com.rideapp.publishride.service.persistence.impl.ridesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ridesPersistence
 * @generated
 */
public class ridesUtil {

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
	public static void clearCache(rides rides) {
		getPersistence().clearCache(rides);
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
	public static Map<Serializable, rides> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<rides> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<rides> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<rides> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<rides> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static rides update(rides rides) {
		return getPersistence().update(rides);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static rides update(rides rides, ServiceContext serviceContext) {
		return getPersistence().update(rides, serviceContext);
	}

	/**
	 * Caches the rides in the entity cache if it is enabled.
	 *
	 * @param rides the rides
	 */
	public static void cacheResult(rides rides) {
		getPersistence().cacheResult(rides);
	}

	/**
	 * Caches the rideses in the entity cache if it is enabled.
	 *
	 * @param rideses the rideses
	 */
	public static void cacheResult(List<rides> rideses) {
		getPersistence().cacheResult(rideses);
	}

	/**
	 * Creates a new rides with the primary key. Does not add the rides to the database.
	 *
	 * @param ridesId the primary key for the new rides
	 * @return the new rides
	 */
	public static rides create(long ridesId) {
		return getPersistence().create(ridesId);
	}

	/**
	 * Removes the rides with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ridesId the primary key of the rides
	 * @return the rides that was removed
	 * @throws NoSuchridesException if a rides with the primary key could not be found
	 */
	public static rides remove(long ridesId)
		throws com.rideapp.publishride.exception.NoSuchridesException {

		return getPersistence().remove(ridesId);
	}

	public static rides updateImpl(rides rides) {
		return getPersistence().updateImpl(rides);
	}

	/**
	 * Returns the rides with the primary key or throws a <code>NoSuchridesException</code> if it could not be found.
	 *
	 * @param ridesId the primary key of the rides
	 * @return the rides
	 * @throws NoSuchridesException if a rides with the primary key could not be found
	 */
	public static rides findByPrimaryKey(long ridesId)
		throws com.rideapp.publishride.exception.NoSuchridesException {

		return getPersistence().findByPrimaryKey(ridesId);
	}

	/**
	 * Returns the rides with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ridesId the primary key of the rides
	 * @return the rides, or <code>null</code> if a rides with the primary key could not be found
	 */
	public static rides fetchByPrimaryKey(long ridesId) {
		return getPersistence().fetchByPrimaryKey(ridesId);
	}

	/**
	 * Returns all the rideses.
	 *
	 * @return the rideses
	 */
	public static List<rides> findAll() {
		return getPersistence().findAll();
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
	public static List<rides> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<rides> findAll(
		int start, int end, OrderByComparator<rides> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<rides> findAll(
		int start, int end, OrderByComparator<rides> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the rideses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of rideses.
	 *
	 * @return the number of rideses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ridesPersistence getPersistence() {
		return _persistence;
	}

	private static volatile ridesPersistence _persistence;

}