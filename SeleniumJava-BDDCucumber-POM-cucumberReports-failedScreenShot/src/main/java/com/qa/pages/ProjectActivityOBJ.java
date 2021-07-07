package com.qa.pages;

import org.openqa.selenium.By;


/**
 * @authorID Rat105478
 * @authorName RameshRathod
 */

public class ProjectActivityOBJ  {

	public static By projectActivityLink = By.xpath("//a[@href='/projectSetup/projectActivities']");
	public static By projectActivityHeader = By.xpath("//div[text()='Project Activities']");
	public static By defineActivitiesSection = By.xpath("//p[text()='Define Activities']");
	
	public static By generateProjectActivitiesMessage = By.xpath("//div[text()='\"To view activity table, you must first Generate Project Activities\"']");
	public static By selectDisciplineDropDown = By.xpath("//div[@class=' css-1wy0on6']/div");
	public static By selectDisciplineDropDownValue= By.xpath ("//div[text()='Piping']");
	public static By generateProjectActivitiesLink= By.xpath ("//span[text()='Generate Project Activities']");
	
	public static By selectApplicableWBSCriteriaModelTitle = By.xpath("//div[text()='Select Applicable WBS Criteria']");
	public static By selectDiscipline = By.xpath("//div[text()='Select Discipline']");
	
	public static By addRowButton = By.xpath("//span[text()='Add Row']");
	public static By formProjectActivity = By.xpath("//div[@class='defineActivity-Container']");
	public static By activityTextBox = By.xpath("//input[@placeholder='Type Here'][@value='']");
	public static By activityTextBoxEdit = By.xpath("//input[@value='6655-4433']");
	public static By cwaNumberNameDropDown1 = By.xpath("//input[@value='3322edit']//parent::div//parent::div//parent::td//parent::tr//td[2]/div/div/div[2]/div");
	public static By cwaNumberNameDropDown2 = By.xpath("//input[@value='3322edit']//parent::div//parent::div//parent::td//parent::tr//td[2]/div/div/div[2]/div[2]");
	public static By cwaNumberNameDropDownValue1 = By.xpath("//div[@class='genetateActivityTableRow-select__option genetateActivityTableRow-select__option--is-focused css-1n7v3ny-option']");
	
	public static By ActivityDeleteIcon = By.xpath("//input[@value='3322edit']//parent::div//parent::div//parent::td//parent::tr//img");
	public static By defineActivityDropDown = By.xpath("//div[@class='activitySelect__indicators css-1wy0on6']/div");
	public static By defineActivityDDValue = By.xpath("//div[@class='activitySelect__option css-yt9ioa-option'][1]");
	
	public static By markAsCompleteIcon = By.xpath("//span[@class='circleBlue']");
	public static By editIcon = By.xpath("//button[@class='activityComplete activityEdit']/img");
	public static By deleteActivity = By.xpath("//input[@value='3322edit']//parent::div//parent::div//parent::td//parent::tr//img");
	
	public static By manhourBudgetsSection = By.xpath("//p[text()='Manhour Budgets']");
	public static By usEngHours  = By.name("projectActivityTable[0].usEngHours");
	public static By usDsgnHours = By.name("projectActivityTable[0].usDsgnHours");
	public static By ousEngHours = By.name("projectActivityTable[0].ousEngHours");
	public static By ousDsgnHours = By.name("projectActivityTable[0].ousDsgnHours");
	public static By totalENGHours = By.xpath("//input[@value='222']");
	public static By totalDSGNHours = By.xpath("//input[@value='666']");
	public static By maxvalidationMessage = By.xpath("//span[text()='Value length should be less than 6']");
	public static By decimalvalidationMessage = By.xpath("//span[text()='No Decimal Values']");
	public static By formClick = By.xpath("//div[@class='activitiesTable ']");
	
	public static By totalENGHours1 = By.xpath("//tbody/tr[2]/td[6]/div/div/input");
	public static By totalDSGNHours1 = By.xpath("//tbody/tr[2]/td[7]/div/div/input");
	
	public static By usEngHours2  = By.name("projectActivityTable[1].usEngHours");
	public static By usDsgnHours2 = By.name("projectActivityTable[1].usDsgnHours");
	public static By ousEngHours2 = By.name("projectActivityTable[1].ousEngHours");
	public static By ousDsgnHours2 = By.name("projectActivityTable[1].ousDsgnHours");
	public static By totalENGHours2 = By.xpath("//tbody/tr[3]/td[6]/div/div/input");
	public static By totalDSGNHours2 = By.xpath("//tbody/tr[3]/td[7]/div/div/input");
	
	
}
