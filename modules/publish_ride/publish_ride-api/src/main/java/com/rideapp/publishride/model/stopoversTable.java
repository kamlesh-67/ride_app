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
 * The table class for the &quot;Rideapp_stopovers&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see stopovers
 * @generated
 */
public class stopoversTable extends BaseTable<stopoversTable> {

	public static final stopoversTable INSTANCE = new stopoversTable();

	public final Column<stopoversTable, Long> stopoversId = createColumn(
		"stopoversId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<stopoversTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<stopoversTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<stopoversTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<stopoversTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<stopoversTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<stopoversTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<stopoversTable, String> location = createColumn(
		"location", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<stopoversTable, Date> arrivalTime = createColumn(
		"arrivalTime", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<stopoversTable, Date> departureTime = createColumn(
		"departureTime", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<stopoversTable, Long> ridesId = createColumn(
		"ridesId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private stopoversTable() {
		super("Rideapp_stopovers", stopoversTable::new);
	}

}