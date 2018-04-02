package com.mappingportlet.portlet;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.MappingServices.model.UserExternal;
import com.MappingServices.service.UserExternalLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.Validator;
import com.servicemapping.model.course;
import com.servicemapping.model.location;
import com.servicemapping.service.courseLocalServiceUtil;
import com.servicemapping.service.locationLocalServiceUtil;

/**
 * @author kranthi.kumar
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.Mapping",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=CoursesPortlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view1.jsp",
		"javax.portlet.name=CoursesPortlet",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class Courses extends MVCPortlet {
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		System.out.println("hello");
		 try {
			 System.out.println("111111");
			    long uid = 0;
				DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(UserExternal.class,"ue", PortletClassLoaderUtil.getClassLoader());
				System.out.println("111111");
				dynamicQuery.add(PropertyFactoryUtil.forName("ue.uid").eq(38501));
				System.out.println("111111");
				List<UserExternal> UserExternal = UserExternalLocalServiceUtil.dynamicQuery(dynamicQuery);
				if(Validator.isNotNull(UserExternal)){
					System.out.println("111111");
				}
				System.out.println("111111");
				/*for(UserExternal UE : UserExternal){
					System.out.println("111111");
				}
				 System.out.println(uid);*/
			  }
			       catch (Exception e) {		     
			   }
			 }
}