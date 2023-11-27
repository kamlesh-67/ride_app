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

import com.rideapp.publishride.exception.NoSuchbookingsException;
import com.rideapp.publishride.model.bookings;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the bookings service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see bookingsUtil
 * @generated
 */
@ProviderType
public interface bookingsPersistence extends BasePersistence<bookings> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link bookingsUtil} to access the bookings persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the bookings in the entity cache if it is enabled.
	 *
	 * @param bookings the bookings
	 */
	public void cacheResult(bookings bookings);

	/**
	 * Caches the bookingses in the entity cache if it is enabled.
	 *
	 * @param bookingses the bookingses
	 */
	public void cacheResult(java.util.List<bookings> bookingses);

	/**
	 * Creates a new bookings with the primary key. Does not add the bookings to the database.
	 *
	 * @param bookingsId the primary key for the new bookings
	 * @return the new bookings
	 */
	public bookings create(long bookingsId);

	/**
	 * Removes the bookings with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bookingsId the primary key of the bookings
	 * @return the bookings that was removed
	 * @throws NoSuchbookingsException if a bookings with the primary key could not be found
	 */
	public bookings remove(long bookingsId) throws NoSuchbookingsException;

	public bookings updateImpl(bookings bookings);

	/**
	 * Returns the bookings with the primary key or throws a <code>NoSuchbookingsException</code> if it could not be found.
	 *
	 * @param bookingsId the primary key of the bookings
	 * @return the bookings
	 * @throws NoSuchbookingsException if a bookings with the primary key could not be found
	 */
	public bookings findByPrimaryKey(long bookingsId)
		throws NoSuchbookingsException;

	/**
	 * Returns the bookings with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bookingsId the primary key of the bookings
	 * @return the bookings, or <code>null</code> if a bookings with the primary key could not be found
	 */
	public bookings fetchByPrimaryKey(long bookingsId);

	/**
	 * Returns all the bookingses.
	 *
	 * @return the bookingses
	 */
	public java.util.List<bookings> findAll();

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
	public java.util.List<bookings> findAll(int start, int end);

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
	public java.util.List<bookings> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bookings>
			orderByComparator);

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
	public java.util.List<bookings> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bookings>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the bookingses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of bookingses.
	 *
	 * @return the number of bookingses
	 */
	public int countAll();

}