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

import com.rideapp.publishride.exception.NoSuchreturnRideException;
import com.rideapp.publishride.model.returnRide;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the return ride service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see returnRideUtil
 * @generated
 */
@ProviderType
public interface returnRidePersistence extends BasePersistence<returnRide> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link returnRideUtil} to access the return ride persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the return ride in the entity cache if it is enabled.
	 *
	 * @param returnRide the return ride
	 */
	public void cacheResult(returnRide returnRide);

	/**
	 * Caches the return rides in the entity cache if it is enabled.
	 *
	 * @param returnRides the return rides
	 */
	public void cacheResult(java.util.List<returnRide> returnRides);

	/**
	 * Creates a new return ride with the primary key. Does not add the return ride to the database.
	 *
	 * @param returnRideId the primary key for the new return ride
	 * @return the new return ride
	 */
	public returnRide create(long returnRideId);

	/**
	 * Removes the return ride with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param returnRideId the primary key of the return ride
	 * @return the return ride that was removed
	 * @throws NoSuchreturnRideException if a return ride with the primary key could not be found
	 */
	public returnRide remove(long returnRideId)
		throws NoSuchreturnRideException;

	public returnRide updateImpl(returnRide returnRide);

	/**
	 * Returns the return ride with the primary key or throws a <code>NoSuchreturnRideException</code> if it could not be found.
	 *
	 * @param returnRideId the primary key of the return ride
	 * @return the return ride
	 * @throws NoSuchreturnRideException if a return ride with the primary key could not be found
	 */
	public returnRide findByPrimaryKey(long returnRideId)
		throws NoSuchreturnRideException;

	/**
	 * Returns the return ride with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param returnRideId the primary key of the return ride
	 * @return the return ride, or <code>null</code> if a return ride with the primary key could not be found
	 */
	public returnRide fetchByPrimaryKey(long returnRideId);

	/**
	 * Returns all the return rides.
	 *
	 * @return the return rides
	 */
	public java.util.List<returnRide> findAll();

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
	public java.util.List<returnRide> findAll(int start, int end);

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
	public java.util.List<returnRide> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<returnRide>
			orderByComparator);

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
	public java.util.List<returnRide> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<returnRide>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the return rides from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of return rides.
	 *
	 * @return the number of return rides
	 */
	public int countAll();

}