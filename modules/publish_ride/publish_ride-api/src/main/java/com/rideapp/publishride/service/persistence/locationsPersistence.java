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

import com.rideapp.publishride.exception.NoSuchlocationsException;
import com.rideapp.publishride.model.locations;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the locations service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see locationsUtil
 * @generated
 */
@ProviderType
public interface locationsPersistence extends BasePersistence<locations> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link locationsUtil} to access the locations persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the locations in the entity cache if it is enabled.
	 *
	 * @param locations the locations
	 */
	public void cacheResult(locations locations);

	/**
	 * Caches the locationses in the entity cache if it is enabled.
	 *
	 * @param locationses the locationses
	 */
	public void cacheResult(java.util.List<locations> locationses);

	/**
	 * Creates a new locations with the primary key. Does not add the locations to the database.
	 *
	 * @param locationsId the primary key for the new locations
	 * @return the new locations
	 */
	public locations create(long locationsId);

	/**
	 * Removes the locations with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param locationsId the primary key of the locations
	 * @return the locations that was removed
	 * @throws NoSuchlocationsException if a locations with the primary key could not be found
	 */
	public locations remove(long locationsId) throws NoSuchlocationsException;

	public locations updateImpl(locations locations);

	/**
	 * Returns the locations with the primary key or throws a <code>NoSuchlocationsException</code> if it could not be found.
	 *
	 * @param locationsId the primary key of the locations
	 * @return the locations
	 * @throws NoSuchlocationsException if a locations with the primary key could not be found
	 */
	public locations findByPrimaryKey(long locationsId)
		throws NoSuchlocationsException;

	/**
	 * Returns the locations with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param locationsId the primary key of the locations
	 * @return the locations, or <code>null</code> if a locations with the primary key could not be found
	 */
	public locations fetchByPrimaryKey(long locationsId);

	/**
	 * Returns all the locationses.
	 *
	 * @return the locationses
	 */
	public java.util.List<locations> findAll();

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
	public java.util.List<locations> findAll(int start, int end);

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
	public java.util.List<locations> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<locations>
			orderByComparator);

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
	public java.util.List<locations> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<locations>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the locationses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of locationses.
	 *
	 * @return the number of locationses
	 */
	public int countAll();

}