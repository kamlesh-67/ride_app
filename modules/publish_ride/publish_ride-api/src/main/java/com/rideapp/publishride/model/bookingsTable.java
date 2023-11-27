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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;Rideapp_bookings&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see bookings
 * @generated
 */
public class bookingsTable extends BaseTable<bookingsTable> {

	public static final bookingsTable INSTANCE = new bookingsTable();

	public final Column<bookingsTable, Long> bookingsId = createColumn(
		"bookingsId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<bookingsTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<bookingsTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<bookingsTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<bookingsTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<bookingsTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<bookingsTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<bookingsTable, Date> bookingDate = createColumn(
		"bookingDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<bookingsTable, Integer> bookedSeats = createColumn(
		"bookedSeats", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<bookingsTable, Float> totalPrice = createColumn(
		"totalPrice", Float.class, Types.FLOAT, Column.FLAG_DEFAULT);
	public final Column<bookingsTable, Long> ridesId = createColumn(
		"ridesId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private bookingsTable() {
		super("Rideapp_bookings", bookingsTable::new);
	}

}