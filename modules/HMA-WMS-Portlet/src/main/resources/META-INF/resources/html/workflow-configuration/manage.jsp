<%@ include file="/html/init.jsp" %>

<portlet:actionURL name="saveConfiguration" var="saveConfigurationURL"></portlet:actionURL>
<portlet:actionURL name="createConfiguration" var="createConfigurationURL"></portlet:actionURL>

<% WFMS_WorkflowConfig wfms_config = (WFMS_WorkflowConfig) request.getAttribute("wfms_config");%>

<h2>Manage Workflow Configuration</h2>
<div id="addConfigurationForm">
	<div class="portlet-layout row">
	
	<% 	
		String configId = "";
		String configKey = "";
		String configLabel = "";
		String contentType = "";
		String content = "";
		String actionUrl = "";
		
		if(wfms_config  != null){ 
			actionUrl = saveConfigurationURL.toString();
			configId =  String.valueOf(wfms_config.getWfcId());
			configKey =  wfms_config.getConfigKey();
			configLabel =  wfms_config.getConfigLabel();
			contentType =  wfms_config.getContentType();
			content =  wfms_config.getContent();
		} else {
			actionUrl = createConfigurationURL.toString();
		}
	%>
		
		<aui:form action="<%= actionUrl %>" method="post">
			<div class="portlet-column portlet-column-first col-sm-8 box-content">
			
				<div>
					<aui:input type="hidden" name="configId"  	value="<%= configId %>" />
					<aui:input type="text" 	 name="configKey" 	value="<%= configKey %>" label="Configuration Key"/>
					<aui:input type="text" 	 name="configLabel" value="<%= configLabel %>" label="Note"/>
					
					<aui:select name="contentType" class="field-select" label="Configuration Type">
						<aui:option value="JSON">Configuration Object</aui:option>
						<aui:option value="Values">List of Values</aui:option>
						<aui:option value="KeysValues">List of Keys and Values</aui:option>
					</aui:select>
			
					<aui:input	type="textarea" label="Configuration Content" name="content" 
								rows="5" cols="70" value= "<%= content %>" />
				</div>
				
			</div>
			<div class="portlet-column portlet-column-first col-sm-4">
				<div class="box-details">
				
					<h3>Configuration ID ####</h3>
					<div>
						<%= contentType %>
					</div>
					<ul class="box-detail-list">
						<li>Created By:</li>
						<li>{username}</li>
						<li>Date Created:</li>
						<li>##/##/##</li>
						<li>Modified By:</li>
						<li>{username}</li>
						<li>Modified Date:</li>
						<li>##/##/####</li>
					</ul>
				
					<button name="redirectReq" class="btn btn-primary" type="submit">Save</button>
					
					<% if(wfms_config  != null){ %>
						<portlet:actionURL name="deleteConfiguration" var="deleteConfigurationURL">
							<portlet:param name="configId" value="<%=Long.toString(wfms_config.getWfcId()) %>" />
						</portlet:actionURL>
						<button name="" class="btn btn-primary" type="button" onClick="confirm('Continue to delete?');getUrl('<%=deleteConfigurationURL%>')">Delete</button>
					<% } %>
		
					<aui:button name="exit" type="button" value="Back" onClick="<%=cancelURL.toString()%>" />
				</div>
			</div>
						
		</aui:form>
	</div>
</div>