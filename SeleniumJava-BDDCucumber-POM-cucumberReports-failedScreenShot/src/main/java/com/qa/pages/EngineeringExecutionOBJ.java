package com.qa.pages;
import org.openqa.selenium.By;


/**
 * @authorID Rat105478
 * @authorName RameshRathod
 */

public class EngineeringExecutionOBJ  {

   	public static By projectDashBoardHeader = By.xpath("//div[text()='Project Dashboard']");
   	public static By overviewMenu = By.xpath(" //button[text()='Overview']//img[@src='/static/media/gigOverview.4b11e014.svg']");
 
	public static By projectDashBoardLink = By.xpath("//img[@src='/static/media/projectDashboardInActive.ef1401c5.svg']");
	//public static By fullProjectDD = By.xpath("//span[text()='Full Project']//parent::div//img[@src='/static/media/icon-chevron-down.173655fd.svg']");
	public static By readMorelink = By.xpath("//button[text()='Read More']");
	public static By overviewSectionlnk = By.xpath("//img[@src='/static/media/gigOverview.4b11e014.svg']");
	public static By engineeringExecutionProjectCard = By.xpath("//div[@class='card-body']/p[text()='01614']");
	
	public static By linkCreation = By.xpath("//h3[text()='Quick Links']//parent::div//img[@src='/static/media/icon-pencil-blue.6a4c020f.svg']");
	public static By createNewLink = By.xpath("//span[text()='Create New Link']");
	public static By linkName = By.xpath("//input[@name='name']");
	public static By linkType = By.xpath("//input[@name='link']");
	public static By savebtn = By.xpath("//button[text()='Save']");
	public static By logHourSavebtn = By.xpath("//*[@class='logTimeSave enable'][text()='Save']");
	
	public static By assignModelSavebtn = By.xpath("//*[@class='modalPrimaryButton btn btn-primary '][text()='Save']");
	
	
	//AssignGig
	public static By gig = By.xpath("//div[@class='gantt_grid_data']/div[3]");
	public static By goToGigDashboard = By.xpath("//a[text()='Go to Gig Dashboard']");
	
	//public static By assignGigORreAssignGig = By.xpath("//button[text()='Save']//button[@class='reqTransferBtn']/img");
	public static By reAssignGig = By.xpath("//button[text()='ReAssign']");
	public static By assignGig = By.xpath("//button[text()='Assign']");
	public static By assignedToDD = By.xpath("//div[@class='customSelect__indicators css-1wy0on6']/div");
	public static By gcDDV = By.xpath("//div[@class='css-1g6gooi']/div/input");
	public static By cancelbtn = By.xpath("//button[text()='Cancel']");
	
	//editGig
	public static By gigInfoEditIcon = By.xpath("//span[text()='gig info']//parent::div//img[@src='/static/media/icon-pencil-blue.6a4c020f.svg']");
	public static By forcastStartDt  = By.xpath("//div[text()='Forecast Start Date']//parent::div//input");
	public static By forcastFinishDt  = By.xpath("//div[text()='Forecast Finish Date']//parent::div//input");
	public static By saveeditbtn = By.xpath("//button[text()='Save Edits']");
	
	//logHours
	public static By logtextbox = By.xpath("//input[@type='number']");
	
	//gigReferences 
	public static By gigReferencesEditicon = By.xpath("//span[text()='GIG REFERENCES']//parent::div//img[@src='/static/media/icon-pencil-blue.6a4c020f.svg']");
	
	
	//GCrole
	
	public static By firstGig = By.xpath("//div[@class='row flex-nowrap overflow-auto m-0 mb-4 py-4 widget-cards-wrapper']/div[1]");
	public static By startGig = By.xpath("//button[text()='Start Gig']");
	public static By requestTransfer = By.xpath("//button[text()='Request Transfer']");
	public static By holdGig = By.xpath("//button[text()='Hold Gig']");
	public static By reasonTextbox = By.xpath("//div[@class='customSelect__value-container css-1hwfws3']/div/div/input");
	public static By commentTextbox = By.name("comment");
	public static By sendbtn = By.xpath("//button[text()='Send']");
	public static By resumeGig = By.xpath("//button[text()='Resume Gig']");
	public static By cancelRequest = By.xpath("//button[text()='Cancel Request']");
	public static By yesCancel = By.xpath("//button[text()='Yes']");
	public static By noCancel = By.xpath("//button[text()='No']");
	
	//filter
	public static By pipingDisciplineCH = By.xpath("//span[text()='Piping']");
    public static By pipingcheckbox = By.xpath("//span[text()='Piping']//parent::div//input");
    public static By processcheckbox = By.xpath("//span[text()='Process']//parent::div//input");
    public static By structuralcheckbox = By.xpath("//span[text()='Structural']//parent::div//input");
    public static By electricalcheckbox = By.xpath("//span[text()='Electrical']//parent::div//input");
    public static By InCcheckbox = By.xpath("//span[text()='I&C']//parent::div//input");
    public static By equipmentcheckbox = By.xpath("//span[text()='Equipment']//parent::div//input");
  		
	//ProjectDashBoard wbsList as a PLI/DPS role		
	public static By wbsInfoLink = By.xpath("//button[text()='WBS Info']");	
	public static By wbsInfoDropdwn = By.xpath("//div[@class='css-1g6gooi']/div/input");			
	public static By editListbtn = By.xpath("//button[text()=' Edit List']");
	public static By addRowbtn = By.xpath("//span[text()=' Add Row']");	
	public static By saveEditbtn = By.xpath("//button[text()='Save Edits']");
	public static By rowClick = By.xpath("//tr[@class='table-row']");
	public static By cwaID = By.name("wbsTable[0].cwaId");
	public static By cwaName = By.name("wbsTable[0].cwaName");
	public static By cwaID1 = By.name("wbsTable[1].cwaId");
	public static By cwaName1 = By.name("wbsTable[1].cwaName");
	public static By deleteIcon = By.xpath("//tr[@class='table-row'][1]/td[3]/img");
	public static By deleteIcon1 = By.xpath("//tr[@class='table-row'][1]/td[4]/img");
	public static By deleteIcon2 = By.xpath("//img[@src='/static/media/trash.ca7161ca.svg']");
	
	public static By addFieldIcon = By.xpath ("//span[text()=' Add Field']");
	public static By newlyAddedFieldTextBox = By.xpath ("//p[text()='Automation Test * ']//parent::div//input");
	//ProjectDashBoard projectInfo as a PLI/DPS role		
		public static By projectInfoLink = By.xpath("//button[text()='Project Info']");	
		public static By proposalProjectRiskScore = By.name("basicProjectData.proposalProjectRiskScore");
		public static By editFormbtn = By.xpath("//button[text()=' Edit Form']"); 
		

		/**
		 * @role projectUser
		 * @header Input/Outputs
		 * @section projectOutputs
		 */
		public static By projectOutputLink = By.xpath("//button[text()='Project Outputs']");	
		//filter
	    public static By specialityGroupCheckbox = By.xpath("//span[text()='Speciality Group']//parent::div//input");
	    public static By actualCheckbox = By.xpath("//span[text()='Actual']//parent::div//input");
	    public static By notReadyCheckbox = By.xpath("//span[text()='Not-Ready']//parent::div//input");
	    public static By searchIcon = By.xpath("//div/img[@src='/static/media/search.b6d30596.svg']");
	    public static By searchTextBox = By.xpath("//span[@class='search-input-container']/input");
	    public static By searchClearIcon = By.xpath("//img[@src='/static/media/xCircleFill.fab3e1a4.svg']");
	  
	    
	    public static By gigInfoLink = By.xpath(" //button[text()='Gig Info']");
	   
	    public static By gigReferencesLink = By.xpath(" //button[text()='Gig References']");
	    public static By addReferenceBtn = By.xpath(" //span[text()='Add Reference']");
	    public static By gigRefeEditListbtn = By.xpath("//p[text()='Edit List']");
	    public static By referenceNameDD = By.xpath("//div[@class='css-1g6gooi']/div/input");
	    public static By referenceGigdeleteIcon = By.xpath("//tbody/tr/td[5]/img");
	    public static By proceedbtn = By.xpath("//button[text()='Proceed']");
	    
	    
	    
	    public static By discussionLink = By.xpath(" //button[text()='Discussion']");
	    public static By disscussionTextBox = By.xpath("//div[@class='mentions__control']/textarea");

	    public static By discardBtn = By.xpath("//button[text()='Discard Edits']");
	    public static By gigEditForm = By.xpath("//span[text()='Edit Form']");
	    
	 //myProjectHomePage
	    public static By logTimeDD = By.xpath("//select[@class='logTimeDropdown']");
	    public static By hoursTextBox = By.xpath("//input[@class='logTimeSpent ']");
	    public static By myGigsSection = By.xpath("//button[text()='My Gigs']");
	    public static By notReadyChckbox = By.xpath("//input[@value='Not-Ready']");
	    public static By readyTostrtChckbox = By.xpath("//input[@value='Ready to Start']");
	    public static By applyButton = By.xpath("//button[text()='Apply']");
	 
	 
	  //gigInfo
	    public static By displayChangesFormDD = By.xpath("//div[@class='discipline-select-drodpwn__indicators css-1wy0on6']/div");
	    public static By displayChangesFormDDValue = By.xpath("//*[text()='Baseline Project Plan'][@tabindex='-1']");
	  
	    //Equipment
	    public static By EquipmentTagColumnTextBox = By.name("wbsTable[0].equipmentTag");
		public static By EquipmentNameColumnTextBox = By.name("wbsTable[0].equipmentName");
		public static By equipmentTypedropDown = By.xpath("//td[@data-id='equipmentType']/div/div/div[1]/div[2]/div/input");
		public static By purchaseSpecificationNumberNamedropDown = By.xpath("//td[@data-id='purchaseSpecificationNumberName']/div/div/div[1]/div[2]/div/input");
		public static By processAreaIdNamedropDown = By.xpath("//td[@data-id='processAreaIdName']/div/div/div[1]/div[2]/div/input");
		

	 
	    
	    //electrical
	    public static By electricalSystemsName = By.name("wbsTable[0].electricalSystemsName");
	  
	    //Structural
	    public static By foundationTag = By.name("wbsTable[0].foundationTag");
		public static By foundationName = By.name("wbsTable[0].foundationName");
		public static By foundationType = By.xpath("//td[@data-id='foundationType']/div/div/div[1]/div[2]/div/input");
		public static By cwaNumberNameDropDown = By.xpath("//td[@data-id='cwaNumberName']/div/div/div[1]/div[2]/div/input");
//I&C
		public static By instrumentTypeDD = By.xpath("//div[@class=' css-2b097c-container']/div/div[1]/div[2]/div/input");
		
	// Input/output header
		public static By editOutputbtn = By.xpath("//span[text()='Edit Outputs']");
		public static By outputTextbx = By.xpath("//div[@class='bv-text-field-container']/div/input");
		public static By valueTypeTB = By.xpath("//div[text()='Select...']//parent::div//parent::div//parent::div//parent::span//parent::td//parent::tr/td[2]//div[@class='css-1g6gooi']/div/input");
		public static By uomTypeTB = By.xpath("//div[text()='Select...']//parent::div//parent::div//parent::div//parent::span//parent::td//parent::tr/td[3]//div[@class='css-1g6gooi']/div/input");
		public static By responsibleDisciplineTB = By.xpath("//div[text()='Select...']//parent::div//parent::div//parent::div//parent::span//parent::td//parent::tr/td[13]//div[@class='css-1g6gooi']/div/input");
	    public static By originTB = By.xpath("//div[text()='Select...']//parent::div//parent::div//parent::div//parent::span//parent::td//parent::tr/td[15]//div[@class='css-1g6gooi']/div/input");
	    public static By originGigTB = By.xpath("//div[text()='Select...']//parent::div//parent::div//parent::div//parent::span//parent::td//parent::tr/td[16]//div[@class='css-1g6gooi']/div/input");
	  
		public static By baseNameTB = By.xpath("//div[text()='Select...']//parent::div//parent::div//parent::div//parent::span//parent::td//parent::tr/td[17]//div[@class='css-1g6gooi']/div/input");
		public static By deliverableTypeTB = By.xpath("//div[text()='Select...']//parent::div//parent::div//parent::div//parent::span//parent::td//parent::tr/td[18]//div[@class='css-1g6gooi']/div/input");
		public static By fileTypeTB = By.xpath("//div[text()='Select...']//parent::div//parent::div//parent::div//parent::span//parent::td//parent::tr/td[19]//div[@class='css-1g6gooi']/div/input");
		public static By purposeTB = By.xpath("//div[text()='Select...']//parent::div//parent::div//parent::div//parent::span//parent::td//parent::tr/td[20]//div[@class='css-1g6gooi']/div/input");
		
		public static By outputTextbxedit = By.xpath("//input[@value='Test123']");
		public static By deletebtn = By.xpath("//button[text()='Delete']");
		public static By editIcon = By.xpath("//*[text()='Test123']//parent::span//parent::span//parent::td//parent::tr//img[@class='edit-icon']");
		public static By deleteIconInOut = By.xpath("//*[text()='Test1231']//parent::span//parent::span//parent::td//parent::tr//img[@class='delete-icon']");

// My Work item 
		public static By vievingDD = By.name("viewingDropDown");
		public static By urgencyDD = By.name("urgencyDropDown");
		
	//Required input
		public static By editRequiredInp = By.xpath("//img[@class='editRequiredInp']");
		public static By addInputBtn = By.xpath("//button[@class='addButton create-link']/span");
		public static By addInputDD = By.xpath("//div[@class='css-1g6gooi']/div/input");
		public static By saveBtn = By.xpath("//*[@class='modalPrimaryButton btn btn-primary '][text()='Save']");
		public static By addInputdeleteIcon = By.xpath("//img[@class='deleteIcon']");
		
		//laminarScope
		public static By dotedIcon = By.xpath("//thead/tr/th[4]/div/div/span[@class='k-icon k-i-more-vertical']");
		public static By selectItemPerPage = By.xpath("//span[@class='k-dropdown-wrap k-state-default']/select");
		public static By farwardIcon = By.xpath("//span[@class='k-icon k-i-arrow-60-right']");
		public static By previousIcon = By.xpath("//span[@class='k-icon k-i-arrow-60-left']");
		public static By sortAscending = By.xpath("//div[text()='Sort Ascending']");
		public static By sortDescending = By.xpath("//div[text()='Sort Descending']");
		public static By filter = By.xpath("//div[text()='Filter']");
		public static By filterInputbox = By.xpath("//div[@class='k-filter-menu-container']/div/div/input");
		public static By filterBtn = By.xpath("//div[@class='k-columnmenu-actions']/button[text()='Filter']");
		public static By clearbtn = By.xpath("//div[@class='k-columnmenu-actions']/button[text()='Clear']");
		public static By firstgGigClick = By.xpath("//tbody/tr[1]/td[3]/a");
		
	
}
