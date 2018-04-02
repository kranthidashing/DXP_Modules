package com.custom.login.portlet;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;

import com.MappingServices.model.UserExternal;
import com.MappingServices.service.UserExternalLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.model.CompanyConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.security.auth.session.AuthenticatedSessionManagerUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;

@Component(
	property = {
		"javax.portlet.name=MyLoginPortlet",
		"mvc.command.name=/login/login"
	},
	service = MVCActionCommand.class
)
public class MyLoginMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
			WebKeys.THEME_DISPLAY);
		
		HttpServletRequest request = PortalUtil.getOriginalServletRequest(
			PortalUtil.getHttpServletRequest(actionRequest));
		
		HttpServletResponse response = PortalUtil.getHttpServletResponse(
			actionResponse);
		/*long uid = 0;
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(UserExternal.class, PortletClassLoaderUtil.getClassLoader());
		dynamicQuery.add(PropertyFactoryUtil.forName("PolicyNumber").eq("22222"));
		List<UserExternal> UserExternal = UserExternalLocalServiceUtil.dynamicQuery(dynamicQuery);
		for(UserExternal UE : UserExternal){
			uid=UE.getUid();
			break;
		}
		 System.out.println(uid);*/
		 /* User user = UserLocalServiceUtil.getUser(uid);
        System.out.println(user.getEmailAddress());*/
		String login = "test@liferay.com";
		String password = "jjj";
		boolean rememberMe = false;
		String authType = CompanyConstants.AUTH_TYPE_EA;
		
		AuthenticatedSessionManagerUtil.login(
			request, response, login, password, rememberMe, authType);
		
		actionResponse.sendRedirect(themeDisplay.getPathMain());
	}

}
