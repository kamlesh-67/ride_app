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

import com.rideapp.publishride.model.returnRide;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing returnRide in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class returnRideCacheModel
	implements CacheModel<returnRide>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof returnRideCacheModel)) {
			return false;
		}

		returnRideCacheModel returnRideCacheModel =
			(returnRideCacheModel)object;

		if (returnRideId == returnRideCacheModel.returnRideId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, returnRideId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{returnRideId=");
		sb.append(returnRideId);
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
		sb.append(", returnDate=");
		sb.append(returnDate);
		sb.append(", availableSeats=");
		sb.append(availableSeats);
		sb.append(", price=");
		sb.append(price);
		sb.append(", ridesId=");
		sb.append(ridesId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public returnRide toEntityModel() {
		returnRideImpl returnRideImpl = new returnRideImpl();

		returnRideImpl.setReturnRideId(returnRideId);
		returnRideImpl.setGroupId(groupId);
		returnRideImpl.setCompanyId(companyId);
		returnRideImpl.setUserId(userId);

		if (userName == null) {
			returnRideImpl.setUserName("");
		}
		else {
			returnRideImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			returnRideImpl.setCreateDate(null);
		}
		else {
			returnRideImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			returnRideImpl.setModifiedDate(null);
		}
		else {
			returnRideImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (returnDate == Long.MIN_VALUE) {
			returnRideImpl.setReturnDate(null);
		}
		else {
			returnRideImpl.setReturnDate(new Date(returnDate));
		}

		returnRideImpl.setAvailableSeats(availableSeats);
		returnRideImpl.setPrice(price);
		returnRideImpl.setRidesId(ridesId);

		returnRideImpl.resetOriginalValues();

		return returnRideImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		returnRideId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		returnDate = objectInput.readLong();

		availableSeats = objectInput.readInt();

		price = objectInput.readFloat();

		ridesId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(returnRideId);

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
		objectOutput.writeLong(returnDate);

		objectOutput.writeInt(availableSeats);

		objectOutput.writeFloat(price);

		objectOutput.writeLong(ridesId);
	}

	public long returnRideId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long returnDate;
	public int availableSeats;
	public float price;
	public long ridesId;

}