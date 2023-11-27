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

import com.rideapp.publishride.model.bookings;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing bookings in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class bookingsCacheModel
	implements CacheModel<bookings>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof bookingsCacheModel)) {
			return false;
		}

		bookingsCacheModel bookingsCacheModel = (bookingsCacheModel)object;

		if (bookingsId == bookingsCacheModel.bookingsId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, bookingsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{bookingsId=");
		sb.append(bookingsId);
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
		sb.append(", bookingDate=");
		sb.append(bookingDate);
		sb.append(", bookedSeats=");
		sb.append(bookedSeats);
		sb.append(", totalPrice=");
		sb.append(totalPrice);
		sb.append(", ridesId=");
		sb.append(ridesId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public bookings toEntityModel() {
		bookingsImpl bookingsImpl = new bookingsImpl();

		bookingsImpl.setBookingsId(bookingsId);
		bookingsImpl.setGroupId(groupId);
		bookingsImpl.setCompanyId(companyId);
		bookingsImpl.setUserId(userId);

		if (userName == null) {
			bookingsImpl.setUserName("");
		}
		else {
			bookingsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			bookingsImpl.setCreateDate(null);
		}
		else {
			bookingsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			bookingsImpl.setModifiedDate(null);
		}
		else {
			bookingsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (bookingDate == Long.MIN_VALUE) {
			bookingsImpl.setBookingDate(null);
		}
		else {
			bookingsImpl.setBookingDate(new Date(bookingDate));
		}

		bookingsImpl.setBookedSeats(bookedSeats);
		bookingsImpl.setTotalPrice(totalPrice);
		bookingsImpl.setRidesId(ridesId);

		bookingsImpl.resetOriginalValues();

		return bookingsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		bookingsId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		bookingDate = objectInput.readLong();

		bookedSeats = objectInput.readInt();

		totalPrice = objectInput.readFloat();

		ridesId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(bookingsId);

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
		objectOutput.writeLong(bookingDate);

		objectOutput.writeInt(bookedSeats);

		objectOutput.writeFloat(totalPrice);

		objectOutput.writeLong(ridesId);
	}

	public long bookingsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long bookingDate;
	public int bookedSeats;
	public float totalPrice;
	public long ridesId;

}