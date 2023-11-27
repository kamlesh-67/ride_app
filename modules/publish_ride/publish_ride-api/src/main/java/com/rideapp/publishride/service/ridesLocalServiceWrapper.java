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
 * Provides a wrapper for {@link ridesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ridesLocalService
 * @generated
 */
public class ridesLocalServiceWrapper
	implements ridesLocalService, ServiceWrapper<ridesLocalService> {

	public ridesLocalServiceWrapper() {
		this(null);
	}

	public ridesLocalServiceWrapper(ridesLocalService ridesLocalService) {
		_ridesLocalService = ridesLocalService;
	}

	/**
	 * Adds the rides to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ridesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rides the rides
	 * @return the rides that was added
	 */
	@Override
	public com.rideapp.publishride.model.rides addrides(
		com.rideapp.publishride.model.rides rides) {

		return _ridesLocalService.addrides(rides);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ridesLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new rides with the primary key. Does not add the rides to the database.
	 *
	 * @param ridesId the primary key for the new rides
	 * @return the new rides
	 */
	@Override
	public com.rideapp.publishride.model.rides createrides(long ridesId) {
		return _ridesLocalService.createrides(ridesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ridesLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the rides with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ridesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ridesId the primary key of the rides
	 * @return the rides that was removed
	 * @throws PortalException if a rides with the primary key could not be found
	 */
	@Override
	public com.rideapp.publishride.model.rides deleterides(long ridesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ridesLocalService.deleterides(ridesId);
	}

	/**
	 * Deletes the rides from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ridesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rides the rides
	 * @return the rides that was removed
	 */
	@Override
	public com.rideapp.publishride.model.rides deleterides(
		com.rideapp.publishride.model.rides rides) {

		return _ridesLocalService.deleterides(rides);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ridesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ridesLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ridesLocalService.dynamicQuery();
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

		return _ridesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.rideapp.publishride.model.impl.ridesModelImpl</code>.
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

		return _ridesLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.rideapp.publishride.model.impl.ridesModelImpl</code>.
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

		return _ridesLocalService.dynamicQuery(
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

		return _ridesLocalService.dynamicQueryCount(dynamicQuery);
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

		return _ridesLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.rideapp.publishride.model.rides fetchrides(long ridesId) {
		return _ridesLocalService.fetchrides(ridesId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ridesLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ridesLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ridesLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ridesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the rides with the primary key.
	 *
	 * @param ridesId the primary key of the rides
	 * @return the rides
	 * @throws PortalException if a rides with the primary key could not be found
	 */
	@Override
	public com.rideapp.publishride.model.rides getrides(long ridesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ridesLocalService.getrides(ridesId);
	}

	/**
	 * Returns a range of all the rideses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.rideapp.publishride.model.impl.ridesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rideses
	 * @param end the upper bound of the range of rideses (not inclusive)
	 * @return the range of rideses
	 */
	@Override
	public java.util.List<com.rideapp.publishride.model.rides> getrideses(
		int start, int end) {

		return _ridesLocalService.getrideses(start, end);
	}

	/**
	 * Returns the number of rideses.
	 *
	 * @return the number of rideses
	 */
	@Override
	public int getridesesCount() {
		return _ridesLocalService.getridesesCount();
	}

	/**
	 * Updates the rides in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ridesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rides the rides
	 * @return the rides that was updated
	 */
	@Override
	public com.rideapp.publishride.model.rides updaterides(
		com.rideapp.publishride.model.rides rides) {

		return _ridesLocalService.updaterides(rides);
	}

	@Override
	public ridesLocalService getWrappedService() {
		return _ridesLocalService;
	}

	@Override
	public void setWrappedService(ridesLocalService ridesLocalService) {
		_ridesLocalService = ridesLocalService;
	}

	private ridesLocalService _ridesLocalService;

}