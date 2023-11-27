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

import com.rideapp.publishride.model.stopovers;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the stopovers service. This utility wraps <code>com.rideapp.publishride.service.persistence.impl.stopoversPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see stopoversPersistence
 * @generated
 */
public class stopoversUtil {

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
	public static void clearCache(stopovers stopovers) {
		getPersistence().clearCache(stopovers);
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
	public static Map<Serializable, stopovers> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<stopovers> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<stopovers> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<stopovers> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<stopovers> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static stopovers update(stopovers stopovers) {
		return getPersistence().update(stopovers);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static stopovers update(
		stopovers stopovers, ServiceContext serviceContext) {

		return getPersistence().update(stopovers, serviceContext);
	}

	/**
	 * Caches the stopovers in the entity cache if it is enabled.
	 *
	 * @param stopovers the stopovers
	 */
	public static void cacheResult(stopovers stopovers) {
		getPersistence().cacheResult(stopovers);
	}

	/**
	 * Caches the stopoverses in the entity cache if it is enabled.
	 *
	 * @param stopoverses the stopoverses
	 */
	public static void cacheResult(List<stopovers> stopoverses) {
		getPersistence().cacheResult(stopoverses);
	}

	/**
	 * Creates a new stopovers with the primary key. Does not add the stopovers to the database.
	 *
	 * @param stopoversId the primary key for the new stopovers
	 * @return the new stopovers
	 */
	public static stopovers create(long stopoversId) {
		return getPersistence().create(stopoversId);
	}

	/**
	 * Removes the stopovers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param stopoversId the primary key of the stopovers
	 * @return the stopovers that was removed
	 * @throws NoSuchstopoversException if a stopovers with the primary key could not be found
	 */
	public static stopovers remove(long stopoversId)
		throws com.rideapp.publishride.exception.NoSuchstopoversException {

		return getPersistence().remove(stopoversId);
	}

	public static stopovers updateImpl(stopovers stopovers) {
		return getPersistence().updateImpl(stopovers);
	}

	/**
	 * Returns the stopovers with the primary key or throws a <code>NoSuchstopoversException</code> if it could not be found.
	 *
	 * @param stopoversId the primary key of the stopovers
	 * @return the stopovers
	 * @throws NoSuchstopoversException if a stopovers with the primary key could not be found
	 */
	public static stopovers findByPrimaryKey(long stopoversId)
		throws com.rideapp.publishride.exception.NoSuchstopoversException {

		return getPersistence().findByPrimaryKey(stopoversId);
	}

	/**
	 * Returns the stopovers with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param stopoversId the primary key of the stopovers
	 * @return the stopovers, or <code>null</code> if a stopovers with the primary key could not be found
	 */
	public static stopovers fetchByPrimaryKey(long stopoversId) {
		return getPersistence().fetchByPrimaryKey(stopoversId);
	}

	/**
	 * Returns all the stopoverses.
	 *
	 * @return the stopoverses
	 */
	public static List<stopovers> findAll() {
		return getPersistence().findAll();
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
	public static List<stopovers> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<stopovers> findAll(
		int start, int end, OrderByComparator<stopovers> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<stopovers> findAll(
		int start, int end, OrderByComparator<stopovers> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the stopoverses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of stopoverses.
	 *
	 * @return the number of stopoverses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static stopoversPersistence getPersistence() {
		return _persistence;
	}

	private static volatile stopoversPersistence _persistence;

}