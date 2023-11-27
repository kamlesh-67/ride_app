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

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.util.PortalUtil;

import com.rideapp.publishride.model.vehicals;
import com.rideapp.publishride.service.persistence.bookingsPersistence;
import com.rideapp.publishride.service.persistence.locationsPersistence;
import com.rideapp.publishride.service.persistence.returnRidePersistence;
import com.rideapp.publishride.service.persistence.ridesPersistence;
import com.rideapp.publishride.service.persistence.stopoversPersistence;
import com.rideapp.publishride.service.persistence.vehicalsPersistence;
import com.rideapp.publishride.service.vehicalsService;
import com.rideapp.publishride.service.vehicalsServiceUtil;

import java.lang.reflect.Field;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the vehicals remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.rideapp.publishride.service.impl.vehicalsServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.rideapp.publishride.service.impl.vehicalsServiceImpl
 * @generated
 */
public abstract class vehicalsServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, IdentifiableOSGiService, vehicalsService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>vehicalsService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>vehicalsServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
		_setServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			vehicalsService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		vehicalsService = (vehicalsService)aopProxy;

		_setServiceUtilService(vehicalsService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return vehicalsService.class.getName();
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

	private void _setServiceUtilService(vehicalsService vehicalsService) {
		try {
			Field field = vehicalsServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, vehicalsService);
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

	@Reference
	protected com.rideapp.publishride.service.vehicalsLocalService
		vehicalsLocalService;

	protected vehicalsService vehicalsService;

	@Reference
	protected vehicalsPersistence vehicalsPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameService
		classNameService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserService userService;

	private static final Log _log = LogFactoryUtil.getLog(
		vehicalsServiceBaseImpl.class);

}