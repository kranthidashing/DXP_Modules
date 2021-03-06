create table WFMS_Associate_History (
	assocHistoryId INTEGER not null primary key,
	associateId VARCHAR(75) null,
	associateName VARCHAR(75) null,
	currentPosition VARCHAR(75) null,
	history TEXT null,
	createdBy VARCHAR(75) null,
	createDate DATE null
);

create table WFMS_COS (
	cosId VARCHAR(75) not null primary key,
	assoicateId VARCHAR(75) null,
	newPositionNumber VARCHAR(75) null,
	action VARCHAR(75) null,
	reasonCODE VARCHAR(75) null,
	description TEXT null,
	changeDescription VARCHAR(75) null,
	newJobCode VARCHAR(75) null,
	sameJobCode VARCHAR(75) null,
	sameLeadership VARCHAR(75) null,
	sameDept VARCHAR(75) null,
	sameMgr VARCHAR(75) null,
	routingProcess VARCHAR(255) null,
	notificationTo VARCHAR(255) null,
	status VARCHAR(75) null,
	type_ VARCHAR(75) null,
	effectiveDate VARCHAR(75) null,
	teamNumber VARCHAR(75) null,
	shiftCode VARCHAR(75) null,
	mgrAssociateNumber VARCHAR(75) null,
	manpowerCategiry VARCHAR(75) null,
	comments TEXT null,
	leadershipAssignment VARCHAR(75) null,
	associateDateOfHire VARCHAR(75) null,
	newDivision VARCHAR(75) null,
	newDivisionManager VARCHAR(75) null,
	newDepartmentName VARCHAR(75) null,
	newDepartmentNumber VARCHAR(75) null,
	newDepartmentManager VARCHAR(75) null,
	newManagerName VARCHAR(75) null,
	newManagerTitle VARCHAR(75) null,
	deleteflagStatus INTEGER,
	RequistionId VARCHAR(75) null,
	companyId LONG,
	scopeGroupId LONG,
	createdBy VARCHAR(75) null,
	createDate DATE null,
	modifiedBy VARCHAR(75) null,
	modifiedDate DATE null,
	associatename VARCHAR(75) null,
	relatesTo VARCHAR(75) null,
	nextApprover TEXT null,
	roleOfApprover VARCHAR(75) null,
	approverList VARCHAR(255) null,
	approverStep INTEGER,
	workflow VARCHAR(75) null,
	workflowStep INTEGER,
	workflowId VARCHAR(75) null,
	dummy VARCHAR(75) null,
	refCosId VARCHAR(75) null,
	systemGenerated INTEGER,
	positionNumber VARCHAR(75) null,
	currentJobCode VARCHAR(75) null,
	currentDivision VARCHAR(75) null,
	currentDivisionManager VARCHAR(75) null,
	currentDepartmentName VARCHAR(75) null,
	currentDepartmentNumber VARCHAR(75) null,
	currentDepartmentManager VARCHAR(75) null,
	currentManagerName VARCHAR(75) null,
	currentManagerTitle VARCHAR(75) null,
	currentTeamNumber VARCHAR(75) null,
	currentShiftCode VARCHAR(75) null,
	currentLeadershipAssignment VARCHAR(75) null,
	currentManpowerRep VARCHAR(75) null,
	currentManagerAssocNumber VARCHAR(75) null,
	sortApprovedList VARCHAR(1500) null,
	DuplicateApprovedList VARCHAR(1500) null,
	DuplicateApprovedListStartIndex INTEGER,
	DuplicateApprovedListEndIndex INTEGER,
	announced INTEGER,
	currentPositionText INTEGER,
	DuplicateCounter INTEGER
);

create table WFMS_COS_Audit (
	cosaId VARCHAR(75) not null primary key,
	cosId VARCHAR(75) null,
	userId LONG,
	createdBy VARCHAR(75) null,
	createDate DATE null,
	change_ TEXT null,
	comments TEXT null
);

create table WFMS_Config (
	configId LONG not null primary key,
	createdBy VARCHAR(75) null,
	createDate DATE null,
	modifiedBy VARCHAR(75) null,
	modifiedDate DATE null,
	configKey VARCHAR(75) null,
	configLabel VARCHAR(75) null,
	contentType VARCHAR(75) null,
	content TEXT null
);

create table WFMS_NA_Support (
	ASSOCIATE_NUMBER VARCHAR(75) not null primary key,
	ASSOC_NO VARCHAR(75) null,
	ASSOCIATE_DATE_OF_HIRE VARCHAR(75) null,
	ASSOCIATE_NAME VARCHAR(75) null,
	DEPT_NUMBER VARCHAR(75) null,
	DEPT_NO INTEGER,
	DEPT_NAME VARCHAR(75) null,
	ASSOCIATE_TITLE VARCHAR(75) null,
	SHIFT_CODE VARCHAR(75) null,
	TEAM_NUMBER VARCHAR(75) null,
	EFFDT VARCHAR(75) null,
	TERMINATION_DT VARCHAR(75) null,
	MANAGER_ASSOCIATE_NUMBER INTEGER,
	ASSGN_TYPE VARCHAR(75) null,
	LEADERSHIP_ASSIGNMENT VARCHAR(75) null,
	EMAIL VARCHAR(75) null,
	deleteflag INTEGER,
	createdBy VARCHAR(75) null,
	createDate DATE null,
	modifiedBy VARCHAR(75) null,
	modifiedDate DATE null
);

create table WFMS_NotificationEngine (
	templateId LONG not null primary key,
	companyId LONG,
	scopeGroupId LONG,
	createdBy VARCHAR(75) null,
	createDate DATE null,
	modifiedBy VARCHAR(75) null,
	modifiedDate DATE null,
	title VARCHAR(75) null,
	content VARCHAR(75) null,
	contentType VARCHAR(75) null,
	comments VARCHAR(75) null,
	timesUsed INTEGER
);

create table WFMS_Position (
	pId VARCHAR(75) not null primary key,
	companyId LONG,
	scopeGroupId LONG,
	createdBy VARCHAR(75) null,
	createDate DATE null,
	modifiedBy VARCHAR(75) null,
	modifiedDate DATE null,
	active_ BOOLEAN,
	number_ VARCHAR(75) null,
	description VARCHAR(2000) null,
	status VARCHAR(75) null,
	reportsTo VARCHAR(75) null,
	autoGenerateReq VARCHAR(75) null,
	critical BOOLEAN,
	division VARCHAR(75) null,
	departmentName VARCHAR(75) null,
	departmentNumber VARCHAR(75) null,
	line VARCHAR(75) null,
	ladder VARCHAR(75) null,
	mpCatBugdet VARCHAR(75) null,
	mpCatFilledWith VARCHAR(75) null,
	positionClass VARCHAR(75) null,
	type_ VARCHAR(75) null,
	level VARCHAR(75) null,
	leadershipAssignment VARCHAR(75) null,
	category VARCHAR(75) null,
	subCategory VARCHAR(75) null,
	workforceCategory VARCHAR(75) null,
	empCategory VARCHAR(75) null,
	empCategoryDesc VARCHAR(1500) null,
	yearEst VARCHAR(150) null,
	reasonsFor TEXT null,
	reavailuationDate VARCHAR(150) null,
	associateNumber VARCHAR(75) null,
	associateName VARCHAR(75) null,
	associateTitle VARCHAR(75) null,
	comments TEXT null,
	typicalJobTitle TEXT null,
	minJobKnowHow TEXT null,
	duties TEXT null,
	tasksPerformed TEXT null,
	lengthOfService TEXT null,
	degree TEXT null,
	reqSkills TEXT null,
	desiredSkills TEXT null,
	environment TEXT null,
	weeklyOvertime TEXT null,
	frequencyOfTravel TEXT null,
	history TEXT null,
	other TEXT null,
	departmentManager VARCHAR(75) null,
	divisionManager VARCHAR(75) null,
	relatesTo VARCHAR(75) null,
	nextApprover TEXT null,
	workflow VARCHAR(75) null,
	workflowStep INTEGER,
	workflowId VARCHAR(75) null,
	dummy VARCHAR(75) null,
	refPosId VARCHAR(75) null,
	ismodify BOOLEAN,
	disapproveComments TEXT null
);

create table WFMS_Position_Audit (
	paId VARCHAR(75) not null primary key,
	pId VARCHAR(75) null,
	userId LONG,
	associateId VARCHAR(75) null,
	change_ TEXT null,
	fromPId VARCHAR(75) null,
	comments TEXT null,
	createdBy VARCHAR(75) null,
	createDate DATE null
);

create table WFMS_Requisition (
	rwfId VARCHAR(75) not null primary key,
	rId VARCHAR(75) null,
	companyId LONG,
	scopeGroupId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	ApprovedDate DATE null,
	createdBy VARCHAR(75) null,
	Number VARCHAR(75) null,
	associatenumber VARCHAR(75) null,
	associatename VARCHAR(75) null,
	status VARCHAR(75) null,
	postingType VARCHAR(75) null,
	teamNumber VARCHAR(75) null,
	associatetype VARCHAR(75) null,
	shiftAssign VARCHAR(75) null,
	howAvailable VARCHAR(75) null,
	whoReplaced VARCHAR(75) null,
	dateneeded VARCHAR(75) null,
	contactperson VARCHAR(75) null,
	contactphonenumber VARCHAR(75) null,
	taleonumber VARCHAR(75) null,
	other TEXT null,
	comments TEXT null,
	deleteflagStatus INTEGER,
	dummy VARCHAR(75) null,
	workflowId VARCHAR(75) null,
	nextapprove TEXT null,
	roleOfApprover VARCHAR(75) null,
	relatesTo VARCHAR(75) null,
	workflow VARCHAR(75) null,
	workflowStep INTEGER,
	approverStep INTEGER,
	refReqId VARCHAR(75) null,
	disapproveComments TEXT null
);

create table WFMS_Requisition_Audit (
	reqaId VARCHAR(75) not null primary key,
	reqId VARCHAR(75) null,
	userId LONG,
	createdBy VARCHAR(75) null,
	createDate DATE null,
	change_ VARCHAR(75) null,
	comments TEXT null
);

create table WFMS_WorkflowConfig (
	wfcId LONG not null primary key,
	createdBy VARCHAR(75) null,
	createDate DATE null,
	modifiedBy VARCHAR(75) null,
	modifiedDate DATE null,
	configKey VARCHAR(75) null,
	configLabel VARCHAR(75) null,
	contentType VARCHAR(75) null,
	content TEXT null
);

create table WFMS_action_and_reasoncode (
	aarId VARCHAR(75) not null primary key,
	action VARCHAR(75) null,
	reasonCode VARCHAR(75) null,
	description VARCHAR(500) null,
	deleteflag INTEGER,
	createdBy VARCHAR(75) null,
	createDate DATE null,
	modifiedBy VARCHAR(75) null,
	modifiedDate DATE null
);

create table WFMS_action_names (
	actionId VARCHAR(75) not null primary key,
	actionName VARCHAR(75) null,
	deleteflag INTEGER,
	createdBy VARCHAR(75) null,
	createDate DATE null,
	modifiedBy VARCHAR(75) null,
	modifiedDate DATE null
);

create table WFMS_associate_skills (
	associate_number VARCHAR(75) not null primary key,
	skills VARCHAR(75) null
);

create table WFMS_associate_skills_audit (
	associate_log_id LONG not null primary key IDENTITY,
	associate_number VARCHAR(75) null,
	userId LONG,
	createdBy VARCHAR(75) null,
	createDate DATE null,
	change_ TEXT null
);

create table WFMS_routing_and_approvers (
	rapId VARCHAR(75) not null primary key,
	action VARCHAR(75) null,
	changeDescription VARCHAR(255) null,
	currentJobCodeORLeadership VARCHAR(255) null,
	newJobCodeORLeadership VARCHAR(255) null,
	SameJobCode VARCHAR(75) null,
	SameLeadership VARCHAR(75) null,
	isSameDept VARCHAR(75) null,
	isSameMgr VARCHAR(75) null,
	routingProcess VARCHAR(255) null,
	notificationTo VARCHAR(255) null,
	deleteflag INTEGER,
	createdBy VARCHAR(75) null,
	createDate DATE null,
	modifiedBy VARCHAR(75) null,
	modifiedDate DATE null
);