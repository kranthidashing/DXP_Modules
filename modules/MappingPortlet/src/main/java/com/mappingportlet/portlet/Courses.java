package com.mappingportlet.portlet;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
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
			   	String LocationName ="Hyderabad";
			   	String CourseName = "Java";
			   	Long Fee = 2000L;
			   	Date StartDate = new Date();
			   	Date EndDate = new Date();
			   	Long MaxSeats = 1000L;
			   	Long lid = 0L;
			  //ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			    course _course = courseLocalServiceUtil.createcourse(CounterLocalServiceUtil.increment());
			    _course.setCourseName(CourseName);
			    _course.setFee(Fee);
			    _course.setStartDate(StartDate);
			    _course.setEndDate(EndDate);
			    _course.setMaxseats(MaxSeats);
			    _course.setGroupId(0);
			    _course.setCompanyId(0);
			    _course.setUserId(0);
			    _course.setUserName("ll");
			    _course.setCreateDate(new Date());
			    _course.setModifiedDate(new Date());
			    List<location> _location = locationLocalServiceUtil.getlocations(0, locationLocalServiceUtil.getlocationsCount());
			    for(location Newlocation : _location){
			    	if(Newlocation.getLocationName().equalsIgnoreCase(LocationName)){
			    		lid=Newlocation.getLocationId();
			    		break;
			    	}
			    }
			    courseLocalServiceUtil.addcourse(_course);
			    courseLocalServiceUtil.addlocationcourse(lid,_course);
			  }
			       catch (Exception e) {		     
			   }
			 }
}