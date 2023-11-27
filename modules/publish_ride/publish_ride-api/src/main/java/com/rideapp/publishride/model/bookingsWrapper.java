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
 * This class is a wrapper for {@link bookings}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see bookings
 * @generated
 */
public class bookingsWrapper
	extends BaseModelWrapper<bookings>
	implements bookings, ModelWrapper<bookings> {

	public bookingsWrapper(bookings bookings) {
		super(bookings);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("bookingsId", getBookingsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("bookingDate", getBookingDate());
		attributes.put("bookedSeats", getBookedSeats());
		attributes.put("totalPrice", getTotalPrice());
		attributes.put("ridesId", getRidesId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long bookingsId = (Long)attributes.get("bookingsId");

		if (bookingsId != null) {
			setBookingsId(bookingsId);
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

		Date bookingDate = (Date)attributes.get("bookingDate");

		if (bookingDate != null) {
			setBookingDate(bookingDate);
		}

		Integer bookedSeats = (Integer)attributes.get("bookedSeats");

		if (bookedSeats != null) {
			setBookedSeats(bookedSeats);
		}

		Float totalPrice = (Float)attributes.get("totalPrice");

		if (totalPrice != null) {
			setTotalPrice(totalPrice);
		}

		Long ridesId = (Long)attributes.get("ridesId");

		if (ridesId != null) {
			setRidesId(ridesId);
		}
	}

	@Override
	public bookings cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the booked seats of this bookings.
	 *
	 * @return the booked seats of this bookings
	 */
	@Override
	public int getBookedSeats() {
		return model.getBookedSeats();
	}

	/**
	 * Returns the booking date of this bookings.
	 *
	 * @return the booking date of this bookings
	 */
	@Override
	public Date getBookingDate() {
		return model.getBookingDate();
	}

	/**
	 * Returns the bookings ID of this bookings.
	 *
	 * @return the bookings ID of this bookings
	 */
	@Override
	public long getBookingsId() {
		return model.getBookingsId();
	}

	/**
	 * Returns the company ID of this bookings.
	 *
	 * @return the company ID of this bookings
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this bookings.
	 *
	 * @return the create date of this bookings
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this bookings.
	 *
	 * @return the group ID of this bookings
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this bookings.
	 *
	 * @return the modified date of this bookings
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this bookings.
	 *
	 * @return the primary key of this bookings
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the rides ID of this bookings.
	 *
	 * @return the rides ID of this bookings
	 */
	@Override
	public long getRidesId() {
		return model.getRidesId();
	}

	/**
	 * Returns the total price of this bookings.
	 *
	 * @return the total price of this bookings
	 */
	@Override
	public float getTotalPrice() {
		return model.getTotalPrice();
	}

	/**
	 * Returns the user ID of this bookings.
	 *
	 * @return the user ID of this bookings
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this bookings.
	 *
	 * @return the user name of this bookings
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this bookings.
	 *
	 * @return the user uuid of this bookings
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
	 * Sets the booked seats of this bookings.
	 *
	 * @param bookedSeats the booked seats of this bookings
	 */
	@Override
	public void setBookedSeats(int bookedSeats) {
		model.setBookedSeats(bookedSeats);
	}

	/**
	 * Sets the booking date of this bookings.
	 *
	 * @param bookingDate the booking date of this bookings
	 */
	@Override
	public void setBookingDate(Date bookingDate) {
		model.setBookingDate(bookingDate);
	}

	/**
	 * Sets the bookings ID of this bookings.
	 *
	 * @param bookingsId the bookings ID of this bookings
	 */
	@Override
	public void setBookingsId(long bookingsId) {
		model.setBookingsId(bookingsId);
	}

	/**
	 * Sets the company ID of this bookings.
	 *
	 * @param companyId the company ID of this bookings
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this bookings.
	 *
	 * @param createDate the create date of this bookings
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this bookings.
	 *
	 * @param groupId the group ID of this bookings
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this bookings.
	 *
	 * @param modifiedDate the modified date of this bookings
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this bookings.
	 *
	 * @param primaryKey the primary key of this bookings
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the rides ID of this bookings.
	 *
	 * @param ridesId the rides ID of this bookings
	 */
	@Override
	public void setRidesId(long ridesId) {
		model.setRidesId(ridesId);
	}

	/**
	 * Sets the total price of this bookings.
	 *
	 * @param totalPrice the total price of this bookings
	 */
	@Override
	public void setTotalPrice(float totalPrice) {
		model.setTotalPrice(totalPrice);
	}

	/**
	 * Sets the user ID of this bookings.
	 *
	 * @param userId the user ID of this bookings
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this bookings.
	 *
	 * @param userName the user name of this bookings
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this bookings.
	 *
	 * @param userUuid the user uuid of this bookings
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
	protected bookingsWrapper wrap(bookings bookings) {
		return new bookingsWrapper(bookings);
	}

}