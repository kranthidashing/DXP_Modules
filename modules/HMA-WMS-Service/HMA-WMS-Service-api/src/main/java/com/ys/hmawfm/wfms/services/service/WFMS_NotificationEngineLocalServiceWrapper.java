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

package com.ys.hmawfm.wfms.services.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link WFMS_NotificationEngineLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see WFMS_NotificationEngineLocalService
 * @generated
 */
@ProviderType
public class WFMS_NotificationEngineLocalServiceWrapper
	implements WFMS_NotificationEngineLocalService,
		ServiceWrapper<WFMS_NotificationEngineLocalService> {
	public WFMS_NotificationEngineLocalServiceWrapper(
		WFMS_NotificationEngineLocalService wfms_NotificationEngineLocalService) {
		_wfms_NotificationEngineLocalService = wfms_NotificationEngineLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _wfms_NotificationEngineLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _wfms_NotificationEngineLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _wfms_NotificationEngineLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _wfms_NotificationEngineLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _wfms_NotificationEngineLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.ys.hmawfm.wfms.services.model.WFMS_NotificationEngine addNewNotifications(
		long companyId, long scopeGroupId, java.lang.String createdBy,
		java.lang.String content, java.lang.String contentType,
		java.lang.String comments, java.lang.String title, int timesUsed)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wfms_NotificationEngineLocalService.addNewNotifications(companyId,
			scopeGroupId, createdBy, content, contentType, comments, title,
			timesUsed);
	}

	/**
	* Adds the WFMS_NotificationEngine to the database. Also notifies the appropriate model listeners.
	*
	* @param wfms_NotificationEngine the WFMS_NotificationEngine
	* @return the WFMS_NotificationEngine that was added
	*/
	@Override
	public com.ys.hmawfm.wfms.services.model.WFMS_NotificationEngine addWFMS_NotificationEngine(
		com.ys.hmawfm.wfms.services.model.WFMS_NotificationEngine wfms_NotificationEngine) {
		return _wfms_NotificationEngineLocalService.addWFMS_NotificationEngine(wfms_NotificationEngine);
	}

	/**
	* Creates a new WFMS_NotificationEngine with the primary key. Does not add the WFMS_NotificationEngine to the database.
	*
	* @param templateId the primary key for the new WFMS_NotificationEngine
	* @return the new WFMS_NotificationEngine
	*/
	@Override
	public com.ys.hmawfm.wfms.services.model.WFMS_NotificationEngine createWFMS_NotificationEngine(
		long templateId) {
		return _wfms_NotificationEngineLocalService.createWFMS_NotificationEngine(templateId);
	}

	/**
	* Deletes the WFMS_NotificationEngine from the database. Also notifies the appropriate model listeners.
	*
	* @param wfms_NotificationEngine the WFMS_NotificationEngine
	* @return the WFMS_NotificationEngine that was removed
	*/
	@Override
	public com.ys.hmawfm.wfms.services.model.WFMS_NotificationEngine deleteWFMS_NotificationEngine(
		com.ys.hmawfm.wfms.services.model.WFMS_NotificationEngine wfms_NotificationEngine) {
		return _wfms_NotificationEngineLocalService.deleteWFMS_NotificationEngine(wfms_NotificationEngine);
	}

	/**
	* Deletes the WFMS_NotificationEngine with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param templateId the primary key of the WFMS_NotificationEngine
	* @return the WFMS_NotificationEngine that was removed
	* @throws PortalException if a WFMS_NotificationEngine with the primary key could not be found
	*/
	@Override
	public com.ys.hmawfm.wfms.services.model.WFMS_NotificationEngine deleteWFMS_NotificationEngine(
		long templateId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _wfms_NotificationEngineLocalService.deleteWFMS_NotificationEngine(templateId);
	}

	@Override
	public com.ys.hmawfm.wfms.services.model.WFMS_NotificationEngine fetchWFMS_NotificationEngine(
		long templateId) {
		return _wfms_NotificationEngineLocalService.fetchWFMS_NotificationEngine(templateId);
	}

	@Override
	public com.ys.hmawfm.wfms.services.model.WFMS_NotificationEngine getByNotificationId(
		long notificationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wfms_NotificationEngineLocalService.getByNotificationId(notificationId);
	}

	/**
	* Returns the WFMS_NotificationEngine with the primary key.
	*
	* @param templateId the primary key of the WFMS_NotificationEngine
	* @return the WFMS_NotificationEngine
	* @throws PortalException if a WFMS_NotificationEngine with the primary key could not be found
	*/
	@Override
	public com.ys.hmawfm.wfms.services.model.WFMS_NotificationEngine getWFMS_NotificationEngine(
		long templateId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _wfms_NotificationEngineLocalService.getWFMS_NotificationEngine(templateId);
	}

	@Override
	public com.ys.hmawfm.wfms.services.model.WFMS_NotificationEngine updateNotifications(
		long templateId, java.lang.String modifiedBy, java.lang.String content,
		java.lang.String contentType, java.lang.String comments,
		java.lang.String title, int timesUsed)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wfms_NotificationEngineLocalService.updateNotifications(templateId,
			modifiedBy, content, contentType, comments, title, timesUsed);
	}

	/**
	* Updates the WFMS_NotificationEngine in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param wfms_NotificationEngine the WFMS_NotificationEngine
	* @return the WFMS_NotificationEngine that was updated
	*/
	@Override
	public com.ys.hmawfm.wfms.services.model.WFMS_NotificationEngine updateWFMS_NotificationEngine(
		com.ys.hmawfm.wfms.services.model.WFMS_NotificationEngine wfms_NotificationEngine) {
		return _wfms_NotificationEngineLocalService.updateWFMS_NotificationEngine(wfms_NotificationEngine);
	}

	/**
	* Returns the number of WFMS_NotificationEngines.
	*
	* @return the number of WFMS_NotificationEngines
	*/
	@Override
	public int getWFMS_NotificationEnginesCount() {
		return _wfms_NotificationEngineLocalService.getWFMS_NotificationEnginesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _wfms_NotificationEngineLocalService.getOSGiServiceIdentifier();
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
		return _wfms_NotificationEngineLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ys.hmawfm.wfms.services.model.impl.WFMS_NotificationEngineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _wfms_NotificationEngineLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ys.hmawfm.wfms.services.model.impl.WFMS_NotificationEngineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _wfms_NotificationEngineLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.ys.hmawfm.wfms.services.model.WFMS_NotificationEngine> getAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wfms_NotificationEngineLocalService.getAll();
	}

	/**
	* Returns a range of all the WFMS_NotificationEngines.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ys.hmawfm.wfms.services.model.impl.WFMS_NotificationEngineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of WFMS_NotificationEngines
	* @param end the upper bound of the range of WFMS_NotificationEngines (not inclusive)
	* @return the range of WFMS_NotificationEngines
	*/
	@Override
	public java.util.List<com.ys.hmawfm.wfms.services.model.WFMS_NotificationEngine> getWFMS_NotificationEngines(
		int start, int end) {
		return _wfms_NotificationEngineLocalService.getWFMS_NotificationEngines(start,
			end);
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
		return _wfms_NotificationEngineLocalService.dynamicQueryCount(dynamicQuery);
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
		return _wfms_NotificationEngineLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public WFMS_NotificationEngineLocalService getWrappedService() {
		return _wfms_NotificationEngineLocalService;
	}

	@Override
	public void setWrappedService(
		WFMS_NotificationEngineLocalService wfms_NotificationEngineLocalService) {
		_wfms_NotificationEngineLocalService = wfms_NotificationEngineLocalService;
	}

	private WFMS_NotificationEngineLocalService _wfms_NotificationEngineLocalService;
}