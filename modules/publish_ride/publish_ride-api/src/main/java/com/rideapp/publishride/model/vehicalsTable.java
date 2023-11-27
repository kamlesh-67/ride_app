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
 * The table class for the &quot;Rideapp_vehicals&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see vehicals
 * @generated
 */
public class vehicalsTable extends BaseTable<vehicalsTable> {

	public static final vehicalsTable INSTANCE = new vehicalsTable();

	public final Column<vehicalsTable, Long> vehicalsId = createColumn(
		"vehicalsId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<vehicalsTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<vehicalsTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<vehicalsTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<vehicalsTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<vehicalsTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<vehicalsTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<vehicalsTable, String> carModel = createColumn(
		"carModel", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<vehicalsTable, String> plateNumber = createColumn(
		"plateNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<vehicalsTable, Integer> capacity = createColumn(
		"capacity", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<vehicalsTable, String> comfortLevel = createColumn(
		"comfortLevel", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private vehicalsTable() {
		super("Rideapp_vehicals", vehicalsTable::new);
	}

}