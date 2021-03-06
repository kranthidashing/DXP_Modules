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
 * Provides the local service utility for WFMS_Position. This utility wraps
 * {@link com.ys.hmawfm.wfms.services.service.impl.WFMS_PositionLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see WFMS_PositionLocalService
 * @see com.ys.hmawfm.wfms.services.service.base.WFMS_PositionLocalServiceBaseImpl
 * @see com.ys.hmawfm.wfms.services.service.impl.WFMS_PositionLocalServiceImpl
 * @generated
 */
@ProviderType
public class WFMS_PositionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ys.hmawfm.wfms.services.service.impl.WFMS_PositionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static com.ys.hmawfm.wfms.services.model.WFMS_Position addNewEmptyPosition()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addNewEmptyPosition();
	}

	public static com.ys.hmawfm.wfms.services.model.WFMS_Position addNewPosition(
		java.lang.String pid, java.lang.String reqId, long companyId,
		long scopeGroupId, java.lang.String createdBy, java.lang.String status,
		java.lang.String positionDescription, java.lang.String reportedTo,
		java.lang.String isAutoGenerate, boolean isCriticalWorkSegment,
		java.lang.String division, java.lang.String deptName,
		java.lang.String deptNumber, java.lang.String line,
		java.lang.String ladder, java.lang.String mpCatBugdet,
		java.lang.String mpCatFilledWith, java.lang.String positionClass,
		java.lang.String type, java.lang.String level,
		java.lang.String leadershipAssignment, java.lang.String category,
		java.lang.String subCategory, java.lang.String workforceCategory,
		java.lang.String empCategory, java.lang.String empCategoryDesc,
		java.lang.String yearEst, java.lang.String reasonsFor,
		java.lang.String reavailuationDate, java.lang.String associateName,
		java.lang.String associateNumber, java.lang.String associatetitle,
		java.lang.String comments, java.lang.String typicalJobTitle,
		java.lang.String minJobKnowHow, java.lang.String duties,
		java.lang.String tasksPerformed, java.lang.String lengthOfService,
		java.lang.String degree, java.lang.String reqSkills,
		java.lang.String desiredSkills, java.lang.String environment,
		java.lang.String weeklyOvertime, java.lang.String frequencyOfTravel,
		java.lang.String history, java.lang.String other,
		java.lang.String deptManager, java.lang.String divisionManager,
		java.lang.String workflowConfigKey, int workflowStep)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addNewPosition(pid, reqId, companyId, scopeGroupId,
			createdBy, status, positionDescription, reportedTo, isAutoGenerate,
			isCriticalWorkSegment, division, deptName, deptNumber, line,
			ladder, mpCatBugdet, mpCatFilledWith, positionClass, type, level,
			leadershipAssignment, category, subCategory, workforceCategory,
			empCategory, empCategoryDesc, yearEst, reasonsFor,
			reavailuationDate, associateName, associateNumber, associatetitle,
			comments, typicalJobTitle, minJobKnowHow, duties, tasksPerformed,
			lengthOfService, degree, reqSkills, desiredSkills, environment,
			weeklyOvertime, frequencyOfTravel, history, other, deptManager,
			divisionManager, workflowConfigKey, workflowStep);
	}

	/**
	* Adds the WFMS_Position to the database. Also notifies the appropriate model listeners.
	*
	* @param wfms_Position the WFMS_Position
	* @return the WFMS_Position that was added
	*/
	public static com.ys.hmawfm.wfms.services.model.WFMS_Position addWFMS_Position(
		com.ys.hmawfm.wfms.services.model.WFMS_Position wfms_Position) {
		return getService().addWFMS_Position(wfms_Position);
	}

	public static com.ys.hmawfm.wfms.services.model.WFMS_Position addnewtempPosition(
		java.lang.String positionId, java.lang.String requisitonId,
		long companyId, long scopeGroupId, java.lang.String createdBy,
		java.lang.String status, java.lang.String positionDescription,
		java.lang.String reportedTo, java.lang.String isAutoGenerate,
		boolean isCriticalWorkSegment, java.lang.String division,
		java.lang.String deptName, java.lang.String deptNumber,
		java.lang.String line, java.lang.String ladder,
		java.lang.String mpCatBugdet, java.lang.String mpCatFilledWith,
		java.lang.String positionClass, java.lang.String type,
		java.lang.String level, java.lang.String leadershipAssignment,
		java.lang.String category, java.lang.String subCategory,
		java.lang.String workforceCategory, java.lang.String empCategory,
		java.lang.String empCategoryDesc, java.lang.String yearEst,
		java.lang.String reasonsFor, java.lang.String reavailuationDate,
		java.lang.String associateName, java.lang.String associateNumber,
		java.lang.String associatetitle, java.lang.String comments,
		java.lang.String typicalJobTitle, java.lang.String minJobKnowHow,
		java.lang.String duties, java.lang.String tasksPerformed,
		java.lang.String lengthOfService, java.lang.String degree,
		java.lang.String reqSkills, java.lang.String desiredSkills,
		java.lang.String environment, java.lang.String weeklyOvertime,
		java.lang.String frequencyOfTravel, java.lang.String history,
		java.lang.String other, java.lang.String deptManager,
		java.lang.String divisionManager, java.lang.String positionid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addnewtempPosition(positionId, requisitonId, companyId,
			scopeGroupId, createdBy, status, positionDescription, reportedTo,
			isAutoGenerate, isCriticalWorkSegment, division, deptName,
			deptNumber, line, ladder, mpCatBugdet, mpCatFilledWith,
			positionClass, type, level, leadershipAssignment, category,
			subCategory, workforceCategory, empCategory, empCategoryDesc,
			yearEst, reasonsFor, reavailuationDate, associateName,
			associateNumber, associatetitle, comments, typicalJobTitle,
			minJobKnowHow, duties, tasksPerformed, lengthOfService, degree,
			reqSkills, desiredSkills, environment, weeklyOvertime,
			frequencyOfTravel, history, other, deptManager, divisionManager,
			positionid);
	}

	public static com.ys.hmawfm.wfms.services.model.WFMS_Position addnewtempPosition(
		long companyId, long scopeGroupId, java.lang.String createdBy,
		java.lang.String status, java.lang.String positionDescription,
		java.lang.String reportedTo, java.lang.String isAutoGenerate,
		boolean isCriticalWorkSegment, java.lang.String division,
		java.lang.String deptName, java.lang.String deptNumber,
		java.lang.String line, java.lang.String ladder,
		java.lang.String mpCatBugdet, java.lang.String mpCatFilledWith,
		java.lang.String positionClass, java.lang.String type,
		java.lang.String level, java.lang.String leadershipAssignment,
		java.lang.String category, java.lang.String subCategory,
		java.lang.String workforceCategory, java.lang.String empCategory,
		java.lang.String empCategoryDesc, java.lang.String yearEst,
		java.lang.String reasonsFor, java.lang.String reavailuationDate,
		java.lang.String associateName, java.lang.String associateNumber,
		java.lang.String associatetitle, java.lang.String comments,
		java.lang.String typicalJobTitle, java.lang.String minJobKnowHow,
		java.lang.String duties, java.lang.String tasksPerformed,
		java.lang.String lengthOfService, java.lang.String degree,
		java.lang.String reqSkills, java.lang.String desiredSkills,
		java.lang.String environment, java.lang.String weeklyOvertime,
		java.lang.String frequencyOfTravel, java.lang.String history,
		java.lang.String other, java.lang.String deptManager,
		java.lang.String divisionManager)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addnewtempPosition(companyId, scopeGroupId, createdBy,
			status, positionDescription, reportedTo, isAutoGenerate,
			isCriticalWorkSegment, division, deptName, deptNumber, line,
			ladder, mpCatBugdet, mpCatFilledWith, positionClass, type, level,
			leadershipAssignment, category, subCategory, workforceCategory,
			empCategory, empCategoryDesc, yearEst, reasonsFor,
			reavailuationDate, associateName, associateNumber, associatetitle,
			comments, typicalJobTitle, minJobKnowHow, duties, tasksPerformed,
			lengthOfService, degree, reqSkills, desiredSkills, environment,
			weeklyOvertime, frequencyOfTravel, history, other, deptManager,
			divisionManager);
	}

	/**
	* Creates a new WFMS_Position with the primary key. Does not add the WFMS_Position to the database.
	*
	* @param pId the primary key for the new WFMS_Position
	* @return the new WFMS_Position
	*/
	public static com.ys.hmawfm.wfms.services.model.WFMS_Position createWFMS_Position(
		java.lang.String pId) {
		return getService().createWFMS_Position(pId);
	}

	public static com.ys.hmawfm.wfms.services.model.WFMS_Position deletePosition(
		java.lang.String positionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.hmawfm.wfms.services.exception.NoSuchWFMS_PositionException {
		return getService().deletePosition(positionId);
	}

	/**
	* Deletes the WFMS_Position from the database. Also notifies the appropriate model listeners.
	*
	* @param wfms_Position the WFMS_Position
	* @return the WFMS_Position that was removed
	*/
	public static com.ys.hmawfm.wfms.services.model.WFMS_Position deleteWFMS_Position(
		com.ys.hmawfm.wfms.services.model.WFMS_Position wfms_Position) {
		return getService().deleteWFMS_Position(wfms_Position);
	}

	/**
	* Deletes the WFMS_Position with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param pId the primary key of the WFMS_Position
	* @return the WFMS_Position that was removed
	* @throws PortalException if a WFMS_Position with the primary key could not be found
	*/
	public static com.ys.hmawfm.wfms.services.model.WFMS_Position deleteWFMS_Position(
		java.lang.String pId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteWFMS_Position(pId);
	}

	public static com.ys.hmawfm.wfms.services.model.WFMS_Position fetchWFMS_Position(
		java.lang.String pId) {
		return getService().fetchWFMS_Position(pId);
	}

	public static com.ys.hmawfm.wfms.services.model.WFMS_Position findByposition(
		java.lang.String pId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.hmawfm.wfms.services.exception.NoSuchWFMS_PositionException {
		return getService().findByposition(pId);
	}

	public static com.ys.hmawfm.wfms.services.model.WFMS_Position getByAssociateNumber(
		java.lang.String associateNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.hmawfm.wfms.services.exception.NoSuchWFMS_PositionException {
		return getService().getByAssociateNumber(associateNumber);
	}

	public static com.ys.hmawfm.wfms.services.model.WFMS_Position getByPositionId(
		java.lang.String positionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getByPositionId(positionId);
	}

	/**
	* Returns the WFMS_Position with the primary key.
	*
	* @param pId the primary key of the WFMS_Position
	* @return the WFMS_Position
	* @throws PortalException if a WFMS_Position with the primary key could not be found
	*/
	public static com.ys.hmawfm.wfms.services.model.WFMS_Position getWFMS_Position(
		java.lang.String pId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getWFMS_Position(pId);
	}

	public static com.ys.hmawfm.wfms.services.model.WFMS_Position updatePosition(
		java.lang.String reqid, java.lang.String positionId,
		java.lang.String modifiedBy, java.lang.String content,
		java.lang.String contentType, java.lang.String status,
		java.lang.String positionDescription, java.lang.String reportedTo,
		java.lang.String isAutoGenerate, boolean isCriticalWorkSegment,
		java.lang.String division, java.lang.String deptName,
		java.lang.String deptNumber, java.lang.String line,
		java.lang.String ladder, java.lang.String mpCatBugdet,
		java.lang.String mpCatFilledWith, java.lang.String positionClass,
		java.lang.String type, java.lang.String level,
		java.lang.String leadershipAssignment, java.lang.String category,
		java.lang.String subCategory, java.lang.String workforceCategory,
		java.lang.String empCategory, java.lang.String empCategoryDesc,
		java.lang.String yearEst, java.lang.String reasonsFor,
		java.lang.String reavailuationDate, java.lang.String associateName,
		java.lang.String associateNumber, java.lang.String associatetitle,
		java.lang.String comments, java.lang.String typicalJobTitle,
		java.lang.String minJobKnowHow, java.lang.String duties,
		java.lang.String tasksPerformed, java.lang.String lengthOfService,
		java.lang.String degree, java.lang.String reqSkills,
		java.lang.String desiredSkills, java.lang.String environment,
		java.lang.String weeklyOvertime, java.lang.String frequencyOfTravel,
		java.lang.String history, java.lang.String other,
		java.lang.String deptManager, java.lang.String divisionManager,
		long companyId, long scopeGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updatePosition(reqid, positionId, modifiedBy, content,
			contentType, status, positionDescription, reportedTo,
			isAutoGenerate, isCriticalWorkSegment, division, deptName,
			deptNumber, line, ladder, mpCatBugdet, mpCatFilledWith,
			positionClass, type, level, leadershipAssignment, category,
			subCategory, workforceCategory, empCategory, empCategoryDesc,
			yearEst, reasonsFor, reavailuationDate, associateName,
			associateNumber, associatetitle, comments, typicalJobTitle,
			minJobKnowHow, duties, tasksPerformed, lengthOfService, degree,
			reqSkills, desiredSkills, environment, weeklyOvertime,
			frequencyOfTravel, history, other, deptManager, divisionManager,
			companyId, scopeGroupId);
	}

	public static com.ys.hmawfm.wfms.services.model.WFMS_Position updatePositionEntry(
		com.ys.hmawfm.wfms.services.model.WFMS_Position entry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatePositionEntry(entry);
	}

	/**
	* Updates the WFMS_Position in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param wfms_Position the WFMS_Position
	* @return the WFMS_Position that was updated
	*/
	public static com.ys.hmawfm.wfms.services.model.WFMS_Position updateWFMS_Position(
		com.ys.hmawfm.wfms.services.model.WFMS_Position wfms_Position) {
		return getService().updateWFMS_Position(wfms_Position);
	}

	/**
	* Returns the number of WFMS_Positions.
	*
	* @return the number of WFMS_Positions
	*/
	public static int getWFMS_PositionsCount() {
		return getService().getWFMS_PositionsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ys.hmawfm.wfms.services.model.impl.WFMS_PositionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ys.hmawfm.wfms.services.model.impl.WFMS_PositionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.ys.hmawfm.wfms.services.model.WFMS_Position> findByAssociateNumber(
		java.lang.String associateNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByAssociateNumber(associateNumber);
	}

	public static java.util.List<com.ys.hmawfm.wfms.services.model.WFMS_Position> findByDepartmentName(
		java.lang.String departmentName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByDepartmentName(departmentName);
	}

	public static java.util.List<com.ys.hmawfm.wfms.services.model.WFMS_Position> findByNextApprover(
		java.lang.String nextApprover)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByNextApprover(nextApprover);
	}

	public static java.util.List<com.ys.hmawfm.wfms.services.model.WFMS_Position> findByReportsTo(
		java.lang.String reportsTo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByReportsTo(reportsTo);
	}

	public static java.util.List<com.ys.hmawfm.wfms.services.model.WFMS_Position> findByautoGenerateReq(
		java.lang.String autoGenerateReq)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByautoGenerateReq(autoGenerateReq);
	}

	public static java.util.List<com.ys.hmawfm.wfms.services.model.WFMS_Position> findBydummy(
		java.lang.String dummy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBydummy(dummy);
	}

	public static java.util.List<com.ys.hmawfm.wfms.services.model.WFMS_Position> findBypositionIdGetByStaus(
		java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBypositionIdGetByStaus(status);
	}

	public static java.util.List<com.ys.hmawfm.wfms.services.model.WFMS_Position> findByrefPosId(
		java.lang.String refPosId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByrefPosId(refPosId);
	}

	public static java.util.List<com.ys.hmawfm.wfms.services.model.WFMS_Position> findByworkflowId(
		java.lang.String workflowId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByworkflowId(workflowId);
	}

	public static java.util.List<com.ys.hmawfm.wfms.services.model.WFMS_Position> getAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAll();
	}

	/**
	* Returns a range of all the WFMS_Positions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ys.hmawfm.wfms.services.model.impl.WFMS_PositionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of WFMS_Positions
	* @param end the upper bound of the range of WFMS_Positions (not inclusive)
	* @return the range of WFMS_Positions
	*/
	public static java.util.List<com.ys.hmawfm.wfms.services.model.WFMS_Position> getWFMS_Positions(
		int start, int end) {
		return getService().getWFMS_Positions(start, end);
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

	public static void clearCache()
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearCache();
	}

	public static void removeAllPositions()
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ys.hmawfm.wfms.services.exception.NoSuchWFMS_PositionException {
		getService().removeAllPositions();
	}

	public static WFMS_PositionLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<WFMS_PositionLocalService, WFMS_PositionLocalService> _serviceTracker =
		ServiceTrackerFactory.open(WFMS_PositionLocalService.class);
}