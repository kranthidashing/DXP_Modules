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

package com.ys.hmawfm.wfms.services.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.ys.hmawfm.wfms.services.model.WFMS_action_and_reasoncode;
import com.ys.hmawfm.wfms.services.model.WFMS_action_and_reasoncodeModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the WFMS_action_and_reasoncode service. Represents a row in the &quot;WFMS_action_and_reasoncode&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link WFMS_action_and_reasoncodeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link WFMS_action_and_reasoncodeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WFMS_action_and_reasoncodeImpl
 * @see WFMS_action_and_reasoncode
 * @see WFMS_action_and_reasoncodeModel
 * @generated
 */
@ProviderType
public class WFMS_action_and_reasoncodeModelImpl extends BaseModelImpl<WFMS_action_and_reasoncode>
	implements WFMS_action_and_reasoncodeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a WFMS_action_and_reasoncode model instance should use the {@link WFMS_action_and_reasoncode} interface instead.
	 */
	public static final String TABLE_NAME = "WFMS_action_and_reasoncode";
	public static final Object[][] TABLE_COLUMNS = {
			{ "aarId", Types.VARCHAR },
			{ "action", Types.VARCHAR },
			{ "reasonCode", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "deleteflag", Types.INTEGER },
			{ "createdBy", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedBy", Types.VARCHAR },
			{ "modifiedDate", Types.TIMESTAMP }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("aarId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("action", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("reasonCode", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("deleteflag", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("createdBy", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedBy", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE = "create table WFMS_action_and_reasoncode (aarId VARCHAR(75) not null primary key,action VARCHAR(75) null,reasonCode VARCHAR(75) null,description VARCHAR(500) null,deleteflag INTEGER,createdBy VARCHAR(75) null,createDate DATE null,modifiedBy VARCHAR(75) null,modifiedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table WFMS_action_and_reasoncode";
	public static final String ORDER_BY_JPQL = " ORDER BY wfms_action_and_reasoncode.aarId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY WFMS_action_and_reasoncode.aarId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.ys.hmawfm.wfms.services.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ys.hmawfm.wfms.services.model.WFMS_action_and_reasoncode"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.ys.hmawfm.wfms.services.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ys.hmawfm.wfms.services.model.WFMS_action_and_reasoncode"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.ys.hmawfm.wfms.services.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.ys.hmawfm.wfms.services.model.WFMS_action_and_reasoncode"),
			true);
	public static final long AARID_COLUMN_BITMASK = 1L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.ys.hmawfm.wfms.services.service.util.ServiceProps.get(
				"lock.expiration.time.com.ys.hmawfm.wfms.services.model.WFMS_action_and_reasoncode"));

	public WFMS_action_and_reasoncodeModelImpl() {
	}

	@Override
	public String getPrimaryKey() {
		return _aarId;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setAarId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _aarId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return WFMS_action_and_reasoncode.class;
	}

	@Override
	public String getModelClassName() {
		return WFMS_action_and_reasoncode.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("aarId", getAarId());
		attributes.put("action", getAction());
		attributes.put("reasonCode", getReasonCode());
		attributes.put("description", getDescription());
		attributes.put("deleteflag", getDeleteflag());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedBy", getModifiedBy());
		attributes.put("modifiedDate", getModifiedDate());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String aarId = (String)attributes.get("aarId");

		if (aarId != null) {
			setAarId(aarId);
		}

		String action = (String)attributes.get("action");

		if (action != null) {
			setAction(action);
		}

		String reasonCode = (String)attributes.get("reasonCode");

		if (reasonCode != null) {
			setReasonCode(reasonCode);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Integer deleteflag = (Integer)attributes.get("deleteflag");

		if (deleteflag != null) {
			setDeleteflag(deleteflag);
		}

		String createdBy = (String)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		String modifiedBy = (String)attributes.get("modifiedBy");

		if (modifiedBy != null) {
			setModifiedBy(modifiedBy);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public String getAarId() {
		if (_aarId == null) {
			return StringPool.BLANK;
		}
		else {
			return _aarId;
		}
	}

	@Override
	public void setAarId(String aarId) {
		_columnBitmask |= AARID_COLUMN_BITMASK;

		if (_originalAarId == null) {
			_originalAarId = _aarId;
		}

		_aarId = aarId;
	}

	public String getOriginalAarId() {
		return GetterUtil.getString(_originalAarId);
	}

	@Override
	public String getAction() {
		if (_action == null) {
			return StringPool.BLANK;
		}
		else {
			return _action;
		}
	}

	@Override
	public void setAction(String action) {
		_action = action;
	}

	@Override
	public String getReasonCode() {
		if (_reasonCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _reasonCode;
		}
	}

	@Override
	public void setReasonCode(String reasonCode) {
		_reasonCode = reasonCode;
	}

	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public int getDeleteflag() {
		return _deleteflag;
	}

	@Override
	public void setDeleteflag(int deleteflag) {
		_deleteflag = deleteflag;
	}

	@Override
	public String getCreatedBy() {
		if (_createdBy == null) {
			return StringPool.BLANK;
		}
		else {
			return _createdBy;
		}
	}

	@Override
	public void setCreatedBy(String createdBy) {
		_createdBy = createdBy;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public String getModifiedBy() {
		if (_modifiedBy == null) {
			return StringPool.BLANK;
		}
		else {
			return _modifiedBy;
		}
	}

	@Override
	public void setModifiedBy(String modifiedBy) {
		_modifiedBy = modifiedBy;
	}

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

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public WFMS_action_and_reasoncode toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (WFMS_action_and_reasoncode)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		WFMS_action_and_reasoncodeImpl wfms_action_and_reasoncodeImpl = new WFMS_action_and_reasoncodeImpl();

		wfms_action_and_reasoncodeImpl.setAarId(getAarId());
		wfms_action_and_reasoncodeImpl.setAction(getAction());
		wfms_action_and_reasoncodeImpl.setReasonCode(getReasonCode());
		wfms_action_and_reasoncodeImpl.setDescription(getDescription());
		wfms_action_and_reasoncodeImpl.setDeleteflag(getDeleteflag());
		wfms_action_and_reasoncodeImpl.setCreatedBy(getCreatedBy());
		wfms_action_and_reasoncodeImpl.setCreateDate(getCreateDate());
		wfms_action_and_reasoncodeImpl.setModifiedBy(getModifiedBy());
		wfms_action_and_reasoncodeImpl.setModifiedDate(getModifiedDate());

		wfms_action_and_reasoncodeImpl.resetOriginalValues();

		return wfms_action_and_reasoncodeImpl;
	}

	@Override
	public int compareTo(WFMS_action_and_reasoncode wfms_action_and_reasoncode) {
		String primaryKey = wfms_action_and_reasoncode.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof WFMS_action_and_reasoncode)) {
			return false;
		}

		WFMS_action_and_reasoncode wfms_action_and_reasoncode = (WFMS_action_and_reasoncode)obj;

		String primaryKey = wfms_action_and_reasoncode.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
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
		WFMS_action_and_reasoncodeModelImpl wfms_action_and_reasoncodeModelImpl = this;

		wfms_action_and_reasoncodeModelImpl._originalAarId = wfms_action_and_reasoncodeModelImpl._aarId;

		wfms_action_and_reasoncodeModelImpl._setModifiedDate = false;

		wfms_action_and_reasoncodeModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<WFMS_action_and_reasoncode> toCacheModel() {
		WFMS_action_and_reasoncodeCacheModel wfms_action_and_reasoncodeCacheModel =
			new WFMS_action_and_reasoncodeCacheModel();

		wfms_action_and_reasoncodeCacheModel.aarId = getAarId();

		String aarId = wfms_action_and_reasoncodeCacheModel.aarId;

		if ((aarId != null) && (aarId.length() == 0)) {
			wfms_action_and_reasoncodeCacheModel.aarId = null;
		}

		wfms_action_and_reasoncodeCacheModel.action = getAction();

		String action = wfms_action_and_reasoncodeCacheModel.action;

		if ((action != null) && (action.length() == 0)) {
			wfms_action_and_reasoncodeCacheModel.action = null;
		}

		wfms_action_and_reasoncodeCacheModel.reasonCode = getReasonCode();

		String reasonCode = wfms_action_and_reasoncodeCacheModel.reasonCode;

		if ((reasonCode != null) && (reasonCode.length() == 0)) {
			wfms_action_and_reasoncodeCacheModel.reasonCode = null;
		}

		wfms_action_and_reasoncodeCacheModel.description = getDescription();

		String description = wfms_action_and_reasoncodeCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			wfms_action_and_reasoncodeCacheModel.description = null;
		}

		wfms_action_and_reasoncodeCacheModel.deleteflag = getDeleteflag();

		wfms_action_and_reasoncodeCacheModel.createdBy = getCreatedBy();

		String createdBy = wfms_action_and_reasoncodeCacheModel.createdBy;

		if ((createdBy != null) && (createdBy.length() == 0)) {
			wfms_action_and_reasoncodeCacheModel.createdBy = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			wfms_action_and_reasoncodeCacheModel.createDate = createDate.getTime();
		}
		else {
			wfms_action_and_reasoncodeCacheModel.createDate = Long.MIN_VALUE;
		}

		wfms_action_and_reasoncodeCacheModel.modifiedBy = getModifiedBy();

		String modifiedBy = wfms_action_and_reasoncodeCacheModel.modifiedBy;

		if ((modifiedBy != null) && (modifiedBy.length() == 0)) {
			wfms_action_and_reasoncodeCacheModel.modifiedBy = null;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			wfms_action_and_reasoncodeCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			wfms_action_and_reasoncodeCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return wfms_action_and_reasoncodeCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{aarId=");
		sb.append(getAarId());
		sb.append(", action=");
		sb.append(getAction());
		sb.append(", reasonCode=");
		sb.append(getReasonCode());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", deleteflag=");
		sb.append(getDeleteflag());
		sb.append(", createdBy=");
		sb.append(getCreatedBy());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedBy=");
		sb.append(getModifiedBy());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append(
			"com.ys.hmawfm.wfms.services.model.WFMS_action_and_reasoncode");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>aarId</column-name><column-value><![CDATA[");
		sb.append(getAarId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>action</column-name><column-value><![CDATA[");
		sb.append(getAction());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reasonCode</column-name><column-value><![CDATA[");
		sb.append(getReasonCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>deleteflag</column-name><column-value><![CDATA[");
		sb.append(getDeleteflag());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdBy</column-name><column-value><![CDATA[");
		sb.append(getCreatedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedBy</column-name><column-value><![CDATA[");
		sb.append(getModifiedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = WFMS_action_and_reasoncode.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			WFMS_action_and_reasoncode.class
		};
	private String _aarId;
	private String _originalAarId;
	private String _action;
	private String _reasonCode;
	private String _description;
	private int _deleteflag;
	private String _createdBy;
	private Date _createDate;
	private String _modifiedBy;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _columnBitmask;
	private WFMS_action_and_reasoncode _escapedModel;
}