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
 * The base model interface for the WFMS_action_and_reasoncode service. Represents a row in the &quot;WFMS_action_and_reasoncode&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ys.hmawfm.wfms.services.model.impl.WFMS_action_and_reasoncodeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ys.hmawfm.wfms.services.model.impl.WFMS_action_and_reasoncodeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WFMS_action_and_reasoncode
 * @see com.ys.hmawfm.wfms.services.model.impl.WFMS_action_and_reasoncodeImpl
 * @see com.ys.hmawfm.wfms.services.model.impl.WFMS_action_and_reasoncodeModelImpl
 * @generated
 */
@ProviderType
public interface WFMS_action_and_reasoncodeModel extends BaseModel<WFMS_action_and_reasoncode> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a WFMS_action_and_reasoncode model instance should use the {@link WFMS_action_and_reasoncode} interface instead.
	 */

	/**
	 * Returns the primary key of this WFMS_action_and_reasoncode.
	 *
	 * @return the primary key of this WFMS_action_and_reasoncode
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this WFMS_action_and_reasoncode.
	 *
	 * @param primaryKey the primary key of this WFMS_action_and_reasoncode
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the aar ID of this WFMS_action_and_reasoncode.
	 *
	 * @return the aar ID of this WFMS_action_and_reasoncode
	 */
	@AutoEscape
	public String getAarId();

	/**
	 * Sets the aar ID of this WFMS_action_and_reasoncode.
	 *
	 * @param aarId the aar ID of this WFMS_action_and_reasoncode
	 */
	public void setAarId(String aarId);

	/**
	 * Returns the action of this WFMS_action_and_reasoncode.
	 *
	 * @return the action of this WFMS_action_and_reasoncode
	 */
	@AutoEscape
	public String getAction();

	/**
	 * Sets the action of this WFMS_action_and_reasoncode.
	 *
	 * @param action the action of this WFMS_action_and_reasoncode
	 */
	public void setAction(String action);

	/**
	 * Returns the reason code of this WFMS_action_and_reasoncode.
	 *
	 * @return the reason code of this WFMS_action_and_reasoncode
	 */
	@AutoEscape
	public String getReasonCode();

	/**
	 * Sets the reason code of this WFMS_action_and_reasoncode.
	 *
	 * @param reasonCode the reason code of this WFMS_action_and_reasoncode
	 */
	public void setReasonCode(String reasonCode);

	/**
	 * Returns the description of this WFMS_action_and_reasoncode.
	 *
	 * @return the description of this WFMS_action_and_reasoncode
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this WFMS_action_and_reasoncode.
	 *
	 * @param description the description of this WFMS_action_and_reasoncode
	 */
	public void setDescription(String description);

	/**
	 * Returns the deleteflag of this WFMS_action_and_reasoncode.
	 *
	 * @return the deleteflag of this WFMS_action_and_reasoncode
	 */
	public int getDeleteflag();

	/**
	 * Sets the deleteflag of this WFMS_action_and_reasoncode.
	 *
	 * @param deleteflag the deleteflag of this WFMS_action_and_reasoncode
	 */
	public void setDeleteflag(int deleteflag);

	/**
	 * Returns the created by of this WFMS_action_and_reasoncode.
	 *
	 * @return the created by of this WFMS_action_and_reasoncode
	 */
	@AutoEscape
	public String getCreatedBy();

	/**
	 * Sets the created by of this WFMS_action_and_reasoncode.
	 *
	 * @param createdBy the created by of this WFMS_action_and_reasoncode
	 */
	public void setCreatedBy(String createdBy);

	/**
	 * Returns the create date of this WFMS_action_and_reasoncode.
	 *
	 * @return the create date of this WFMS_action_and_reasoncode
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this WFMS_action_and_reasoncode.
	 *
	 * @param createDate the create date of this WFMS_action_and_reasoncode
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified by of this WFMS_action_and_reasoncode.
	 *
	 * @return the modified by of this WFMS_action_and_reasoncode
	 */
	@AutoEscape
	public String getModifiedBy();

	/**
	 * Sets the modified by of this WFMS_action_and_reasoncode.
	 *
	 * @param modifiedBy the modified by of this WFMS_action_and_reasoncode
	 */
	public void setModifiedBy(String modifiedBy);

	/**
	 * Returns the modified date of this WFMS_action_and_reasoncode.
	 *
	 * @return the modified date of this WFMS_action_and_reasoncode
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this WFMS_action_and_reasoncode.
	 *
	 * @param modifiedDate the modified date of this WFMS_action_and_reasoncode
	 */
	public void setModifiedDate(Date modifiedDate);

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
	public int compareTo(WFMS_action_and_reasoncode wfms_action_and_reasoncode);

	@Override
	public int hashCode();

	@Override
	public CacheModel<WFMS_action_and_reasoncode> toCacheModel();

	@Override
	public WFMS_action_and_reasoncode toEscapedModel();

	@Override
	public WFMS_action_and_reasoncode toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}