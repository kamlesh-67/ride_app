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
 * This class is a wrapper for {@link rides}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see rides
 * @generated
 */
public class ridesWrapper
	extends BaseModelWrapper<rides> implements ModelWrapper<rides>, rides {

	public ridesWrapper(rides rides) {
		super(rides);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ridesId", getRidesId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("leavingLocation", getLeavingLocation());
		attributes.put("headingLocation", getHeadingLocation());
		attributes.put("arivalDate", getArivalDate());
		attributes.put("availableSeats", getAvailableSeats());
		attributes.put("comfortLevel", getComfortLevel());
		attributes.put("price", getPrice());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ridesId = (Long)attributes.get("ridesId");

		if (ridesId != null) {
			setRidesId(ridesId);
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

		String leavingLocation = (String)attributes.get("leavingLocation");

		if (leavingLocation != null) {
			setLeavingLocation(leavingLocation);
		}

		String headingLocation = (String)attributes.get("headingLocation");

		if (headingLocation != null) {
			setHeadingLocation(headingLocation);
		}

		Date arivalDate = (Date)attributes.get("arivalDate");

		if (arivalDate != null) {
			setArivalDate(arivalDate);
		}

		Integer availableSeats = (Integer)attributes.get("availableSeats");

		if (availableSeats != null) {
			setAvailableSeats(availableSeats);
		}

		String comfortLevel = (String)attributes.get("comfortLevel");

		if (comfortLevel != null) {
			setComfortLevel(comfortLevel);
		}

		Float price = (Float)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}
	}

	@Override
	public rides cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the arival date of this rides.
	 *
	 * @return the arival date of this rides
	 */
	@Override
	public Date getArivalDate() {
		return model.getArivalDate();
	}

	/**
	 * Returns the available seats of this rides.
	 *
	 * @return the available seats of this rides
	 */
	@Override
	public int getAvailableSeats() {
		return model.getAvailableSeats();
	}

	/**
	 * Returns the comfort level of this rides.
	 *
	 * @return the comfort level of this rides
	 */
	@Override
	public String getComfortLevel() {
		return model.getComfortLevel();
	}

	/**
	 * Returns the company ID of this rides.
	 *
	 * @return the company ID of this rides
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this rides.
	 *
	 * @return the create date of this rides
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this rides.
	 *
	 * @return the group ID of this rides
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the heading location of this rides.
	 *
	 * @return the heading location of this rides
	 */
	@Override
	public String getHeadingLocation() {
		return model.getHeadingLocation();
	}

	/**
	 * Returns the leaving location of this rides.
	 *
	 * @return the leaving location of this rides
	 */
	@Override
	public String getLeavingLocation() {
		return model.getLeavingLocation();
	}

	/**
	 * Returns the modified date of this rides.
	 *
	 * @return the modified date of this rides
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the price of this rides.
	 *
	 * @return the price of this rides
	 */
	@Override
	public float getPrice() {
		return model.getPrice();
	}

	/**
	 * Returns the primary key of this rides.
	 *
	 * @return the primary key of this rides
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the rides ID of this rides.
	 *
	 * @return the rides ID of this rides
	 */
	@Override
	public long getRidesId() {
		return model.getRidesId();
	}

	/**
	 * Returns the user ID of this rides.
	 *
	 * @return the user ID of this rides
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this rides.
	 *
	 * @return the user name of this rides
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this rides.
	 *
	 * @return the user uuid of this rides
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
	 * Sets the arival date of this rides.
	 *
	 * @param arivalDate the arival date of this rides
	 */
	@Override
	public void setArivalDate(Date arivalDate) {
		model.setArivalDate(arivalDate);
	}

	/**
	 * Sets the available seats of this rides.
	 *
	 * @param availableSeats the available seats of this rides
	 */
	@Override
	public void setAvailableSeats(int availableSeats) {
		model.setAvailableSeats(availableSeats);
	}

	/**
	 * Sets the comfort level of this rides.
	 *
	 * @param comfortLevel the comfort level of this rides
	 */
	@Override
	public void setComfortLevel(String comfortLevel) {
		model.setComfortLevel(comfortLevel);
	}

	/**
	 * Sets the company ID of this rides.
	 *
	 * @param companyId the company ID of this rides
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this rides.
	 *
	 * @param createDate the create date of this rides
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this rides.
	 *
	 * @param groupId the group ID of this rides
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the heading location of this rides.
	 *
	 * @param headingLocation the heading location of this rides
	 */
	@Override
	public void setHeadingLocation(String headingLocation) {
		model.setHeadingLocation(headingLocation);
	}

	/**
	 * Sets the leaving location of this rides.
	 *
	 * @param leavingLocation the leaving location of this rides
	 */
	@Override
	public void setLeavingLocation(String leavingLocation) {
		model.setLeavingLocation(leavingLocation);
	}

	/**
	 * Sets the modified date of this rides.
	 *
	 * @param modifiedDate the modified date of this rides
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the price of this rides.
	 *
	 * @param price the price of this rides
	 */
	@Override
	public void setPrice(float price) {
		model.setPrice(price);
	}

	/**
	 * Sets the primary key of this rides.
	 *
	 * @param primaryKey the primary key of this rides
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the rides ID of this rides.
	 *
	 * @param ridesId the rides ID of this rides
	 */
	@Override
	public void setRidesId(long ridesId) {
		model.setRidesId(ridesId);
	}

	/**
	 * Sets the user ID of this rides.
	 *
	 * @param userId the user ID of this rides
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this rides.
	 *
	 * @param userName the user name of this rides
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this rides.
	 *
	 * @param userUuid the user uuid of this rides
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
	protected ridesWrapper wrap(rides rides) {
		return new ridesWrapper(rides);
	}

}