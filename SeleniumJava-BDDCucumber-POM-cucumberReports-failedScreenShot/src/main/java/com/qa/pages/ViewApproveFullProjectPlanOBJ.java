package com.qa.pages;

import org.openqa.selenium.By;


/**
 * @authorID Rat105478
 * @authorName RameshRathod
 */

public class ViewApproveFullProjectPlanOBJ  {

	public static By viewApproveProjectLink = By.xpath("//a[@href='/projectSetup/view-approve-project-plan']");
	public static By preliminaryDisciplinePlanDD = By.xpath("//div[@class='custom-select-dropdown-container css-2b097c-container']/div/div[2]/div");
	public static By preliminaryDisciplinePlanDDValue = By.xpath("//div[text()='Preliminary Discipline Plan'][@tabindex='-1']");
	public static By dayScaleDD = By.xpath("//div[text()='PROJECT PLAN']");
	public static By dropdownClick = By.xpath("//div[@class='custom-select-drodpwn-scale__indicators css-1wy0on6']");
	public static By dayScaleDay = By.xpath("//ul[@class='dropdown-menu p-2']/li[1]");
	public static By dayScaleWeek = By.xpath("//ul[@class='dropdown-menu p-2']/li[2]");
	public static By dayScaleMonth = By.xpath("//ul[@class='dropdown-menu p-2']/li[3]");
	public static By zoomToFit = By.xpath("//p[text()='Zoom To Fit']");
	public static By filterIcon = By.xpath("//img[@src='/static/media/icon-filter.68e1d1d4.svg']");
	public static By clearFilter = By.xpath("//span[text()='Clear All Filters']");
	public static By firstTaskName = By.xpath("//div[@class='gantt_grid_data']/div[1]");
	public static By electricalTaskName = By.xpath("//span[text()='Electrical Load List excluding Voltage Drop Calculations-Electrical Load List excluding Voltage Drop Calculations-Common']");
	public static By processTaskName = By.xpath("//span[text()='Equipment List-']");
	public static By iandcTaskName = By.xpath("//span[text()='Instrument Index-123-processName-123-processName']");
	public static By structuralTaskName = By.xpath("//span[text()='Secondary Structural Steel Design & Model-1234-Test123-Other-Stag-Sname-1234-Test123-Other-Stag-Sname']");
	public static By equipmentTaskName = By.xpath("//span[text()='Mechanical Data Sheets-61-Civil/Structural Equipment and Materials-Compressor-equipmentNameTest-Compressor-61-Civil/Structural Equipment and Materials-Compressor-equipmentNameTest-Compressor']");
	public static By frstTaskRowClick = By.xpath("//div[text()='3D Model modeling, Interference, P&ID Check, Walk Thru - Equipment-1234-Test123-Compressor-123Tag-NameEquip-1234-Test123-Compressor-123Tag-NameEquip']");
	public static By filterformclik = By.xpath("//div[@class='dashboard-view']");
	public static By inprogressIcons = By.xpath("//img[@src='/static/media/icon-in-progress.de5854d9.svg']");
	public static By viewEditFullInformationLink = By.xpath("//div[text()='View/Edit Full Information']");
	public static By editFormLink = By.xpath("//span[text()='Edit Form']");
	public static By continuebtn = By.xpath("//button[text()='Continue']");
	public static By saveEditsButton = By.xpath("//button[text()='Save Edits']");
	public static By cancelEditsButton = By.xpath("//button[text()='Discard Edits']//parent::div//button[text()='Cancel']");
	public static By discardEditsButton = By.xpath("//button[text()='Save Edits']//parent::div//button[text()='Discard Edits']");
	public static By saveEditsButton1 = By.xpath("//button[text()='Discard Edits']//parent::div//button[text()='Save Edits']");
	
	public static By cancelButton = By.xpath("//button[text()='Cancel']");
	public static By backButton = By.xpath("//span[text()='Back']");
	public static By edit_general_budgetManhoursHrs = By.name("general_budgetManhoursHrs");
	public static By edit_PipeLineNumber = By.xpath("//div[text()='Pipe Line Number']//parent::div//div[text()='Enter Value']");
	public static By edit_disciplineSubjectSpecificOnModule = By.name("disciplineSubjectSpecific_onModule");
	
	public static By edit_criticality_activityCriticalityScoreTB = By.name("criticality_activityCriticalityScore");
	public static By edit_disciplineSubjectSpecific_onModule = By.name("disciplineSubjectSpecific_onModule");
	public static By farwardPagination = By.xpath("//button[text()='»']");
	public static By previousPagination = By.xpath("//button[text()='«']");
	public static By formclick = By.xpath("//div[@class='gantt-container']");
	public static By gantt_task_rowClick = By.xpath("//div[@class='gantt_task_row gantt_selected']");
	
	public static By wbsFields1 = By.xpath("//div[text()='WBS']//parent::div[@class='row plan-details-block']//div[@class='plan-content col-6'][1]//input");
	public static By wbsFields2 = By.xpath("//div[text()='WBS']//parent::div[@class='row plan-details-block']//div[@class='plan-content col-6'][2]//input");
	public static By wbsFields3 = By.xpath("//div[text()='WBS']//parent::div[@class='row plan-details-block']//div[@class='plan-content col-6'][3]//input");
	public static By wbsFields4 = By.xpath("//div[text()='WBS']//parent::div[@class='row plan-details-block']//div[@class='plan-content col-6'][4]//input");
	
	public static By moduleNumberNameDD = By.xpath("//div[@id='Module Number/Name']/div[1]/div[2]/div");
	public static By moduleNumberNameDDValue = By.xpath("//div[@id='Module Number/Name']/div[2]/div/div[1]");
	public static By deleteDDValue = By.xpath("//div[@id='Module Number/Name']/div[1]/div[2]/div[1]");
	public static By activityCriticalityScoreTB = By.name("criticality_activityCriticalityScore");
		
	public static By dateRadioButton = By.xpath("//span[text()='Plan Start Range']//parent::div//input");
	public static By planStartRange = By.name("Plan Start Range");
	public static By dateFormClick = By.xpath("dropdown-menu container");
	public static By structuralCheckBox = By.xpath("//span[text()='Structural']//parent::div//input");
	public static By pipingCheckBox = By.xpath("//span[text()='Piping']//parent::div//input");
	
	public static By SubstructureCheckBox = By.xpath("//span[text()='Substructure (Foundation)']//parent::div//input");
	public static By cancelButtonDate = By.xpath("//div[@class='daterangepicker ltr show-calendar opensright drop-up']/div[4]/button[text()='Cancel']");
	public static By forecastStartRange = By.name("Forecast Start Range");
	public static By applyButtonDate = By.xpath("//div[@class='daterangepicker ltr show-calendar opensright drop-up']/div[4]/button[text()='Apply']");
		
	public static By filterApplyButton = By.xpath("//button[@class='btn btn-primary text-center'][text()='Apply']");
	public static By completeButton = By.xpath("//button[text()='Complete']");
	
}
