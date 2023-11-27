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
 * Provides a wrapper for {@link locationsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see locationsLocalService
 * @generated
 */
public class locationsLocalServiceWrapper
	implements locationsLocalService, ServiceWrapper<locationsLocalService> {

	public locationsLocalServiceWrapper() {
		this(null);
	}

	public locationsLocalServiceWrapper(
		locationsLocalService locationsLocalService) {

		_locationsLocalService = locationsLocalService;
	}

	/**
	 * Adds the locations to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect locationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param locations the locations
	 * @return the locations that was added
	 */
	@Override
	public com.rideapp.publishride.model.locations addlocations(
		com.rideapp.publishride.model.locations locations) {

		return _locationsLocalService.addlocations(locations);
	}

	/**
	 * Creates a new locations with the primary key. Does not add the locations to the database.
	 *
	 * @param locationsId the primary key for the new locations
	 * @return the new locations
	 */
	@Override
	public com.rideapp.publishride.model.locations createlocations(
		long locationsId) {

		return _locationsLocalService.createlocations(locationsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _locationsLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the locations from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect locationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param locations the locations
	 * @return the locations that was removed
	 */
	@Override
	public com.rideapp.publishride.model.locations deletelocations(
		com.rideapp.publishride.model.locations locations) {

		return _locationsLocalService.deletelocations(locations);
	}

	/**
	 * Deletes the locations with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect locationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param locationsId the primary key of the locations
	 * @return the locations that was removed
	 * @throws PortalException if a locations with the primary key could not be found
	 */
	@Override
	public com.rideapp.publishride.model.locations deletelocations(
			long locationsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _locationsLocalService.deletelocations(locationsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _locationsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _locationsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _locationsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _locationsLocalService.dynamicQuery();
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

		return _locationsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.rideapp.publishride.model.impl.locationsModelImpl</code>.
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

		return _locationsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.rideapp.publishride.model.impl.locationsModelImpl</code>.
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

		return _locationsLocalService.dynamicQuery(
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

		return _locationsLocalService.dynamicQueryCount(dynamicQuery);
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

		return _locationsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.rideapp.publishride.model.locations fetchlocations(
		long locationsId) {

		return _locationsLocalService.fetchlocations(locationsId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _locationsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _locationsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the locations with the primary key.
	 *
	 * @param locationsId the primary key of the locations
	 * @return the locations
	 * @throws PortalException if a locations with the primary key could not be found
	 */
	@Override
	public com.rideapp.publishride.model.locations getlocations(
			long locationsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _locationsLocalService.getlocations(locationsId);
	}

	/**
	 * Returns a range of all the locationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.rideapp.publishride.model.impl.locationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of locationses
	 * @param end the upper bound of the range of locationses (not inclusive)
	 * @return the range of locationses
	 */
	@Override
	public java.util.List<com.rideapp.publishride.model.locations>
		getlocationses(int start, int end) {

		return _locationsLocalService.getlocationses(start, end);
	}

	/**
	 * Returns the number of locationses.
	 *
	 * @return the number of locationses
	 */
	@Override
	public int getlocationsesCount() {
		return _locationsLocalService.getlocationsesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _locationsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _locationsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the locations in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect locationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param locations the locations
	 * @return the locations that was updated
	 */
	@Override
	public com.rideapp.publishride.model.locations updatelocations(
		com.rideapp.publishride.model.locations locations) {

		return _locationsLocalService.updatelocations(locations);
	}

	@Override
	public locationsLocalService getWrappedService() {
		return _locationsLocalService;
	}

	@Override
	public void setWrappedService(locationsLocalService locationsLocalService) {
		_locationsLocalService = locationsLocalService;
	}

	private locationsLocalService _locationsLocalService;

}