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

import com.astra.workflowservice.model.WorkFlowConfig;
import com.astra.workflowservice.model.WorkFlowConfigModel;
import com.astra.workflowservice.model.WorkFlowConfigSoap;

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
 * The base model implementation for the WorkFlowConfig service. Represents a row in the &quot;Astra_WorkFlowConfig&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link WorkFlowConfigModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link WorkFlowConfigImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WorkFlowConfigImpl
 * @see WorkFlowConfig
 * @see WorkFlowConfigModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class WorkFlowConfigModelImpl extends BaseModelImpl<WorkFlowConfig>
	implements WorkFlowConfigModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a work flow config model instance should use the {@link WorkFlowConfig} interface instead.
	 */
	public static final String TABLE_NAME = "Astra_WorkFlowConfig";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "WfcId", Types.BIGINT },
			{ "ConfigKey", Types.VARCHAR },
			{ "Content", Types.VARCHAR },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("WfcId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("ConfigKey", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("Content", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE = "create table Astra_WorkFlowConfig (uuid_ VARCHAR(75) null,WfcId LONG not null primary key,ConfigKey VARCHAR(75) null,Content TEXT null,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table Astra_WorkFlowConfig";
	public static final String ORDER_BY_JPQL = " ORDER BY workFlowConfig.WfcId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Astra_WorkFlowConfig.WfcId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.astra.workflowservice.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.astra.workflowservice.model.WorkFlowConfig"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.astra.workflowservice.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.astra.workflowservice.model.WorkFlowConfig"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.astra.workflowservice.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.astra.workflowservice.model.WorkFlowConfig"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long UUID_COLUMN_BITMASK = 2L;
	public static final long WFCID_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static WorkFlowConfig toModel(WorkFlowConfigSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		WorkFlowConfig model = new WorkFlowConfigImpl();

		model.setUuid(soapModel.getUuid());
		model.setWfcId(soapModel.getWfcId());
		model.setConfigKey(soapModel.getConfigKey());
		model.setContent(soapModel.getContent());
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
	public static List<WorkFlowConfig> toModels(WorkFlowConfigSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<WorkFlowConfig> models = new ArrayList<WorkFlowConfig>(soapModels.length);

		for (WorkFlowConfigSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.astra.workflowservice.service.util.ServiceProps.get(
				"lock.expiration.time.com.astra.workflowservice.model.WorkFlowConfig"));

	public WorkFlowConfigModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _WfcId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setWfcId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _WfcId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return WorkFlowConfig.class;
	}

	@Override
	public String getModelClassName() {
		return WorkFlowConfig.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("WfcId", getWfcId());
		attributes.put("ConfigKey", getConfigKey());
		attributes.put("Content", getContent());
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

		Long WfcId = (Long)attributes.get("WfcId");

		if (WfcId != null) {
			setWfcId(WfcId);
		}

		String ConfigKey = (String)attributes.get("ConfigKey");

		if (ConfigKey != null) {
			setConfigKey(ConfigKey);
		}

		String Content = (String)attributes.get("Content");

		if (Content != null) {
			setContent(Content);
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
	public long getWfcId() {
		return _WfcId;
	}

	@Override
	public void setWfcId(long WfcId) {
		_WfcId = WfcId;
	}

	@JSON
	@Override
	public String getConfigKey() {
		if (_ConfigKey == null) {
			return StringPool.BLANK;
		}
		else {
			return _ConfigKey;
		}
	}

	@Override
	public void setConfigKey(String ConfigKey) {
		_ConfigKey = ConfigKey;
	}

	@JSON
	@Override
	public String getContent() {
		if (_Content == null) {
			return StringPool.BLANK;
		}
		else {
			return _Content;
		}
	}

	@Override
	public void setContent(String Content) {
		_Content = Content;
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
				WorkFlowConfig.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			WorkFlowConfig.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public WorkFlowConfig toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (WorkFlowConfig)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		WorkFlowConfigImpl workFlowConfigImpl = new WorkFlowConfigImpl();

		workFlowConfigImpl.setUuid(getUuid());
		workFlowConfigImpl.setWfcId(getWfcId());
		workFlowConfigImpl.setConfigKey(getConfigKey());
		workFlowConfigImpl.setContent(getContent());
		workFlowConfigImpl.setCompanyId(getCompanyId());
		workFlowConfigImpl.setUserId(getUserId());
		workFlowConfigImpl.setUserName(getUserName());
		workFlowConfigImpl.setCreateDate(getCreateDate());
		workFlowConfigImpl.setModifiedDate(getModifiedDate());

		workFlowConfigImpl.resetOriginalValues();

		return workFlowConfigImpl;
	}

	@Override
	public int compareTo(WorkFlowConfig workFlowConfig) {
		long primaryKey = workFlowConfig.getPrimaryKey();

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

		if (!(obj instanceof WorkFlowConfig)) {
			return false;
		}

		WorkFlowConfig workFlowConfig = (WorkFlowConfig)obj;

		long primaryKey = workFlowConfig.getPrimaryKey();

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
		WorkFlowConfigModelImpl workFlowConfigModelImpl = this;

		workFlowConfigModelImpl._originalUuid = workFlowConfigModelImpl._uuid;

		workFlowConfigModelImpl._originalCompanyId = workFlowConfigModelImpl._companyId;

		workFlowConfigModelImpl._setOriginalCompanyId = false;

		workFlowConfigModelImpl._setModifiedDate = false;

		workFlowConfigModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<WorkFlowConfig> toCacheModel() {
		WorkFlowConfigCacheModel workFlowConfigCacheModel = new WorkFlowConfigCacheModel();

		workFlowConfigCacheModel.uuid = getUuid();

		String uuid = workFlowConfigCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			workFlowConfigCacheModel.uuid = null;
		}

		workFlowConfigCacheModel.WfcId = getWfcId();

		workFlowConfigCacheModel.ConfigKey = getConfigKey();

		String ConfigKey = workFlowConfigCacheModel.ConfigKey;

		if ((ConfigKey != null) && (ConfigKey.length() == 0)) {
			workFlowConfigCacheModel.ConfigKey = null;
		}

		workFlowConfigCacheModel.Content = getContent();

		String Content = workFlowConfigCacheModel.Content;

		if ((Content != null) && (Content.length() == 0)) {
			workFlowConfigCacheModel.Content = null;
		}

		workFlowConfigCacheModel.companyId = getCompanyId();

		workFlowConfigCacheModel.userId = getUserId();

		workFlowConfigCacheModel.userName = getUserName();

		String userName = workFlowConfigCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			workFlowConfigCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			workFlowConfigCacheModel.createDate = createDate.getTime();
		}
		else {
			workFlowConfigCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			workFlowConfigCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			workFlowConfigCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return workFlowConfigCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", WfcId=");
		sb.append(getWfcId());
		sb.append(", ConfigKey=");
		sb.append(getConfigKey());
		sb.append(", Content=");
		sb.append(getContent());
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
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.astra.workflowservice.model.WorkFlowConfig");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>WfcId</column-name><column-value><![CDATA[");
		sb.append(getWfcId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ConfigKey</column-name><column-value><![CDATA[");
		sb.append(getConfigKey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Content</column-name><column-value><![CDATA[");
		sb.append(getContent());
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

	private static final ClassLoader _classLoader = WorkFlowConfig.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			WorkFlowConfig.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _WfcId;
	private String _ConfigKey;
	private String _Content;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _columnBitmask;
	private WorkFlowConfig _escapedModel;
}