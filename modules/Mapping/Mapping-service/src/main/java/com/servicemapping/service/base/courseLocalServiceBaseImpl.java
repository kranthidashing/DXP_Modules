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

package com.servicemapping.service.base;

import aQute.bnd.annotation.ProviderType;

import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import com.servicemapping.model.course;

import com.servicemapping.service.courseLocalService;
import com.servicemapping.service.persistence.coursePersistence;
import com.servicemapping.service.persistence.locationPersistence;
import com.servicemapping.service.persistence.registrationDetailsPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the course local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.servicemapping.service.impl.courseLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.servicemapping.service.impl.courseLocalServiceImpl
 * @see com.servicemapping.service.courseLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class courseLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements courseLocalService, IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.servicemapping.service.courseLocalServiceUtil} to access the course local service.
	 */

	/**
	 * Adds the course to the database. Also notifies the appropriate model listeners.
	 *
	 * @param course the course
	 * @return the course that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public course addcourse(course course) {
		course.setNew(true);

		return coursePersistence.update(course);
	}

	/**
	 * Creates a new course with the primary key. Does not add the course to the database.
	 *
	 * @param courseId the primary key for the new course
	 * @return the new course
	 */
	@Override
	public course createcourse(long courseId) {
		return coursePersistence.create(courseId);
	}

	/**
	 * Deletes the course with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param courseId the primary key of the course
	 * @return the course that was removed
	 * @throws PortalException if a course with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public course deletecourse(long courseId) throws PortalException {
		return coursePersistence.remove(courseId);
	}

	/**
	 * Deletes the course from the database. Also notifies the appropriate model listeners.
	 *
	 * @param course the course
	 * @return the course that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public course deletecourse(course course) {
		return coursePersistence.remove(course);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(course.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return coursePersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.servicemapping.model.impl.courseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) {
		return coursePersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.servicemapping.model.impl.courseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator) {
		return coursePersistence.findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return coursePersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) {
		return coursePersistence.countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public course fetchcourse(long courseId) {
		return coursePersistence.fetchByPrimaryKey(courseId);
	}

	/**
	 * Returns the course matching the UUID and group.
	 *
	 * @param uuid the course's UUID
	 * @param groupId the primary key of the group
	 * @return the matching course, or <code>null</code> if a matching course could not be found
	 */
	@Override
	public course fetchcourseByUuidAndGroupId(String uuid, long groupId) {
		return coursePersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the course with the primary key.
	 *
	 * @param courseId the primary key of the course
	 * @return the course
	 * @throws PortalException if a course with the primary key could not be found
	 */
	@Override
	public course getcourse(long courseId) throws PortalException {
		return coursePersistence.findByPrimaryKey(courseId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(courseLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(course.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("courseId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(courseLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(course.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("courseId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(courseLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(course.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("courseId");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {
		final ExportActionableDynamicQuery exportActionableDynamicQuery = new ExportActionableDynamicQuery() {
				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary = portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(stagedModelType,
						modelAdditionCount);

					long modelDeletionCount = ExportImportHelperUtil.getModelDeletionCount(portletDataContext,
							stagedModelType);

					manifestSummary.addModelDeletionCount(stagedModelType,
						modelDeletionCount);

					return modelAdditionCount;
				}
			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(new ActionableDynamicQuery.AddCriteriaMethod() {
				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					portletDataContext.addDateRangeCriteria(dynamicQuery,
						"modifiedDate");
				}
			});

		exportActionableDynamicQuery.setCompanyId(portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<course>() {
				@Override
				public void performAction(course course)
					throws PortalException {
					StagedModelDataHandlerUtil.exportStagedModel(portletDataContext,
						course);
				}
			});
		exportActionableDynamicQuery.setStagedModelType(new StagedModelType(
				PortalUtil.getClassNameId(course.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return courseLocalService.deletecourse((course)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return coursePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the courses matching the UUID and company.
	 *
	 * @param uuid the UUID of the courses
	 * @param companyId the primary key of the company
	 * @return the matching courses, or an empty list if no matches were found
	 */
	@Override
	public List<course> getcoursesByUuidAndCompanyId(String uuid, long companyId) {
		return coursePersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of courses matching the UUID and company.
	 *
	 * @param uuid the UUID of the courses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching courses, or an empty list if no matches were found
	 */
	@Override
	public List<course> getcoursesByUuidAndCompanyId(String uuid,
		long companyId, int start, int end,
		OrderByComparator<course> orderByComparator) {
		return coursePersistence.findByUuid_C(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	 * Returns the course matching the UUID and group.
	 *
	 * @param uuid the course's UUID
	 * @param groupId the primary key of the group
	 * @return the matching course
	 * @throws PortalException if a matching course could not be found
	 */
	@Override
	public course getcourseByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {
		return coursePersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the courses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.servicemapping.model.impl.courseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @return the range of courses
	 */
	@Override
	public List<course> getcourses(int start, int end) {
		return coursePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of courses.
	 *
	 * @return the number of courses
	 */
	@Override
	public int getcoursesCount() {
		return coursePersistence.countAll();
	}

	/**
	 * Updates the course in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param course the course
	 * @return the course that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public course updatecourse(course course) {
		return coursePersistence.update(course);
	}

	/**
	 */
	@Override
	public void addlocationcourse(long locationId, long courseId) {
		locationPersistence.addcourse(locationId, courseId);
	}

	/**
	 */
	@Override
	public void addlocationcourse(long locationId, course course) {
		locationPersistence.addcourse(locationId, course);
	}

	/**
	 */
	@Override
	public void addlocationcourses(long locationId, long[] courseIds) {
		locationPersistence.addcourses(locationId, courseIds);
	}

	/**
	 */
	@Override
	public void addlocationcourses(long locationId, List<course> courses) {
		locationPersistence.addcourses(locationId, courses);
	}

	/**
	 */
	@Override
	public void clearlocationcourses(long locationId) {
		locationPersistence.clearcourses(locationId);
	}

	/**
	 */
	@Override
	public void deletelocationcourse(long locationId, long courseId) {
		locationPersistence.removecourse(locationId, courseId);
	}

	/**
	 */
	@Override
	public void deletelocationcourse(long locationId, course course) {
		locationPersistence.removecourse(locationId, course);
	}

	/**
	 */
	@Override
	public void deletelocationcourses(long locationId, long[] courseIds) {
		locationPersistence.removecourses(locationId, courseIds);
	}

	/**
	 */
	@Override
	public void deletelocationcourses(long locationId, List<course> courses) {
		locationPersistence.removecourses(locationId, courses);
	}

	/**
	 * Returns the locationIds of the locations associated with the course.
	 *
	 * @param courseId the courseId of the course
	 * @return long[] the locationIds of locations associated with the course
	 */
	@Override
	public long[] getlocationPrimaryKeys(long courseId) {
		return coursePersistence.getlocationPrimaryKeys(courseId);
	}

	/**
	 */
	@Override
	public List<course> getlocationcourses(long locationId) {
		return locationPersistence.getcourses(locationId);
	}

	/**
	 */
	@Override
	public List<course> getlocationcourses(long locationId, int start, int end) {
		return locationPersistence.getcourses(locationId, start, end);
	}

	/**
	 */
	@Override
	public List<course> getlocationcourses(long locationId, int start, int end,
		OrderByComparator<course> orderByComparator) {
		return locationPersistence.getcourses(locationId, start, end,
			orderByComparator);
	}

	/**
	 */
	@Override
	public int getlocationcoursesCount(long locationId) {
		return locationPersistence.getcoursesSize(locationId);
	}

	/**
	 */
	@Override
	public boolean haslocationcourse(long locationId, long courseId) {
		return locationPersistence.containscourse(locationId, courseId);
	}

	/**
	 */
	@Override
	public boolean haslocationcourses(long locationId) {
		return locationPersistence.containscourses(locationId);
	}

	/**
	 */
	@Override
	public void setlocationcourses(long locationId, long[] courseIds) {
		locationPersistence.setcourses(locationId, courseIds);
	}

	/**
	 */
	@Override
	public void addregistrationDetailscourse(long registrationId, long courseId) {
		registrationDetailsPersistence.addcourse(registrationId, courseId);
	}

	/**
	 */
	@Override
	public void addregistrationDetailscourse(long registrationId, course course) {
		registrationDetailsPersistence.addcourse(registrationId, course);
	}

	/**
	 */
	@Override
	public void addregistrationDetailscourses(long registrationId,
		long[] courseIds) {
		registrationDetailsPersistence.addcourses(registrationId, courseIds);
	}

	/**
	 */
	@Override
	public void addregistrationDetailscourses(long registrationId,
		List<course> courses) {
		registrationDetailsPersistence.addcourses(registrationId, courses);
	}

	/**
	 */
	@Override
	public void clearregistrationDetailscourses(long registrationId) {
		registrationDetailsPersistence.clearcourses(registrationId);
	}

	/**
	 */
	@Override
	public void deleteregistrationDetailscourse(long registrationId,
		long courseId) {
		registrationDetailsPersistence.removecourse(registrationId, courseId);
	}

	/**
	 */
	@Override
	public void deleteregistrationDetailscourse(long registrationId,
		course course) {
		registrationDetailsPersistence.removecourse(registrationId, course);
	}

	/**
	 */
	@Override
	public void deleteregistrationDetailscourses(long registrationId,
		long[] courseIds) {
		registrationDetailsPersistence.removecourses(registrationId, courseIds);
	}

	/**
	 */
	@Override
	public void deleteregistrationDetailscourses(long registrationId,
		List<course> courses) {
		registrationDetailsPersistence.removecourses(registrationId, courses);
	}

	/**
	 * Returns the registrationIds of the registration detailses associated with the course.
	 *
	 * @param courseId the courseId of the course
	 * @return long[] the registrationIds of registration detailses associated with the course
	 */
	@Override
	public long[] getregistrationDetailsPrimaryKeys(long courseId) {
		return coursePersistence.getregistrationDetailsPrimaryKeys(courseId);
	}

	/**
	 */
	@Override
	public List<course> getregistrationDetailscourses(long registrationId) {
		return registrationDetailsPersistence.getcourses(registrationId);
	}

	/**
	 */
	@Override
	public List<course> getregistrationDetailscourses(long registrationId,
		int start, int end) {
		return registrationDetailsPersistence.getcourses(registrationId, start,
			end);
	}

	/**
	 */
	@Override
	public List<course> getregistrationDetailscourses(long registrationId,
		int start, int end, OrderByComparator<course> orderByComparator) {
		return registrationDetailsPersistence.getcourses(registrationId, start,
			end, orderByComparator);
	}

	/**
	 */
	@Override
	public int getregistrationDetailscoursesCount(long registrationId) {
		return registrationDetailsPersistence.getcoursesSize(registrationId);
	}

	/**
	 */
	@Override
	public boolean hasregistrationDetailscourse(long registrationId,
		long courseId) {
		return registrationDetailsPersistence.containscourse(registrationId,
			courseId);
	}

	/**
	 */
	@Override
	public boolean hasregistrationDetailscourses(long registrationId) {
		return registrationDetailsPersistence.containscourses(registrationId);
	}

	/**
	 */
	@Override
	public void setregistrationDetailscourses(long registrationId,
		long[] courseIds) {
		registrationDetailsPersistence.setcourses(registrationId, courseIds);
	}

	/**
	 * Returns the course local service.
	 *
	 * @return the course local service
	 */
	public courseLocalService getcourseLocalService() {
		return courseLocalService;
	}

	/**
	 * Sets the course local service.
	 *
	 * @param courseLocalService the course local service
	 */
	public void setcourseLocalService(courseLocalService courseLocalService) {
		this.courseLocalService = courseLocalService;
	}

	/**
	 * Returns the course persistence.
	 *
	 * @return the course persistence
	 */
	public coursePersistence getcoursePersistence() {
		return coursePersistence;
	}

	/**
	 * Sets the course persistence.
	 *
	 * @param coursePersistence the course persistence
	 */
	public void setcoursePersistence(coursePersistence coursePersistence) {
		this.coursePersistence = coursePersistence;
	}

	/**
	 * Returns the location local service.
	 *
	 * @return the location local service
	 */
	public com.servicemapping.service.locationLocalService getlocationLocalService() {
		return locationLocalService;
	}

	/**
	 * Sets the location local service.
	 *
	 * @param locationLocalService the location local service
	 */
	public void setlocationLocalService(
		com.servicemapping.service.locationLocalService locationLocalService) {
		this.locationLocalService = locationLocalService;
	}

	/**
	 * Returns the location persistence.
	 *
	 * @return the location persistence
	 */
	public locationPersistence getlocationPersistence() {
		return locationPersistence;
	}

	/**
	 * Sets the location persistence.
	 *
	 * @param locationPersistence the location persistence
	 */
	public void setlocationPersistence(locationPersistence locationPersistence) {
		this.locationPersistence = locationPersistence;
	}

	/**
	 * Returns the registration details local service.
	 *
	 * @return the registration details local service
	 */
	public com.servicemapping.service.registrationDetailsLocalService getregistrationDetailsLocalService() {
		return registrationDetailsLocalService;
	}

	/**
	 * Sets the registration details local service.
	 *
	 * @param registrationDetailsLocalService the registration details local service
	 */
	public void setregistrationDetailsLocalService(
		com.servicemapping.service.registrationDetailsLocalService registrationDetailsLocalService) {
		this.registrationDetailsLocalService = registrationDetailsLocalService;
	}

	/**
	 * Returns the registration details persistence.
	 *
	 * @return the registration details persistence
	 */
	public registrationDetailsPersistence getregistrationDetailsPersistence() {
		return registrationDetailsPersistence;
	}

	/**
	 * Sets the registration details persistence.
	 *
	 * @param registrationDetailsPersistence the registration details persistence
	 */
	public void setregistrationDetailsPersistence(
		registrationDetailsPersistence registrationDetailsPersistence) {
		this.registrationDetailsPersistence = registrationDetailsPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register("com.servicemapping.model.course",
			courseLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"com.servicemapping.model.course");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return courseLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return course.class;
	}

	protected String getModelClassName() {
		return course.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = coursePersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = courseLocalService.class)
	protected courseLocalService courseLocalService;
	@BeanReference(type = coursePersistence.class)
	protected coursePersistence coursePersistence;
	@BeanReference(type = com.servicemapping.service.locationLocalService.class)
	protected com.servicemapping.service.locationLocalService locationLocalService;
	@BeanReference(type = locationPersistence.class)
	protected locationPersistence locationPersistence;
	@BeanReference(type = com.servicemapping.service.registrationDetailsLocalService.class)
	protected com.servicemapping.service.registrationDetailsLocalService registrationDetailsLocalService;
	@BeanReference(type = registrationDetailsPersistence.class)
	protected registrationDetailsPersistence registrationDetailsPersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry persistedModelLocalServiceRegistry;
}