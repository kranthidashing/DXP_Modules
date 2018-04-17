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

package com.externalservices.service.base;

import aQute.bnd.annotation.ProviderType;

import com.externalservices.model.leykartEnquiry;

import com.externalservices.service.leykartEnquiryLocalService;
import com.externalservices.service.persistence.leykartEnquiryPersistence;

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

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the leykart enquiry local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.externalservices.service.impl.leykartEnquiryLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.externalservices.service.impl.leykartEnquiryLocalServiceImpl
 * @see com.externalservices.service.leykartEnquiryLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class leykartEnquiryLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements leykartEnquiryLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.externalservices.service.leykartEnquiryLocalServiceUtil} to access the leykart enquiry local service.
	 */

	/**
	 * Adds the leykart enquiry to the database. Also notifies the appropriate model listeners.
	 *
	 * @param leykartEnquiry the leykart enquiry
	 * @return the leykart enquiry that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public leykartEnquiry addleykartEnquiry(leykartEnquiry leykartEnquiry) {
		leykartEnquiry.setNew(true);

		return leykartEnquiryPersistence.update(leykartEnquiry);
	}

	/**
	 * Creates a new leykart enquiry with the primary key. Does not add the leykart enquiry to the database.
	 *
	 * @param Eid the primary key for the new leykart enquiry
	 * @return the new leykart enquiry
	 */
	@Override
	public leykartEnquiry createleykartEnquiry(long Eid) {
		return leykartEnquiryPersistence.create(Eid);
	}

	/**
	 * Deletes the leykart enquiry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Eid the primary key of the leykart enquiry
	 * @return the leykart enquiry that was removed
	 * @throws PortalException if a leykart enquiry with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public leykartEnquiry deleteleykartEnquiry(long Eid)
		throws PortalException {
		return leykartEnquiryPersistence.remove(Eid);
	}

	/**
	 * Deletes the leykart enquiry from the database. Also notifies the appropriate model listeners.
	 *
	 * @param leykartEnquiry the leykart enquiry
	 * @return the leykart enquiry that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public leykartEnquiry deleteleykartEnquiry(leykartEnquiry leykartEnquiry) {
		return leykartEnquiryPersistence.remove(leykartEnquiry);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(leykartEnquiry.class,
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
		return leykartEnquiryPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.externalservices.model.impl.leykartEnquiryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return leykartEnquiryPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.externalservices.model.impl.leykartEnquiryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return leykartEnquiryPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return leykartEnquiryPersistence.countWithDynamicQuery(dynamicQuery);
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
		return leykartEnquiryPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public leykartEnquiry fetchleykartEnquiry(long Eid) {
		return leykartEnquiryPersistence.fetchByPrimaryKey(Eid);
	}

	/**
	 * Returns the leykart enquiry with the matching UUID and company.
	 *
	 * @param uuid the leykart enquiry's UUID
	 * @param companyId the primary key of the company
	 * @return the matching leykart enquiry, or <code>null</code> if a matching leykart enquiry could not be found
	 */
	@Override
	public leykartEnquiry fetchleykartEnquiryByUuidAndCompanyId(String uuid,
		long companyId) {
		return leykartEnquiryPersistence.fetchByUuid_C_First(uuid, companyId,
			null);
	}

	/**
	 * Returns the leykart enquiry with the primary key.
	 *
	 * @param Eid the primary key of the leykart enquiry
	 * @return the leykart enquiry
	 * @throws PortalException if a leykart enquiry with the primary key could not be found
	 */
	@Override
	public leykartEnquiry getleykartEnquiry(long Eid) throws PortalException {
		return leykartEnquiryPersistence.findByPrimaryKey(Eid);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(leykartEnquiryLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(leykartEnquiry.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("Eid");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(leykartEnquiryLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(leykartEnquiry.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("Eid");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(leykartEnquiryLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(leykartEnquiry.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("Eid");
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

		exportActionableDynamicQuery.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<leykartEnquiry>() {
				@Override
				public void performAction(leykartEnquiry leykartEnquiry)
					throws PortalException {
					StagedModelDataHandlerUtil.exportStagedModel(portletDataContext,
						leykartEnquiry);
				}
			});
		exportActionableDynamicQuery.setStagedModelType(new StagedModelType(
				PortalUtil.getClassNameId(leykartEnquiry.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return leykartEnquiryLocalService.deleteleykartEnquiry((leykartEnquiry)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return leykartEnquiryPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns the leykart enquiry with the matching UUID and company.
	 *
	 * @param uuid the leykart enquiry's UUID
	 * @param companyId the primary key of the company
	 * @return the matching leykart enquiry
	 * @throws PortalException if a matching leykart enquiry could not be found
	 */
	@Override
	public leykartEnquiry getleykartEnquiryByUuidAndCompanyId(String uuid,
		long companyId) throws PortalException {
		return leykartEnquiryPersistence.findByUuid_C_First(uuid, companyId,
			null);
	}

	/**
	 * Returns a range of all the leykart enquiries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.externalservices.model.impl.leykartEnquiryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of leykart enquiries
	 * @param end the upper bound of the range of leykart enquiries (not inclusive)
	 * @return the range of leykart enquiries
	 */
	@Override
	public List<leykartEnquiry> getleykartEnquiries(int start, int end) {
		return leykartEnquiryPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of leykart enquiries.
	 *
	 * @return the number of leykart enquiries
	 */
	@Override
	public int getleykartEnquiriesCount() {
		return leykartEnquiryPersistence.countAll();
	}

	/**
	 * Updates the leykart enquiry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param leykartEnquiry the leykart enquiry
	 * @return the leykart enquiry that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public leykartEnquiry updateleykartEnquiry(leykartEnquiry leykartEnquiry) {
		return leykartEnquiryPersistence.update(leykartEnquiry);
	}

	/**
	 * Returns the leykart enquiry local service.
	 *
	 * @return the leykart enquiry local service
	 */
	public leykartEnquiryLocalService getleykartEnquiryLocalService() {
		return leykartEnquiryLocalService;
	}

	/**
	 * Sets the leykart enquiry local service.
	 *
	 * @param leykartEnquiryLocalService the leykart enquiry local service
	 */
	public void setleykartEnquiryLocalService(
		leykartEnquiryLocalService leykartEnquiryLocalService) {
		this.leykartEnquiryLocalService = leykartEnquiryLocalService;
	}

	/**
	 * Returns the leykart enquiry persistence.
	 *
	 * @return the leykart enquiry persistence
	 */
	public leykartEnquiryPersistence getleykartEnquiryPersistence() {
		return leykartEnquiryPersistence;
	}

	/**
	 * Sets the leykart enquiry persistence.
	 *
	 * @param leykartEnquiryPersistence the leykart enquiry persistence
	 */
	public void setleykartEnquiryPersistence(
		leykartEnquiryPersistence leykartEnquiryPersistence) {
		this.leykartEnquiryPersistence = leykartEnquiryPersistence;
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
		persistedModelLocalServiceRegistry.register("com.externalservices.model.leykartEnquiry",
			leykartEnquiryLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"com.externalservices.model.leykartEnquiry");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return leykartEnquiryLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return leykartEnquiry.class;
	}

	protected String getModelClassName() {
		return leykartEnquiry.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = leykartEnquiryPersistence.getDataSource();

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

	@BeanReference(type = leykartEnquiryLocalService.class)
	protected leykartEnquiryLocalService leykartEnquiryLocalService;
	@BeanReference(type = leykartEnquiryPersistence.class)
	protected leykartEnquiryPersistence leykartEnquiryPersistence;
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