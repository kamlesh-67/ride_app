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

import com.rideapp.publishride.exception.NoSuchridesException;
import com.rideapp.publishride.model.rides;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the rides service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ridesUtil
 * @generated
 */
@ProviderType
public interface ridesPersistence extends BasePersistence<rides> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ridesUtil} to access the rides persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the rides in the entity cache if it is enabled.
	 *
	 * @param rides the rides
	 */
	public void cacheResult(rides rides);

	/**
	 * Caches the rideses in the entity cache if it is enabled.
	 *
	 * @param rideses the rideses
	 */
	public void cacheResult(java.util.List<rides> rideses);

	/**
	 * Creates a new rides with the primary key. Does not add the rides to the database.
	 *
	 * @param ridesId the primary key for the new rides
	 * @return the new rides
	 */
	public rides create(long ridesId);

	/**
	 * Removes the rides with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ridesId the primary key of the rides
	 * @return the rides that was removed
	 * @throws NoSuchridesException if a rides with the primary key could not be found
	 */
	public rides remove(long ridesId) throws NoSuchridesException;

	public rides updateImpl(rides rides);

	/**
	 * Returns the rides with the primary key or throws a <code>NoSuchridesException</code> if it could not be found.
	 *
	 * @param ridesId the primary key of the rides
	 * @return the rides
	 * @throws NoSuchridesException if a rides with the primary key could not be found
	 */
	public rides findByPrimaryKey(long ridesId) throws NoSuchridesException;

	/**
	 * Returns the rides with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ridesId the primary key of the rides
	 * @return the rides, or <code>null</code> if a rides with the primary key could not be found
	 */
	public rides fetchByPrimaryKey(long ridesId);

	/**
	 * Returns all the rideses.
	 *
	 * @return the rideses
	 */
	public java.util.List<rides> findAll();

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
	public java.util.List<rides> findAll(int start, int end);

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
	public java.util.List<rides> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<rides>
			orderByComparator);

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
	public java.util.List<rides> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<rides>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the rideses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of rideses.
	 *
	 * @return the number of rideses
	 */
	public int countAll();

}