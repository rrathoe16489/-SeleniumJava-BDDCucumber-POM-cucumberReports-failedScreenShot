package com.qa.pages;

import org.openqa.selenium.By;

/**
 * @authorID Rat105478
 * @authorName RameshRathod
 */

public class WBSInformationOBJ  {

	public static By userName = By.name("userEmail");
	
	public static By addRowButton = By.xpath("//span[@class='addWbsRow']/img");
	public static By CWANumberTextBox = By.name("wbsTable[0].cwaId");
	public static By CWANameTextBox = By.name("wbsTable[0].cwaName");
	
	
	public static By moduleNumberColumnTextBox = By.name("wbsTable[0].moduleNumber");
	public static By moduleNameColumnTextBox = By.name("wbsTable[0].moduleName");
	public static By CWANumberNameColumnDD = By.xpath("//th[text()='CWA Number/Name']//parent::tr//parent::thead//parent::table//td[3]//div[@class='css-1g6gooi']/div/input");
	
	public static By purchaseSpecificationNumberColumnDropDown = By.xpath("//div[@class='css-1g6gooi']/div/input");
	
	public static By processAreaId = By.name("wbsTable[0].processAreaId");
	public static By processAreaName = By.name("wbsTable[0].processAreaName");
	
	public static By EquipmentTagColumnTextBox = By.name("wbsTable[0].equipmentTag");
	public static By EquipmentNameColumnTextBox = By.name("wbsTable[0].equipmentName");
	public static By equipmentTypedropDown = By.xpath("//th[text()='Equipment Type']//parent::tr//parent::thead//parent::table//td[3]//div[@class='css-1g6gooi']/div/input");
	public static By purchaseSpecificationNumberNamedropDown = By.xpath("//th[text()='Equipment Type']//parent::tr//parent::thead//parent::table//td[4]//div[@class='css-1g6gooi']/div/input");
	public static By processAreaIdNamedropDown = By.xpath("//th[text()='Equipment Type']//parent::tr//parent::thead//parent::table//td[5]//div[@class='css-1g6gooi']/div/input");
	public static By cwaNumberNameDropDown = By.xpath("//th[text()='Equipment Type']//parent::tr//parent::thead//parent::table//td[6]//div[@class='css-1g6gooi']/div/input");

	public static By philosophyDocumentNumber = By.name("wbsTable[0].philosophyDocumentNumber");
	public static By philosophyDocumentName = By.name("wbsTable[0].philosophyDocumentName");

	public static By studyNumber = By.name("wbsTable[0].studyNumber");
	public static By studyName = By.name("wbsTable[0].studyName");

	public static By PipeSpecificationList = By.xpath("//p[text()='Tie-in Priority List']//parent::li//parent::ul//p[text()='Pipe Specification List']");
	public static By pipeSpecificationNumber = By.name("wbsTable[0].pipeSpecificationNumber");
	public static By pipeSpecificationMaterial = By.name("wbsTable[0].pipeSpecificationMaterial");
	public static By pipeSpecificationClass = By.name("wbsTable[0].pipeSpecificationClass");
	
	public static By tieInPriority = By.name("wbsTable[0].tieInPriority");
	
	public static By fluidName = By.name("wbsTable[0].fluidName");
	
	public static By deleteIcon = By.id("deleteRow");
	
	public static By continueButton = By.xpath("//button[text()='Continue']");
	public static By RESET_BUTTON= By.xpath ("//button[text()='Save']//parent::div//button[text()='Reset']");
	public static By SAVE_BUTTON = By.xpath ("//button[text()='Save']");
	public static By COMPLETE_BUTTON= By.xpath ("//button[text()='Complete']");
	public static By EDIT_BUTTON= By.xpath ("//button[text()='Edit']");
	public static By completeWBSHeader = By.xpath("//div[text()='WBS Information']//parent::a//img[@src='/static/media/completed.0bc5e4c8.svg']");
	
}
