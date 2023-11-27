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

import com.rideapp.publishride.model.stopovers;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing stopovers in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class stopoversCacheModel
	implements CacheModel<stopovers>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof stopoversCacheModel)) {
			return false;
		}

		stopoversCacheModel stopoversCacheModel = (stopoversCacheModel)object;

		if (stopoversId == stopoversCacheModel.stopoversId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, stopoversId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{stopoversId=");
		sb.append(stopoversId);
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
		sb.append(", location=");
		sb.append(location);
		sb.append(", arrivalTime=");
		sb.append(arrivalTime);
		sb.append(", departureTime=");
		sb.append(departureTime);
		sb.append(", ridesId=");
		sb.append(ridesId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public stopovers toEntityModel() {
		stopoversImpl stopoversImpl = new stopoversImpl();

		stopoversImpl.setStopoversId(stopoversId);
		stopoversImpl.setGroupId(groupId);
		stopoversImpl.setCompanyId(companyId);
		stopoversImpl.setUserId(userId);

		if (userName == null) {
			stopoversImpl.setUserName("");
		}
		else {
			stopoversImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			stopoversImpl.setCreateDate(null);
		}
		else {
			stopoversImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			stopoversImpl.setModifiedDate(null);
		}
		else {
			stopoversImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (location == null) {
			stopoversImpl.setLocation("");
		}
		else {
			stopoversImpl.setLocation(location);
		}

		if (arrivalTime == Long.MIN_VALUE) {
			stopoversImpl.setArrivalTime(null);
		}
		else {
			stopoversImpl.setArrivalTime(new Date(arrivalTime));
		}

		if (departureTime == Long.MIN_VALUE) {
			stopoversImpl.setDepartureTime(null);
		}
		else {
			stopoversImpl.setDepartureTime(new Date(departureTime));
		}

		stopoversImpl.setRidesId(ridesId);

		stopoversImpl.resetOriginalValues();

		return stopoversImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		stopoversId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		location = objectInput.readUTF();
		arrivalTime = objectInput.readLong();
		departureTime = objectInput.readLong();

		ridesId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(stopoversId);

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

		if (location == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(location);
		}

		objectOutput.writeLong(arrivalTime);
		objectOutput.writeLong(departureTime);

		objectOutput.writeLong(ridesId);
	}

	public long stopoversId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String location;
	public long arrivalTime;
	public long departureTime;
	public long ridesId;

}