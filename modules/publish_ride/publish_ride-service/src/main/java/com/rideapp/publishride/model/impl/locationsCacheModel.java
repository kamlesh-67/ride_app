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

import com.rideapp.publishride.model.locations;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing locations in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class locationsCacheModel
	implements CacheModel<locations>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof locationsCacheModel)) {
			return false;
		}

		locationsCacheModel locationsCacheModel = (locationsCacheModel)object;

		if (locationsId == locationsCacheModel.locationsId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, locationsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{locationsId=");
		sb.append(locationsId);
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
		sb.append(", name=");
		sb.append(name);
		sb.append(", latitude=");
		sb.append(latitude);
		sb.append(", longitude=");
		sb.append(longitude);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public locations toEntityModel() {
		locationsImpl locationsImpl = new locationsImpl();

		locationsImpl.setLocationsId(locationsId);
		locationsImpl.setGroupId(groupId);
		locationsImpl.setCompanyId(companyId);
		locationsImpl.setUserId(userId);

		if (userName == null) {
			locationsImpl.setUserName("");
		}
		else {
			locationsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			locationsImpl.setCreateDate(null);
		}
		else {
			locationsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			locationsImpl.setModifiedDate(null);
		}
		else {
			locationsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			locationsImpl.setName("");
		}
		else {
			locationsImpl.setName(name);
		}

		locationsImpl.setLatitude(latitude);
		locationsImpl.setLongitude(longitude);

		locationsImpl.resetOriginalValues();

		return locationsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		locationsId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();

		latitude = objectInput.readDouble();

		longitude = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(locationsId);

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

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeDouble(latitude);

		objectOutput.writeDouble(longitude);
	}

	public long locationsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public double latitude;
	public double longitude;

}