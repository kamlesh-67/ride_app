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

package com.rideapp.publishride.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link bookingsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see bookingsLocalService
 * @generated
 */
public class bookingsLocalServiceWrapper
	implements bookingsLocalService, ServiceWrapper<bookingsLocalService> {

	public bookingsLocalServiceWrapper() {
		this(null);
	}

	public bookingsLocalServiceWrapper(
		bookingsLocalService bookingsLocalService) {

		_bookingsLocalService = bookingsLocalService;
	}

	/**
	 * Adds the bookings to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect bookingsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bookings the bookings
	 * @return the bookings that was added
	 */
	@Override
	public com.rideapp.publishride.model.bookings addbookings(
		com.rideapp.publishride.model.bookings bookings) {

		return _bookingsLocalService.addbookings(bookings);
	}

	/**
	 * Creates a new bookings with the primary key. Does not add the bookings to the database.
	 *
	 * @param bookingsId the primary key for the new bookings
	 * @return the new bookings
	 */
	@Override
	public com.rideapp.publishride.model.bookings createbookings(
		long bookingsId) {

		return _bookingsLocalService.createbookings(bookingsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bookingsLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the bookings from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect bookingsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bookings the bookings
	 * @return the bookings that was removed
	 */
	@Override
	public com.rideapp.publishride.model.bookings deletebookings(
		com.rideapp.publishride.model.bookings bookings) {

		return _bookingsLocalService.deletebookings(bookings);
	}

	/**
	 * Deletes the bookings with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect bookingsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bookingsId the primary key of the bookings
	 * @return the bookings that was removed
	 * @throws PortalException if a bookings with the primary key could not be found
	 */
	@Override
	public com.rideapp.publishride.model.bookings deletebookings(
			long bookingsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bookingsLocalService.deletebookings(bookingsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bookingsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _bookingsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _bookingsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _bookingsLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _bookingsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.rideapp.publishride.model.impl.bookingsModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _bookingsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.rideapp.publishride.model.impl.bookingsModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _bookingsLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _bookingsLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _bookingsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.rideapp.publishride.model.bookings fetchbookings(
		long bookingsId) {

		return _bookingsLocalService.fetchbookings(bookingsId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _bookingsLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the bookings with the primary key.
	 *
	 * @param bookingsId the primary key of the bookings
	 * @return the bookings
	 * @throws PortalException if a bookings with the primary key could not be found
	 */
	@Override
	public com.rideapp.publishride.model.bookings getbookings(long bookingsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bookingsLocalService.getbookings(bookingsId);
	}

	/**
	 * Returns a range of all the bookingses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.rideapp.publishride.model.impl.bookingsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of bookingses
	 * @param end the upper bound of the range of bookingses (not inclusive)
	 * @return the range of bookingses
	 */
	@Override
	public java.util.List<com.rideapp.publishride.model.bookings> getbookingses(
		int start, int end) {

		return _bookingsLocalService.getbookingses(start, end);
	}

	/**
	 * Returns the number of bookingses.
	 *
	 * @return the number of bookingses
	 */
	@Override
	public int getbookingsesCount() {
		return _bookingsLocalService.getbookingsesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _bookingsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _bookingsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bookingsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the bookings in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect bookingsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param bookings the bookings
	 * @return the bookings that was updated
	 */
	@Override
	public com.rideapp.publishride.model.bookings updatebookings(
		com.rideapp.publishride.model.bookings bookings) {

		return _bookingsLocalService.updatebookings(bookings);
	}

	@Override
	public bookingsLocalService getWrappedService() {
		return _bookingsLocalService;
	}

	@Override
	public void setWrappedService(bookingsLocalService bookingsLocalService) {
		_bookingsLocalService = bookingsLocalService;
	}

	private bookingsLocalService _bookingsLocalService;

}