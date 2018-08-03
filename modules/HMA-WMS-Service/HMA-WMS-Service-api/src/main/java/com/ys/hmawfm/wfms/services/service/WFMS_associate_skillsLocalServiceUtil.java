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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for WFMS_associate_skills. This utility wraps
 * {@link com.ys.hmawfm.wfms.services.service.impl.WFMS_associate_skillsLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see WFMS_associate_skillsLocalService
 * @see com.ys.hmawfm.wfms.services.service.base.WFMS_associate_skillsLocalServiceBaseImpl
 * @see com.ys.hmawfm.wfms.services.service.impl.WFMS_associate_skillsLocalServiceImpl
 * @generated
 */
@ProviderType
public class WFMS_associate_skillsLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ys.hmawfm.wfms.services.service.impl.WFMS_associate_skillsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the WFMS_associate_skills to the database. Also notifies the appropriate model listeners.
	*
	* @param wfms_associate_skills the WFMS_associate_skills
	* @return the WFMS_associate_skills that was added
	*/
	public static com.ys.hmawfm.wfms.services.model.WFMS_associate_skills addWFMS_associate_skills(
		com.ys.hmawfm.wfms.services.model.WFMS_associate_skills wfms_associate_skills) {
		return getService().addWFMS_associate_skills(wfms_associate_skills);
	}

	/**
	* Creates a new WFMS_associate_skills with the primary key. Does not add the WFMS_associate_skills to the database.
	*
	* @param associate_number the primary key for the new WFMS_associate_skills
	* @return the new WFMS_associate_skills
	*/
	public static com.ys.hmawfm.wfms.services.model.WFMS_associate_skills createWFMS_associate_skills(
		java.lang.String associate_number) {
		return getService().createWFMS_associate_skills(associate_number);
	}

	/**
	* Deletes the WFMS_associate_skills from the database. Also notifies the appropriate model listeners.
	*
	* @param wfms_associate_skills the WFMS_associate_skills
	* @return the WFMS_associate_skills that was removed
	*/
	public static com.ys.hmawfm.wfms.services.model.WFMS_associate_skills deleteWFMS_associate_skills(
		com.ys.hmawfm.wfms.services.model.WFMS_associate_skills wfms_associate_skills) {
		return getService().deleteWFMS_associate_skills(wfms_associate_skills);
	}

	/**
	* Deletes the WFMS_associate_skills with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param associate_number the primary key of the WFMS_associate_skills
	* @return the WFMS_associate_skills that was removed
	* @throws PortalException if a WFMS_associate_skills with the primary key could not be found
	*/
	public static com.ys.hmawfm.wfms.services.model.WFMS_associate_skills deleteWFMS_associate_skills(
		java.lang.String associate_number)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteWFMS_associate_skills(associate_number);
	}

	public static com.ys.hmawfm.wfms.services.model.WFMS_associate_skills fetchWFMS_associate_skills(
		java.lang.String associate_number) {
		return getService().fetchWFMS_associate_skills(associate_number);
	}

	/**
	* Returns the WFMS_associate_skills with the primary key.
	*
	* @param associate_number the primary key of the WFMS_associate_skills
	* @return the WFMS_associate_skills
	* @throws PortalException if a WFMS_associate_skills with the primary key could not be found
	*/
	public static com.ys.hmawfm.wfms.services.model.WFMS_associate_skills getWFMS_associate_skills(
		java.lang.String associate_number)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getWFMS_associate_skills(associate_number);
	}

	/**
	* Updates the WFMS_associate_skills in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param wfms_associate_skills the WFMS_associate_skills
	* @return the WFMS_associate_skills that was updated
	*/
	public static com.ys.hmawfm.wfms.services.model.WFMS_associate_skills updateWFMS_associate_skills(
		com.ys.hmawfm.wfms.services.model.WFMS_associate_skills wfms_associate_skills) {
		return getService().updateWFMS_associate_skills(wfms_associate_skills);
	}

	/**
	* Returns the number of WFMS_associate_skillses.
	*
	* @return the number of WFMS_associate_skillses
	*/
	public static int getWFMS_associate_skillsesCount() {
		return getService().getWFMS_associate_skillsesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ys.hmawfm.wfms.services.model.impl.WFMS_associate_skillsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ys.hmawfm.wfms.services.model.impl.WFMS_associate_skillsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the WFMS_associate_skillses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ys.hmawfm.wfms.services.model.impl.WFMS_associate_skillsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of WFMS_associate_skillses
	* @param end the upper bound of the range of WFMS_associate_skillses (not inclusive)
	* @return the range of WFMS_associate_skillses
	*/
	public static java.util.List<com.ys.hmawfm.wfms.services.model.WFMS_associate_skills> getWFMS_associate_skillses(
		int start, int end) {
		return getService().getWFMS_associate_skillses(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static WFMS_associate_skillsLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<WFMS_associate_skillsLocalService, WFMS_associate_skillsLocalService> _serviceTracker =
		ServiceTrackerFactory.open(WFMS_associate_skillsLocalService.class);
}