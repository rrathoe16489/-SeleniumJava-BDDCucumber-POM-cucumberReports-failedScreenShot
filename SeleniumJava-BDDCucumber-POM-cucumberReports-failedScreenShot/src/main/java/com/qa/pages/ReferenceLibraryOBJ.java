package com.qa.pages;

import org.openqa.selenium.By;

/**
 * @authorID Rat105478
 * @authorName RameshRathod
 */

public class ReferenceLibraryOBJ {

	public static By referenceLibraryHeader = By.xpath("//div[text()='Reference Library']");
	public static By referenceLibraryHeaderLink = By.xpath("//div[text()='Reference Library']//parent::a[@href='/projectSetup/referenceLibrary']");
	public static By ProjectSpecificDocumentsManagementSection = By.xpath("//p[text()='Client Documents - Management']//parent::li//parent::ul//p[text()='Project-Specific Documents - Management']");
	public static By ClientDocumentsManagementSection = By.xpath("//p[text()='Project-Specific Documents - Management']//parent::li//parent::ul//p[text()='Client Documents - Management']");
	public static By ProceduresManagementSection= By.xpath("//p[text()='Project-Specific Documents - Management']//parent::li//parent::ul//p[text()='Procedures - Management']");
	
	
	public static By laminarLogo1 = By.xpath ("//div[@class='sidebar-image']/img[1]");
	public static By laminarLogo2 = By.xpath ("//div[@class='sidebar-image']/img[2]");
	public static By IncludeColumn = By.xpath ("//th[text()='Name']//parent::tr//th[text()='Include']");
	public static By CategoryColumn = By.xpath ("//th[text()='Include']//parent::tr//th[text()='Category']");
	public static By NameColumn = By.xpath ("//th[text()='Include']//parent::tr//th[text()='Name']");
	public static By IDColumn = By.xpath ("//th[text()='Include']//parent::tr//th[text()='ID']");
	public static By LinkColumn = By.xpath ("//th[text()='Include']//parent::tr//th[text()='Link']");
	public static By toggle = By.xpath("//tbody/tr[1]/td[1]/label/span");
	public static By categoryTextLink = By.xpath("//table[@class='table referenceLibraryTable table-hover']/tbody/tr[1]/td[2]");
	public static By secondRowText = By.xpath("//tbody/tr[2]/td[2]");
	public static By nameTextBox = By.name ("name");
	public static By IDtextBox = By.name ("documentId");
	public static By linkTextBox = By.name ("link");
	public static By addReferenceButton = By.xpath ("//img[@src='/static/media/add.b23f718f.svg']");
	public static By copyIcon = By.xpath ("//tbody/tr[1]/td[6]/img[@src='/static/media/copyClipboard.e9522ab0.svg']");
	public static By categoryTB = By.name("categoryName");
	public static By categoryDropDown = By.xpath("//div[text()='Category Name']");
	public static By categoryDropDownvalue = By.id("react-select-2-option-0");
	public static By googleLink = By.xpath("//*[@class='linkAnchor'][@href='https://www.google.com/']");
	public static By ProjectSpecificDocumentsManagementCheckedMark= By.xpath ("//p[text()='Project-Specific Documents - Management']//parent::li//img[@class='sideMenuIcon']");
	public static By proceduresManagementCheckedMark= By.xpath ("//p[text()='Procedures - Management']//parent::li//img[@class='sideMenuIcon']");
	
	
	public static By nameTextBoxdocument = By.xpath("//*[@name='name'][@value='']");
	public static By RESET_BUTTON= By.xpath("//button[text()='Save']//parent::div//button[text()='Reset']");
	public static By SAVE_BUTTON = By.xpath("//button[text()='Save']");
	public static By COMPLETE_BUTTON= By.xpath("//button[text()='Reset']//parent::div//button[text()='Complete']");
	public static By EDIT_BUTTON= By.xpath ("//button[text()='Edit']");
	
	//ClientDocument
	public static By clientDocumentsManagementCheckedMark= By.xpath ("//p[text()='Client Documents - Management']//parent::li//img[@class='sideMenuIcon']");
	
	//ManualHandbooks
	public static By manualsHandbooksManagementSection = By.xpath ("//p[text()='Manuals/Handbooks - Management']");
	public static By manualsHandbooksManagementCheckedMark= By.xpath ("//p[text()='Manuals/Handbooks - Management']//parent::li//img[@class='sideMenuIcon']");
	
	//OtherManagement
	public static By OtherManagementSection = By.xpath("//p[text()='Other - Management']");
	public static By OtherManagementCheckedMark= By.xpath ("//p[text()='Other - Management']//parent::li//img[@class='sideMenuIcon']");
	
	//checklistsManagement
	public static By checklistsManagementSection= By.xpath("//p[text()='Checklists - Management']");
	public static By checklistsManagementCheckedMark= By.xpath ("//p[text()='Checklists - Management']//parent::li//img[@class='sideMenuIcon']");
	
	//DPS Piping Role
	public static By projectSpecificDocumentsPipingCheckedMark= By.xpath ("//p[text()='Project-Specific Documents - Piping']//parent::li//img[@class='sideMenuIcon']");
	public static By projectSpecificDocumentsPiping= By.xpath ("//p[text()='Project-Specific Documents - Piping']");
	public static By clientDocumentsPiping= By.xpath ("//p[text()='Client Documents - Piping']");
	public static By clientDocumentsPipingCheckedMark= By.xpath ("//p[text()='Client Documents - Piping']//parent::li//img[@class='sideMenuIcon']");
	public static By proceduresPiping= By.xpath ("//p[text()='Procedures - Piping']");
	public static By proceduresPipingCheckedMark= By.xpath ("//p[text()='Procedures - Piping']//parent::li//img[@class='sideMenuIcon']");
	public static By calculationTemplatesPiping= By.xpath ("//p[text()='Calculation Templates - Piping']");
	public static By calculationTemplatesCheckedMark= By.xpath ("//p[text()='Calculation Templates - Piping']//parent::li//img[@class='sideMenuIcon']");
	public static By typicalDetailsPiping= By.xpath ("//p[text()='Typical Details - Piping']");
	public static By typicalDetailsPipingCheckedMark= By.xpath ("//p[text()='Typical Details - Piping']//parent::li//img[@class='sideMenuIcon']");
	public static By manualsHandbooksPiping= By.xpath ("//p[text()='Manuals/Handbooks - Piping']");
	public static By manualsHandbooksPipingCheckedMark= By.xpath ("//p[text()='Manuals/Handbooks - Piping']//parent::li//img[@class='sideMenuIcon']");
	public static By trainingPiping= By.xpath ("//p[text()='Training - Piping']");
	public static By trainingPipingCheckedMark= By.xpath ("//p[text()='Training - Piping']//parent::li//img[@class='sideMenuIcon']");
	public static By otherPiping= By.xpath ("//p[text()='Other - Piping']");
	public static By otherPipingCheckedMark= By.xpath ("//p[text()='Other - Piping']//parent::li//img[@class='sideMenuIcon']");
	public static By checklistsPiping= By.xpath ("//p[text()='Checklists - Piping']");
	public static By checklistsPipingCheckedMark= By.xpath ("//p[text()='Checklists - Piping']//parent::li//img[@class='sideMenuIcon']");
	
	
	//DPS Process Role 
	public static By projectSpecificDocumentsProcessCheckedMark= By.xpath ("//p[text()='Project-Specific Documents - Process']//parent::li//img[@class='sideMenuIcon']");
	public static By projectSpecificDocumentsProcess= By.xpath ("//p[text()='Project-Specific Documents - Process']");
	public static By clientDocumentsProcess= By.xpath ("//p[text()='Client Documents - Process']");
	public static By clientDocumentsProcessCheckedMark= By.xpath ("//p[text()='Client Documents - Process']//parent::li//img[@class='sideMenuIcon']");
	public static By proceduresProcess= By.xpath ("//p[text()='Procedures - Process']");
	public static By proceduresProcessCheckedMark= By.xpath ("//p[text()='Procedures - Process']//parent::li//img[@class='sideMenuIcon']");
	public static By calculationTemplatesProcess= By.xpath ("//p[text()='Calculation Templates - Process']");
	public static By calculationTemplatesProcessCheckedMark= By.xpath ("//p[text()='Calculation Templates - Process']//parent::li//img[@class='sideMenuIcon']");
	public static By typicalDetailsProcess= By.xpath ("//p[text()='Typical Details - Process']");
	public static By typicalDetailsProcessCheckedMark= By.xpath ("//p[text()='Typical Details - Process']//parent::li//img[@class='sideMenuIcon']");
	public static By manualsHandbooksProcess= By.xpath ("//p[text()='Manuals/Handbooks - Process']");
	public static By manualsHandbooksProcessCheckedMark= By.xpath ("//p[text()='Manuals/Handbooks - Process']//parent::li//img[@class='sideMenuIcon']");
	public static By trainingProcess= By.xpath ("//p[text()='Training - Process']");
	public static By trainingProcessCheckedMark= By.xpath ("//p[text()='Training - Process']//parent::li//img[@class='sideMenuIcon']");
	public static By otherProcess= By.xpath ("//p[text()='Other - Process']");
	public static By otherProcessCheckedMark= By.xpath ("//p[text()='Other - Process']//parent::li//img[@class='sideMenuIcon']");
	public static By checklistsProcess= By.xpath ("//p[text()='Checklists - Process']");
	public static By checklistsProcessCheckedMark= By.xpath ("//p[text()='Checklists - Process']//parent::li//img[@class='sideMenuIcon']");
	
	//DPS Equipment Role
				public static By projectSpecificDocumentsEquipmentCheckedMark= By.xpath ("//p[text()='Project-Specific Documents - Equipment']//parent::li//img[@class='sideMenuIcon']");
				public static By projectSpecificDocumentsEquipment= By.xpath ("//p[text()='Project-Specific Documents - Equipment']");
				public static By clientDocumentsEquipment= By.xpath ("//p[text()='Client Documents - Equipment']");
				public static By clientDocumentsEquipmentCheckedMark= By.xpath ("//p[text()='Client Documents - Equipment']//parent::li//img[@class='sideMenuIcon']");
				public static By proceduresEquipment= By.xpath ("//p[text()='Procedures - Equipment']");
				public static By proceduresEquipmentCheckedMark= By.xpath ("//p[text()='Procedures - Equipment']//parent::li//img[@class='sideMenuIcon']");
				public static By calculationTemplatesEquipment= By.xpath ("//p[text()='Calculation Templates - Equipment']");
				public static By calculationTemplatesEquipmentCheckedMark= By.xpath ("//p[text()='Calculation Templates - Equipment']//parent::li//img[@class='sideMenuIcon']");
				public static By typicalDetailsEquipment= By.xpath ("//p[text()='Typical Details - Equipment']");
				public static By typicalDetailsEquipmentCheckedMark= By.xpath ("//p[text()='Typical Details - Equipment']//parent::li//img[@class='sideMenuIcon']");
				public static By manualsHandbooksEquipment= By.xpath ("//p[text()='Manuals/Handbooks - Equipment']");
				public static By manualsHandbooksEquipmentCheckedMark= By.xpath ("//p[text()='Manuals/Handbooks - Equipment']//parent::li//img[@class='sideMenuIcon']");
				public static By trainingEquipment= By.xpath ("//p[text()='Training - Equipment']");
				public static By trainingEquipmentCheckedMark= By.xpath ("//p[text()='Training - Equipment']//parent::li//img[@class='sideMenuIcon']");
				public static By otherEquipment= By.xpath ("//p[text()='Other - Equipment']");
				public static By otherEquipmentCheckedMark= By.xpath ("//p[text()='Other - Equipment']//parent::li//img[@class='sideMenuIcon']");
				public static By checklistsEquipment= By.xpath ("//p[text()='Checklists - Equipment']");
				public static By checklistsEquipmentCheckedMark= By.xpath ("//p[text()='Checklists - Equipment']//parent::li//img[@class='sideMenuIcon']");
				
	public static By userName= By.name ("userEmail");
	public static By password= By.name ("password");
	public static By ProjectSpecificDocumentsStructuralSection = By.xpath("//p[text()='Client Documents - Structural']//parent::li//parent::ul//p[text()='Project-Specific Documents - Structural']");
	public static By ClientDocumentsStructuralSection = By.xpath("//p[text()='Project-Specific Documents - Structural']//parent::li//parent::ul//p[text()='Client Documents - Structural']");
	public static By ProceduresStructuralSection= By.xpath("//p[text()='Client Documents - Structural']//parent::li//parent::ul//p[text()='Procedures - Structural']");
	public static By CalculationTemplatesStructuralSection= By.xpath("//p[text()='Client Documents - Structural']//parent::li//parent::ul//p[text()='Calculation Templates - Structural']");
	public static By TypicalDetailsStructuralSection= By.xpath("//p[text()='Client Documents - Structural']//parent::li//parent::ul//p[text()='Typical Details - Structural']");
	public static By ManualsHandbooksStructuralSection = By.xpath ("//p[text()='Client Documents - Structural']//parent::li//parent::ul//p[text()='Manuals/Handbooks- Structural']");
	public static By TrainingStructuralSection= By.xpath("//p[text()='Client Documents - Structural']//parent::li//parent::ul//p[text()='Training - Structural']");
	public static By OtherStructuralSection = By.xpath("//p[text()='Client Documents - Structural']//parent::li//parent::ul//p[text()='Other - Structural']");
	public static By ChecklistsStructuralSection= By.xpath("//p[text()='Client Documents - Structural']//parent::li//parent::ul//p[text()='Checklists - Structural']");

	public static By linkDeleteIcon= By.xpath ("//img[@src='/static/media/xCircleFill.fab3e1a4.svg']");
	public static By link= By.xpath ("//a[@href='https://www.google.com/']");
	public static By crossIcon= By.xpath ("//img[@src='/static/media/xCircleFill.fab3e1a4.svg']");
	public static By crossDeleteButton= By.xpath ("//button[text()='Cancel']//parent::div//button[text()='Delete']");
	public static By completeHeaderIconReferenceLib  = By.xpath ("//div[text()='Reference Library']//parent::a//img[@src='/static/media/completed.0bc5e4c8.svg']");
}
