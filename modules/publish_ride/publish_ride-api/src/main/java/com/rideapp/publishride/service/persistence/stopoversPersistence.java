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

import com.rideapp.publishride.exception.NoSuchstopoversException;
import com.rideapp.publishride.model.stopovers;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the stopovers service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see stopoversUtil
 * @generated
 */
@ProviderType
public interface stopoversPersistence extends BasePersistence<stopovers> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link stopoversUtil} to access the stopovers persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the stopovers in the entity cache if it is enabled.
	 *
	 * @param stopovers the stopovers
	 */
	public void cacheResult(stopovers stopovers);

	/**
	 * Caches the stopoverses in the entity cache if it is enabled.
	 *
	 * @param stopoverses the stopoverses
	 */
	public void cacheResult(java.util.List<stopovers> stopoverses);

	/**
	 * Creates a new stopovers with the primary key. Does not add the stopovers to the database.
	 *
	 * @param stopoversId the primary key for the new stopovers
	 * @return the new stopovers
	 */
	public stopovers create(long stopoversId);

	/**
	 * Removes the stopovers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param stopoversId the primary key of the stopovers
	 * @return the stopovers that was removed
	 * @throws NoSuchstopoversException if a stopovers with the primary key could not be found
	 */
	public stopovers remove(long stopoversId) throws NoSuchstopoversException;

	public stopovers updateImpl(stopovers stopovers);

	/**
	 * Returns the stopovers with the primary key or throws a <code>NoSuchstopoversException</code> if it could not be found.
	 *
	 * @param stopoversId the primary key of the stopovers
	 * @return the stopovers
	 * @throws NoSuchstopoversException if a stopovers with the primary key could not be found
	 */
	public stopovers findByPrimaryKey(long stopoversId)
		throws NoSuchstopoversException;

	/**
	 * Returns the stopovers with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param stopoversId the primary key of the stopovers
	 * @return the stopovers, or <code>null</code> if a stopovers with the primary key could not be found
	 */
	public stopovers fetchByPrimaryKey(long stopoversId);

	/**
	 * Returns all the stopoverses.
	 *
	 * @return the stopoverses
	 */
	public java.util.List<stopovers> findAll();

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
	public java.util.List<stopovers> findAll(int start, int end);

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
	public java.util.List<stopovers> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<stopovers>
			orderByComparator);

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
	public java.util.List<stopovers> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<stopovers>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the stopoverses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of stopoverses.
	 *
	 * @return the number of stopoverses
	 */
	public int countAll();

}