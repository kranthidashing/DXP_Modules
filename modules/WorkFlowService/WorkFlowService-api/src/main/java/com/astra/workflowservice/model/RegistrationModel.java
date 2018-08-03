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

package com.astra.workflowservice.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Registration service. Represents a row in the &quot;Astra_Registration&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.astra.workflowservice.model.impl.RegistrationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.astra.workflowservice.model.impl.RegistrationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Registration
 * @see com.astra.workflowservice.model.impl.RegistrationImpl
 * @see com.astra.workflowservice.model.impl.RegistrationModelImpl
 * @generated
 */
@ProviderType
public interface RegistrationModel extends BaseModel<Registration>, ShardedModel,
	StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a registration model instance should use the {@link Registration} interface instead.
	 */

	/**
	 * Returns the primary key of this registration.
	 *
	 * @return the primary key of this registration
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this registration.
	 *
	 * @param primaryKey the primary key of this registration
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this registration.
	 *
	 * @return the uuid of this registration
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this registration.
	 *
	 * @param uuid the uuid of this registration
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the registration ID of this registration.
	 *
	 * @return the registration ID of this registration
	 */
	public long getRegistrationId();

	/**
	 * Sets the registration ID of this registration.
	 *
	 * @param RegistrationId the registration ID of this registration
	 */
	public void setRegistrationId(long RegistrationId);

	/**
	 * Returns the firstname of this registration.
	 *
	 * @return the firstname of this registration
	 */
	@AutoEscape
	public String getFirstname();

	/**
	 * Sets the firstname of this registration.
	 *
	 * @param firstname the firstname of this registration
	 */
	public void setFirstname(String firstname);

	/**
	 * Returns the lastname of this registration.
	 *
	 * @return the lastname of this registration
	 */
	@AutoEscape
	public String getLastname();

	/**
	 * Sets the lastname of this registration.
	 *
	 * @param lastname the lastname of this registration
	 */
	public void setLastname(String lastname);

	/**
	 * Returns the course of this registration.
	 *
	 * @return the course of this registration
	 */
	@AutoEscape
	public String getCourse();

	/**
	 * Sets the course of this registration.
	 *
	 * @param course the course of this registration
	 */
	public void setCourse(String course);

	/**
	 * Returns the email of this registration.
	 *
	 * @return the email of this registration
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this registration.
	 *
	 * @param email the email of this registration
	 */
	public void setEmail(String email);

	/**
	 * Returns the location of this registration.
	 *
	 * @return the location of this registration
	 */
	@AutoEscape
	public String getLocation();

	/**
	 * Sets the location of this registration.
	 *
	 * @param location the location of this registration
	 */
	public void setLocation(String location);

	/**
	 * Returns the status of this registration.
	 *
	 * @return the status of this registration
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this registration.
	 *
	 * @param status the status of this registration
	 */
	public void setStatus(String status);

	/**
	 * Returns the comments of this registration.
	 *
	 * @return the comments of this registration
	 */
	@AutoEscape
	public String getComments();

	/**
	 * Sets the comments of this registration.
	 *
	 * @param comments the comments of this registration
	 */
	public void setComments(String comments);

	/**
	 * Returns the workflowstepnumber of this registration.
	 *
	 * @return the workflowstepnumber of this registration
	 */
	@AutoEscape
	public String getWorkflowstepnumber();

	/**
	 * Sets the workflowstepnumber of this registration.
	 *
	 * @param Workflowstepnumber the workflowstepnumber of this registration
	 */
	public void setWorkflowstepnumber(String Workflowstepnumber);

	/**
	 * Returns the workflow ID of this registration.
	 *
	 * @return the workflow ID of this registration
	 */
	@AutoEscape
	public String getWorkflowId();

	/**
	 * Sets the workflow ID of this registration.
	 *
	 * @param WorkflowId the workflow ID of this registration
	 */
	public void setWorkflowId(String WorkflowId);

	/**
	 * Returns the current approver of this registration.
	 *
	 * @return the current approver of this registration
	 */
	@AutoEscape
	public String getCurrentApprover();

	/**
	 * Sets the current approver of this registration.
	 *
	 * @param CurrentApprover the current approver of this registration
	 */
	public void setCurrentApprover(String CurrentApprover);

	/**
	 * Returns the company ID of this registration.
	 *
	 * @return the company ID of this registration
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this registration.
	 *
	 * @param companyId the company ID of this registration
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this registration.
	 *
	 * @return the user ID of this registration
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this registration.
	 *
	 * @param userId the user ID of this registration
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this registration.
	 *
	 * @return the user uuid of this registration
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this registration.
	 *
	 * @param userUuid the user uuid of this registration
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this registration.
	 *
	 * @return the user name of this registration
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this registration.
	 *
	 * @param userName the user name of this registration
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this registration.
	 *
	 * @return the create date of this registration
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this registration.
	 *
	 * @param createDate the create date of this registration
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this registration.
	 *
	 * @return the modified date of this registration
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this registration.
	 *
	 * @param modifiedDate the modified date of this registration
	 */
	@Override
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
	public int compareTo(Registration registration);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Registration> toCacheModel();

	@Override
	public Registration toEscapedModel();

	@Override
	public Registration toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}