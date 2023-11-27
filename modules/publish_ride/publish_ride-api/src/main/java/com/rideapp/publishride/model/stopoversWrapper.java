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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link stopovers}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see stopovers
 * @generated
 */
public class stopoversWrapper
	extends BaseModelWrapper<stopovers>
	implements ModelWrapper<stopovers>, stopovers {

	public stopoversWrapper(stopovers stopovers) {
		super(stopovers);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("stopoversId", getStopoversId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("location", getLocation());
		attributes.put("arrivalTime", getArrivalTime());
		attributes.put("departureTime", getDepartureTime());
		attributes.put("ridesId", getRidesId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long stopoversId = (Long)attributes.get("stopoversId");

		if (stopoversId != null) {
			setStopoversId(stopoversId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		Date arrivalTime = (Date)attributes.get("arrivalTime");

		if (arrivalTime != null) {
			setArrivalTime(arrivalTime);
		}

		Date departureTime = (Date)attributes.get("departureTime");

		if (departureTime != null) {
			setDepartureTime(departureTime);
		}

		Long ridesId = (Long)attributes.get("ridesId");

		if (ridesId != null) {
			setRidesId(ridesId);
		}
	}

	@Override
	public stopovers cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the arrival time of this stopovers.
	 *
	 * @return the arrival time of this stopovers
	 */
	@Override
	public Date getArrivalTime() {
		return model.getArrivalTime();
	}

	/**
	 * Returns the company ID of this stopovers.
	 *
	 * @return the company ID of this stopovers
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this stopovers.
	 *
	 * @return the create date of this stopovers
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the departure time of this stopovers.
	 *
	 * @return the departure time of this stopovers
	 */
	@Override
	public Date getDepartureTime() {
		return model.getDepartureTime();
	}

	/**
	 * Returns the group ID of this stopovers.
	 *
	 * @return the group ID of this stopovers
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the location of this stopovers.
	 *
	 * @return the location of this stopovers
	 */
	@Override
	public String getLocation() {
		return model.getLocation();
	}

	/**
	 * Returns the modified date of this stopovers.
	 *
	 * @return the modified date of this stopovers
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this stopovers.
	 *
	 * @return the primary key of this stopovers
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the rides ID of this stopovers.
	 *
	 * @return the rides ID of this stopovers
	 */
	@Override
	public long getRidesId() {
		return model.getRidesId();
	}

	/**
	 * Returns the stopovers ID of this stopovers.
	 *
	 * @return the stopovers ID of this stopovers
	 */
	@Override
	public long getStopoversId() {
		return model.getStopoversId();
	}

	/**
	 * Returns the user ID of this stopovers.
	 *
	 * @return the user ID of this stopovers
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this stopovers.
	 *
	 * @return the user name of this stopovers
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this stopovers.
	 *
	 * @return the user uuid of this stopovers
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the arrival time of this stopovers.
	 *
	 * @param arrivalTime the arrival time of this stopovers
	 */
	@Override
	public void setArrivalTime(Date arrivalTime) {
		model.setArrivalTime(arrivalTime);
	}

	/**
	 * Sets the company ID of this stopovers.
	 *
	 * @param companyId the company ID of this stopovers
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this stopovers.
	 *
	 * @param createDate the create date of this stopovers
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the departure time of this stopovers.
	 *
	 * @param departureTime the departure time of this stopovers
	 */
	@Override
	public void setDepartureTime(Date departureTime) {
		model.setDepartureTime(departureTime);
	}

	/**
	 * Sets the group ID of this stopovers.
	 *
	 * @param groupId the group ID of this stopovers
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the location of this stopovers.
	 *
	 * @param location the location of this stopovers
	 */
	@Override
	public void setLocation(String location) {
		model.setLocation(location);
	}

	/**
	 * Sets the modified date of this stopovers.
	 *
	 * @param modifiedDate the modified date of this stopovers
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this stopovers.
	 *
	 * @param primaryKey the primary key of this stopovers
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the rides ID of this stopovers.
	 *
	 * @param ridesId the rides ID of this stopovers
	 */
	@Override
	public void setRidesId(long ridesId) {
		model.setRidesId(ridesId);
	}

	/**
	 * Sets the stopovers ID of this stopovers.
	 *
	 * @param stopoversId the stopovers ID of this stopovers
	 */
	@Override
	public void setStopoversId(long stopoversId) {
		model.setStopoversId(stopoversId);
	}

	/**
	 * Sets the user ID of this stopovers.
	 *
	 * @param userId the user ID of this stopovers
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this stopovers.
	 *
	 * @param userName the user name of this stopovers
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this stopovers.
	 *
	 * @param userUuid the user uuid of this stopovers
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected stopoversWrapper wrap(stopovers stopovers) {
		return new stopoversWrapper(stopovers);
	}

}