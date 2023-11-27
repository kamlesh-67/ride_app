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
 * Provides a wrapper for {@link stopoversLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see stopoversLocalService
 * @generated
 */
public class stopoversLocalServiceWrapper
	implements ServiceWrapper<stopoversLocalService>, stopoversLocalService {

	public stopoversLocalServiceWrapper() {
		this(null);
	}

	public stopoversLocalServiceWrapper(
		stopoversLocalService stopoversLocalService) {

		_stopoversLocalService = stopoversLocalService;
	}

	/**
	 * Adds the stopovers to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect stopoversLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param stopovers the stopovers
	 * @return the stopovers that was added
	 */
	@Override
	public com.rideapp.publishride.model.stopovers addstopovers(
		com.rideapp.publishride.model.stopovers stopovers) {

		return _stopoversLocalService.addstopovers(stopovers);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _stopoversLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new stopovers with the primary key. Does not add the stopovers to the database.
	 *
	 * @param stopoversId the primary key for the new stopovers
	 * @return the new stopovers
	 */
	@Override
	public com.rideapp.publishride.model.stopovers createstopovers(
		long stopoversId) {

		return _stopoversLocalService.createstopovers(stopoversId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _stopoversLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the stopovers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect stopoversLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param stopoversId the primary key of the stopovers
	 * @return the stopovers that was removed
	 * @throws PortalException if a stopovers with the primary key could not be found
	 */
	@Override
	public com.rideapp.publishride.model.stopovers deletestopovers(
			long stopoversId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _stopoversLocalService.deletestopovers(stopoversId);
	}

	/**
	 * Deletes the stopovers from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect stopoversLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param stopovers the stopovers
	 * @return the stopovers that was removed
	 */
	@Override
	public com.rideapp.publishride.model.stopovers deletestopovers(
		com.rideapp.publishride.model.stopovers stopovers) {

		return _stopoversLocalService.deletestopovers(stopovers);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _stopoversLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _stopoversLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _stopoversLocalService.dynamicQuery();
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

		return _stopoversLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.rideapp.publishride.model.impl.stopoversModelImpl</code>.
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

		return _stopoversLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.rideapp.publishride.model.impl.stopoversModelImpl</code>.
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

		return _stopoversLocalService.dynamicQuery(
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

		return _stopoversLocalService.dynamicQueryCount(dynamicQuery);
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

		return _stopoversLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.rideapp.publishride.model.stopovers fetchstopovers(
		long stopoversId) {

		return _stopoversLocalService.fetchstopovers(stopoversId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _stopoversLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _stopoversLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _stopoversLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _stopoversLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the stopovers with the primary key.
	 *
	 * @param stopoversId the primary key of the stopovers
	 * @return the stopovers
	 * @throws PortalException if a stopovers with the primary key could not be found
	 */
	@Override
	public com.rideapp.publishride.model.stopovers getstopovers(
			long stopoversId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _stopoversLocalService.getstopovers(stopoversId);
	}

	/**
	 * Returns a range of all the stopoverses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.rideapp.publishride.model.impl.stopoversModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of stopoverses
	 * @param end the upper bound of the range of stopoverses (not inclusive)
	 * @return the range of stopoverses
	 */
	@Override
	public java.util.List<com.rideapp.publishride.model.stopovers>
		getstopoverses(int start, int end) {

		return _stopoversLocalService.getstopoverses(start, end);
	}

	/**
	 * Returns the number of stopoverses.
	 *
	 * @return the number of stopoverses
	 */
	@Override
	public int getstopoversesCount() {
		return _stopoversLocalService.getstopoversesCount();
	}

	/**
	 * Updates the stopovers in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect stopoversLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param stopovers the stopovers
	 * @return the stopovers that was updated
	 */
	@Override
	public com.rideapp.publishride.model.stopovers updatestopovers(
		com.rideapp.publishride.model.stopovers stopovers) {

		return _stopoversLocalService.updatestopovers(stopovers);
	}

	@Override
	public stopoversLocalService getWrappedService() {
		return _stopoversLocalService;
	}

	@Override
	public void setWrappedService(stopoversLocalService stopoversLocalService) {
		_stopoversLocalService = stopoversLocalService;
	}

	private stopoversLocalService _stopoversLocalService;

}