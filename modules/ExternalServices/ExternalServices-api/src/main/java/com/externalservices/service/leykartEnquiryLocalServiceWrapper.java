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

package com.externalservices.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link leykartEnquiryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see leykartEnquiryLocalService
 * @generated
 */
@ProviderType
public class leykartEnquiryLocalServiceWrapper
	implements leykartEnquiryLocalService,
		ServiceWrapper<leykartEnquiryLocalService> {
	public leykartEnquiryLocalServiceWrapper(
		leykartEnquiryLocalService leykartEnquiryLocalService) {
		_leykartEnquiryLocalService = leykartEnquiryLocalService;
	}

	/**
	* Adds the leykart enquiry to the database. Also notifies the appropriate model listeners.
	*
	* @param leykartEnquiry the leykart enquiry
	* @return the leykart enquiry that was added
	*/
	@Override
	public com.externalservices.model.leykartEnquiry addleykartEnquiry(
		com.externalservices.model.leykartEnquiry leykartEnquiry) {
		return _leykartEnquiryLocalService.addleykartEnquiry(leykartEnquiry);
	}

	/**
	* Creates a new leykart enquiry with the primary key. Does not add the leykart enquiry to the database.
	*
	* @param Eid the primary key for the new leykart enquiry
	* @return the new leykart enquiry
	*/
	@Override
	public com.externalservices.model.leykartEnquiry createleykartEnquiry(
		long Eid) {
		return _leykartEnquiryLocalService.createleykartEnquiry(Eid);
	}

	/**
	* Deletes the leykart enquiry from the database. Also notifies the appropriate model listeners.
	*
	* @param leykartEnquiry the leykart enquiry
	* @return the leykart enquiry that was removed
	*/
	@Override
	public com.externalservices.model.leykartEnquiry deleteleykartEnquiry(
		com.externalservices.model.leykartEnquiry leykartEnquiry) {
		return _leykartEnquiryLocalService.deleteleykartEnquiry(leykartEnquiry);
	}

	/**
	* Deletes the leykart enquiry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Eid the primary key of the leykart enquiry
	* @return the leykart enquiry that was removed
	* @throws PortalException if a leykart enquiry with the primary key could not be found
	*/
	@Override
	public com.externalservices.model.leykartEnquiry deleteleykartEnquiry(
		long Eid) throws com.liferay.portal.kernel.exception.PortalException {
		return _leykartEnquiryLocalService.deleteleykartEnquiry(Eid);
	}

	@Override
	public com.externalservices.model.leykartEnquiry fetchleykartEnquiry(
		long Eid) {
		return _leykartEnquiryLocalService.fetchleykartEnquiry(Eid);
	}

	/**
	* Returns the leykart enquiry with the matching UUID and company.
	*
	* @param uuid the leykart enquiry's UUID
	* @param companyId the primary key of the company
	* @return the matching leykart enquiry, or <code>null</code> if a matching leykart enquiry could not be found
	*/
	@Override
	public com.externalservices.model.leykartEnquiry fetchleykartEnquiryByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _leykartEnquiryLocalService.fetchleykartEnquiryByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the leykart enquiry with the primary key.
	*
	* @param Eid the primary key of the leykart enquiry
	* @return the leykart enquiry
	* @throws PortalException if a leykart enquiry with the primary key could not be found
	*/
	@Override
	public com.externalservices.model.leykartEnquiry getleykartEnquiry(long Eid)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _leykartEnquiryLocalService.getleykartEnquiry(Eid);
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
	public com.externalservices.model.leykartEnquiry getleykartEnquiryByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _leykartEnquiryLocalService.getleykartEnquiryByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Updates the leykart enquiry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param leykartEnquiry the leykart enquiry
	* @return the leykart enquiry that was updated
	*/
	@Override
	public com.externalservices.model.leykartEnquiry updateleykartEnquiry(
		com.externalservices.model.leykartEnquiry leykartEnquiry) {
		return _leykartEnquiryLocalService.updateleykartEnquiry(leykartEnquiry);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _leykartEnquiryLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _leykartEnquiryLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _leykartEnquiryLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _leykartEnquiryLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _leykartEnquiryLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _leykartEnquiryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of leykart enquiries.
	*
	* @return the number of leykart enquiries
	*/
	@Override
	public int getleykartEnquiriesCount() {
		return _leykartEnquiryLocalService.getleykartEnquiriesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _leykartEnquiryLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _leykartEnquiryLocalService.dynamicQuery(dynamicQuery);
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
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _leykartEnquiryLocalService.dynamicQuery(dynamicQuery, start, end);
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
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _leykartEnquiryLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
	public java.util.List<com.externalservices.model.leykartEnquiry> getleykartEnquiries(
		int start, int end) {
		return _leykartEnquiryLocalService.getleykartEnquiries(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _leykartEnquiryLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _leykartEnquiryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public leykartEnquiryLocalService getWrappedService() {
		return _leykartEnquiryLocalService;
	}

	@Override
	public void setWrappedService(
		leykartEnquiryLocalService leykartEnquiryLocalService) {
		_leykartEnquiryLocalService = leykartEnquiryLocalService;
	}

	private leykartEnquiryLocalService _leykartEnquiryLocalService;
}