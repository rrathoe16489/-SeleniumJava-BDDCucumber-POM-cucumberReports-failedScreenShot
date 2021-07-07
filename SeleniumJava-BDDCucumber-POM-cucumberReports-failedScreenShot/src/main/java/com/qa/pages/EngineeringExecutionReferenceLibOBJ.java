package com.qa.pages;
import org.openqa.selenium.By;

/**
 * @authorID Rat105478
 * @authorName RameshRathod
 */

public class EngineeringExecutionReferenceLibOBJ  {

	//Reference Library
		public static By twenthrowDocumentLink = By.xpath("//tbody/tr[20]/td[1]/div/a");
		public static By previousPagination = By.xpath("//span[text()='Previous'][1]");
		public static By nextPagination = By.xpath("//span[text()='Next'][1]");
		public static By manageReferenceSearchbox = By.xpath("//div/input[@id='search']");
		
		//ul[@class='pagination']/li/a[text()='10']
		public static By pipingCheckBox = By.xpath("//span[text()='Piping']//parent::li//input[@type='checkbox']");
		public static By manageReferencesbtn = By.xpath("//p[text()='Manage References']");
		 public static By addReferenceBtn = By.xpath(" //span[text()='Add Reference']");
		 public static By saveBtn = By.xpath("//button[text()='Save']");
		 public static By backBtn = By.xpath("//span[text()='Back']");
		 public static By filterApplyButtonReferenceLib = By.xpath(" //button[@class='btn btn-primary'][text()='Apply']");
		 public static By categoryTextLinkManage = By.xpath("//table[@class='table table-stripped manageReferenceTable']/tbody/tr[1]/td[2]");
		 public static By categoryTextBoxDD = By.xpath("//div[@class='css-1g6gooi']/div/input");
		 public static By referenceSectionDD = By.name("referenceSection");
		 public static By responsibleDisciplineDD = By.name("responsibleDiscipline");
		 
		 
		 
}
