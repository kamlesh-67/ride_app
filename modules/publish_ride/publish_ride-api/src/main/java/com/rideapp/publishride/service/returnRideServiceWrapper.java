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
 * Provides a wrapper for {@link returnRideService}.
 *
 * @author Brian Wing Shun Chan
 * @see returnRideService
 * @generated
 */
public class returnRideServiceWrapper
	implements returnRideService, ServiceWrapper<returnRideService> {

	public returnRideServiceWrapper() {
		this(null);
	}

	public returnRideServiceWrapper(returnRideService returnRideService) {
		_returnRideService = returnRideService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _returnRideService.getOSGiServiceIdentifier();
	}

	@Override
	public returnRideService getWrappedService() {
		return _returnRideService;
	}

	@Override
	public void setWrappedService(returnRideService returnRideService) {
		_returnRideService = returnRideService;
	}

	private returnRideService _returnRideService;

}