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
 * This class is a wrapper for {@link vehicals}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vehicals
 * @generated
 */
public class vehicalsWrapper
	extends BaseModelWrapper<vehicals>
	implements ModelWrapper<vehicals>, vehicals {

	public vehicalsWrapper(vehicals vehicals) {
		super(vehicals);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("vehicalsId", getVehicalsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("carModel", getCarModel());
		attributes.put("plateNumber", getPlateNumber());
		attributes.put("capacity", getCapacity());
		attributes.put("comfortLevel", getComfortLevel());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long vehicalsId = (Long)attributes.get("vehicalsId");

		if (vehicalsId != null) {
			setVehicalsId(vehicalsId);
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

		String carModel = (String)attributes.get("carModel");

		if (carModel != null) {
			setCarModel(carModel);
		}

		String plateNumber = (String)attributes.get("plateNumber");

		if (plateNumber != null) {
			setPlateNumber(plateNumber);
		}

		Integer capacity = (Integer)attributes.get("capacity");

		if (capacity != null) {
			setCapacity(capacity);
		}

		String comfortLevel = (String)attributes.get("comfortLevel");

		if (comfortLevel != null) {
			setComfortLevel(comfortLevel);
		}
	}

	@Override
	public vehicals cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the capacity of this vehicals.
	 *
	 * @return the capacity of this vehicals
	 */
	@Override
	public int getCapacity() {
		return model.getCapacity();
	}

	/**
	 * Returns the car model of this vehicals.
	 *
	 * @return the car model of this vehicals
	 */
	@Override
	public String getCarModel() {
		return model.getCarModel();
	}

	/**
	 * Returns the comfort level of this vehicals.
	 *
	 * @return the comfort level of this vehicals
	 */
	@Override
	public String getComfortLevel() {
		return model.getComfortLevel();
	}

	/**
	 * Returns the company ID of this vehicals.
	 *
	 * @return the company ID of this vehicals
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this vehicals.
	 *
	 * @return the create date of this vehicals
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this vehicals.
	 *
	 * @return the group ID of this vehicals
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this vehicals.
	 *
	 * @return the modified date of this vehicals
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the plate number of this vehicals.
	 *
	 * @return the plate number of this vehicals
	 */
	@Override
	public String getPlateNumber() {
		return model.getPlateNumber();
	}

	/**
	 * Returns the primary key of this vehicals.
	 *
	 * @return the primary key of this vehicals
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this vehicals.
	 *
	 * @return the user ID of this vehicals
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this vehicals.
	 *
	 * @return the user name of this vehicals
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this vehicals.
	 *
	 * @return the user uuid of this vehicals
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the vehicals ID of this vehicals.
	 *
	 * @return the vehicals ID of this vehicals
	 */
	@Override
	public long getVehicalsId() {
		return model.getVehicalsId();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the capacity of this vehicals.
	 *
	 * @param capacity the capacity of this vehicals
	 */
	@Override
	public void setCapacity(int capacity) {
		model.setCapacity(capacity);
	}

	/**
	 * Sets the car model of this vehicals.
	 *
	 * @param carModel the car model of this vehicals
	 */
	@Override
	public void setCarModel(String carModel) {
		model.setCarModel(carModel);
	}

	/**
	 * Sets the comfort level of this vehicals.
	 *
	 * @param comfortLevel the comfort level of this vehicals
	 */
	@Override
	public void setComfortLevel(String comfortLevel) {
		model.setComfortLevel(comfortLevel);
	}

	/**
	 * Sets the company ID of this vehicals.
	 *
	 * @param companyId the company ID of this vehicals
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this vehicals.
	 *
	 * @param createDate the create date of this vehicals
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this vehicals.
	 *
	 * @param groupId the group ID of this vehicals
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this vehicals.
	 *
	 * @param modifiedDate the modified date of this vehicals
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the plate number of this vehicals.
	 *
	 * @param plateNumber the plate number of this vehicals
	 */
	@Override
	public void setPlateNumber(String plateNumber) {
		model.setPlateNumber(plateNumber);
	}

	/**
	 * Sets the primary key of this vehicals.
	 *
	 * @param primaryKey the primary key of this vehicals
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this vehicals.
	 *
	 * @param userId the user ID of this vehicals
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this vehicals.
	 *
	 * @param userName the user name of this vehicals
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this vehicals.
	 *
	 * @param userUuid the user uuid of this vehicals
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the vehicals ID of this vehicals.
	 *
	 * @param vehicalsId the vehicals ID of this vehicals
	 */
	@Override
	public void setVehicalsId(long vehicalsId) {
		model.setVehicalsId(vehicalsId);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected vehicalsWrapper wrap(vehicals vehicals) {
		return new vehicalsWrapper(vehicals);
	}

}