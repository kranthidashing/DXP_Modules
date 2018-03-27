package com.rest.mapping.application;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.servicemapping.model.course;
import com.servicemapping.model.location;
import com.servicemapping.service.courseLocalServiceUtil;
import com.servicemapping.service.locationLocalServiceUtil;

/**
 * @author kranthi.kumar
 */
@ApplicationPath("/greetings")
@Component(immediate = true, service = Application.class)
public class RestMappingApplication extends Application {

	public Set<Object> getSingletons() {
		return Collections.<Object>singleton(this);
	}

	@GET
	@Produces("text/plain")
	public String working() {
		return "It works!";
	}

	@GET
	@Path("/morning")
	@Produces("text/plain")
	public String hello() {
		return "Good morning!";
	}

	@GET
	@Path("/morning/{name}")
	@Produces("text/plain")
	public String morning(
		@PathParam("name") String name,
		@QueryParam("drink") String drink) {

		String greeting = "Good Morning " + name;

		if (drink != null) {
			greeting += ". Would you like some " + drink + "?";
		}

		return greeting;
	}
	@GET
	@Path("/getlocationcourses")
	@Produces(MediaType.TEXT_PLAIN)
	public String getcourses() throws JSONException{
		JSONObject json = JSONFactoryUtil.createJSONObject();
		List<location> _loc = locationLocalServiceUtil.getlocations(0, locationLocalServiceUtil.getlocationsCount());
		JSONArray createJSONArray = JSONFactoryUtil.createJSONArray();
	    for (location loc : _loc){
	    	JSONObject json2 = JSONFactoryUtil.createJSONObject();
	    	
	    	JSONArray createJSONArray1 = JSONFactoryUtil.createJSONArray();
	    	long lid = loc.getLocationId();
	    	String lname = loc.getLocationName();
	    	List<course> getlocationcourses = courseLocalServiceUtil.getlocationcourses(loc.getLocationId());
	    	 for (course lc : getlocationcourses){
	    		 JSONObject json1 = JSONFactoryUtil.createJSONObject();
	    		 json1.put("Courseid", lc.getCourseId());
	    		 json1.put("CourseName", lc.getCourseName());
	    		 json1.put("CourseFee", lc.getFee());
	    		 createJSONArray1.put(json1);
	    	 }
	    	 json2.put("Location_Id",lid);
	    	 json2.put("Location_Name",lname);
	    	 json2.put("Course_Details",createJSONArray1);	  
	    	 createJSONArray.put(json2);
	    }
		return json.put("DATA",createJSONArray).toJSONString();		
	}

}