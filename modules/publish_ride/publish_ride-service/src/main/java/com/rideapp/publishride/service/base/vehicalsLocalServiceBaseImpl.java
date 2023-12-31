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

package com.rideapp.publishride.service.base;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import com.rideapp.publishride.model.vehicals;
import com.rideapp.publishride.service.persistence.bookingsPersistence;
import com.rideapp.publishride.service.persistence.locationsPersistence;
import com.rideapp.publishride.service.persistence.returnRidePersistence;
import com.rideapp.publishride.service.persistence.ridesPersistence;
import com.rideapp.publishride.service.persistence.stopoversPersistence;
import com.rideapp.publishride.service.persistence.vehicalsPersistence;
import com.rideapp.publishride.service.vehicalsLocalService;
import com.rideapp.publishride.service.vehicalsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the vehicals local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.rideapp.publishride.service.impl.vehicalsLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.rideapp.publishride.service.impl.vehicalsLocalServiceImpl
 * @generated
 */
public abstract class vehicalsLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService, vehicalsLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>vehicalsLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>vehicalsLocalServiceUtil</code>.
	 */

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
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public vehicals addvehicals(vehicals vehicals) {
		vehicals.setNew(true);

		return vehicalsPersistence.update(vehicals);
	}

	/**
	 * Creates a new vehicals with the primary key. Does not add the vehicals to the database.
	 *
	 * @param vehicalsId the primary key for the new vehicals
	 * @return the new vehicals
	 */
	@Override
	@Transactional(enabled = false)
	public vehicals createvehicals(long vehicalsId) {
		return vehicalsPersistence.create(vehicalsId);
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
	@Indexable(type = IndexableType.DELETE)
	@Override
	public vehicals deletevehicals(long vehicalsId) throws PortalException {
		return vehicalsPersistence.remove(vehicalsId);
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
	@Indexable(type = IndexableType.DELETE)
	@Override
	public vehicals deletevehicals(vehicals vehicals) {
		return vehicalsPersistence.remove(vehicals);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return vehicalsPersistence.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(DSLQuery dslQuery) {
		Long count = dslQuery(dslQuery);

		return count.intValue();
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			vehicals.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return vehicalsPersistence.findWithDynamicQuery(dynamicQuery);
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
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return vehicalsPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
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
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return vehicalsPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return vehicalsPersistence.countWithDynamicQuery(dynamicQuery);
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
		DynamicQuery dynamicQuery, Projection projection) {

		return vehicalsPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public vehicals fetchvehicals(long vehicalsId) {
		return vehicalsPersistence.fetchByPrimaryKey(vehicalsId);
	}

	/**
	 * Returns the vehicals with the primary key.
	 *
	 * @param vehicalsId the primary key of the vehicals
	 * @return the vehicals
	 * @throws PortalException if a vehicals with the primary key could not be found
	 */
	@Override
	public vehicals getvehicals(long vehicalsId) throws PortalException {
		return vehicalsPersistence.findByPrimaryKey(vehicalsId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(vehicalsLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(vehicals.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("vehicalsId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			vehicalsLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(vehicals.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("vehicalsId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(vehicalsLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(vehicals.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("vehicalsId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return vehicalsPersistence.create(((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		if (_log.isWarnEnabled()) {
			_log.warn(
				"Implement vehicalsLocalServiceImpl#deletevehicals(vehicals) to avoid orphaned data");
		}

		return vehicalsLocalService.deletevehicals((vehicals)persistedModel);
	}

	@Override
	public BasePersistence<vehicals> getBasePersistence() {
		return vehicalsPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return vehicalsPersistence.findByPrimaryKey(primaryKeyObj);
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
	public List<vehicals> getvehicalses(int start, int end) {
		return vehicalsPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of vehicalses.
	 *
	 * @return the number of vehicalses
	 */
	@Override
	public int getvehicalsesCount() {
		return vehicalsPersistence.countAll();
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
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public vehicals updatevehicals(vehicals vehicals) {
		return vehicalsPersistence.update(vehicals);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			vehicalsLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		vehicalsLocalService = (vehicalsLocalService)aopProxy;

		_setLocalServiceUtilService(vehicalsLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return vehicalsLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return vehicals.class;
	}

	protected String getModelClassName() {
		return vehicals.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = vehicalsPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	private void _setLocalServiceUtilService(
		vehicalsLocalService vehicalsLocalService) {

		try {
			Field field = vehicalsLocalServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, vehicalsLocalService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Reference
	protected bookingsPersistence bookingsPersistence;

	@Reference
	protected locationsPersistence locationsPersistence;

	@Reference
	protected returnRidePersistence returnRidePersistence;

	@Reference
	protected ridesPersistence ridesPersistence;

	@Reference
	protected stopoversPersistence stopoversPersistence;

	protected vehicalsLocalService vehicalsLocalService;

	@Reference
	protected vehicalsPersistence vehicalsPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	private static final Log _log = LogFactoryUtil.getLog(
		vehicalsLocalServiceBaseImpl.class);

}