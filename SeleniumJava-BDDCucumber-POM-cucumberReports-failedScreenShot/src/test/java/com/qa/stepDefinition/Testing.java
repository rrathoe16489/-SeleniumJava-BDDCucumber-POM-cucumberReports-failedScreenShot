package com.qa.stepDefinition;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.util.Assert;
import com.qa.factory.DriverFactory;
import com.qa.pages.EngineeringExecutionOBJ;
import com.qa.pages.EngineeringExecutionReferenceLibOBJ;
import com.qa.pages.Gig_WorkflowsOBJ;
import com.qa.pages.ProjectActivityOBJ;
import com.qa.pages.ProjectInfoOBJ;
import com.qa.pages.ReferenceLibraryOBJ;
import com.qa.pages.ViewApproveFullProjectPlanOBJ;
import com.qa.pages.WBSInformationOBJ;
import com.qa.util.ConfigReader;
import com.qa.util.TestUtilDemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @authorID Rat105478
 * @authorName RameshRathod
 */

public class Testing {
	WebElement element;
	private WebDriver driver = DriverFactory.getDriver();
		
	private TestUtilDemo util = new TestUtilDemo(DriverFactory.getDriver());
	
	@Given("Validate when user login for selected role {string}")
	public void login_as_role(String gdcred) throws Throwable {
		TestUtilDemo.doSendKeys(By.name("userEmail"), gdcred);
		Thread.sleep(1000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.SIGNINBUTTON, "");
		Thread.sleep(20000);

	}

	@Given("validate signIn and select projectCard {string}")
	public void validate_signIn_and_select_projectCard(String projectCard) throws Throwable {

		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(By.xpath("//div[@class='card-body']/p[text()='" + projectCard + "']")));
		TestUtilDemo.clickElement(By.xpath("//div[@class='card-body']/p[text()='" + projectCard + "']"), "click on project");
		Thread.sleep(10000);
	}

	@When("validate {string} is Display and click")
	public void clicks_on_headerName(String headerName) throws Throwable {

		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(By.xpath("//div[text()='" + headerName + "']")));
		TestUtilDemo.clickElement(By.xpath("//div[text()='" + headerName + "']"), "select first activity");
		Thread.sleep(5000);

		/*
		 * ((JavascriptExecutor) driver).executeScript(
		 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
		 * , driver.findElement(By.xpath("//div[text()='" + headerName + "']")));
		 * util.clickElement(By.xpath("//div[text()='" + headerName + "']"),
		 * "click on project");
		 * 
		 * Thread.sleep(1000); Actions ac = new Actions(driver);
		 * ac.moveToElement(driver.findElement(By.xpath("//div[text()='" + headerName +
		 * "']"))).click().build().perform();
		 * 
		 * Thread.sleep(10000);
		 */

	}

	@When("validate {string} is Display and click in masterDataManager")
	public void clicks_on_headerName1(String headerName) throws Throwable {
		/*
		 * ((JavascriptExecutor) driver).executeScript(
		 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
		 * , driver.findElement(By.xpath("//div[text()='" + headerName + "']")));
		 * 
		 * util.clickElement(By.xpath("//div[text()='" + headerName + "']"),
		 * "click on project");
		 */

		Thread.sleep(1000);
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//div[text()='" + headerName + "']"))).click().build().perform();

		Thread.sleep(10000);

	}

	@When("validate click on InputOutputs Header")
	public void clicks_on_headerNam() throws Throwable {

		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(By.xpath("//div[text()='Inputs/ Outputs']")));
		TestUtilDemo.clickElement(By.xpath("//div[text()='Inputs/ Outputs']"), "click on project");
		Thread.sleep(10000);

	}

	@When("validate {string} is click")
	public void clicks_on_section(String sectionName) throws Throwable {

		TestUtilDemo.clickElement(By.xpath("//button[text()='" + sectionName + "']"), "firstGig click");
		/*
		 * Actions ac = new Actions(driver);
		 * ac.moveToElement(driver.findElement(By.xpath("//button[text()='" +
		 * sectionName + "']"))).click().build() .perform();
		 */
		Thread.sleep(3000);
	}

	@When("validate user click on the backButton")
	public void clicks_on_backButton() throws Throwable {
		Thread.sleep(3000);
		TestUtilDemo.clickElement(EngineeringExecutionReferenceLibOBJ.backBtn, "firstGig click");

		/*
		 * Actions ac = new Actions(driver);
		 * ac.moveToElement(driver.findElement(EngineeringExecutionReferenceLibOBJ.
		 * backBtn)).click().build().perform(); Thread.sleep(5000);
		 */

	}

	/*
	 * @Then("validate GDUser select gig, click on goToGigDashboard and view Gig Info on GigDashBoard"
	 * ) public void validate_viewGigDashBoard_gigInfo() throws Throwable {
	 * ((JavascriptExecutor) driver).executeScript(
	 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
	 * , driver.findElement(EngineeringExecutionOBJ.gig));
	 * util.clickElement(EngineeringExecutionOBJ.gig, "firstGig click");
	 * Thread.sleep(5000);
	 * 
	 * util.scrollDownTillElementPresent(EngineeringExecutionOBJ.goToGigDashboard);
	 * util.clickElement(EngineeringExecutionOBJ.goToGigDashboard,
	 * "firstGig click"); Thread.sleep(5000);
	 * 
	 * }
	 * 
	 * @Then("validate GDDiscipline user assign the gig to GCDiscipline user {string}"
	 * ) public void validate_assigningGigs(String gcValue) throws Throwable {
	 * 
	 * if (util.isElementsPresent(EngineeringExecutionOBJ.assignGig)) {
	 * util.clickElement(EngineeringExecutionOBJ.assignGig, "assignGig btn click");
	 * Thread.sleep(3000); util.clickElement(EngineeringExecutionOBJ.assignedToDD,
	 * "DD click"); util.selectValueAndEnter(EngineeringExecutionOBJ.gcDDV,
	 * gcValue);
	 * 
	 * util.clickElement(EngineeringExecutionOBJ.assignModelSavebtn, "btn click"); }
	 * if (util.isElementsPresent(EngineeringExecutionOBJ.reAssignGig)) {
	 * util.clickElement(EngineeringExecutionOBJ.reAssignGig,
	 * "assignGig btn click"); Thread.sleep(3000);
	 * util.clickElement(EngineeringExecutionOBJ.assignedToDD, "DD click");
	 * Thread.sleep(2000);
	 * 
	 * 
	 * Actions ac = new Actions(driver);
	 * ac.moveToElement(driver.findElement(By.xpath("//div[text()='" + headerName +
	 * "']"))).click().build().perform(); Thread.sleep(30000);
	 * 
	 * 
	 * util.selectValueAndEnter(EngineeringExecutionOBJ.gcDDV, gcValue);
	 * Thread.sleep(2000); util.clickElement(EngineeringExecutionOBJ.cancelbtn,
	 * "btn click"); } }
	 * 
	 * @When("validate gc&gd user edit the gigInfo from gigInfo Widget") public void
	 * validate_gigInfo_Edit_Icon1() throws Throwable {
	 * util.clickElement(EngineeringExecutionOBJ.gigInfoEditIcon, "edit click");
	 * util.scrollDownTillElementPresent(EngineeringExecutionOBJ.forcastStartDt);
	 * 
	 * WebElement startDate =
	 * driver.findElement(EngineeringExecutionOBJ.forcastStartDt); DateFormat
	 * dateFormat = new SimpleDateFormat("dd-MM-yyyy"); Date today =
	 * Calendar.getInstance().getTime(); String date = dateFormat.format(today);
	 * startDate.clear(); startDate.sendKeys(date); Thread.sleep(4000);
	 * startDate.sendKeys(Keys.TAB); Thread.sleep(4000); WebElement finishDate =
	 * driver.findElement(EngineeringExecutionOBJ.forcastFinishDt);
	 * finishDate.sendKeys(Keys.TAB); Thread.sleep(4000);
	 * 
	 * WebElement startDate =
	 * driver.findElement(EngineeringExecutionOBJ.forcastStartDt);
	 * startDate.clear(); String date = "ssMMyyyy" + 1; System.out.println();
	 * SimpleDateFormat sdf = new SimpleDateFormat(date); String date1 =
	 * sdf.format(new Date()); // startDate.sendKeys(date1); //
	 * startDate.sendKeys(Keys.TAB); Thread.sleep(4000);
	 * 
	 * WebElement finishDate =
	 * driver.findElement(EngineeringExecutionOBJ.forcastFinishDt);
	 * finishDate.clear(); String date2 = "ssMMyyyy"; SimpleDateFormat sdf1 = new
	 * SimpleDateFormat(date2); String ftDate = sdf1.format(new Date()); //
	 * finishDate.sendKeys(ftDate); // finishDate.sendKeys(Keys.TAB);
	 * Thread.sleep(4000);
	 * 
	 * 
	 * util.clickElement(EngineeringExecutionOBJ.saveeditbtn, "saveeditbtn click");
	 * Thread.sleep(2000);
	 * 
	 * Actions ac = new Actions(driver);
	 * ac.moveToElement(driver.findElement(EngineeringExecutionOBJ.overviewMenu)).
	 * click().build().perform(); Thread.sleep(30000); //
	 * util.clickElement(EngineeringExecutionOBJ.overviewMenu, "overview // click");
	 * // Thread.sleep(3000); }
	 * 
	 * @When("validate gc&gd user fill the logHours spent in LogTime widget on GigDashboard {string}"
	 * ) public void validate_logHoursSpent(String loghour) throws Throwable {
	 * util.clearAnddoSendKeys(EngineeringExecutionOBJ.logtextbox, loghour);
	 * util.clickElement(EngineeringExecutionOBJ.logHourSavebtn, "savebtn click");
	 * Thread.sleep(3000); }
	 * 
	 * @When("validate the edit icon presence for GD not for GC role when Gig status not Completed"
	 * ) public void validate_editIcon_present_forGDandGC_role() throws Throwable {
	 * if (util.isElementsPresent(EngineeringExecutionOBJ.gigReferencesEditicon)) {
	 * util.clickElement(EngineeringExecutionOBJ.gigReferencesEditicon,
	 * "editIcon click"); Thread.sleep(3000); } }
	 * 
	 * @When("validate GDUser edit Required Inputs widget {string}") public void
	 * validate_edit_requiredInputWidget(String inputValue) throws Throwable {
	 * 
	 * ((JavascriptExecutor) driver).executeScript(
	 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
	 * , driver.findElement(EngineeringExecutionOBJ.editRequiredInp));
	 * util.clickElement(EngineeringExecutionOBJ.editRequiredInp, "edit click");
	 * Thread.sleep(3000);
	 * 
	 * // add util.clickElement(EngineeringExecutionOBJ.addInputBtn, "");
	 * util.selectValueAndEnter(EngineeringExecutionOBJ.addInputDD, inputValue);
	 * util.clickElement(EngineeringExecutionOBJ.saveBtn, ""); Thread.sleep(3000);
	 * 
	 * // delete ((JavascriptExecutor) driver).executeScript(
	 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
	 * , driver.findElement(EngineeringExecutionOBJ.editRequiredInp));
	 * util.clickElement(EngineeringExecutionOBJ.editRequiredInp, "edit click");
	 * Thread.sleep(3000);
	 * 
	 * if (util.isElementsPresent(EngineeringExecutionOBJ.addInputdeleteIcon)) {
	 * util.clickElement(EngineeringExecutionOBJ.addInputdeleteIcon, ""); }
	 * util.clickElement(EngineeringExecutionOBJ.saveBtn, ""); }
	 * 
	 * //GC role
	 * 
	 * @When("validate GCUser select first gig from the table") public void
	 * validate_gcSelect_firstGig() throws Throwable {
	 * util.clickElement(EngineeringExecutionOBJ.firstGig, "button click");
	 * Thread.sleep(5000); }
	 * 
	 * @When("validate GC user start the Gig") public void
	 * validate_gcuser_startGig() throws Throwable { if
	 * (util.isElementsPresent(EngineeringExecutionOBJ.startGig)) {
	 * util.clickElement(EngineeringExecutionOBJ.startGig, "button click");
	 * Thread.sleep(5000); } }
	 * 
	 * @When("validate GC user are able to Hold-Gig and enter the specific reason {string},{string}"
	 * ) public void validate_holdGig(String reason, String comment) throws
	 * Throwable { if (util.isElementsPresent(EngineeringExecutionOBJ.holdGig)) {
	 * util.clickElement(EngineeringExecutionOBJ.holdGig, "button click");
	 * Thread.sleep(5000);
	 * 
	 * Actions ac = new Actions(driver);
	 * ac.moveToElement(driver.findElement(EngineeringExecutionOBJ.reasonTextbox)).
	 * click().build().perform(); Thread.sleep(30000);
	 * 
	 * // util.clickElement(EngineeringExecutionOBJ.reasonTextbox, "click"); //
	 * Thread.sleep(2000);
	 * util.selectValueAndEnter(EngineeringExecutionOBJ.reasonTextbox, reason);
	 * util.doSendKeys(EngineeringExecutionOBJ.commentTextbox, comment);
	 * util.clickElement(EngineeringExecutionOBJ.sendbtn, "send button");
	 * Thread.sleep(5000); } }
	 * 
	 * @When("validate GC user are able to Resume-Gig") public void
	 * validate_resumeGig() throws Throwable { if
	 * (util.isElementsPresent(EngineeringExecutionOBJ.resumeGig)) {
	 * util.clickElement(EngineeringExecutionOBJ.resumeGig, "button click");
	 * Thread.sleep(5000);
	 * 
	 * } }
	 * 
	 * @When("validate GC user are able to Request-Transfer {string},{string}")
	 * public void validate_requestTransfer(String transferReason, String comment)
	 * throws Throwable { Thread.sleep(5000); if
	 * (util.isElementsPresent(EngineeringExecutionOBJ.requestTransfer)) {
	 * Thread.sleep(5000);
	 * util.clickElement(EngineeringExecutionOBJ.requestTransfer, "button click");
	 * Thread.sleep(1000);
	 * 
	 * Actions ac = new Actions(driver);
	 * ac.moveToElement(driver.findElement(EngineeringExecutionOBJ.reasonTextbox)).
	 * click().build().perform(); //
	 * util.clickElement(EngineeringExecutionOBJ.reasonTextbox, "click");
	 * Thread.sleep(3000);
	 * util.selectValueAndEnter(EngineeringExecutionOBJ.reasonTextbox,
	 * transferReason); util.doSendKeys(EngineeringExecutionOBJ.commentTextbox,
	 * comment); util.clickElement(EngineeringExecutionOBJ.sendbtn, "send button");
	 * } }
	 * 
	 * @When("validate GC and GD user can see and perform the Cancel-Request")
	 * public void validate_cancelRequest() throws Throwable { if
	 * (util.isElementsPresent(EngineeringExecutionOBJ.cancelRequest)) {
	 * util.clickElement(EngineeringExecutionOBJ.cancelRequest, "button click");
	 * Thread.sleep(3000); util.clickElement(EngineeringExecutionOBJ.yesCancel,
	 * "click"); Thread.sleep(3000); } }
	 * 
	 * @Then("verify the Day Scale in Preliminary Discipline Plan {string},{string},{string}"
	 * ) public void click_and_select_dayScale_value(String day, String week, String
	 * month) throws Throwable { ((JavascriptExecutor) driver).executeScript(
	 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
	 * , driver.findElement(ViewApproveFullProjectPlanOBJ.dayScaleDD));
	 * util.clickElement(ViewApproveFullProjectPlanOBJ.dropdownClick, "");
	 * util.clickElement(By.xpath("//div[text()='" + day + "']"), "day select");
	 * Thread.sleep(4000);
	 * 
	 * util.clickElement(ViewApproveFullProjectPlanOBJ.dropdownClick, "");
	 * util.clickElement(By.xpath("//div[text()='" + week + "']"), "day select");
	 * Thread.sleep(4000);
	 * 
	 * util.clickElement(ViewApproveFullProjectPlanOBJ.dropdownClick, "");
	 * util.clickElement(By.xpath("//div[text()='" + month + "']"), "day select");
	 * Thread.sleep(4000); }
	 * 
	 * @When("verify user apply the filter by clicking on the filter icon {string}")
	 * public void validate_filter(String gdUser) throws Throwable {
	 * util.clickElement(ViewApproveFullProjectPlanOBJ.filterIcon, ""); if
	 * (gdUser.equals("gdpiping@bv.com")) { ((JavascriptExecutor)
	 * driver).executeScript(
	 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
	 * , driver.findElement(EngineeringExecutionOBJ.pipingcheckbox));
	 * util.clickElement(EngineeringExecutionOBJ.pipingcheckbox, "checkbox click");
	 * Thread.sleep(2000); }
	 * 
	 * if (gdUser.equals("gdprocess@bv.com")) { ((JavascriptExecutor)
	 * driver).executeScript(
	 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
	 * , driver.findElement(EngineeringExecutionOBJ.processcheckbox));
	 * util.clickElement(EngineeringExecutionOBJ.processcheckbox, "checkbox click");
	 * Thread.sleep(2000); }
	 * 
	 * if (gdUser.equals("gdstructural@bv.com")) { ((JavascriptExecutor)
	 * driver).executeScript(
	 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
	 * , driver.findElement(EngineeringExecutionOBJ.structuralcheckbox));
	 * util.clickElement(EngineeringExecutionOBJ.structuralcheckbox,
	 * "checkbox click"); Thread.sleep(2000); }
	 * 
	 * if (gdUser.equals("gdelectrical@bv.com")) { ((JavascriptExecutor)
	 * driver).executeScript(
	 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
	 * , driver.findElement(EngineeringExecutionOBJ.electricalcheckbox));
	 * util.clickElement(EngineeringExecutionOBJ.electricalcheckbox,
	 * "checkbox click"); Thread.sleep(2000); }
	 * 
	 * if (gdUser.equals("gdequipment@bv.com")) { ((JavascriptExecutor)
	 * driver).executeScript(
	 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
	 * , driver.findElement(EngineeringExecutionOBJ.equipmentcheckbox));
	 * util.clickElement(EngineeringExecutionOBJ.equipmentcheckbox,
	 * "checkbox click"); Thread.sleep(2000); }
	 * 
	 * if (gdUser.equals("gdiandc@bv.com")) { ((JavascriptExecutor)
	 * driver).executeScript(
	 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
	 * , driver.findElement(EngineeringExecutionOBJ.InCcheckbox));
	 * util.clickElement(EngineeringExecutionOBJ.InCcheckbox, "checkbox click");
	 * Thread.sleep(2000); }
	 * 
	 * if
	 * (util.isElementsPresent(EngineeringExecutionReferenceLibOBJ.pipingCheckBox))
	 * { ((JavascriptExecutor) driver).executeScript(
	 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
	 * , driver.findElement(EngineeringExecutionReferenceLibOBJ.pipingCheckBox));
	 * util.clickElement(EngineeringExecutionReferenceLibOBJ.pipingCheckBox,
	 * "pipingcheckbox click"); Thread.sleep(2000); }
	 * 
	 * if (util.isElementsPresent(EngineeringExecutionReferenceLibOBJ.
	 * filterApplyButtonReferenceLib)) {
	 * util.clickElement(EngineeringExecutionReferenceLibOBJ.
	 * filterApplyButtonReferenceLib, " click"); Thread.sleep(4000); }
	 * 
	 * if (util.isElementsPresent(ViewApproveFullProjectPlanOBJ.filterApplyButton))
	 * { util.clickElement(ViewApproveFullProjectPlanOBJ.filterApplyButton, "");
	 * Thread.sleep(3000); }
	 * 
	 * }
	 * 
	 * @When("validate user clear the filter by clicking on the clearFilter button")
	 * public void validate_clearFilter() throws Throwable {
	 * 
	 * ((JavascriptExecutor) driver).executeScript(
	 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
	 * , driver.findElement(ViewApproveFullProjectPlanOBJ.clearFilter));
	 * 
	 * util.clickElement(ViewApproveFullProjectPlanOBJ.clearFilter, "");
	 * Thread.sleep(5000);
	 * 
	 * }
	 * 
	 *//**
		 * @role GC/GDProjectUser
		 * @section gigInfo
		 */
	/*
	 * @When("GC&GDProjectUser select the displayChangesFormDDValue and apply the filter {string}"
	 * ) public void validate_displayChangesFormDD(String DDValue) throws Throwable
	 * {
	 * 
	 * util.clickElement(EngineeringExecutionOBJ.displayChangesFormDD, "");
	 * Thread.sleep(1000);
	 * util.clickElement(EngineeringExecutionOBJ.displayChangesFormDDValue, "");
	 * Thread.sleep(3000); util.clickElement(EngineeringExecutionOBJ.applyButton,
	 * "");
	 * 
	 * }
	 * 
	 *//**
		 * @role PLI/DPS
		 * @header projectDashBoard
		 * @section wbsList
		 */
	/*
	 * 
	 * @When("validate PLI&DPS edit the WBSLists under WBS Info Section {string},{string},{string},{string}"
	 * ) public void validate_wbsList_edit(String listName, String value1, String
	 * value2, String value3) throws Throwable {
	 * util.clickElement(EngineeringExecutionOBJ.wbsInfoLink, "");
	 * Thread.sleep(6000);
	 * util.selectValueAndEnter(EngineeringExecutionOBJ.wbsInfoDropdwn, listName);
	 * Thread.sleep(1000); util.clickElement(EngineeringExecutionOBJ.editListbtn,
	 * ""); Thread.sleep(3000);
	 * util.clickElement(EngineeringExecutionOBJ.deleteIcon2, "");
	 * 
	 * if (listName.equals("CWA List")) { //
	 * util.clickElement(EngineeringExecutionOBJ.deleteIcon, "");
	 * util.clickElement(EngineeringExecutionOBJ.addRowbtn, "");
	 * util.doSendKeys(EngineeringExecutionOBJ.cwaID, value1);
	 * util.doSendKeys(EngineeringExecutionOBJ.cwaName, value2); Thread.sleep(3000);
	 * util.clickElement(EngineeringExecutionOBJ.saveEditbtn, "");
	 * Thread.sleep(8000); }
	 * 
	 * if (listName.equals("Pipe Specification List")) { //
	 * util.clickElement(EngineeringExecutionOBJ.deleteIcon1, "");
	 * util.clickElement(EngineeringExecutionOBJ.addRowbtn, "");
	 * util.doSendKeys(WBSInformationOBJ.pipeSpecificationNumber, value1);
	 * util.doSendKeys(WBSInformationOBJ.pipeSpecificationMaterial, value2);
	 * util.doSendKeys(WBSInformationOBJ.pipeSpecificationClass, value3);
	 * Thread.sleep(3000); util.clickElement(EngineeringExecutionOBJ.saveEditbtn,
	 * ""); Thread.sleep(8000); }
	 * 
	 * if (listName.equals("Study List")) { //
	 * util.clickElement(EngineeringExecutionOBJ.deleteIcon, "");
	 * util.clickElement(EngineeringExecutionOBJ.addRowbtn, "");
	 * util.doSendKeys(WBSInformationOBJ.studyNumber, value1);
	 * util.doSendKeys(WBSInformationOBJ.studyName, value2); Thread.sleep(3000);
	 * util.clickElement(EngineeringExecutionOBJ.saveEditbtn, "");
	 * Thread.sleep(8000); }
	 * 
	 * if (listName.equals("Mechanical Equipment List")) {
	 * util.clickElement(EngineeringExecutionOBJ.addRowbtn, "");
	 * util.doSendKeys(WBSInformationOBJ.EquipmentTagColumnTextBox, value1);
	 * util.doSendKeys(WBSInformationOBJ.EquipmentNameColumnTextBox, value2);
	 * util.selectValueAndEnter(WBSInformationOBJ.equipmentTypeDD, "Pump");
	 * util.selectValueAndEnter(WBSInformationOBJ.purchaseSpecificationNumberNameDD,
	 * "61-Civil/Structural Equipment and Materials");
	 * util.selectValueAndEnter(WBSInformationOBJ.processAreaIdNameDD,
	 * "123-NameProcess");
	 * util.selectValueAndEnter(WBSInformationOBJ.cwaNumberNameDD, "1234-TestName");
	 * util.clickElement(EngineeringExecutionOBJ.saveEditbtn, "");
	 * Thread.sleep(8000); }
	 * 
	 * if (listName.equals("Electrical Systems List")) {
	 * util.clickElement(EngineeringExecutionOBJ.addRowbtn, "");
	 * util.doSendKeys(EngineeringExecutionOBJ.electricalSystemsName, value1);
	 * util.clickElement(EngineeringExecutionOBJ.saveEditbtn, "");
	 * Thread.sleep(8000); }
	 * 
	 * if (listName.equals("Foundation List")) {
	 * util.clickElement(EngineeringExecutionOBJ.addRowbtn, "");
	 * util.doSendKeys(EngineeringExecutionOBJ.foundationTag, value1);
	 * util.doSendKeys(EngineeringExecutionOBJ.foundationName, value2);
	 * util.selectValueAndEnter(EngineeringExecutionOBJ.foundationType, value3);
	 * util.selectValueAndEnter(EngineeringExecutionOBJ.cwaNumberNameDropDown,
	 * "1234-TestName"); util.clickElement(EngineeringExecutionOBJ.saveEditbtn, "");
	 * Thread.sleep(8000); }
	 * 
	 * if (listName.equals("Instrument Type List")) {
	 * util.clickElement(EngineeringExecutionOBJ.addRowbtn, "");
	 * util.selectValueAndEnter(EngineeringExecutionOBJ.instrumentTypeDD, value1);
	 * util.clickElement(EngineeringExecutionOBJ.saveEditbtn, "");
	 * Thread.sleep(8000); }
	 * 
	 * }
	 * 
	 * @When("validate PLI&DPS edit the WBSLists under WBS Info Section Equipment {string},{string},{string},{string},{string},{string},{string}"
	 * ) public void validate_wbsListEdit(String listName, String value1, String
	 * value2, String value3, String value4, String value5, String value6) throws
	 * Throwable { util.clickElement(EngineeringExecutionOBJ.wbsInfoLink, "");
	 * Thread.sleep(6000);
	 * util.selectValueAndEnter(EngineeringExecutionOBJ.wbsInfoDropdwn, listName);
	 * Thread.sleep(1000); util.clickElement(EngineeringExecutionOBJ.editListbtn,
	 * ""); Thread.sleep(3000);
	 * util.clickElement(EngineeringExecutionOBJ.deleteIcon2, "");
	 * 
	 * util.clickElement(EngineeringExecutionOBJ.addRowbtn, "");
	 * util.doSendKeys(WBSInformationOBJ.EquipmentTagColumnTextBox, value1);
	 * util.doSendKeys(WBSInformationOBJ.EquipmentNameColumnTextBox, value2);
	 * util.selectValueAndEnter(WBSInformationOBJ.equipmentTypeDD, value3);
	 * util.selectValueAndEnter(WBSInformationOBJ.purchaseSpecificationNumberNameDD,
	 * value4); util.selectValueAndEnter(WBSInformationOBJ.processAreaIdNameDD,
	 * value5); util.selectValueAndEnter(WBSInformationOBJ.cwaNumberNameDD, value6);
	 * util.clickElement(EngineeringExecutionOBJ.saveEditbtn, "");
	 * Thread.sleep(8000); }
	 * 
	 *//**
		 * @role PLI/DPS
		 * @header projectDashBoard
		 * @section projectInfo
		 */
	/*
	 * @Then("validate PLI&DPS edit the Project Information under Project Info Section {string},{string}"
	 * ) public void validate_projectInfo_edit(String projectInfoList, String
	 * fieldName) throws Throwable {
	 * 
	 * Thread.sleep(8000);
	 * util.selectValueAndEnter(EngineeringExecutionOBJ.wbsInfoDropdwn,
	 * projectInfoList); Thread.sleep(2000); //
	 * util.selectValueAndEnter(EngineeringExecutionOBJ.wbsInfoDropdwn, //
	 * projectInfoList); // Thread.sleep(2000);
	 * util.clickElement(EngineeringExecutionOBJ.editFormbtn, "");
	 * Thread.sleep(3000);
	 * 
	 * if (projectInfoList.equals("General Project Information")) { String date =
	 * "ssmm"; SimpleDateFormat sdf = new SimpleDateFormat(date); String date1 =
	 * sdf.format(new Date());
	 * util.clearAnddoSendKeys(EngineeringExecutionOBJ.proposalProjectRiskScore,
	 * date1); Thread.sleep(3000); WebElement web =
	 * driver.findElement(EngineeringExecutionOBJ.proposalProjectRiskScore);
	 * web.sendKeys(Keys.TAB);
	 * util.clickElement(EngineeringExecutionOBJ.saveEditbtn, "");
	 * Thread.sleep(5000); }
	 * 
	 * if (projectInfoList.equals("Piping") || projectInfoList.equals("Process") ||
	 * projectInfoList.equals("Electrical") || projectInfoList.equals("Structural")
	 * || projectInfoList.equals("I&C")) {
	 * util.clickElement(EngineeringExecutionOBJ.addFieldIcon,
	 * "AddField1 IconText "); util.doSendKeys(ProjectInfoOBJ.fieldNameTextBox,
	 * fieldName); Thread.sleep(2000);
	 * util.dropDownSelectByIndex(ProjectInfoOBJ.valueTypeDropDown, 3,
	 * "ValueType dropdown value"); Thread.sleep(2000);
	 * util.clickElement(ProjectInfoOBJ.addfieldSaveButton, "addfield Save Button");
	 * util.doSendKeys(EngineeringExecutionOBJ.newlyAddedFieldTextBox, "Test");
	 * Thread.sleep(2000); util.clickElement(EngineeringExecutionOBJ.saveEditbtn,
	 * ""); Thread.sleep(5000); } }
	 * 
	 *//**
		 * @throws Throwable
		 * @role projectUser & GDuser
		 * @header Input/Outputs
		 * @section projectOutputs
		 */
	/*
	 * @When("verify when projectUser clicks on Gig name {string} under Project Outputs section"
	 * ) public void validate_clickOn_gigName(String gigName) throws Throwable {
	 * Thread.sleep(2000); ((JavascriptExecutor) driver).executeScript(
	 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
	 * , driver.findElement(
	 * By.xpath("//tr[@class='row-container'][1]/td[1]/span/span/span[text()='" +
	 * gigName + "']"))); util.clickElement(
	 * By.xpath("//tr[@class='row-container'][1]/td[1]/span/span/span[text()='" +
	 * gigName + "']"), "gigName"); Thread.sleep(5000);
	 * 
	 * }
	 * 
	 * @Then("verify when projectUser clicks on Back") public void
	 * validate_clickOn_backBtn() throws Throwable {
	 * util.clickElement(ViewApproveFullProjectPlanOBJ.backButton,
	 * "overviewSection link"); Thread.sleep(5000); }
	 * 
	 * @When("verify projectUser filter records under ProjectOutputs section by selecting multiple records and also clear the all filter also"
	 * ) public void validate_projectOutput_filter() throws Throwable {
	 * util.clickElement(ViewApproveFullProjectPlanOBJ.filterIcon, "");
	 * ((JavascriptExecutor) driver).executeScript(
	 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
	 * , driver.findElement(EngineeringExecutionOBJ.pipingcheckbox));
	 * Thread.sleep(2000); util.clickElement(EngineeringExecutionOBJ.pipingcheckbox,
	 * "checkbox click");
	 * util.clickElement(EngineeringExecutionOBJ.specialityGroupCheckbox,
	 * "checkbox click"); util.clickElement(EngineeringExecutionOBJ.actualCheckbox,
	 * "checkbox click");
	 * util.clickElement(EngineeringExecutionOBJ.notReadyCheckbox,
	 * "checkbox click"); Thread.sleep(2000);
	 * 
	 * util.clickElement(ViewApproveFullProjectPlanOBJ.filterApplyButton, "");
	 * Thread.sleep(5000);
	 * 
	 * util.clickElement(ViewApproveFullProjectPlanOBJ.clearFilter, "");
	 * Thread.sleep(5000); }
	 * 
	 * @When("verify projectUser search the records and clear the record by clicking on cross icon {string} under ProjectOutputs section"
	 * ) public void validate_projectOutput_search(String searchText) throws
	 * Throwable {
	 * 
	 * util.clickElement(EngineeringExecutionOBJ.searchIcon, "searchIcon click"); if
	 * (util.isElementsPresent(EngineeringExecutionOBJ.searchTextBox)) {
	 * util.doSendKeys(EngineeringExecutionOBJ.searchTextBox, searchText);
	 * WebElement web = driver.findElement(EngineeringExecutionOBJ.searchTextBox);
	 * web.sendKeys(Keys.ENTER); Thread.sleep(5000);
	 * util.clickElement(EngineeringExecutionOBJ.searchClearIcon,
	 * "searchClearIcon click");
	 * 
	 * Thread.sleep(5000); }
	 * 
	 * if (util.isElementsPresent(EngineeringExecutionReferenceLibOBJ.
	 * manageReferenceSearchbox)) {
	 * util.doSendKeys(EngineeringExecutionReferenceLibOBJ.manageReferenceSearchbox,
	 * searchText); WebElement web =
	 * driver.findElement(EngineeringExecutionReferenceLibOBJ.
	 * manageReferenceSearchbox); web.sendKeys(Keys.ENTER); Thread.sleep(5000);
	 * util.clickElement(EngineeringExecutionOBJ.searchClearIcon,
	 * "searchClearIcon click");
	 * 
	 * Thread.sleep(5000); } }
	 * 
	 * @When("verify GDUser Edit Project Outputs Table and set assumption in Project Outputs table {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}"
	 * ) public void validate_editProjectOutputsTable(String outputValue, String
	 * value1, String value2, String value3, String value4, String value5, String
	 * value6, String value7, String value8,String value9, String
	 * outputValueforEdit) throws Throwable {
	 * util.clickElement(EngineeringExecutionOBJ.editOutputbtn, "click");
	 * Thread.sleep(2000); util.clickElement(EngineeringExecutionOBJ.addRowbtn,
	 * "click"); Thread.sleep(3000);
	 * util.doSendKeys(EngineeringExecutionOBJ.outputTextbx, outputValue);
	 * util.selectValueAndEnter(EngineeringExecutionOBJ.valueTypeTB, value1);
	 * util.selectValueAndEnter(EngineeringExecutionOBJ.uomTypeTB, value2);
	 * util.selectValueAndEnter(EngineeringExecutionOBJ.responsibleDisciplineTB,
	 * value3); //util.selectValueAndEnter(EngineeringExecutionOBJ.originTB,
	 * value4);
	 * 
	 * 
	 * 
	 * 
	 * util.clickElement(EngineeringExecutionOBJ.originGigTB, "click");
	 * Thread.sleep(2000); util.clickElement(By.xpath("//div[text()='Laminar']"),
	 * "click");
	 * 
	 * 
	 * driver.findElement(EngineeringExecutionOBJ.originGigTB).sendKeys(value5);
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * driver.findElement(By.xpath("//div[text()='Laminar']")).click();
	 * 
	 * 
	 * 
	 * 
	 * WebElement element = driver.findElement(EngineeringExecutionOBJ.originTB);
	 * element.sendKeys(value4); Thread.sleep(1000);
	 * //element.sendKeys(Keys.DOWN,Keys.RETURN); element.sendKeys(Keys.DOWN);
	 * Thread.sleep(1000); element.sendKeys(Keys.RETURN); Thread.sleep(1000);
	 * element.sendKeys(Keys.ENTER); Thread.sleep(1000);
	 * 
	 * 
	 * 
	 * util.selectValueAndEnter(EngineeringExecutionOBJ.originGigTB, value5);
	 * util.selectValueAndEnter(EngineeringExecutionOBJ.baseNameTB, value6);
	 * util.selectValueAndEnter(EngineeringExecutionOBJ.deliverableTypeTB, value7);
	 * util.selectValueAndEnter(EngineeringExecutionOBJ.fileTypeTB, value8);
	 * Thread.sleep(2000);
	 * util.selectValueAndEnter(EngineeringExecutionOBJ.purposeTB, value9);
	 * 
	 * util.clickElement(EngineeringExecutionOBJ.saveEditbtn, "");
	 * 
	 * ((JavascriptExecutor) driver).executeScript(
	 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
	 * , driver.findElement(EngineeringExecutionOBJ.editOutputbtn));
	 * Thread.sleep(3000); util.clickElement(EngineeringExecutionOBJ.editOutputbtn,
	 * "click");
	 * 
	 * ((JavascriptExecutor) driver).executeScript(
	 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
	 * , driver.findElement(EngineeringExecutionOBJ.editIcon)); Thread.sleep(3000);
	 * util.clickElement(EngineeringExecutionOBJ.editIcon, "click");
	 * 
	 * ((JavascriptExecutor) driver).executeScript(
	 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
	 * , driver.findElement(EngineeringExecutionOBJ.outputTextbxedit));
	 * Thread.sleep(3000); util.doSendKeys(EngineeringExecutionOBJ.outputTextbxedit,
	 * outputValueforEdit); util.clickElement(EngineeringExecutionOBJ.saveEditbtn,
	 * "");
	 * 
	 * ((JavascriptExecutor) driver).executeScript(
	 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
	 * , driver.findElement(EngineeringExecutionOBJ.editOutputbtn));
	 * Thread.sleep(3000); util.clickElement(EngineeringExecutionOBJ.editOutputbtn,
	 * "click");
	 * 
	 * ((JavascriptExecutor) driver).executeScript(
	 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
	 * , driver.findElement(EngineeringExecutionOBJ.deleteIconInOut));
	 * Thread.sleep(3000);
	 * util.clickElement(EngineeringExecutionOBJ.deleteIconInOut, "click");
	 * Thread.sleep(3000); util.clickElement(EngineeringExecutionOBJ.deletebtn,
	 * "click"); util.clickElement(EngineeringExecutionOBJ.saveEditbtn, ""); }
	 * 
	 *//**
		 * @throws Throwable
		 * @role projectUser
		 */
	/*
	 * @When("verify when project user move full page without saving for all subSection in gigDashBoard screen {string}"
	 * ) public void validate_moveFullPage_without_saving(String logHour) throws
	 * Throwable {
	 * 
	 * util.clearAnddoSendKeys(EngineeringExecutionOBJ.logtextbox, logHour);
	 * Thread.sleep(3000);
	 * 
	 * if (util.clickElements(EngineeringExecutionOBJ.gigInfoLink,
	 * "gigInfoLink click")) { Thread.sleep(3000);
	 * util.clickElement(EngineeringExecutionOBJ.discardBtn, ""); }
	 * 
	 * util.clickElement(EngineeringExecutionOBJ.gigInfoLink, "gigInfoLink click");
	 * Thread.sleep(3000); util.clickElement(EngineeringExecutionOBJ.gigEditForm,
	 * "editFormbtn click"); Thread.sleep(3000);
	 * util.scrollDownTillElementPresent(EngineeringExecutionOBJ.forcastStartDt);
	 * 
	 * WebElement startDate =
	 * driver.findElement(EngineeringExecutionOBJ.forcastStartDt); DateFormat
	 * dateFormat = new SimpleDateFormat("dd-MM-yyyy"); Date today =
	 * Calendar.getInstance().getTime(); String date = dateFormat.format(today);
	 * startDate.clear(); startDate.sendKeys(date); Thread.sleep(4000);
	 * startDate.sendKeys(Keys.TAB); Thread.sleep(4000); WebElement finishDate =
	 * driver.findElement(EngineeringExecutionOBJ.forcastFinishDt);
	 * finishDate.sendKeys(Keys.TAB); Thread.sleep(4000);
	 * 
	 * if (util.clickElements(EngineeringExecutionOBJ.discussionLink,
	 * "gigInfoLink click")) { Thread.sleep(3000);
	 * util.clickElement(EngineeringExecutionOBJ.discardBtn, "");
	 * Thread.sleep(3000); }
	 * 
	 * }
	 * 
	 *//**
		 * @throws Throwable
		 * @role GD
		 * @section gigReference
		 */
	/*
	 * @When("verify when GD user edit Gig Reference full page {string}") public
	 * void validate_edit_gig_reference(String referenceName) throws Throwable {
	 * 
	 * util.clickElement(EngineeringExecutionOBJ.gigReferencesLink, " click");
	 * Thread.sleep(3000);
	 * 
	 * if (util.isElementsPresent(EngineeringExecutionOBJ.gigRefeEditListbtn)) {
	 * util.clickElement(EngineeringExecutionOBJ.gigRefeEditListbtn,
	 * "gigRefeEditListbtn click");
	 * 
	 * } ((JavascriptExecutor) driver).executeScript(
	 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
	 * , driver.findElement(EngineeringExecutionOBJ.addReferenceBtn));
	 * util.clickElement(EngineeringExecutionOBJ.addReferenceBtn, "");
	 * 
	 * ((JavascriptExecutor) driver).executeScript(
	 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
	 * , driver.findElement(EngineeringExecutionOBJ.referenceNameDD));
	 * util.selectValueAndEnter(EngineeringExecutionOBJ.referenceNameDD,
	 * referenceName); Thread.sleep(3000);
	 * 
	 * util.clickElement(EngineeringExecutionOBJ.referenceGigdeleteIcon, "");
	 * Thread.sleep(3000); util.clickElement(EngineeringExecutionOBJ.proceedbtn,
	 * "");
	 * 
	 * ((JavascriptExecutor) driver).executeScript(
	 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
	 * , driver.findElement(EngineeringExecutionOBJ.saveeditbtn));
	 * util.clickElement(EngineeringExecutionOBJ.saveeditbtn, "");
	 * 
	 * }
	 * 
	 *//**
		 * @throws Throwable
		 * @throws Throwable
		 * @role projectUser
		 * @section My ProjectHomePage
		 * @menu overview
		 */
	/*
	 * @When("validate projectUser select category from dropDown and enter the logHour {string} in Log Time Widget under Overview Section"
	 * ) public void validate_logTime(String logHour) throws Throwable {
	 * ((JavascriptExecutor) driver).executeScript(
	 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
	 * , driver.findElement(EngineeringExecutionOBJ.logTimeDD));
	 * util.dropDownSelectByIndex(EngineeringExecutionOBJ.logTimeDD, 1,
	 * "dropDown link"); Thread.sleep(1000);
	 * util.clickElement(EngineeringExecutionOBJ.hoursTextBox, "click in");
	 * util.clearAnddoSendKeys(EngineeringExecutionOBJ.hoursTextBox, logHour);
	 * 
	 * }
	 * 
	 * @When("validate {string} is click from my project home header") public void
	 * clicks_on_sections(String sectionName) throws Throwable {
	 * 
	 * util.clickElement(By.xpath("//button[text()='" + sectionName + "']"), "");
	 * Thread.sleep(10000); }
	 * 
	 * @Then("GCProjectUser filter the Gig Cards in My Gigs sub-menu section")
	 * public void validate_filter_the_gig_cards() throws Throwable {
	 * util.clickElement(EngineeringExecutionOBJ.notReadyChckbox,
	 * "click on the chckbx"); Thread.sleep(2000);
	 * util.clickElement(EngineeringExecutionOBJ.readyTostrtChckbox,
	 * "click on the chckbx"); Thread.sleep(2000);
	 * util.clickElement(EngineeringExecutionOBJ.applyButton,
	 * "click on the button"); Thread.sleep(4000); }
	 * 
	 * @Then("GCProjectUser Filter Work Item Cards in My Work Items sub-menu section"
	 * ) public void validate_filter_of_work_item() throws Throwable {
	 * 
	 * util.dropDownSelectByIndex(EngineeringExecutionOBJ.vievingDD, 1, "DD Value");
	 * Thread.sleep(2000);
	 * util.dropDownSelectByIndex(EngineeringExecutionOBJ.urgencyDD, 1, "DD value");
	 * Thread.sleep(2000); util.clickElement(EngineeringExecutionOBJ.applyButton,
	 * ""); }
	 * 
	 * below code later use
	 * 
	 * @When("validate user click on overview section") public void
	 * validate_clickOn_overviewSection() throws Throwable {
	 * util.clickElement(EngineeringExecutionOBJ.overviewSectionlnk,
	 * "overviewSection link"); Thread.sleep(8000);
	 * 
	 * }
	 * 
	 * @Then("validate projectUser selecting Full Project under Overview Section and displays data reported for all gigs within project {string}"
	 * ) public void validate_projectStatusWidget(String fullProject) throws
	 * Throwable {
	 * util.clickElement(By.xpath("//div[@class='dropdown-toggle']/span[text()='" +
	 * fullProject + "']"), "dropDown"); Thread.sleep(2000); }
	 * 
	 * @Then("validate projectUser selecting Read More button under Overview Section and navigates user to Project Info Section"
	 * ) public void user_enters_Define_Activities_screen() throws Throwable {
	 * ((JavascriptExecutor) driver).executeScript(
	 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
	 * , driver.findElement(EngineeringExecutionOBJ.readMorelink));
	 * Thread.sleep(6000); util.clickElement(EngineeringExecutionOBJ.readMorelink,
	 * " readMorelink"); Thread.sleep(5000);
	 * 
	 * }
	 * 
	 * @Then("verify when user select the first gigActivity TaskName") public void
	 * validate_select_TaskName1() throws Throwable {
	 * 
	 * util.scrollDownTillBottum();
	 * util.clickElement(ViewApproveFullProjectPlanOBJ.firstTaskName,
	 * "click on the drop down");
	 * 
	 * }
	 * 
	 *//**
		 * @throws Throwable
		 * @role projectUser
		 * @header MylaminarScope
		 * @menu Project Gigs
		 *//*
			 * @Then("validate projectUser click on the threeDot Icon") public void
			 * validate_click_on_threeDot() throws Throwable {
			 * util.clickElement(EngineeringExecutionOBJ.dotedIcon, "click");
			 * Thread.sleep(5000);
			 * 
			 * }
			 * 
			 * @Then("verify when user selects Sort Ascending option") public void
			 * validate_click_on_ascending() throws Throwable {
			 * util.clickElement(EngineeringExecutionOBJ.sortAscending, "click");
			 * Thread.sleep(3000); }
			 * 
			 * @Then("verify when user selects Sort Descending option") public void
			 * validate_click_on_descending() throws Throwable {
			 * util.clickElement(EngineeringExecutionOBJ.sortDescending, "click");
			 * Thread.sleep(3000); }
			 * 
			 * @Then("verify when user selects Filter option in the popup and enter value in textbox {string}"
			 * ) public void validate_click_on_filter(String filterInputValue) throws
			 * Throwable { util.clickElement(EngineeringExecutionOBJ.filter, "click");
			 * Thread.sleep(3000);
			 * util.clearAnddoSendKeys(EngineeringExecutionOBJ.filterInputbox,
			 * filterInputValue); }
			 * 
			 * @Then("verify when user selects Filter option in the popup and Clear the filter"
			 * ) public void validate_click_on_filter_and_clear() throws Throwable {
			 * util.clickElement(EngineeringExecutionOBJ.filter, "click");
			 * Thread.sleep(3000); ((JavascriptExecutor) driver).executeScript(
			 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
			 * , driver.findElement(EngineeringExecutionOBJ.clearbtn));
			 * util.clickElement(EngineeringExecutionOBJ.clearbtn, "click"); }
			 * 
			 * @Then("verify user selects Filter button") public void
			 * validate_click_on_filterButton() throws Throwable {
			 * util.clickElement(EngineeringExecutionOBJ.filterBtn, "click");
			 * Thread.sleep(5000); }
			 * 
			 * @Then("verify user select value from itemsPerPage dropDown") public void
			 * validate_click_on_dropdown() throws Throwable {
			 * util.dropDownSelectByValue(EngineeringExecutionOBJ.selectItemPerPage, "100",
			 * ""); Thread.sleep(5000); }
			 * 
			 * @Then("Verify when user selects farward option") public void
			 * validate_click_on_farward() throws Throwable { Thread.sleep(1000);
			 * util.clickElement(EngineeringExecutionOBJ.farwardIcon, ""); }
			 * 
			 * @Then("Verify when user selects previous option") public void
			 * validate_click_on_previous() throws Throwable {
			 * 
			 * Thread.sleep(1000); util.clickElement(EngineeringExecutionOBJ.previousIcon,
			 * ""); }
			 * 
			 * @Then("Verify Clicking on a Gig IDName navigates user to the Gig Dashboard for the given instance"
			 * ) public void validate_click_on_gigIDName() throws Throwable {
			 * util.clickElement(EngineeringExecutionOBJ.firstgGigClick, "");
			 * Thread.sleep(5000); }
			 */
}
