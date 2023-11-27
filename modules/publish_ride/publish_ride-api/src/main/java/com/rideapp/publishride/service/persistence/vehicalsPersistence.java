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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.rideapp.publishride.exception.NoSuchvehicalsException;
import com.rideapp.publishride.model.vehicals;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the vehicals service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vehicalsUtil
 * @generated
 */
@ProviderType
public interface vehicalsPersistence extends BasePersistence<vehicals> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link vehicalsUtil} to access the vehicals persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the vehicals in the entity cache if it is enabled.
	 *
	 * @param vehicals the vehicals
	 */
	public void cacheResult(vehicals vehicals);

	/**
	 * Caches the vehicalses in the entity cache if it is enabled.
	 *
	 * @param vehicalses the vehicalses
	 */
	public void cacheResult(java.util.List<vehicals> vehicalses);

	/**
	 * Creates a new vehicals with the primary key. Does not add the vehicals to the database.
	 *
	 * @param vehicalsId the primary key for the new vehicals
	 * @return the new vehicals
	 */
	public vehicals create(long vehicalsId);

	/**
	 * Removes the vehicals with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vehicalsId the primary key of the vehicals
	 * @return the vehicals that was removed
	 * @throws NoSuchvehicalsException if a vehicals with the primary key could not be found
	 */
	public vehicals remove(long vehicalsId) throws NoSuchvehicalsException;

	public vehicals updateImpl(vehicals vehicals);

	/**
	 * Returns the vehicals with the primary key or throws a <code>NoSuchvehicalsException</code> if it could not be found.
	 *
	 * @param vehicalsId the primary key of the vehicals
	 * @return the vehicals
	 * @throws NoSuchvehicalsException if a vehicals with the primary key could not be found
	 */
	public vehicals findByPrimaryKey(long vehicalsId)
		throws NoSuchvehicalsException;

	/**
	 * Returns the vehicals with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vehicalsId the primary key of the vehicals
	 * @return the vehicals, or <code>null</code> if a vehicals with the primary key could not be found
	 */
	public vehicals fetchByPrimaryKey(long vehicalsId);

	/**
	 * Returns all the vehicalses.
	 *
	 * @return the vehicalses
	 */
	public java.util.List<vehicals> findAll();

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
	public java.util.List<vehicals> findAll(int start, int end);

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
	public java.util.List<vehicals> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vehicals>
			orderByComparator);

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
	public java.util.List<vehicals> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vehicals>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the vehicalses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of vehicalses.
	 *
	 * @return the number of vehicalses
	 */
	public int countAll();

}