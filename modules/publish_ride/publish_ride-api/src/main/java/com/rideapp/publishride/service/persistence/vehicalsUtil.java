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

import com.rideapp.publishride.model.vehicals;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the vehicals service. This utility wraps <code>com.rideapp.publishride.service.persistence.impl.vehicalsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vehicalsPersistence
 * @generated
 */
public class vehicalsUtil {

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
	public static void clearCache(vehicals vehicals) {
		getPersistence().clearCache(vehicals);
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
	public static Map<Serializable, vehicals> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<vehicals> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<vehicals> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<vehicals> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<vehicals> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static vehicals update(vehicals vehicals) {
		return getPersistence().update(vehicals);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static vehicals update(
		vehicals vehicals, ServiceContext serviceContext) {

		return getPersistence().update(vehicals, serviceContext);
	}

	/**
	 * Caches the vehicals in the entity cache if it is enabled.
	 *
	 * @param vehicals the vehicals
	 */
	public static void cacheResult(vehicals vehicals) {
		getPersistence().cacheResult(vehicals);
	}

	/**
	 * Caches the vehicalses in the entity cache if it is enabled.
	 *
	 * @param vehicalses the vehicalses
	 */
	public static void cacheResult(List<vehicals> vehicalses) {
		getPersistence().cacheResult(vehicalses);
	}

	/**
	 * Creates a new vehicals with the primary key. Does not add the vehicals to the database.
	 *
	 * @param vehicalsId the primary key for the new vehicals
	 * @return the new vehicals
	 */
	public static vehicals create(long vehicalsId) {
		return getPersistence().create(vehicalsId);
	}

	/**
	 * Removes the vehicals with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vehicalsId the primary key of the vehicals
	 * @return the vehicals that was removed
	 * @throws NoSuchvehicalsException if a vehicals with the primary key could not be found
	 */
	public static vehicals remove(long vehicalsId)
		throws com.rideapp.publishride.exception.NoSuchvehicalsException {

		return getPersistence().remove(vehicalsId);
	}

	public static vehicals updateImpl(vehicals vehicals) {
		return getPersistence().updateImpl(vehicals);
	}

	/**
	 * Returns the vehicals with the primary key or throws a <code>NoSuchvehicalsException</code> if it could not be found.
	 *
	 * @param vehicalsId the primary key of the vehicals
	 * @return the vehicals
	 * @throws NoSuchvehicalsException if a vehicals with the primary key could not be found
	 */
	public static vehicals findByPrimaryKey(long vehicalsId)
		throws com.rideapp.publishride.exception.NoSuchvehicalsException {

		return getPersistence().findByPrimaryKey(vehicalsId);
	}

	/**
	 * Returns the vehicals with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vehicalsId the primary key of the vehicals
	 * @return the vehicals, or <code>null</code> if a vehicals with the primary key could not be found
	 */
	public static vehicals fetchByPrimaryKey(long vehicalsId) {
		return getPersistence().fetchByPrimaryKey(vehicalsId);
	}

	/**
	 * Returns all the vehicalses.
	 *
	 * @return the vehicalses
	 */
	public static List<vehicals> findAll() {
		return getPersistence().findAll();
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
	public static List<vehicals> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<vehicals> findAll(
		int start, int end, OrderByComparator<vehicals> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<vehicals> findAll(
		int start, int end, OrderByComparator<vehicals> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the vehicalses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of vehicalses.
	 *
	 * @return the number of vehicalses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static vehicalsPersistence getPersistence() {
		return _persistence;
	}

	private static volatile vehicalsPersistence _persistence;

}