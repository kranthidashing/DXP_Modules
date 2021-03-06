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

package com.ys.hmawfm.wfms.services.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the WFMS_NotificationEngine service. Represents a row in the &quot;WFMS_NotificationEngine&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ys.hmawfm.wfms.services.model.impl.WFMS_NotificationEngineModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ys.hmawfm.wfms.services.model.impl.WFMS_NotificationEngineImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WFMS_NotificationEngine
 * @see com.ys.hmawfm.wfms.services.model.impl.WFMS_NotificationEngineImpl
 * @see com.ys.hmawfm.wfms.services.model.impl.WFMS_NotificationEngineModelImpl
 * @generated
 */
@ProviderType
public interface WFMS_NotificationEngineModel extends BaseModel<WFMS_NotificationEngine>,
	ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a WFMS_NotificationEngine model instance should use the {@link WFMS_NotificationEngine} interface instead.
	 */

	/**
	 * Returns the primary key of this WFMS_NotificationEngine.
	 *
	 * @return the primary key of this WFMS_NotificationEngine
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this WFMS_NotificationEngine.
	 *
	 * @param primaryKey the primary key of this WFMS_NotificationEngine
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the template ID of this WFMS_NotificationEngine.
	 *
	 * @return the template ID of this WFMS_NotificationEngine
	 */
	public long getTemplateId();

	/**
	 * Sets the template ID of this WFMS_NotificationEngine.
	 *
	 * @param templateId the template ID of this WFMS_NotificationEngine
	 */
	public void setTemplateId(long templateId);

	/**
	 * Returns the company ID of this WFMS_NotificationEngine.
	 *
	 * @return the company ID of this WFMS_NotificationEngine
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this WFMS_NotificationEngine.
	 *
	 * @param companyId the company ID of this WFMS_NotificationEngine
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the scope group ID of this WFMS_NotificationEngine.
	 *
	 * @return the scope group ID of this WFMS_NotificationEngine
	 */
	public long getScopeGroupId();

	/**
	 * Sets the scope group ID of this WFMS_NotificationEngine.
	 *
	 * @param scopeGroupId the scope group ID of this WFMS_NotificationEngine
	 */
	public void setScopeGroupId(long scopeGroupId);

	/**
	 * Returns the created by of this WFMS_NotificationEngine.
	 *
	 * @return the created by of this WFMS_NotificationEngine
	 */
	@AutoEscape
	public String getCreatedBy();

	/**
	 * Sets the created by of this WFMS_NotificationEngine.
	 *
	 * @param createdBy the created by of this WFMS_NotificationEngine
	 */
	public void setCreatedBy(String createdBy);

	/**
	 * Returns the create date of this WFMS_NotificationEngine.
	 *
	 * @return the create date of this WFMS_NotificationEngine
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this WFMS_NotificationEngine.
	 *
	 * @param createDate the create date of this WFMS_NotificationEngine
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified by of this WFMS_NotificationEngine.
	 *
	 * @return the modified by of this WFMS_NotificationEngine
	 */
	@AutoEscape
	public String getModifiedBy();

	/**
	 * Sets the modified by of this WFMS_NotificationEngine.
	 *
	 * @param modifiedBy the modified by of this WFMS_NotificationEngine
	 */
	public void setModifiedBy(String modifiedBy);

	/**
	 * Returns the modified date of this WFMS_NotificationEngine.
	 *
	 * @return the modified date of this WFMS_NotificationEngine
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this WFMS_NotificationEngine.
	 *
	 * @param modifiedDate the modified date of this WFMS_NotificationEngine
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the title of this WFMS_NotificationEngine.
	 *
	 * @return the title of this WFMS_NotificationEngine
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this WFMS_NotificationEngine.
	 *
	 * @param title the title of this WFMS_NotificationEngine
	 */
	public void setTitle(String title);

	/**
	 * Returns the content of this WFMS_NotificationEngine.
	 *
	 * @return the content of this WFMS_NotificationEngine
	 */
	@AutoEscape
	public String getContent();

	/**
	 * Sets the content of this WFMS_NotificationEngine.
	 *
	 * @param content the content of this WFMS_NotificationEngine
	 */
	public void setContent(String content);

	/**
	 * Returns the content type of this WFMS_NotificationEngine.
	 *
	 * @return the content type of this WFMS_NotificationEngine
	 */
	@AutoEscape
	public String getContentType();

	/**
	 * Sets the content type of this WFMS_NotificationEngine.
	 *
	 * @param contentType the content type of this WFMS_NotificationEngine
	 */
	public void setContentType(String contentType);

	/**
	 * Returns the comments of this WFMS_NotificationEngine.
	 *
	 * @return the comments of this WFMS_NotificationEngine
	 */
	@AutoEscape
	public String getComments();

	/**
	 * Sets the comments of this WFMS_NotificationEngine.
	 *
	 * @param comments the comments of this WFMS_NotificationEngine
	 */
	public void setComments(String comments);

	/**
	 * Returns the times used of this WFMS_NotificationEngine.
	 *
	 * @return the times used of this WFMS_NotificationEngine
	 */
	public int getTimesUsed();

	/**
	 * Sets the times used of this WFMS_NotificationEngine.
	 *
	 * @param timesUsed the times used of this WFMS_NotificationEngine
	 */
	public void setTimesUsed(int timesUsed);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(WFMS_NotificationEngine wfms_NotificationEngine);

	@Override
	public int hashCode();

	@Override
	public CacheModel<WFMS_NotificationEngine> toCacheModel();

	@Override
	public WFMS_NotificationEngine toEscapedModel();

	@Override
	public WFMS_NotificationEngine toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}