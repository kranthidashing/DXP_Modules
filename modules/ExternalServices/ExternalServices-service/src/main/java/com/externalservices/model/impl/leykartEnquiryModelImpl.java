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

package com.externalservices.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.externalservices.model.leykartEnquiry;
import com.externalservices.model.leykartEnquiryModel;
import com.externalservices.model.leykartEnquirySoap;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the leykartEnquiry service. Represents a row in the &quot;ExternalServices_leykartEnquiry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link leykartEnquiryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link leykartEnquiryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see leykartEnquiryImpl
 * @see leykartEnquiry
 * @see leykartEnquiryModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class leykartEnquiryModelImpl extends BaseModelImpl<leykartEnquiry>
	implements leykartEnquiryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a leykart enquiry model instance should use the {@link leykartEnquiry} interface instead.
	 */
	public static final String TABLE_NAME = "ExternalServices_leykartEnquiry";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "Eid", Types.BIGINT },
			{ "FirstName", Types.VARCHAR },
			{ "LastName", Types.VARCHAR },
			{ "Email", Types.VARCHAR },
			{ "ContactNumber", Types.VARCHAR },
			{ "PartName", Types.VARCHAR },
			{ "PartNumber", Types.VARCHAR },
			{ "Message", Types.VARCHAR },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("Eid", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("FirstName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("LastName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("Email", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("ContactNumber", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("PartName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("PartNumber", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("Message", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE = "create table ExternalServices_leykartEnquiry (uuid_ VARCHAR(75) null,Eid LONG not null primary key,FirstName VARCHAR(75) null,LastName VARCHAR(75) null,Email VARCHAR(75) null,ContactNumber VARCHAR(75) null,PartName VARCHAR(75) null,PartNumber VARCHAR(75) null,Message VARCHAR(75) null,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table ExternalServices_leykartEnquiry";
	public static final String ORDER_BY_JPQL = " ORDER BY leykartEnquiry.Eid ASC";
	public static final String ORDER_BY_SQL = " ORDER BY ExternalServices_leykartEnquiry.Eid ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.externalservices.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.externalservices.model.leykartEnquiry"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.externalservices.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.externalservices.model.leykartEnquiry"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.externalservices.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.externalservices.model.leykartEnquiry"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long UUID_COLUMN_BITMASK = 2L;
	public static final long EID_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static leykartEnquiry toModel(leykartEnquirySoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		leykartEnquiry model = new leykartEnquiryImpl();

		model.setUuid(soapModel.getUuid());
		model.setEid(soapModel.getEid());
		model.setFirstName(soapModel.getFirstName());
		model.setLastName(soapModel.getLastName());
		model.setEmail(soapModel.getEmail());
		model.setContactNumber(soapModel.getContactNumber());
		model.setPartName(soapModel.getPartName());
		model.setPartNumber(soapModel.getPartNumber());
		model.setMessage(soapModel.getMessage());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<leykartEnquiry> toModels(leykartEnquirySoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<leykartEnquiry> models = new ArrayList<leykartEnquiry>(soapModels.length);

		for (leykartEnquirySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.externalservices.service.util.ServiceProps.get(
				"lock.expiration.time.com.externalservices.model.leykartEnquiry"));

	public leykartEnquiryModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _Eid;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEid(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _Eid;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return leykartEnquiry.class;
	}

	@Override
	public String getModelClassName() {
		return leykartEnquiry.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("Eid", getEid());
		attributes.put("FirstName", getFirstName());
		attributes.put("LastName", getLastName());
		attributes.put("Email", getEmail());
		attributes.put("ContactNumber", getContactNumber());
		attributes.put("PartName", getPartName());
		attributes.put("PartNumber", getPartNumber());
		attributes.put("Message", getMessage());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long Eid = (Long)attributes.get("Eid");

		if (Eid != null) {
			setEid(Eid);
		}

		String FirstName = (String)attributes.get("FirstName");

		if (FirstName != null) {
			setFirstName(FirstName);
		}

		String LastName = (String)attributes.get("LastName");

		if (LastName != null) {
			setLastName(LastName);
		}

		String Email = (String)attributes.get("Email");

		if (Email != null) {
			setEmail(Email);
		}

		String ContactNumber = (String)attributes.get("ContactNumber");

		if (ContactNumber != null) {
			setContactNumber(ContactNumber);
		}

		String PartName = (String)attributes.get("PartName");

		if (PartName != null) {
			setPartName(PartName);
		}

		String PartNumber = (String)attributes.get("PartNumber");

		if (PartNumber != null) {
			setPartNumber(PartNumber);
		}

		String Message = (String)attributes.get("Message");

		if (Message != null) {
			setMessage(Message);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getEid() {
		return _Eid;
	}

	@Override
	public void setEid(long Eid) {
		_Eid = Eid;
	}

	@JSON
	@Override
	public String getFirstName() {
		if (_FirstName == null) {
			return StringPool.BLANK;
		}
		else {
			return _FirstName;
		}
	}

	@Override
	public void setFirstName(String FirstName) {
		_FirstName = FirstName;
	}

	@JSON
	@Override
	public String getLastName() {
		if (_LastName == null) {
			return StringPool.BLANK;
		}
		else {
			return _LastName;
		}
	}

	@Override
	public void setLastName(String LastName) {
		_LastName = LastName;
	}

	@JSON
	@Override
	public String getEmail() {
		if (_Email == null) {
			return StringPool.BLANK;
		}
		else {
			return _Email;
		}
	}

	@Override
	public void setEmail(String Email) {
		_Email = Email;
	}

	@JSON
	@Override
	public String getContactNumber() {
		if (_ContactNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _ContactNumber;
		}
	}

	@Override
	public void setContactNumber(String ContactNumber) {
		_ContactNumber = ContactNumber;
	}

	@JSON
	@Override
	public String getPartName() {
		if (_PartName == null) {
			return StringPool.BLANK;
		}
		else {
			return _PartName;
		}
	}

	@Override
	public void setPartName(String PartName) {
		_PartName = PartName;
	}

	@JSON
	@Override
	public String getPartNumber() {
		if (_PartNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _PartNumber;
		}
	}

	@Override
	public void setPartNumber(String PartNumber) {
		_PartNumber = PartNumber;
	}

	@JSON
	@Override
	public String getMessage() {
		if (_Message == null) {
			return StringPool.BLANK;
		}
		else {
			return _Message;
		}
	}

	@Override
	public void setMessage(String Message) {
		_Message = Message;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
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

		_modifiedDate = modifiedDate;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				leykartEnquiry.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			leykartEnquiry.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public leykartEnquiry toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (leykartEnquiry)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		leykartEnquiryImpl leykartEnquiryImpl = new leykartEnquiryImpl();

		leykartEnquiryImpl.setUuid(getUuid());
		leykartEnquiryImpl.setEid(getEid());
		leykartEnquiryImpl.setFirstName(getFirstName());
		leykartEnquiryImpl.setLastName(getLastName());
		leykartEnquiryImpl.setEmail(getEmail());
		leykartEnquiryImpl.setContactNumber(getContactNumber());
		leykartEnquiryImpl.setPartName(getPartName());
		leykartEnquiryImpl.setPartNumber(getPartNumber());
		leykartEnquiryImpl.setMessage(getMessage());
		leykartEnquiryImpl.setCompanyId(getCompanyId());
		leykartEnquiryImpl.setUserId(getUserId());
		leykartEnquiryImpl.setUserName(getUserName());
		leykartEnquiryImpl.setCreateDate(getCreateDate());
		leykartEnquiryImpl.setModifiedDate(getModifiedDate());

		leykartEnquiryImpl.resetOriginalValues();

		return leykartEnquiryImpl;
	}

	@Override
	public int compareTo(leykartEnquiry leykartEnquiry) {
		long primaryKey = leykartEnquiry.getPrimaryKey();

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
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof leykartEnquiry)) {
			return false;
		}

		leykartEnquiry leykartEnquiry = (leykartEnquiry)obj;

		long primaryKey = leykartEnquiry.getPrimaryKey();

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

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		leykartEnquiryModelImpl leykartEnquiryModelImpl = this;

		leykartEnquiryModelImpl._originalUuid = leykartEnquiryModelImpl._uuid;

		leykartEnquiryModelImpl._originalCompanyId = leykartEnquiryModelImpl._companyId;

		leykartEnquiryModelImpl._setOriginalCompanyId = false;

		leykartEnquiryModelImpl._setModifiedDate = false;

		leykartEnquiryModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<leykartEnquiry> toCacheModel() {
		leykartEnquiryCacheModel leykartEnquiryCacheModel = new leykartEnquiryCacheModel();

		leykartEnquiryCacheModel.uuid = getUuid();

		String uuid = leykartEnquiryCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			leykartEnquiryCacheModel.uuid = null;
		}

		leykartEnquiryCacheModel.Eid = getEid();

		leykartEnquiryCacheModel.FirstName = getFirstName();

		String FirstName = leykartEnquiryCacheModel.FirstName;

		if ((FirstName != null) && (FirstName.length() == 0)) {
			leykartEnquiryCacheModel.FirstName = null;
		}

		leykartEnquiryCacheModel.LastName = getLastName();

		String LastName = leykartEnquiryCacheModel.LastName;

		if ((LastName != null) && (LastName.length() == 0)) {
			leykartEnquiryCacheModel.LastName = null;
		}

		leykartEnquiryCacheModel.Email = getEmail();

		String Email = leykartEnquiryCacheModel.Email;

		if ((Email != null) && (Email.length() == 0)) {
			leykartEnquiryCacheModel.Email = null;
		}

		leykartEnquiryCacheModel.ContactNumber = getContactNumber();

		String ContactNumber = leykartEnquiryCacheModel.ContactNumber;

		if ((ContactNumber != null) && (ContactNumber.length() == 0)) {
			leykartEnquiryCacheModel.ContactNumber = null;
		}

		leykartEnquiryCacheModel.PartName = getPartName();

		String PartName = leykartEnquiryCacheModel.PartName;

		if ((PartName != null) && (PartName.length() == 0)) {
			leykartEnquiryCacheModel.PartName = null;
		}

		leykartEnquiryCacheModel.PartNumber = getPartNumber();

		String PartNumber = leykartEnquiryCacheModel.PartNumber;

		if ((PartNumber != null) && (PartNumber.length() == 0)) {
			leykartEnquiryCacheModel.PartNumber = null;
		}

		leykartEnquiryCacheModel.Message = getMessage();

		String Message = leykartEnquiryCacheModel.Message;

		if ((Message != null) && (Message.length() == 0)) {
			leykartEnquiryCacheModel.Message = null;
		}

		leykartEnquiryCacheModel.companyId = getCompanyId();

		leykartEnquiryCacheModel.userId = getUserId();

		leykartEnquiryCacheModel.userName = getUserName();

		String userName = leykartEnquiryCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			leykartEnquiryCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			leykartEnquiryCacheModel.createDate = createDate.getTime();
		}
		else {
			leykartEnquiryCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			leykartEnquiryCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			leykartEnquiryCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return leykartEnquiryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", Eid=");
		sb.append(getEid());
		sb.append(", FirstName=");
		sb.append(getFirstName());
		sb.append(", LastName=");
		sb.append(getLastName());
		sb.append(", Email=");
		sb.append(getEmail());
		sb.append(", ContactNumber=");
		sb.append(getContactNumber());
		sb.append(", PartName=");
		sb.append(getPartName());
		sb.append(", PartNumber=");
		sb.append(getPartNumber());
		sb.append(", Message=");
		sb.append(getMessage());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.externalservices.model.leykartEnquiry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Eid</column-name><column-value><![CDATA[");
		sb.append(getEid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FirstName</column-name><column-value><![CDATA[");
		sb.append(getFirstName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LastName</column-name><column-value><![CDATA[");
		sb.append(getLastName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ContactNumber</column-name><column-value><![CDATA[");
		sb.append(getContactNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PartName</column-name><column-value><![CDATA[");
		sb.append(getPartName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PartNumber</column-name><column-value><![CDATA[");
		sb.append(getPartNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Message</column-name><column-value><![CDATA[");
		sb.append(getMessage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = leykartEnquiry.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			leykartEnquiry.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _Eid;
	private String _FirstName;
	private String _LastName;
	private String _Email;
	private String _ContactNumber;
	private String _PartName;
	private String _PartNumber;
	private String _Message;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _columnBitmask;
	private leykartEnquiry _escapedModel;
}