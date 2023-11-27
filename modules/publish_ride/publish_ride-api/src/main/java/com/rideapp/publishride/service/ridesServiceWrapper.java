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
 * Provides a wrapper for {@link ridesService}.
 *
 * @author Brian Wing Shun Chan
 * @see ridesService
 * @generated
 */
public class ridesServiceWrapper
	implements ridesService, ServiceWrapper<ridesService> {

	public ridesServiceWrapper() {
		this(null);
	}

	public ridesServiceWrapper(ridesService ridesService) {
		_ridesService = ridesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ridesService.getOSGiServiceIdentifier();
	}

	@Override
	public ridesService getWrappedService() {
		return _ridesService;
	}

	@Override
	public void setWrappedService(ridesService ridesService) {
		_ridesService = ridesService;
	}

	private ridesService _ridesService;

}