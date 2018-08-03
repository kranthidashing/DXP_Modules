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

package com.astra.workflowservice.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.astra.workflowservice.model.Registration;
import com.astra.workflowservice.model.RegistrationModel;
import com.astra.workflowservice.model.RegistrationSoap;

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
 * The base model implementation for the Registration service. Represents a row in the &quot;Astra_Registration&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link RegistrationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RegistrationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegistrationImpl
 * @see Registration
 * @see RegistrationModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class RegistrationModelImpl extends BaseModelImpl<Registration>
	implements RegistrationModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a registration model instance should use the {@link Registration} interface instead.
	 */
	public static final String TABLE_NAME = "Astra_Registration";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "RegistrationId", Types.BIGINT },
			{ "firstname", Types.VARCHAR },
			{ "lastname", Types.VARCHAR },
			{ "course", Types.VARCHAR },
			{ "email", Types.VARCHAR },
			{ "location", Types.VARCHAR },
			{ "status", Types.VARCHAR },
			{ "comments", Types.VARCHAR },
			{ "Workflowstepnumber", Types.VARCHAR },
			{ "WorkflowId", Types.VARCHAR },
			{ "CurrentApprover", Types.VARCHAR },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("RegistrationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("firstname", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("lastname", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("course", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("email", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("location", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("status", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("comments", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("Workflowstepnumber", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("WorkflowId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("CurrentApprover", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE = "create table Astra_Registration (uuid_ VARCHAR(75) null,RegistrationId LONG not null primary key,firstname VARCHAR(75) null,lastname VARCHAR(75) null,course VARCHAR(75) null,email VARCHAR(75) null,location VARCHAR(75) null,status VARCHAR(75) null,comments VARCHAR(75) null,Workflowstepnumber VARCHAR(75) null,WorkflowId VARCHAR(75) null,CurrentApprover VARCHAR(75) null,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table Astra_Registration";
	public static final String ORDER_BY_JPQL = " ORDER BY registration.RegistrationId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Astra_Registration.RegistrationId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.astra.workflowservice.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.astra.workflowservice.model.Registration"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.astra.workflowservice.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.astra.workflowservice.model.Registration"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.astra.workflowservice.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.astra.workflowservice.model.Registration"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long UUID_COLUMN_BITMASK = 2L;
	public static final long REGISTRATIONID_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Registration toModel(RegistrationSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Registration model = new RegistrationImpl();

		model.setUuid(soapModel.getUuid());
		model.setRegistrationId(soapModel.getRegistrationId());
		model.setFirstname(soapModel.getFirstname());
		model.setLastname(soapModel.getLastname());
		model.setCourse(soapModel.getCourse());
		model.setEmail(soapModel.getEmail());
		model.setLocation(soapModel.getLocation());
		model.setStatus(soapModel.getStatus());
		model.setComments(soapModel.getComments());
		model.setWorkflowstepnumber(soapModel.getWorkflowstepnumber());
		model.setWorkflowId(soapModel.getWorkflowId());
		model.setCurrentApprover(soapModel.getCurrentApprover());
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
	public static List<Registration> toModels(RegistrationSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Registration> models = new ArrayList<Registration>(soapModels.length);

		for (RegistrationSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.astra.workflowservice.service.util.ServiceProps.get(
				"lock.expiration.time.com.astra.workflowservice.model.Registration"));

	public RegistrationModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _RegistrationId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRegistrationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _RegistrationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Registration.class;
	}

	@Override
	public String getModelClassName() {
		return Registration.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("RegistrationId", getRegistrationId());
		attributes.put("firstname", getFirstname());
		attributes.put("lastname", getLastname());
		attributes.put("course", getCourse());
		attributes.put("email", getEmail());
		attributes.put("location", getLocation());
		attributes.put("status", getStatus());
		attributes.put("comments", getComments());
		attributes.put("Workflowstepnumber", getWorkflowstepnumber());
		attributes.put("WorkflowId", getWorkflowId());
		attributes.put("CurrentApprover", getCurrentApprover());
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

		Long RegistrationId = (Long)attributes.get("RegistrationId");

		if (RegistrationId != null) {
			setRegistrationId(RegistrationId);
		}

		String firstname = (String)attributes.get("firstname");

		if (firstname != null) {
			setFirstname(firstname);
		}

		String lastname = (String)attributes.get("lastname");

		if (lastname != null) {
			setLastname(lastname);
		}

		String course = (String)attributes.get("course");

		if (course != null) {
			setCourse(course);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String comments = (String)attributes.get("comments");

		if (comments != null) {
			setComments(comments);
		}

		String Workflowstepnumber = (String)attributes.get("Workflowstepnumber");

		if (Workflowstepnumber != null) {
			setWorkflowstepnumber(Workflowstepnumber);
		}

		String WorkflowId = (String)attributes.get("WorkflowId");

		if (WorkflowId != null) {
			setWorkflowId(WorkflowId);
		}

		String CurrentApprover = (String)attributes.get("CurrentApprover");

		if (CurrentApprover != null) {
			setCurrentApprover(CurrentApprover);
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
	public long getRegistrationId() {
		return _RegistrationId;
	}

	@Override
	public void setRegistrationId(long RegistrationId) {
		_RegistrationId = RegistrationId;
	}

	@JSON
	@Override
	public String getFirstname() {
		if (_firstname == null) {
			return StringPool.BLANK;
		}
		else {
			return _firstname;
		}
	}

	@Override
	public void setFirstname(String firstname) {
		_firstname = firstname;
	}

	@JSON
	@Override
	public String getLastname() {
		if (_lastname == null) {
			return StringPool.BLANK;
		}
		else {
			return _lastname;
		}
	}

	@Override
	public void setLastname(String lastname) {
		_lastname = lastname;
	}

	@JSON
	@Override
	public String getCourse() {
		if (_course == null) {
			return StringPool.BLANK;
		}
		else {
			return _course;
		}
	}

	@Override
	public void setCourse(String course) {
		_course = course;
	}

	@JSON
	@Override
	public String getEmail() {
		if (_email == null) {
			return StringPool.BLANK;
		}
		else {
			return _email;
		}
	}

	@Override
	public void setEmail(String email) {
		_email = email;
	}

	@JSON
	@Override
	public String getLocation() {
		if (_location == null) {
			return StringPool.BLANK;
		}
		else {
			return _location;
		}
	}

	@Override
	public void setLocation(String location) {
		_location = location;
	}

	@JSON
	@Override
	public String getStatus() {
		if (_status == null) {
			return StringPool.BLANK;
		}
		else {
			return _status;
		}
	}

	@Override
	public void setStatus(String status) {
		_status = status;
	}

	@JSON
	@Override
	public String getComments() {
		if (_comments == null) {
			return StringPool.BLANK;
		}
		else {
			return _comments;
		}
	}

	@Override
	public void setComments(String comments) {
		_comments = comments;
	}

	@JSON
	@Override
	public String getWorkflowstepnumber() {
		if (_Workflowstepnumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _Workflowstepnumber;
		}
	}

	@Override
	public void setWorkflowstepnumber(String Workflowstepnumber) {
		_Workflowstepnumber = Workflowstepnumber;
	}

	@JSON
	@Override
	public String getWorkflowId() {
		if (_WorkflowId == null) {
			return StringPool.BLANK;
		}
		else {
			return _WorkflowId;
		}
	}

	@Override
	public void setWorkflowId(String WorkflowId) {
		_WorkflowId = WorkflowId;
	}

	@JSON
	@Override
	public String getCurrentApprover() {
		if (_CurrentApprover == null) {
			return StringPool.BLANK;
		}
		else {
			return _CurrentApprover;
		}
	}

	@Override
	public void setCurrentApprover(String CurrentApprover) {
		_CurrentApprover = CurrentApprover;
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
				Registration.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Registration.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Registration toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Registration)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		RegistrationImpl registrationImpl = new RegistrationImpl();

		registrationImpl.setUuid(getUuid());
		registrationImpl.setRegistrationId(getRegistrationId());
		registrationImpl.setFirstname(getFirstname());
		registrationImpl.setLastname(getLastname());
		registrationImpl.setCourse(getCourse());
		registrationImpl.setEmail(getEmail());
		registrationImpl.setLocation(getLocation());
		registrationImpl.setStatus(getStatus());
		registrationImpl.setComments(getComments());
		registrationImpl.setWorkflowstepnumber(getWorkflowstepnumber());
		registrationImpl.setWorkflowId(getWorkflowId());
		registrationImpl.setCurrentApprover(getCurrentApprover());
		registrationImpl.setCompanyId(getCompanyId());
		registrationImpl.setUserId(getUserId());
		registrationImpl.setUserName(getUserName());
		registrationImpl.setCreateDate(getCreateDate());
		registrationImpl.setModifiedDate(getModifiedDate());

		registrationImpl.resetOriginalValues();

		return registrationImpl;
	}

	@Override
	public int compareTo(Registration registration) {
		long primaryKey = registration.getPrimaryKey();

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

		if (!(obj instanceof Registration)) {
			return false;
		}

		Registration registration = (Registration)obj;

		long primaryKey = registration.getPrimaryKey();

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
		RegistrationModelImpl registrationModelImpl = this;

		registrationModelImpl._originalUuid = registrationModelImpl._uuid;

		registrationModelImpl._originalCompanyId = registrationModelImpl._companyId;

		registrationModelImpl._setOriginalCompanyId = false;

		registrationModelImpl._setModifiedDate = false;

		registrationModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Registration> toCacheModel() {
		RegistrationCacheModel registrationCacheModel = new RegistrationCacheModel();

		registrationCacheModel.uuid = getUuid();

		String uuid = registrationCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			registrationCacheModel.uuid = null;
		}

		registrationCacheModel.RegistrationId = getRegistrationId();

		registrationCacheModel.firstname = getFirstname();

		String firstname = registrationCacheModel.firstname;

		if ((firstname != null) && (firstname.length() == 0)) {
			registrationCacheModel.firstname = null;
		}

		registrationCacheModel.lastname = getLastname();

		String lastname = registrationCacheModel.lastname;

		if ((lastname != null) && (lastname.length() == 0)) {
			registrationCacheModel.lastname = null;
		}

		registrationCacheModel.course = getCourse();

		String course = registrationCacheModel.course;

		if ((course != null) && (course.length() == 0)) {
			registrationCacheModel.course = null;
		}

		registrationCacheModel.email = getEmail();

		String email = registrationCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			registrationCacheModel.email = null;
		}

		registrationCacheModel.location = getLocation();

		String location = registrationCacheModel.location;

		if ((location != null) && (location.length() == 0)) {
			registrationCacheModel.location = null;
		}

		registrationCacheModel.status = getStatus();

		String status = registrationCacheModel.status;

		if ((status != null) && (status.length() == 0)) {
			registrationCacheModel.status = null;
		}

		registrationCacheModel.comments = getComments();

		String comments = registrationCacheModel.comments;

		if ((comments != null) && (comments.length() == 0)) {
			registrationCacheModel.comments = null;
		}

		registrationCacheModel.Workflowstepnumber = getWorkflowstepnumber();

		String Workflowstepnumber = registrationCacheModel.Workflowstepnumber;

		if ((Workflowstepnumber != null) && (Workflowstepnumber.length() == 0)) {
			registrationCacheModel.Workflowstepnumber = null;
		}

		registrationCacheModel.WorkflowId = getWorkflowId();

		String WorkflowId = registrationCacheModel.WorkflowId;

		if ((WorkflowId != null) && (WorkflowId.length() == 0)) {
			registrationCacheModel.WorkflowId = null;
		}

		registrationCacheModel.CurrentApprover = getCurrentApprover();

		String CurrentApprover = registrationCacheModel.CurrentApprover;

		if ((CurrentApprover != null) && (CurrentApprover.length() == 0)) {
			registrationCacheModel.CurrentApprover = null;
		}

		registrationCacheModel.companyId = getCompanyId();

		registrationCacheModel.userId = getUserId();

		registrationCacheModel.userName = getUserName();

		String userName = registrationCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			registrationCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			registrationCacheModel.createDate = createDate.getTime();
		}
		else {
			registrationCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			registrationCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			registrationCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return registrationCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", RegistrationId=");
		sb.append(getRegistrationId());
		sb.append(", firstname=");
		sb.append(getFirstname());
		sb.append(", lastname=");
		sb.append(getLastname());
		sb.append(", course=");
		sb.append(getCourse());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", location=");
		sb.append(getLocation());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", comments=");
		sb.append(getComments());
		sb.append(", Workflowstepnumber=");
		sb.append(getWorkflowstepnumber());
		sb.append(", WorkflowId=");
		sb.append(getWorkflowId());
		sb.append(", CurrentApprover=");
		sb.append(getCurrentApprover());
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
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("com.astra.workflowservice.model.Registration");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>RegistrationId</column-name><column-value><![CDATA[");
		sb.append(getRegistrationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>firstname</column-name><column-value><![CDATA[");
		sb.append(getFirstname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastname</column-name><column-value><![CDATA[");
		sb.append(getLastname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>course</column-name><column-value><![CDATA[");
		sb.append(getCourse());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>location</column-name><column-value><![CDATA[");
		sb.append(getLocation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>comments</column-name><column-value><![CDATA[");
		sb.append(getComments());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Workflowstepnumber</column-name><column-value><![CDATA[");
		sb.append(getWorkflowstepnumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>WorkflowId</column-name><column-value><![CDATA[");
		sb.append(getWorkflowId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CurrentApprover</column-name><column-value><![CDATA[");
		sb.append(getCurrentApprover());
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

	private static final ClassLoader _classLoader = Registration.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Registration.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _RegistrationId;
	private String _firstname;
	private String _lastname;
	private String _course;
	private String _email;
	private String _location;
	private String _status;
	private String _comments;
	private String _Workflowstepnumber;
	private String _WorkflowId;
	private String _CurrentApprover;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _columnBitmask;
	private Registration _escapedModel;
}