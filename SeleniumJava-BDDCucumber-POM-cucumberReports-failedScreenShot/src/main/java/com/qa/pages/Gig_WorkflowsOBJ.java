package com.qa.pages;

import org.openqa.selenium.By;

public class Gig_WorkflowsOBJ {

    public static By gigHeader = By.xpath("//div[text()='Gig Workflows']");
    public static By gigworkFlowHeader = By.xpath("//span[@class='gigHeaderLabel']");
    public static By dropdownSelectoption = By.xpath("//div[@class='gigworkflow-select']/parent::div//div[@class='activitySelect__indicators css-1wy0on6']");
    public static By gigworkflowdropdown = By.xpath("//div[text()='textToReplace']");
    public static By optionselect = By.xpath("//div[@class ='activitySelect__menu css-26l3qy-menu']//span[text()='textToReplace']");

    //Dos activity
    public static By activityDropdownbox = By.xpath("//span[text()='Mechanical Data Sheets']//parent::div");
    public static By allSteos = By.xpath("//div[text()='textToReplace']");
    public static By deletesubtypedrpdnR = By.xpath("//p[text()='Subtype']/parent::div//div[@class=' css-tlfecz-indicatorContainer']");
    public static By togglebtnInHouseReview = By.xpath("//label[@for='inHouseReview']");
    public static By btnApply = By.xpath("//button[text()='Apply']");
    public static By step1ActivityInformation = By.xpath("//div[text()='Activity Information']");
    public static By subtypedrpdnR = By.xpath("//p[text()='Subtype']/parent::div//div");
    //public static By purchaseSpecNuorNametxt = By.xpath("");
    public static By instPurchaseSpecNudrpdnR = By.xpath("//p[text()='Instrument Purchase Specification Number']/parent::div/..//p[text()='Instrument Purchase Specification Number']/parent::div/div[1]");
    public static By equipmenttagorNamedrpdnR = By.xpath("//p[text()='Discipline/Subject Specific' or text()='WBS']/parent::div/..//p[text()='Equipment Tag/Name']/parent::div/div[1]");
    public static By equipmentCategorydrpdnR = By.xpath("//p[text()='Discipline/Subject Specific']/parent::div/..//p[text()='Equipment Category']/parent::div/div[1]");
    public static By electricalEquiNuorNadrpdnR = By.xpath("//p[text()='Discipline/Subject Specific']/parent::div/..//p[text()='Electrical Equipment Number/Name']/parent::div//div[1]");
    public static By powerhouseTagNadrpdnR = By.xpath("//p[text()='Discipline/Subject Specific']/parent::div/..//p[text()='Powerhouse Tag/Name']/parent::div//div[1]");
    public static By controlRoomNuorNamdrpdnR = By.xpath("//p[text()='Discipline/Subject Specific']/parent::div/..//p[text()='Control Room Number/Name']/parent::div//div[1]");
    public static By foundatiotagnamepdnR = By.xpath("//p[text()='Discipline/Subject Specific']/parent::div/..//p[text()='Foundation Tag/Name']/parent::div//div[1]");

    public static By checkUncheckprocess = By.xpath("//div[text()='textToReplace']/parent::div/div[@class='checkbox_wrapper']/label");

    public static By gigEditbtn = By.xpath("//div[@class='gigStepFooter' or @class='gigButtonContainer']//button[text()='Edit']");

    public static By gigSavebtn = By.xpath("//div[@class='gigStepFooter' or @class='gigButtonContainer']//button[text()='Save']");
    public static By gigContinuebtn = By.xpath("//div[@class='gigStepFooter' or @class='gigButtonContainer']//button[text()='Continue']");
    public static By gigContinueenabledbtn = By.xpath("//div[@class='gigStepFooter' or @class='gigButtonContainer']//button[@class='completeButtonActiveGig']");

    public static By firstinputFragnetStepInform =By.xpath("//input[@type='number'][1]");
    public static By manhours =By.xpath("//input[@name='manHourBudget0']");
    public static By fragnettxt =By.xpath("//input[@name='fragnetStepDuration0']");
    public static By greenvalidation =By.xpath("//div[@class='totalHrs colorGreen row']");
    public static By redvalidation =By.xpath("//div[@class='totalHrs colorRed row']");
    public static By step4completedrnd =By.xpath("//span[text()='Mark as Completed']");
    public static By step4Editdrnd =By.xpath("//span[text()='Edit']");



    public static By equipmentdatasheetlist =By.xpath("//ul[@class='list-group']//li//p[text()='textToReplace']/parent::div/span");
    public static By worktype=By.xpath("//p[text()='Work Type']/parent::div/div");
    public static By gigFinishbtn = By.xpath("//div[@class='gigStepFooter' or @class='gigButtonContainer']//button[text()='Finish Gig Workflow']");
    public static By PreferredPerformerLocation = By.xpath("//p[text()='Preferred Performer Location']/parent::div/div");
    public static By btncomplete= By.xpath("//button[text()='Complete']");

    public static By txtgiginsturctionR= By.xpath("//textarea[@name='general.gigInstructions']");

    }
