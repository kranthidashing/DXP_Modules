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
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.ys.hmawfm.wfms.services.model.WFMS_Requisition_Audit;
import com.ys.hmawfm.wfms.services.model.WFMS_Requisition_AuditModel;
import com.ys.hmawfm.wfms.services.model.WFMS_Requisition_AuditSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the WFMS_Requisition_Audit service. Represents a row in the &quot;WFMS_Requisition_Audit&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link WFMS_Requisition_AuditModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link WFMS_Requisition_AuditImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WFMS_Requisition_AuditImpl
 * @see WFMS_Requisition_Audit
 * @see WFMS_Requisition_AuditModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class WFMS_Requisition_AuditModelImpl extends BaseModelImpl<WFMS_Requisition_Audit>
	implements WFMS_Requisition_AuditModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a WFMS_Requisition_Audit model instance should use the {@link WFMS_Requisition_Audit} interface instead.
	 */
	public static final String TABLE_NAME = "WFMS_Requisition_Audit";
	public static final Object[][] TABLE_COLUMNS = {
			{ "reqaId", Types.VARCHAR },
			{ "reqId", Types.VARCHAR },
			{ "userId", Types.BIGINT },
			{ "createdBy", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "change_", Types.VARCHAR },
			{ "comments", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("reqaId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("reqId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createdBy", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("change_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("comments", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table WFMS_Requisition_Audit (reqaId VARCHAR(75) not null primary key,reqId VARCHAR(75) null,userId LONG,createdBy VARCHAR(75) null,createDate DATE null,change_ VARCHAR(75) null,comments TEXT null)";
	public static final String TABLE_SQL_DROP = "drop table WFMS_Requisition_Audit";
	public static final String ORDER_BY_JPQL = " ORDER BY wfms_Requisition_Audit.createDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY WFMS_Requisition_Audit.createDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.ys.hmawfm.wfms.services.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ys.hmawfm.wfms.services.model.WFMS_Requisition_Audit"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.ys.hmawfm.wfms.services.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ys.hmawfm.wfms.services.model.WFMS_Requisition_Audit"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.ys.hmawfm.wfms.services.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.ys.hmawfm.wfms.services.model.WFMS_Requisition_Audit"),
			true);
	public static final long REQID_COLUMN_BITMASK = 1L;
	public static final long CREATEDATE_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static WFMS_Requisition_Audit toModel(
		WFMS_Requisition_AuditSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		WFMS_Requisition_Audit model = new WFMS_Requisition_AuditImpl();

		model.setReqaId(soapModel.getReqaId());
		model.setReqId(soapModel.getReqId());
		model.setUserId(soapModel.getUserId());
		model.setCreatedBy(soapModel.getCreatedBy());
		model.setCreateDate(soapModel.getCreateDate());
		model.setChange(soapModel.getChange());
		model.setComments(soapModel.getComments());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<WFMS_Requisition_Audit> toModels(
		WFMS_Requisition_AuditSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<WFMS_Requisition_Audit> models = new ArrayList<WFMS_Requisition_Audit>(soapModels.length);

		for (WFMS_Requisition_AuditSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.ys.hmawfm.wfms.services.service.util.ServiceProps.get(
				"lock.expiration.time.com.ys.hmawfm.wfms.services.model.WFMS_Requisition_Audit"));

	public WFMS_Requisition_AuditModelImpl() {
	}

	@Override
	public String getPrimaryKey() {
		return _reqaId;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setReqaId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _reqaId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return WFMS_Requisition_Audit.class;
	}

	@Override
	public String getModelClassName() {
		return WFMS_Requisition_Audit.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("reqaId", getReqaId());
		attributes.put("reqId", getReqId());
		attributes.put("userId", getUserId());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("createDate", getCreateDate());
		attributes.put("change", getChange());
		attributes.put("comments", getComments());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String reqaId = (String)attributes.get("reqaId");

		if (reqaId != null) {
			setReqaId(reqaId);
		}

		String reqId = (String)attributes.get("reqId");

		if (reqId != null) {
			setReqId(reqId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String createdBy = (String)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		String change = (String)attributes.get("change");

		if (change != null) {
			setChange(change);
		}

		String comments = (String)attributes.get("comments");

		if (comments != null) {
			setComments(comments);
		}
	}

	@JSON
	@Override
	public String getReqaId() {
		if (_reqaId == null) {
			return StringPool.BLANK;
		}
		else {
			return _reqaId;
		}
	}

	@Override
	public void setReqaId(String reqaId) {
		_reqaId = reqaId;
	}

	@JSON
	@Override
	public String getReqId() {
		if (_reqId == null) {
			return StringPool.BLANK;
		}
		else {
			return _reqId;
		}
	}

	@Override
	public void setReqId(String reqId) {
		_columnBitmask |= REQID_COLUMN_BITMASK;

		if (_originalReqId == null) {
			_originalReqId = _reqId;
		}

		_reqId = reqId;
	}

	public String getOriginalReqId() {
		return GetterUtil.getString(_originalReqId);
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

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_columnBitmask = -1L;

		_createDate = createDate;
	}

	@JSON
	@Override
	public String getChange() {
		if (_change == null) {
			return StringPool.BLANK;
		}
		else {
			return _change;
		}
	}

	@Override
	public void setChange(String change) {
		_change = change;
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

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public WFMS_Requisition_Audit toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (WFMS_Requisition_Audit)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		WFMS_Requisition_AuditImpl wfms_Requisition_AuditImpl = new WFMS_Requisition_AuditImpl();

		wfms_Requisition_AuditImpl.setReqaId(getReqaId());
		wfms_Requisition_AuditImpl.setReqId(getReqId());
		wfms_Requisition_AuditImpl.setUserId(getUserId());
		wfms_Requisition_AuditImpl.setCreatedBy(getCreatedBy());
		wfms_Requisition_AuditImpl.setCreateDate(getCreateDate());
		wfms_Requisition_AuditImpl.setChange(getChange());
		wfms_Requisition_AuditImpl.setComments(getComments());

		wfms_Requisition_AuditImpl.resetOriginalValues();

		return wfms_Requisition_AuditImpl;
	}

	@Override
	public int compareTo(WFMS_Requisition_Audit wfms_Requisition_Audit) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(),
				wfms_Requisition_Audit.getCreateDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof WFMS_Requisition_Audit)) {
			return false;
		}

		WFMS_Requisition_Audit wfms_Requisition_Audit = (WFMS_Requisition_Audit)obj;

		String primaryKey = wfms_Requisition_Audit.getPrimaryKey();

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
		WFMS_Requisition_AuditModelImpl wfms_Requisition_AuditModelImpl = this;

		wfms_Requisition_AuditModelImpl._originalReqId = wfms_Requisition_AuditModelImpl._reqId;

		wfms_Requisition_AuditModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<WFMS_Requisition_Audit> toCacheModel() {
		WFMS_Requisition_AuditCacheModel wfms_Requisition_AuditCacheModel = new WFMS_Requisition_AuditCacheModel();

		wfms_Requisition_AuditCacheModel.reqaId = getReqaId();

		String reqaId = wfms_Requisition_AuditCacheModel.reqaId;

		if ((reqaId != null) && (reqaId.length() == 0)) {
			wfms_Requisition_AuditCacheModel.reqaId = null;
		}

		wfms_Requisition_AuditCacheModel.reqId = getReqId();

		String reqId = wfms_Requisition_AuditCacheModel.reqId;

		if ((reqId != null) && (reqId.length() == 0)) {
			wfms_Requisition_AuditCacheModel.reqId = null;
		}

		wfms_Requisition_AuditCacheModel.userId = getUserId();

		wfms_Requisition_AuditCacheModel.createdBy = getCreatedBy();

		String createdBy = wfms_Requisition_AuditCacheModel.createdBy;

		if ((createdBy != null) && (createdBy.length() == 0)) {
			wfms_Requisition_AuditCacheModel.createdBy = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			wfms_Requisition_AuditCacheModel.createDate = createDate.getTime();
		}
		else {
			wfms_Requisition_AuditCacheModel.createDate = Long.MIN_VALUE;
		}

		wfms_Requisition_AuditCacheModel.change = getChange();

		String change = wfms_Requisition_AuditCacheModel.change;

		if ((change != null) && (change.length() == 0)) {
			wfms_Requisition_AuditCacheModel.change = null;
		}

		wfms_Requisition_AuditCacheModel.comments = getComments();

		String comments = wfms_Requisition_AuditCacheModel.comments;

		if ((comments != null) && (comments.length() == 0)) {
			wfms_Requisition_AuditCacheModel.comments = null;
		}

		return wfms_Requisition_AuditCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{reqaId=");
		sb.append(getReqaId());
		sb.append(", reqId=");
		sb.append(getReqId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createdBy=");
		sb.append(getCreatedBy());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", change=");
		sb.append(getChange());
		sb.append(", comments=");
		sb.append(getComments());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.ys.hmawfm.wfms.services.model.WFMS_Requisition_Audit");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>reqaId</column-name><column-value><![CDATA[");
		sb.append(getReqaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reqId</column-name><column-value><![CDATA[");
		sb.append(getReqId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
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
			"<column><column-name>change</column-name><column-value><![CDATA[");
		sb.append(getChange());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>comments</column-name><column-value><![CDATA[");
		sb.append(getComments());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = WFMS_Requisition_Audit.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			WFMS_Requisition_Audit.class
		};
	private String _reqaId;
	private String _reqId;
	private String _originalReqId;
	private long _userId;
	private String _createdBy;
	private Date _createDate;
	private String _change;
	private String _comments;
	private long _columnBitmask;
	private WFMS_Requisition_Audit _escapedModel;
}