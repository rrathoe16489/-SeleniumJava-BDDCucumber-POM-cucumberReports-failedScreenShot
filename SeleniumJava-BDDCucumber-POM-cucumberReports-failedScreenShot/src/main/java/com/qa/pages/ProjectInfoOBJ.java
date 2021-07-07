package com.qa.pages;

import org.openqa.selenium.By;

/**
 * @authorID Rat105478
 * @authorName RameshRathod
 */

public class ProjectInfoOBJ {

	 
	public static By LABEL_USERNAME = By.name("userEmail");
	public static By LABEL_PASSWORD = By.name("password");
	
	//superUser
	public static By createNewProject = By.xpath("//button[text()='Create New Project']");
	public static By projectNumberTextBox = By.name("projectNumber");
	public static By projectNameTextBox = By.name("projectName");
	public static By createButton = By.xpath("//button[text()='Create']");
	
	public static By SIGNINBUTTON = By.xpath("//button[text()='Sign In']");
	//public static By PROJECTSELECTIONTesting = By.xpath("//div[@class='card-body']/p[text()='667788']");
	public static By PROJECTSELECTIONTesting = By.xpath("//div[@class='card-body']/p[text()='054156']");
	public static By PROJECTSETUP_TOPTEXT = By.xpath("//div[text()='Project Set-Up']");
	public static By projectInformation_headerName = By.xpath("//div[text()='Project Information']");
	public static By PROJECTINFORMATION_HEADER= By.xpath("//a[@href='/projectSetup/ProjectInformation']");
	public static By wbsInformation_headerName = By.xpath ("//div[text()='WBS Information']");
	public static By WBSInformationHeader = By.xpath("//div[text()='WBS Information']");
	public static By manHourBudgets_headerName = By.xpath ("//div[text()='Manhour Budgets']");
	public static By MANHOURBUDGETS_HEADER = By.xpath ("//div[@class='step-title' and contains(text(),'Manhour Budgets')]");
	public static By referenceLibrary_headerName = By.xpath ("//div[text()='Reference Library']");
	public static By ReferenceLibraryHeader = By.xpath("//a[@href='/projectSetup/referenceLibrary/']");
	public static By workFlowRule_headerName = By.xpath ("//div[text()='Workflow Rules']");
	public static By WORKFLOWRULE_HEADER= By.xpath ("//div[@class='step-title' and contains(text(),'Workflow Rules')]");
	public static By assignTeam_headerName = By.xpath ("//div[text()='Assign Team']");
	public static By ASSIGNTEAM_HEADER = By.xpath ("//div[@class='step-title' and contains(text(),'Assign Team')]");
	
	public static By BREADCRUMB_TEXT= By.xpath ("//a[text()='Home']/parent::div/span[text()='Project Infomation']");
	public static By PROJECTINFORMATION_SECTION = By.xpath ("//p[text()='General Project Information']//parent::li//parent::ul/li/span[text()='Project Information']");
	public static By GENERALPROJECTINFORMATION_SECTION= By.xpath ("//p[text()='Project Scope']//parent::li//parent::ul//p[text()='General Project Information']");
	public static By PROJECTSCOPE_SECTION= By.xpath ("//p[text()='Technical Requirements']//parent::li//parent::ul//p[text()='Project Scope']");
	public static By TECHNICALREQUIREMENT_SECTION= By.xpath ("//p[text()='Project Scope']//parent::li//parent::ul//p[text()='Technical Requirements']");
	public static By LAMINAR_LOGO1 = By.xpath ("//div[@class='sidebar-image']/img[1]");
	public static By LAMINAR_LOGO2= By.xpath ("//div[@class='sidebar-image']/img[2]");
	public static By SaveDisable= By.xpath ("//*[@class='save-button buttonDisabled'][@disabled='']");
	
	/* Below Xpath for the General project information Subsection */
	public static By generalPISubsectionTitle = By.xpath ("//p[text()='Basic Project Data']");
	public static By addFieldIcon1= By.xpath ("//p[text()='Basic Project Data']//parent::div//img");
	public static By projectNameFN = By.xpath ("//p[text()='Project Number']//parent::div//parent::div//p[text()='Project Name']");
	public static By projectNameTF= By.xpath ("//p[text()='Project Name']//parent::div//input");
	public static By projectNumberFN = By.xpath ("//p[text()='Project Name']//parent::div//parent::div//p[text()='Project Number']");
	public static By projectNumberTF= By.xpath ("//p[text()='Project Number']//parent::div//input");
	public static By projectTypeFN = By.xpath ("//p[text()='Project Name']//parent::div//parent::div//p[text()='Project Type']");
	public static By projectTypeDropDown= By.xpath ("//p[text()='Project Type']//parent::div//div[@class=' css-1wy0on6']/div");
	public static By projectTypeDropDownValue= By.xpath ("//div[text()='EPC']");

	public static By typeofFacilityFN = By.xpath ("//p[text()='Project Name']//parent::div//parent::div//p[text()='Type of Facility']");
	public static By typeofFacilityDropDown= By.xpath ("//p[text()='Type of Facility']//parent::div//div[@class=' css-1wy0on6']/div");
	public static By typeofFacilityDropDownValue= By.xpath ("//div[text()='LNG']");
	public static By typeofFacilityDropDownOtherValue= By.xpath ("//div[text()='Other']");
	
	public static By supportingOfficesFN = By.xpath ("//p[text()='Project Name']//parent::div//parent::div//p[text()='Supporting Offices']");
	public static By supportingOfficesDropDown= By.xpath ("//p[text()='Supporting Offices']//parent::div//div[@class=' css-1wy0on6']/div");
	public static By supportingOfficesDropDownValue= By.xpath ("//div[text()='Mumbai']");
	
	public static By riskAssessmentCompletedFN = By.xpath ("//p[text()='Project Name']//parent::div//parent::div//p[text()='Risk Assessment Completed?']");
	public static By riskAssessmentCompletedYRB= By.xpath ("//p[text()='Risk Assessment Completed?']//parent::div//input[@value='Yes']");
	public static By riskAssessmentCompletedNRB = By.xpath ("//p[text()='Risk Assessment Completed?']//parent::div//input[@value='No']");
	public static By proposalProjectRiskScoreFN= By.xpath ("//p[text()='Project Name']//parent::div//parent::div//p[text()='Proposal Project Risk Score']");
	public static By proposalProjectRiskScoreTF = By.xpath ("//p[text()='Proposal Project Risk Score']//parent::div//input");
	public static By proposalProjectRiskLevelFN= By.xpath ("//p[text()='Project Name']//parent::div//parent::div//p[text()='Proposal Project Risk Level']");
	public static By proposalProjectRiskLevelTF = By.xpath ("//p[text()='Proposal Project Risk Level']//parent::div//input");
	public static By leadOfficeFN= By.xpath ("//p[text()='Project Name']//parent::div//parent::div//p[text()='Lead Office']");
	public static By leadOfficeDropDown = By.xpath ("//p[text()='Lead Office']//parent::div//div[@class=' css-1wy0on6']/div");
	public static By leadOfficeDropDownValue= By.xpath ("//div[text()='Denver']");
	
	public static By facilityTechnologyFN= By.xpath ("//p[text()='Project Name']//parent::div//parent::div//p[text()='Facility Technology']");
	public static By facilityTechnologyTF = By.xpath ("//p[text()='Facility Technology']//parent::div//input");
	public static By contractAwardDateFN= By.xpath ("//p[text()='Project Name']//parent::div//parent::div//p[text()='Contract Award Date']");

	public static By contractAwardDateDropDown = By.xpath ("//p[text()='Project Name']//parent::div//parent::div//p[text()='Contract Award Date']");
	public static By constructionContractTypeFN= By.xpath ("//p[text()='Project Name']//parent::div//parent::div//p[text()='Construction Contract Type']");
	public static By constructionContractTypeDropDown = By.xpath ("//p[text()='Construction Contract Type']//parent::div//div[@class=' css-1wy0on6']/div");
	public static By constructionContractTypeDropDownValue= By.xpath ("//div[text()='Direct Hire']");
	
	public static By clientNameFN= By.xpath ("//p[text()='Project Name']//parent::div//parent::div//p[text()='Client Name']");
	public static By clientNameTF = By.xpath ("//p[text()='Client Name']//parent::div//input");
	public static By brownFieldFN= By.xpath ("//p[text()='Project Name']//parent::div//parent::div//p[text()='Brown Field / Green Field']");
	public static By brownFieldBFRB = By.xpath ("//p[text()='Brown Field / Green Field']//parent::div//input[@value='Brown Field']");
	public static By brownFieldGFRB= By.xpath ("//p[text()='Brown Field / Green Field']//parent::div//input[@value='Green Field']");
	public static By brownFieldCRB = By.xpath ("//p[text()='Brown Field / Green Field']//parent::div//input[@value='Combination']");
	public static By isBlackAndVeatchFN= By.xpath ("//p[text()='Project Name']//parent::div//parent::div//p[text()='Is Black & Veatch responsible for JV Reporting / Coordination?']");
	public static By isBlackAndVeatchYRB = By.xpath ("//p[text()='Is Black & Veatch responsible for JV Reporting / Coordination?']//parent::div//input[@value='Yes']");
	public static By isBlackAndVeatchNRB= By.xpath ("//p[text()='Is Black & Veatch responsible for JV Reporting / Coordination?']//parent::div//input[@value='No']");

	public static By areThereForiegnContractFN = By.xpath ("//p[text()='Project Name']//parent::div//parent::div//p[text()='Are there Foriegn Contract and Tax Issues?']");
	public static By areTheresForiegnContractYRB= By.xpath ("//p[text()='Are there Foriegn Contract and Tax Issues?']//parent::div//input[@value='Yes']");
	public static By areTheresForiegnContractNRB = By.xpath ("//p[text()='Are there Foriegn Contract and Tax Issues?']//parent::div//input[@value='No']");
	
	public static By projectLocationSubSectionTitle= By.xpath ("//p[text()='Project Location']");
	public static By addFieldIcon2 = By.xpath ("//p[text()='Project Location']//parent::div//img");
	public static By addFieldIcon = By.xpath ("//img[@src='/static/media/add.b23f718f.svg']");
	public static By projectLocationStateFN= By.xpath ("//p[text()='Project Location Country']//parent::div//parent::div//p[text()='Project Location State/Province']");
	public static By projectLocationStateTF = By.xpath ("//p[text()='Project Location State/Province']//parent::div//input");
	public static By projectLocationCountryFN= By.xpath ("//p[text()='Project Location State/Province']//parent::div//parent::div//p[text()='Project Location Country']");
	public static By projectLocationCountryTF = By.xpath ("//p[text()='Project Location Country']//parent::div//input");
	public static By projectLocationCityFN= By.xpath ("//p[text()='Project Location State/Province']//parent::div//parent::div//p[text()='Project Location City']");
	public static By projectLocationCityTF = By.xpath ("//p[text()='Project Location City']//parent::div//input");
	
	public static By keyScheduleDatesSubSectionTitle= By.xpath ("//p[text()='Key Schedule Dates']");
	public static By addFieldIcon3= By.xpath ("//p[text()='Key Schedule Dates']//parent::div//img");
	public static By projectExecutionStartDateFN = By.xpath ("//p[text()='Est. Engineering Timeframe (Months)']//parent::div//parent::div//p[text()='Project Execution Start Date']");
	public static By projectExecutionStartDate= By.xpath ("//a[text()='date']");
	public static By engineeringTimeframeFN = By.xpath ("//p[text()='Project Execution Start Date']//parent::div//parent::div//p[text()='Est. Engineering Timeframe (Months)']");
	public static By engineeringTimeframeTF= By.xpath ("//p[text()='Est. Engineering Timeframe (Months)']//parent::div//input");
	public static By constructionTimeframeFN = By.xpath ("//p[text()='Project Location State/Province']//parent::div//parent::div//p[text()='Est. Construction Timeframe (Months)']");
	public static By constructionTimeframeTF= By.xpath ("//p[text()='Est. Construction Timeframe (Months)']//parent::div//input");
	
	//Reset
	public static By resetPageModal= By.xpath ("//span[text()='Reset Page']");
	public static By resetMessage= By.xpath ("//div[text()='Reset will revert all displayed information to the last saved version. Continue?']");
	public static By continueButton = By.xpath ("//button[text()='Cancel']//parent::div//button[text()='Continue']");
	public static By cancelButton= By.xpath ("//button[text()='Continue']//parent::div//button[text()='Cancel']");
	
	//Page Leaving message
	public static By leavingMessage= By.xpath ("//div[text()='Save the form before leaving the page']");
	public static By saveMessage= By.xpath ("//div[text()='Your form has been saved']");
	public static By GPICheckedMark= By.xpath ("//p[text()='General Project Information']//parent::li//img[@class='sideMenuIcon']");
	public static By GPIUnCheckedMark= By.xpath ("//p[text()='General Project Information']//parent::li//span[@class='sideMenuIcon circle-white']");
	
	//AdField Modal
	public static By modalTitle= By.name("//div[text()='Add Field']");
	public static By fieldNameTextBox= By.name("fieldName");
	//public static By addedField= By.xpath("//p[text()='Automation Edit * ']");
	public static By valueTypeDropDown= By.name("valueType");
	public static By addfieldSaveButton= By.xpath ("//button[text()='Cancel']//parent::div//button[text()='Save']");
	public static By addfieldCancelButton= By.xpath ("//button[text()='Save']//parent::div//button[text()='Cancel']");
	public static By addFieldCrossIcon= By.xpath ("//div[text()='Add Field']//parent::div/img");
	
	public static By validationError1= By.xpath ("//div/span[text()='Required']");
	public static By validationError2= By.xpath ("//span/span[text()='Required']");
	public static By duplicateErrorMessage= By.xpath ("//div/span[text()='Name Exists']");
	
	//UMO
	public static By UOMTypeText= By.xpath ("//div[text()='UOM Type * ']");
	public static By UOMTText= By.xpath ("//div[text()='UOM * ']");
	public static By UOMTypeDropDown= By.name ("UOMType");
	public static By UOMDropDown= By.name ("UOM");
	
	//newly Added field
	public static By newlyAddedField= By.xpath ("//p[text()='Testing Automation * ']");
	public static By newlyAddedFieldTextBox = By.xpath ("//p[text()='Testing Automation * ']//parent::div//input");
	public static By newlyAddedCrossIcon = By.xpath ("//p[text()= 'Automation Edit * ']//parent::div//img[@src='/static/media/xCircleFill.fab3e1a4.svg']");
	public static By newlyAddedFieldEditIcon = By.xpath ("//p[text()='Testing Automation * ']//parent::div//img[@src='/static/media/edit.51713523.svg']");
	public static By validationErrorMessageForNumeric = By.xpath ("//span[text()='Must be a number']");
	public static By newlyAddedFieldEdited= By.xpath ("//p[text()='Automation Edit * ']");
	
	//Project Scope section
	public static By frontEndEngineering1= By.xpath ("//p[text()='Front-End Engineering Design completed']//parent::div//input[@value='Yes']");
	public static By DetailedEngineering = By.xpath ("//p[text()='Detailed Engineering by Black & Veatch']//parent::div//input[@value='Yes']");
	public static By Procurementby= By.xpath ("//p[text()='Procurement by Black & Veatch']//parent::div//input[@value='Yes']");
	public static By ConstructionManagement = By.xpath ("//p[text()='Construction Management by Black & Veatch']//parent::div//input[@value='Yes']");
	public static By ConstructionLiaison = By.xpath ("//p[text()='Construction Liaison Only by Black & Veatch']//parent::div//input[@value='Yes']");
	public static By ConstructionbyBlack =By.xpath ("//p[text()='Construction by Black & Veatch']//parent::div//input[@value='Yes']");
	public static By ConstructabilityCoordinator = By.xpath ("//p[text()='Constructability Coordinator']//parent::div//input[@value='Yes']");
	public static By StartupbyBlack  = By.xpath ("//p[text()='Startup by Black & Veatch']//parent::div//input[@value='Yes']");
	public static By StartupSupport = By.xpath ("//p[text()='Startup Support by Black & Veatch']//parent::div//input[@value='Yes']");
	public static By OperatorTraining = By.xpath ("//p[text()='Operator Training by Black & Veatch']//parent::div//input[@value='Yes']");
	public static By PerformanceResponsibility =By.xpath ("//div[@class='css-1g6gooi']/div/input");
	public static By SupplierInvoice = By.xpath ("//input[@name='generalScopeData.supplierSubcontractorInvoiceProcessing'][@value='Yes']");
	public static By MaterialsManagement  = By.xpath ("//p[text()='Materials Management Coordination by Black & Veatch']//parent::div//input[@value='Yes']");
	public static By MarineScope =By.xpath ("//p[text()='Marine Scope by Black & Veatch']//parent::div//input[@value='Yes']");
	public static By ProjectEngineering = By.xpath ("//p[text()='Project Engineering Manager Required']//parent::div//input[@value='Yes']");
	public static By ProjectControls  = By.xpath ("//p[text()='Project Controls Manager Required']//parent::div//input[@value='Yes']");
	
	//Technical Requirements
	public static By unitSystemDropDown= By.xpath ("//div[@class='form-row']/div[1]/div/div/div/div[2]/div/input");
	//public static By unitSystemDropDownValue= By.xpath ("//div[text()='English Units']");
	public static By authorityHaving= By.xpath ("//div[@class='form-row']/div[2]/div/div/div/div[2]/div/input");
	public static By CompanyLicenseRequired = By.xpath ("//p[text()='Company License Required in Border?']//parent::div//input[@value='Yes']");
	public static By stateRegCode = By.xpath ("//div[@class='form-row']/div[4]/div/div/div/div[2]/div/input");
	public static By PhysicalDesignApproach =By.xpath ("//p[text()='Physical Design Approach (2D/3D)']//parent::div//input[@value='2D']");
	public static By AWPusedonproject = By.xpath ("//p[text()='AWP used on project']//parent::div//input[@value='Yes']");
	public static By Modulesonproject  = By.xpath ("//p[text()='Modules on project']//parent::div//input[@value='Yes']");

 //project Control
	public static By costTrackingSoftwareTB  = By.xpath ("//div[@class='form-row']/div[1]/div/div/div/div[2]/div/input");
	//public static By staffingSoftware  = By.xpath ("//div[text()='Staffing Software']//parent::div//input[@tabindex='0']");

	//Procurements
	
	public static By materialTracking  = By.xpath ("//div[@class='form-row']/div[1]/div/div/div/div[2]/div/input");
	//public static By procurementTracking  = By.xpath ("//div[text()='Procurement Tracking Software']//parent::div//input[@tabindex='0']");
	public static By procurementCheckedMark= By.xpath ("//p[text()='Procurement']//parent::li//img[@class='sideMenuIcon']");
	public static By projectControlsCheckedMark= By.xpath ("//p[text()='Project Controls']//parent::li//img[@class='sideMenuIcon']");
	public static By technicalRequirementsCheckedMark= By.xpath ("//p[text()='Technical Requirements']//parent::li//img[@class='sideMenuIcon']");
	public static By projectScopeCheckedMark= By.xpath ("//p[text()='Project Scope']//parent::li//img[@class='sideMenuIcon']");
	public static By generalProjectInformationCheckedMark= By.xpath ("//p[text()='General Project Information']//parent::li//img[@class='sideMenuIcon']");
	public static By completeHeaderIconProjectInfo  = By.xpath ("//div[text()='Project Information']//parent::a//img[@src='/static/media/completed.0bc5e4c8.svg']");
	
	//Piping DPS
	public static By projectControls_Section = By.xpath ("//p[text()='Project Controls']");
	public static By electrical_Section = By.xpath ("//p[text()='Electrical']");
	public static By IandC_Section = By.xpath ("//p[text()='I&C']");
	public static By process_Section = By.xpath ("//p[text()='Process']");
	public static By procurement_Section = By.xpath ("//p[text()='Procurement']");
	public static By structural_Section = By.xpath ("//p[text()='Structural']");
	
	public static By piping_Section = By.xpath ("//p[text()='Piping']");
	public static By pipingCheckedMark= By.xpath ("//p[text()='Piping']//parent::li//img[@class='sideMenuIcon']");
	public static By pipingUnCheckedMark= By.xpath ("//p[text()='Piping']//parent::li//span[@class='sideMenuIcon circle-white']");
	public static By stressAnalysisSoftwareTextBox = By.id ("react-select-4-input");
	public static By threeDDesingTextBox = By.id ("react-select-3-input");
	
	public static By formInfo = By.xpath ("//div[@class='projectInformationFormDiv']");
	
	//process
	public static By designReviewDD = By.id ("//p[text()='Design Review Facilitation (HAZID/ PHA/HAZOP)']//parent::div//div[@class=' css-tlfecz-indicatorContainer']");
	public static By designReviewDDValue = By.xpath ("//div[@class=' css-1n7v3ny-option'][@tabindex='-1']");
	public static By processDataSoftwareTextBox = By.xpath ("//div[text()='Process Data Software ']//parent::div//input");
	public static By plantCapacityTextBox = By.xpath ("//input[@placeholder='Plant Capacity']");
	public static By processCheckedMark= By.xpath ("//p[text()='Process']//parent::li//img[@class='sideMenuIcon']");
	

	public static By RESET_BUTTON= By.xpath ("//button[text()='Reset']");
	public static By SAVE_BUTTON = By.xpath ("//button[text()='Save']");
	public static By COMPLETE_BUTTON= By.xpath ("//button[text()='Complete']");
	public static By EDIT_BUTTON= By.xpath ("//button[text()='Edit']");
	
	
}
