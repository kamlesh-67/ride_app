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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.rideapp.publishride.model.bookings;
import com.rideapp.publishride.model.bookingsModel;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the bookings service. Represents a row in the &quot;Rideapp_bookings&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>bookingsModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link bookingsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see bookingsImpl
 * @generated
 */
@JSON(strict = true)
public class bookingsModelImpl
	extends BaseModelImpl<bookings> implements bookingsModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a bookings model instance should use the <code>bookings</code> interface instead.
	 */
	public static final String TABLE_NAME = "Rideapp_bookings";

	public static final Object[][] TABLE_COLUMNS = {
		{"bookingsId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"bookingDate", Types.TIMESTAMP},
		{"bookedSeats", Types.INTEGER}, {"totalPrice", Types.FLOAT},
		{"ridesId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("bookingsId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("bookingDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("bookedSeats", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("totalPrice", Types.FLOAT);
		TABLE_COLUMNS_MAP.put("ridesId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table Rideapp_bookings (bookingsId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,bookingDate DATE null,bookedSeats INTEGER,totalPrice DOUBLE,ridesId LONG)";

	public static final String TABLE_SQL_DROP = "drop table Rideapp_bookings";

	public static final String ORDER_BY_JPQL =
		" ORDER BY bookings.bookingsId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY Rideapp_bookings.bookingsId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long BOOKINGSID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	public bookingsModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _bookingsId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setBookingsId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _bookingsId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return bookings.class;
	}

	@Override
	public String getModelClassName() {
		return bookings.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<bookings, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<bookings, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<bookings, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((bookings)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<bookings, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<bookings, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(bookings)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<bookings, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<bookings, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<bookings, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<bookings, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<bookings, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<bookings, Object>>();
		Map<String, BiConsumer<bookings, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<bookings, ?>>();

		attributeGetterFunctions.put("bookingsId", bookings::getBookingsId);
		attributeSetterBiConsumers.put(
			"bookingsId", (BiConsumer<bookings, Long>)bookings::setBookingsId);
		attributeGetterFunctions.put("groupId", bookings::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<bookings, Long>)bookings::setGroupId);
		attributeGetterFunctions.put("companyId", bookings::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId", (BiConsumer<bookings, Long>)bookings::setCompanyId);
		attributeGetterFunctions.put("userId", bookings::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<bookings, Long>)bookings::setUserId);
		attributeGetterFunctions.put("userName", bookings::getUserName);
		attributeSetterBiConsumers.put(
			"userName", (BiConsumer<bookings, String>)bookings::setUserName);
		attributeGetterFunctions.put("createDate", bookings::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate", (BiConsumer<bookings, Date>)bookings::setCreateDate);
		attributeGetterFunctions.put("modifiedDate", bookings::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<bookings, Date>)bookings::setModifiedDate);
		attributeGetterFunctions.put("bookingDate", bookings::getBookingDate);
		attributeSetterBiConsumers.put(
			"bookingDate",
			(BiConsumer<bookings, Date>)bookings::setBookingDate);
		attributeGetterFunctions.put("bookedSeats", bookings::getBookedSeats);
		attributeSetterBiConsumers.put(
			"bookedSeats",
			(BiConsumer<bookings, Integer>)bookings::setBookedSeats);
		attributeGetterFunctions.put("totalPrice", bookings::getTotalPrice);
		attributeSetterBiConsumers.put(
			"totalPrice", (BiConsumer<bookings, Float>)bookings::setTotalPrice);
		attributeGetterFunctions.put("ridesId", bookings::getRidesId);
		attributeSetterBiConsumers.put(
			"ridesId", (BiConsumer<bookings, Long>)bookings::setRidesId);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public long getBookingsId() {
		return _bookingsId;
	}

	@Override
	public void setBookingsId(long bookingsId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_bookingsId = bookingsId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_groupId = groupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_companyId = companyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public Date getBookingDate() {
		return _bookingDate;
	}

	@Override
	public void setBookingDate(Date bookingDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_bookingDate = bookingDate;
	}

	@JSON
	@Override
	public int getBookedSeats() {
		return _bookedSeats;
	}

	@Override
	public void setBookedSeats(int bookedSeats) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_bookedSeats = bookedSeats;
	}

	@JSON
	@Override
	public float getTotalPrice() {
		return _totalPrice;
	}

	@Override
	public void setTotalPrice(float totalPrice) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_totalPrice = totalPrice;
	}

	@JSON
	@Override
	public long getRidesId() {
		return _ridesId;
	}

	@Override
	public void setRidesId(long ridesId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_ridesId = ridesId;
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), bookings.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public bookings toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, bookings>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		bookingsImpl bookingsImpl = new bookingsImpl();

		bookingsImpl.setBookingsId(getBookingsId());
		bookingsImpl.setGroupId(getGroupId());
		bookingsImpl.setCompanyId(getCompanyId());
		bookingsImpl.setUserId(getUserId());
		bookingsImpl.setUserName(getUserName());
		bookingsImpl.setCreateDate(getCreateDate());
		bookingsImpl.setModifiedDate(getModifiedDate());
		bookingsImpl.setBookingDate(getBookingDate());
		bookingsImpl.setBookedSeats(getBookedSeats());
		bookingsImpl.setTotalPrice(getTotalPrice());
		bookingsImpl.setRidesId(getRidesId());

		bookingsImpl.resetOriginalValues();

		return bookingsImpl;
	}

	@Override
	public bookings cloneWithOriginalValues() {
		bookingsImpl bookingsImpl = new bookingsImpl();

		bookingsImpl.setBookingsId(
			this.<Long>getColumnOriginalValue("bookingsId"));
		bookingsImpl.setGroupId(this.<Long>getColumnOriginalValue("groupId"));
		bookingsImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		bookingsImpl.setUserId(this.<Long>getColumnOriginalValue("userId"));
		bookingsImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		bookingsImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		bookingsImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		bookingsImpl.setBookingDate(
			this.<Date>getColumnOriginalValue("bookingDate"));
		bookingsImpl.setBookedSeats(
			this.<Integer>getColumnOriginalValue("bookedSeats"));
		bookingsImpl.setTotalPrice(
			this.<Float>getColumnOriginalValue("totalPrice"));
		bookingsImpl.setRidesId(this.<Long>getColumnOriginalValue("ridesId"));

		return bookingsImpl;
	}

	@Override
	public int compareTo(bookings bookings) {
		long primaryKey = bookings.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof bookings)) {
			return false;
		}

		bookings bookings = (bookings)object;

		long primaryKey = bookings.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_setModifiedDate = false;

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<bookings> toCacheModel() {
		bookingsCacheModel bookingsCacheModel = new bookingsCacheModel();

		bookingsCacheModel.bookingsId = getBookingsId();

		bookingsCacheModel.groupId = getGroupId();

		bookingsCacheModel.companyId = getCompanyId();

		bookingsCacheModel.userId = getUserId();

		bookingsCacheModel.userName = getUserName();

		String userName = bookingsCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			bookingsCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			bookingsCacheModel.createDate = createDate.getTime();
		}
		else {
			bookingsCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			bookingsCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			bookingsCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		Date bookingDate = getBookingDate();

		if (bookingDate != null) {
			bookingsCacheModel.bookingDate = bookingDate.getTime();
		}
		else {
			bookingsCacheModel.bookingDate = Long.MIN_VALUE;
		}

		bookingsCacheModel.bookedSeats = getBookedSeats();

		bookingsCacheModel.totalPrice = getTotalPrice();

		bookingsCacheModel.ridesId = getRidesId();

		return bookingsCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<bookings, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<bookings, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<bookings, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((bookings)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, bookings>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					bookings.class, ModelWrapper.class);

	}

	private long _bookingsId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private Date _bookingDate;
	private int _bookedSeats;
	private float _totalPrice;
	private long _ridesId;

	public <T> T getColumnValue(String columnName) {
		Function<bookings, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((bookings)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("bookingsId", _bookingsId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("bookingDate", _bookingDate);
		_columnOriginalValues.put("bookedSeats", _bookedSeats);
		_columnOriginalValues.put("totalPrice", _totalPrice);
		_columnOriginalValues.put("ridesId", _ridesId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("bookingsId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("bookingDate", 128L);

		columnBitmasks.put("bookedSeats", 256L);

		columnBitmasks.put("totalPrice", 512L);

		columnBitmasks.put("ridesId", 1024L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private bookings _escapedModel;

}