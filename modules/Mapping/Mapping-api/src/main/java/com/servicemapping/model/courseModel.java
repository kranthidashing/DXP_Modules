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

package com.servicemapping.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the course service. Represents a row in the &quot;DDTI_course&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.servicemapping.model.impl.courseModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.servicemapping.model.impl.courseImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see course
 * @see com.servicemapping.model.impl.courseImpl
 * @see com.servicemapping.model.impl.courseModelImpl
 * @generated
 */
@ProviderType
public interface courseModel extends BaseModel<course>, GroupedModel,
	ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a course model instance should use the {@link course} interface instead.
	 */

	/**
	 * Returns the primary key of this course.
	 *
	 * @return the primary key of this course
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this course.
	 *
	 * @param primaryKey the primary key of this course
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this course.
	 *
	 * @return the uuid of this course
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this course.
	 *
	 * @param uuid the uuid of this course
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the course ID of this course.
	 *
	 * @return the course ID of this course
	 */
	public long getCourseId();

	/**
	 * Sets the course ID of this course.
	 *
	 * @param courseId the course ID of this course
	 */
	public void setCourseId(long courseId);

	/**
	 * Returns the course name of this course.
	 *
	 * @return the course name of this course
	 */
	@AutoEscape
	public String getCourseName();

	/**
	 * Sets the course name of this course.
	 *
	 * @param courseName the course name of this course
	 */
	public void setCourseName(String courseName);

	/**
	 * Returns the fee of this course.
	 *
	 * @return the fee of this course
	 */
	public long getFee();

	/**
	 * Sets the fee of this course.
	 *
	 * @param fee the fee of this course
	 */
	public void setFee(long fee);

	/**
	 * Returns the start date of this course.
	 *
	 * @return the start date of this course
	 */
	public Date getStartDate();

	/**
	 * Sets the start date of this course.
	 *
	 * @param startDate the start date of this course
	 */
	public void setStartDate(Date startDate);

	/**
	 * Returns the end date of this course.
	 *
	 * @return the end date of this course
	 */
	public Date getEndDate();

	/**
	 * Sets the end date of this course.
	 *
	 * @param endDate the end date of this course
	 */
	public void setEndDate(Date endDate);

	/**
	 * Returns the maxseats of this course.
	 *
	 * @return the maxseats of this course
	 */
	public long getMaxseats();

	/**
	 * Sets the maxseats of this course.
	 *
	 * @param maxseats the maxseats of this course
	 */
	public void setMaxseats(long maxseats);

	/**
	 * Returns the group ID of this course.
	 *
	 * @return the group ID of this course
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this course.
	 *
	 * @param groupId the group ID of this course
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this course.
	 *
	 * @return the company ID of this course
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this course.
	 *
	 * @param companyId the company ID of this course
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this course.
	 *
	 * @return the user ID of this course
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this course.
	 *
	 * @param userId the user ID of this course
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this course.
	 *
	 * @return the user uuid of this course
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this course.
	 *
	 * @param userUuid the user uuid of this course
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this course.
	 *
	 * @return the user name of this course
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this course.
	 *
	 * @param userName the user name of this course
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this course.
	 *
	 * @return the create date of this course
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this course.
	 *
	 * @param createDate the create date of this course
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this course.
	 *
	 * @return the modified date of this course
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this course.
	 *
	 * @param modifiedDate the modified date of this course
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
	public int compareTo(com.servicemapping.model.course course);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.servicemapping.model.course> toCacheModel();

	@Override
	public com.servicemapping.model.course toEscapedModel();

	@Override
	public com.servicemapping.model.course toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}