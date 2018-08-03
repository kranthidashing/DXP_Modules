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
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the WFMS_Config service. Represents a row in the &quot;WFMS_Config&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ys.hmawfm.wfms.services.model.impl.WFMS_ConfigModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ys.hmawfm.wfms.services.model.impl.WFMS_ConfigImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WFMS_Config
 * @see com.ys.hmawfm.wfms.services.model.impl.WFMS_ConfigImpl
 * @see com.ys.hmawfm.wfms.services.model.impl.WFMS_ConfigModelImpl
 * @generated
 */
@ProviderType
public interface WFMS_ConfigModel extends BaseModel<WFMS_Config> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a WFMS_Configuration model instance should use the {@link WFMS_Config} interface instead.
	 */

	/**
	 * Returns the primary key of this WFMS_Configuration.
	 *
	 * @return the primary key of this WFMS_Configuration
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this WFMS_Configuration.
	 *
	 * @param primaryKey the primary key of this WFMS_Configuration
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the config ID of this WFMS_Configuration.
	 *
	 * @return the config ID of this WFMS_Configuration
	 */
	public long getConfigId();

	/**
	 * Sets the config ID of this WFMS_Configuration.
	 *
	 * @param configId the config ID of this WFMS_Configuration
	 */
	public void setConfigId(long configId);

	/**
	 * Returns the created by of this WFMS_Configuration.
	 *
	 * @return the created by of this WFMS_Configuration
	 */
	@AutoEscape
	public String getCreatedBy();

	/**
	 * Sets the created by of this WFMS_Configuration.
	 *
	 * @param createdBy the created by of this WFMS_Configuration
	 */
	public void setCreatedBy(String createdBy);

	/**
	 * Returns the create date of this WFMS_Configuration.
	 *
	 * @return the create date of this WFMS_Configuration
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this WFMS_Configuration.
	 *
	 * @param createDate the create date of this WFMS_Configuration
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified by of this WFMS_Configuration.
	 *
	 * @return the modified by of this WFMS_Configuration
	 */
	@AutoEscape
	public String getModifiedBy();

	/**
	 * Sets the modified by of this WFMS_Configuration.
	 *
	 * @param modifiedBy the modified by of this WFMS_Configuration
	 */
	public void setModifiedBy(String modifiedBy);

	/**
	 * Returns the modified date of this WFMS_Configuration.
	 *
	 * @return the modified date of this WFMS_Configuration
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this WFMS_Configuration.
	 *
	 * @param modifiedDate the modified date of this WFMS_Configuration
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the config key of this WFMS_Configuration.
	 *
	 * @return the config key of this WFMS_Configuration
	 */
	@AutoEscape
	public String getConfigKey();

	/**
	 * Sets the config key of this WFMS_Configuration.
	 *
	 * @param configKey the config key of this WFMS_Configuration
	 */
	public void setConfigKey(String configKey);

	/**
	 * Returns the config label of this WFMS_Configuration.
	 *
	 * @return the config label of this WFMS_Configuration
	 */
	@AutoEscape
	public String getConfigLabel();

	/**
	 * Sets the config label of this WFMS_Configuration.
	 *
	 * @param configLabel the config label of this WFMS_Configuration
	 */
	public void setConfigLabel(String configLabel);

	/**
	 * Returns the content type of this WFMS_Configuration.
	 *
	 * @return the content type of this WFMS_Configuration
	 */
	@AutoEscape
	public String getContentType();

	/**
	 * Sets the content type of this WFMS_Configuration.
	 *
	 * @param contentType the content type of this WFMS_Configuration
	 */
	public void setContentType(String contentType);

	/**
	 * Returns the content of this WFMS_Configuration.
	 *
	 * @return the content of this WFMS_Configuration
	 */
	@AutoEscape
	public String getContent();

	/**
	 * Sets the content of this WFMS_Configuration.
	 *
	 * @param content the content of this WFMS_Configuration
	 */
	public void setContent(String content);

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
	public int compareTo(WFMS_Config wfms_Config);

	@Override
	public int hashCode();

	@Override
	public CacheModel<WFMS_Config> toCacheModel();

	@Override
	public WFMS_Config toEscapedModel();

	@Override
	public WFMS_Config toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}