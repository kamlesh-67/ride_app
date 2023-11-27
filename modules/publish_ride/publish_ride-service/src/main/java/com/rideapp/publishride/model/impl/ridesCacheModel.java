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

import com.rideapp.publishride.model.rides;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing rides in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ridesCacheModel implements CacheModel<rides>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ridesCacheModel)) {
			return false;
		}

		ridesCacheModel ridesCacheModel = (ridesCacheModel)object;

		if (ridesId == ridesCacheModel.ridesId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ridesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{ridesId=");
		sb.append(ridesId);
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
		sb.append(", leavingLocation=");
		sb.append(leavingLocation);
		sb.append(", headingLocation=");
		sb.append(headingLocation);
		sb.append(", arivalDate=");
		sb.append(arivalDate);
		sb.append(", availableSeats=");
		sb.append(availableSeats);
		sb.append(", comfortLevel=");
		sb.append(comfortLevel);
		sb.append(", price=");
		sb.append(price);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public rides toEntityModel() {
		ridesImpl ridesImpl = new ridesImpl();

		ridesImpl.setRidesId(ridesId);
		ridesImpl.setGroupId(groupId);
		ridesImpl.setCompanyId(companyId);
		ridesImpl.setUserId(userId);

		if (userName == null) {
			ridesImpl.setUserName("");
		}
		else {
			ridesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ridesImpl.setCreateDate(null);
		}
		else {
			ridesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ridesImpl.setModifiedDate(null);
		}
		else {
			ridesImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (leavingLocation == null) {
			ridesImpl.setLeavingLocation("");
		}
		else {
			ridesImpl.setLeavingLocation(leavingLocation);
		}

		if (headingLocation == null) {
			ridesImpl.setHeadingLocation("");
		}
		else {
			ridesImpl.setHeadingLocation(headingLocation);
		}

		if (arivalDate == Long.MIN_VALUE) {
			ridesImpl.setArivalDate(null);
		}
		else {
			ridesImpl.setArivalDate(new Date(arivalDate));
		}

		ridesImpl.setAvailableSeats(availableSeats);

		if (comfortLevel == null) {
			ridesImpl.setComfortLevel("");
		}
		else {
			ridesImpl.setComfortLevel(comfortLevel);
		}

		ridesImpl.setPrice(price);

		ridesImpl.resetOriginalValues();

		return ridesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ridesId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		leavingLocation = objectInput.readUTF();
		headingLocation = objectInput.readUTF();
		arivalDate = objectInput.readLong();

		availableSeats = objectInput.readInt();
		comfortLevel = objectInput.readUTF();

		price = objectInput.readFloat();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ridesId);

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

		if (leavingLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(leavingLocation);
		}

		if (headingLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(headingLocation);
		}

		objectOutput.writeLong(arivalDate);

		objectOutput.writeInt(availableSeats);

		if (comfortLevel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(comfortLevel);
		}

		objectOutput.writeFloat(price);
	}

	public long ridesId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String leavingLocation;
	public String headingLocation;
	public long arivalDate;
	public int availableSeats;
	public String comfortLevel;
	public float price;

}