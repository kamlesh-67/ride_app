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

import com.rideapp.publishride.model.stopovers;
import com.rideapp.publishride.model.stopoversModel;

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
 * The base model implementation for the stopovers service. Represents a row in the &quot;Rideapp_stopovers&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>stopoversModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link stopoversImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see stopoversImpl
 * @generated
 */
@JSON(strict = true)
public class stopoversModelImpl
	extends BaseModelImpl<stopovers> implements stopoversModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a stopovers model instance should use the <code>stopovers</code> interface instead.
	 */
	public static final String TABLE_NAME = "Rideapp_stopovers";

	public static final Object[][] TABLE_COLUMNS = {
		{"stopoversId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"location", Types.VARCHAR},
		{"arrivalTime", Types.TIMESTAMP}, {"departureTime", Types.TIMESTAMP},
		{"ridesId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("stopoversId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("location", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("arrivalTime", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("departureTime", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("ridesId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table Rideapp_stopovers (stopoversId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,location VARCHAR(75) null,arrivalTime DATE null,departureTime DATE null,ridesId LONG)";

	public static final String TABLE_SQL_DROP = "drop table Rideapp_stopovers";

	public static final String ORDER_BY_JPQL =
		" ORDER BY stopovers.stopoversId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY Rideapp_stopovers.stopoversId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long STOPOVERSID_COLUMN_BITMASK = 1L;

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

	public stopoversModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _stopoversId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setStopoversId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _stopoversId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return stopovers.class;
	}

	@Override
	public String getModelClassName() {
		return stopovers.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<stopovers, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<stopovers, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<stopovers, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((stopovers)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<stopovers, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<stopovers, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(stopovers)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<stopovers, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<stopovers, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<stopovers, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<stopovers, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<stopovers, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<stopovers, Object>>();
		Map<String, BiConsumer<stopovers, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<stopovers, ?>>();

		attributeGetterFunctions.put("stopoversId", stopovers::getStopoversId);
		attributeSetterBiConsumers.put(
			"stopoversId",
			(BiConsumer<stopovers, Long>)stopovers::setStopoversId);
		attributeGetterFunctions.put("groupId", stopovers::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<stopovers, Long>)stopovers::setGroupId);
		attributeGetterFunctions.put("companyId", stopovers::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId", (BiConsumer<stopovers, Long>)stopovers::setCompanyId);
		attributeGetterFunctions.put("userId", stopovers::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<stopovers, Long>)stopovers::setUserId);
		attributeGetterFunctions.put("userName", stopovers::getUserName);
		attributeSetterBiConsumers.put(
			"userName", (BiConsumer<stopovers, String>)stopovers::setUserName);
		attributeGetterFunctions.put("createDate", stopovers::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate",
			(BiConsumer<stopovers, Date>)stopovers::setCreateDate);
		attributeGetterFunctions.put(
			"modifiedDate", stopovers::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<stopovers, Date>)stopovers::setModifiedDate);
		attributeGetterFunctions.put("location", stopovers::getLocation);
		attributeSetterBiConsumers.put(
			"location", (BiConsumer<stopovers, String>)stopovers::setLocation);
		attributeGetterFunctions.put("arrivalTime", stopovers::getArrivalTime);
		attributeSetterBiConsumers.put(
			"arrivalTime",
			(BiConsumer<stopovers, Date>)stopovers::setArrivalTime);
		attributeGetterFunctions.put(
			"departureTime", stopovers::getDepartureTime);
		attributeSetterBiConsumers.put(
			"departureTime",
			(BiConsumer<stopovers, Date>)stopovers::setDepartureTime);
		attributeGetterFunctions.put("ridesId", stopovers::getRidesId);
		attributeSetterBiConsumers.put(
			"ridesId", (BiConsumer<stopovers, Long>)stopovers::setRidesId);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public long getStopoversId() {
		return _stopoversId;
	}

	@Override
	public void setStopoversId(long stopoversId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_stopoversId = stopoversId;
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
	public String getLocation() {
		if (_location == null) {
			return "";
		}
		else {
			return _location;
		}
	}

	@Override
	public void setLocation(String location) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_location = location;
	}

	@JSON
	@Override
	public Date getArrivalTime() {
		return _arrivalTime;
	}

	@Override
	public void setArrivalTime(Date arrivalTime) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_arrivalTime = arrivalTime;
	}

	@JSON
	@Override
	public Date getDepartureTime() {
		return _departureTime;
	}

	@Override
	public void setDepartureTime(Date departureTime) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_departureTime = departureTime;
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
			getCompanyId(), stopovers.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public stopovers toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, stopovers>
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
		stopoversImpl stopoversImpl = new stopoversImpl();

		stopoversImpl.setStopoversId(getStopoversId());
		stopoversImpl.setGroupId(getGroupId());
		stopoversImpl.setCompanyId(getCompanyId());
		stopoversImpl.setUserId(getUserId());
		stopoversImpl.setUserName(getUserName());
		stopoversImpl.setCreateDate(getCreateDate());
		stopoversImpl.setModifiedDate(getModifiedDate());
		stopoversImpl.setLocation(getLocation());
		stopoversImpl.setArrivalTime(getArrivalTime());
		stopoversImpl.setDepartureTime(getDepartureTime());
		stopoversImpl.setRidesId(getRidesId());

		stopoversImpl.resetOriginalValues();

		return stopoversImpl;
	}

	@Override
	public stopovers cloneWithOriginalValues() {
		stopoversImpl stopoversImpl = new stopoversImpl();

		stopoversImpl.setStopoversId(
			this.<Long>getColumnOriginalValue("stopoversId"));
		stopoversImpl.setGroupId(this.<Long>getColumnOriginalValue("groupId"));
		stopoversImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		stopoversImpl.setUserId(this.<Long>getColumnOriginalValue("userId"));
		stopoversImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		stopoversImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		stopoversImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		stopoversImpl.setLocation(
			this.<String>getColumnOriginalValue("location"));
		stopoversImpl.setArrivalTime(
			this.<Date>getColumnOriginalValue("arrivalTime"));
		stopoversImpl.setDepartureTime(
			this.<Date>getColumnOriginalValue("departureTime"));
		stopoversImpl.setRidesId(this.<Long>getColumnOriginalValue("ridesId"));

		return stopoversImpl;
	}

	@Override
	public int compareTo(stopovers stopovers) {
		long primaryKey = stopovers.getPrimaryKey();

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

		if (!(object instanceof stopovers)) {
			return false;
		}

		stopovers stopovers = (stopovers)object;

		long primaryKey = stopovers.getPrimaryKey();

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
	public CacheModel<stopovers> toCacheModel() {
		stopoversCacheModel stopoversCacheModel = new stopoversCacheModel();

		stopoversCacheModel.stopoversId = getStopoversId();

		stopoversCacheModel.groupId = getGroupId();

		stopoversCacheModel.companyId = getCompanyId();

		stopoversCacheModel.userId = getUserId();

		stopoversCacheModel.userName = getUserName();

		String userName = stopoversCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			stopoversCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			stopoversCacheModel.createDate = createDate.getTime();
		}
		else {
			stopoversCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			stopoversCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			stopoversCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		stopoversCacheModel.location = getLocation();

		String location = stopoversCacheModel.location;

		if ((location != null) && (location.length() == 0)) {
			stopoversCacheModel.location = null;
		}

		Date arrivalTime = getArrivalTime();

		if (arrivalTime != null) {
			stopoversCacheModel.arrivalTime = arrivalTime.getTime();
		}
		else {
			stopoversCacheModel.arrivalTime = Long.MIN_VALUE;
		}

		Date departureTime = getDepartureTime();

		if (departureTime != null) {
			stopoversCacheModel.departureTime = departureTime.getTime();
		}
		else {
			stopoversCacheModel.departureTime = Long.MIN_VALUE;
		}

		stopoversCacheModel.ridesId = getRidesId();

		return stopoversCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<stopovers, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<stopovers, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<stopovers, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((stopovers)this);

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

		private static final Function<InvocationHandler, stopovers>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					stopovers.class, ModelWrapper.class);

	}

	private long _stopoversId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _location;
	private Date _arrivalTime;
	private Date _departureTime;
	private long _ridesId;

	public <T> T getColumnValue(String columnName) {
		Function<stopovers, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((stopovers)this);
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

		_columnOriginalValues.put("stopoversId", _stopoversId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("location", _location);
		_columnOriginalValues.put("arrivalTime", _arrivalTime);
		_columnOriginalValues.put("departureTime", _departureTime);
		_columnOriginalValues.put("ridesId", _ridesId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("stopoversId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("location", 128L);

		columnBitmasks.put("arrivalTime", 256L);

		columnBitmasks.put("departureTime", 512L);

		columnBitmasks.put("ridesId", 1024L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private stopovers _escapedModel;

}