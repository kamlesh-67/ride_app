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
 * This class is a wrapper for {@link returnRide}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see returnRide
 * @generated
 */
public class returnRideWrapper
	extends BaseModelWrapper<returnRide>
	implements ModelWrapper<returnRide>, returnRide {

	public returnRideWrapper(returnRide returnRide) {
		super(returnRide);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("returnRideId", getReturnRideId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("returnDate", getReturnDate());
		attributes.put("availableSeats", getAvailableSeats());
		attributes.put("price", getPrice());
		attributes.put("ridesId", getRidesId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long returnRideId = (Long)attributes.get("returnRideId");

		if (returnRideId != null) {
			setReturnRideId(returnRideId);
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

		Date returnDate = (Date)attributes.get("returnDate");

		if (returnDate != null) {
			setReturnDate(returnDate);
		}

		Integer availableSeats = (Integer)attributes.get("availableSeats");

		if (availableSeats != null) {
			setAvailableSeats(availableSeats);
		}

		Float price = (Float)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}

		Long ridesId = (Long)attributes.get("ridesId");

		if (ridesId != null) {
			setRidesId(ridesId);
		}
	}

	@Override
	public returnRide cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the available seats of this return ride.
	 *
	 * @return the available seats of this return ride
	 */
	@Override
	public int getAvailableSeats() {
		return model.getAvailableSeats();
	}

	/**
	 * Returns the company ID of this return ride.
	 *
	 * @return the company ID of this return ride
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this return ride.
	 *
	 * @return the create date of this return ride
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this return ride.
	 *
	 * @return the group ID of this return ride
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this return ride.
	 *
	 * @return the modified date of this return ride
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the price of this return ride.
	 *
	 * @return the price of this return ride
	 */
	@Override
	public float getPrice() {
		return model.getPrice();
	}

	/**
	 * Returns the primary key of this return ride.
	 *
	 * @return the primary key of this return ride
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the return date of this return ride.
	 *
	 * @return the return date of this return ride
	 */
	@Override
	public Date getReturnDate() {
		return model.getReturnDate();
	}

	/**
	 * Returns the return ride ID of this return ride.
	 *
	 * @return the return ride ID of this return ride
	 */
	@Override
	public long getReturnRideId() {
		return model.getReturnRideId();
	}

	/**
	 * Returns the rides ID of this return ride.
	 *
	 * @return the rides ID of this return ride
	 */
	@Override
	public long getRidesId() {
		return model.getRidesId();
	}

	/**
	 * Returns the user ID of this return ride.
	 *
	 * @return the user ID of this return ride
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this return ride.
	 *
	 * @return the user name of this return ride
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this return ride.
	 *
	 * @return the user uuid of this return ride
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
	 * Sets the available seats of this return ride.
	 *
	 * @param availableSeats the available seats of this return ride
	 */
	@Override
	public void setAvailableSeats(int availableSeats) {
		model.setAvailableSeats(availableSeats);
	}

	/**
	 * Sets the company ID of this return ride.
	 *
	 * @param companyId the company ID of this return ride
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this return ride.
	 *
	 * @param createDate the create date of this return ride
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this return ride.
	 *
	 * @param groupId the group ID of this return ride
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this return ride.
	 *
	 * @param modifiedDate the modified date of this return ride
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the price of this return ride.
	 *
	 * @param price the price of this return ride
	 */
	@Override
	public void setPrice(float price) {
		model.setPrice(price);
	}

	/**
	 * Sets the primary key of this return ride.
	 *
	 * @param primaryKey the primary key of this return ride
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the return date of this return ride.
	 *
	 * @param returnDate the return date of this return ride
	 */
	@Override
	public void setReturnDate(Date returnDate) {
		model.setReturnDate(returnDate);
	}

	/**
	 * Sets the return ride ID of this return ride.
	 *
	 * @param returnRideId the return ride ID of this return ride
	 */
	@Override
	public void setReturnRideId(long returnRideId) {
		model.setReturnRideId(returnRideId);
	}

	/**
	 * Sets the rides ID of this return ride.
	 *
	 * @param ridesId the rides ID of this return ride
	 */
	@Override
	public void setRidesId(long ridesId) {
		model.setRidesId(ridesId);
	}

	/**
	 * Sets the user ID of this return ride.
	 *
	 * @param userId the user ID of this return ride
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this return ride.
	 *
	 * @param userName the user name of this return ride
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this return ride.
	 *
	 * @param userUuid the user uuid of this return ride
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
	protected returnRideWrapper wrap(returnRide returnRide) {
		return new returnRideWrapper(returnRide);
	}

}