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
 * Provides a wrapper for {@link locationsService}.
 *
 * @author Brian Wing Shun Chan
 * @see locationsService
 * @generated
 */
public class locationsServiceWrapper
	implements locationsService, ServiceWrapper<locationsService> {

	public locationsServiceWrapper() {
		this(null);
	}

	public locationsServiceWrapper(locationsService locationsService) {
		_locationsService = locationsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _locationsService.getOSGiServiceIdentifier();
	}

	@Override
	public locationsService getWrappedService() {
		return _locationsService;
	}

	@Override
	public void setWrappedService(locationsService locationsService) {
		_locationsService = locationsService;
	}

	private locationsService _locationsService;

}