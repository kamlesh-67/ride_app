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

package com.rideapp.publishride.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the stopovers service. Represents a row in the &quot;Rideapp_stopovers&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.rideapp.publishride.model.impl.stopoversModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.rideapp.publishride.model.impl.stopoversImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see stopovers
 * @generated
 */
@ProviderType
public interface stopoversModel
	extends BaseModel<stopovers>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a stopovers model instance should use the {@link stopovers} interface instead.
	 */

	/**
	 * Returns the primary key of this stopovers.
	 *
	 * @return the primary key of this stopovers
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this stopovers.
	 *
	 * @param primaryKey the primary key of this stopovers
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the stopovers ID of this stopovers.
	 *
	 * @return the stopovers ID of this stopovers
	 */
	public long getStopoversId();

	/**
	 * Sets the stopovers ID of this stopovers.
	 *
	 * @param stopoversId the stopovers ID of this stopovers
	 */
	public void setStopoversId(long stopoversId);

	/**
	 * Returns the group ID of this stopovers.
	 *
	 * @return the group ID of this stopovers
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this stopovers.
	 *
	 * @param groupId the group ID of this stopovers
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this stopovers.
	 *
	 * @return the company ID of this stopovers
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this stopovers.
	 *
	 * @param companyId the company ID of this stopovers
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this stopovers.
	 *
	 * @return the user ID of this stopovers
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this stopovers.
	 *
	 * @param userId the user ID of this stopovers
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this stopovers.
	 *
	 * @return the user uuid of this stopovers
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this stopovers.
	 *
	 * @param userUuid the user uuid of this stopovers
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this stopovers.
	 *
	 * @return the user name of this stopovers
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this stopovers.
	 *
	 * @param userName the user name of this stopovers
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this stopovers.
	 *
	 * @return the create date of this stopovers
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this stopovers.
	 *
	 * @param createDate the create date of this stopovers
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this stopovers.
	 *
	 * @return the modified date of this stopovers
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this stopovers.
	 *
	 * @param modifiedDate the modified date of this stopovers
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the location of this stopovers.
	 *
	 * @return the location of this stopovers
	 */
	@AutoEscape
	public String getLocation();

	/**
	 * Sets the location of this stopovers.
	 *
	 * @param location the location of this stopovers
	 */
	public void setLocation(String location);

	/**
	 * Returns the arrival time of this stopovers.
	 *
	 * @return the arrival time of this stopovers
	 */
	public Date getArrivalTime();

	/**
	 * Sets the arrival time of this stopovers.
	 *
	 * @param arrivalTime the arrival time of this stopovers
	 */
	public void setArrivalTime(Date arrivalTime);

	/**
	 * Returns the departure time of this stopovers.
	 *
	 * @return the departure time of this stopovers
	 */
	public Date getDepartureTime();

	/**
	 * Sets the departure time of this stopovers.
	 *
	 * @param departureTime the departure time of this stopovers
	 */
	public void setDepartureTime(Date departureTime);

	/**
	 * Returns the rides ID of this stopovers.
	 *
	 * @return the rides ID of this stopovers
	 */
	public long getRidesId();

	/**
	 * Sets the rides ID of this stopovers.
	 *
	 * @param ridesId the rides ID of this stopovers
	 */
	public void setRidesId(long ridesId);

	@Override
	public stopovers cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}