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

package com.rideapp.publishride.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.rideapp.publishride.model.vehicals;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing vehicals in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class vehicalsCacheModel
	implements CacheModel<vehicals>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof vehicalsCacheModel)) {
			return false;
		}

		vehicalsCacheModel vehicalsCacheModel = (vehicalsCacheModel)object;

		if (vehicalsId == vehicalsCacheModel.vehicalsId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, vehicalsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{vehicalsId=");
		sb.append(vehicalsId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", carModel=");
		sb.append(carModel);
		sb.append(", plateNumber=");
		sb.append(plateNumber);
		sb.append(", capacity=");
		sb.append(capacity);
		sb.append(", comfortLevel=");
		sb.append(comfortLevel);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public vehicals toEntityModel() {
		vehicalsImpl vehicalsImpl = new vehicalsImpl();

		vehicalsImpl.setVehicalsId(vehicalsId);
		vehicalsImpl.setGroupId(groupId);
		vehicalsImpl.setCompanyId(companyId);
		vehicalsImpl.setUserId(userId);

		if (userName == null) {
			vehicalsImpl.setUserName("");
		}
		else {
			vehicalsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			vehicalsImpl.setCreateDate(null);
		}
		else {
			vehicalsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			vehicalsImpl.setModifiedDate(null);
		}
		else {
			vehicalsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (carModel == null) {
			vehicalsImpl.setCarModel("");
		}
		else {
			vehicalsImpl.setCarModel(carModel);
		}

		if (plateNumber == null) {
			vehicalsImpl.setPlateNumber("");
		}
		else {
			vehicalsImpl.setPlateNumber(plateNumber);
		}

		vehicalsImpl.setCapacity(capacity);

		if (comfortLevel == null) {
			vehicalsImpl.setComfortLevel("");
		}
		else {
			vehicalsImpl.setComfortLevel(comfortLevel);
		}

		vehicalsImpl.resetOriginalValues();

		return vehicalsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		vehicalsId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		carModel = objectInput.readUTF();
		plateNumber = objectInput.readUTF();

		capacity = objectInput.readInt();
		comfortLevel = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(vehicalsId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (carModel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(carModel);
		}

		if (plateNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(plateNumber);
		}

		objectOutput.writeInt(capacity);

		if (comfortLevel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(comfortLevel);
		}
	}

	public long vehicalsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String carModel;
	public String plateNumber;
	public int capacity;
	public String comfortLevel;

}