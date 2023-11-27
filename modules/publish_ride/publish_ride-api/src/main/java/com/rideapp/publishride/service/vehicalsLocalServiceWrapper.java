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
 * Provides a wrapper for {@link vehicalsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see vehicalsLocalService
 * @generated
 */
public class vehicalsLocalServiceWrapper
	implements ServiceWrapper<vehicalsLocalService>, vehicalsLocalService {

	public vehicalsLocalServiceWrapper() {
		this(null);
	}

	public vehicalsLocalServiceWrapper(
		vehicalsLocalService vehicalsLocalService) {

		_vehicalsLocalService = vehicalsLocalService;
	}

	/**
	 * Adds the vehicals to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect vehicalsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param vehicals the vehicals
	 * @return the vehicals that was added
	 */
	@Override
	public com.rideapp.publishride.model.vehicals addvehicals(
		com.rideapp.publishride.model.vehicals vehicals) {

		return _vehicalsLocalService.addvehicals(vehicals);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _vehicalsLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new vehicals with the primary key. Does not add the vehicals to the database.
	 *
	 * @param vehicalsId the primary key for the new vehicals
	 * @return the new vehicals
	 */
	@Override
	public com.rideapp.publishride.model.vehicals createvehicals(
		long vehicalsId) {

		return _vehicalsLocalService.createvehicals(vehicalsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _vehicalsLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the vehicals with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect vehicalsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param vehicalsId the primary key of the vehicals
	 * @return the vehicals that was removed
	 * @throws PortalException if a vehicals with the primary key could not be found
	 */
	@Override
	public com.rideapp.publishride.model.vehicals deletevehicals(
			long vehicalsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _vehicalsLocalService.deletevehicals(vehicalsId);
	}

	/**
	 * Deletes the vehicals from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect vehicalsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param vehicals the vehicals
	 * @return the vehicals that was removed
	 */
	@Override
	public com.rideapp.publishride.model.vehicals deletevehicals(
		com.rideapp.publishride.model.vehicals vehicals) {

		return _vehicalsLocalService.deletevehicals(vehicals);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _vehicalsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _vehicalsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vehicalsLocalService.dynamicQuery();
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

		return _vehicalsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.rideapp.publishride.model.impl.vehicalsModelImpl</code>.
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

		return _vehicalsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.rideapp.publishride.model.impl.vehicalsModelImpl</code>.
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

		return _vehicalsLocalService.dynamicQuery(
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

		return _vehicalsLocalService.dynamicQueryCount(dynamicQuery);
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

		return _vehicalsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.rideapp.publishride.model.vehicals fetchvehicals(
		long vehicalsId) {

		return _vehicalsLocalService.fetchvehicals(vehicalsId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _vehicalsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _vehicalsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _vehicalsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _vehicalsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the vehicals with the primary key.
	 *
	 * @param vehicalsId the primary key of the vehicals
	 * @return the vehicals
	 * @throws PortalException if a vehicals with the primary key could not be found
	 */
	@Override
	public com.rideapp.publishride.model.vehicals getvehicals(long vehicalsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _vehicalsLocalService.getvehicals(vehicalsId);
	}

	/**
	 * Returns a range of all the vehicalses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.rideapp.publishride.model.impl.vehicalsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of vehicalses
	 * @param end the upper bound of the range of vehicalses (not inclusive)
	 * @return the range of vehicalses
	 */
	@Override
	public java.util.List<com.rideapp.publishride.model.vehicals> getvehicalses(
		int start, int end) {

		return _vehicalsLocalService.getvehicalses(start, end);
	}

	/**
	 * Returns the number of vehicalses.
	 *
	 * @return the number of vehicalses
	 */
	@Override
	public int getvehicalsesCount() {
		return _vehicalsLocalService.getvehicalsesCount();
	}

	/**
	 * Updates the vehicals in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect vehicalsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param vehicals the vehicals
	 * @return the vehicals that was updated
	 */
	@Override
	public com.rideapp.publishride.model.vehicals updatevehicals(
		com.rideapp.publishride.model.vehicals vehicals) {

		return _vehicalsLocalService.updatevehicals(vehicals);
	}

	@Override
	public vehicalsLocalService getWrappedService() {
		return _vehicalsLocalService;
	}

	@Override
	public void setWrappedService(vehicalsLocalService vehicalsLocalService) {
		_vehicalsLocalService = vehicalsLocalService;
	}

	private vehicalsLocalService _vehicalsLocalService;

}