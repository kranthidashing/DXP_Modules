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
 * Provides the remote service utility for WFMS_Associate_History. This utility wraps
 * {@link com.ys.hmawfm.wfms.services.service.impl.WFMS_Associate_HistoryServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see WFMS_Associate_HistoryService
 * @see com.ys.hmawfm.wfms.services.service.base.WFMS_Associate_HistoryServiceBaseImpl
 * @see com.ys.hmawfm.wfms.services.service.impl.WFMS_Associate_HistoryServiceImpl
 * @generated
 */
@ProviderType
public class WFMS_Associate_HistoryServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ys.hmawfm.wfms.services.service.impl.WFMS_Associate_HistoryServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static WFMS_Associate_HistoryService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<WFMS_Associate_HistoryService, WFMS_Associate_HistoryService> _serviceTracker =
		ServiceTrackerFactory.open(WFMS_Associate_HistoryService.class);
}