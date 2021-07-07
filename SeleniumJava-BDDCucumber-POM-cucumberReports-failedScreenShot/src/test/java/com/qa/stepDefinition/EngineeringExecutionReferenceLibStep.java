package com.qa.stepDefinition;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.pages.EngineeringExecutionOBJ;
import com.qa.pages.EngineeringExecutionReferenceLibOBJ;
import com.qa.pages.Gig_WorkflowsOBJ;
import com.qa.pages.ProjectActivityOBJ;
import com.qa.pages.ProjectInfoOBJ;
import com.qa.pages.ReferenceLibraryOBJ;
import com.qa.pages.ViewApproveFullProjectPlanOBJ;
import com.qa.pages.WBSInformationOBJ;
import com.qa.util.TestUtilDemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
/**
 * @authorID Rat105478
 * @authorName RameshRathod
 */

public class EngineeringExecutionReferenceLibStep {
	private WebDriver driver;
	public static String date = "ssmm";
	static SimpleDateFormat sdf = new SimpleDateFormat(date);
	public static String refID = sdf.format(new Date());
	TestUtilDemo util;
	@Then("Verify when user clicks on Link in references table")
	public void validate_viewGigDashBoard_gigInfo() throws Throwable {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(EngineeringExecutionReferenceLibOBJ.twenthrowDocumentLink));
		Thread.sleep(2000);
		util.clickElement(EngineeringExecutionReferenceLibOBJ.twenthrowDocumentLink, "link click");
		Thread.sleep(1000);
		// get current window
		String mainWindowHandle = driver.getWindowHandles().iterator().next();
		// switch back
		driver.switchTo().window(mainWindowHandle);
	}
 
	@Then("Verify pagination in reference library table")
	public void verify_pagination() throws Throwable {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(EngineeringExecutionReferenceLibOBJ.previousPagination));
		Thread.sleep(2000);
		//TestUtilDemo.clickElement(EngineeringExecutionReferenceLibOBJ.nextPagination, "link click");
		//Thread.sleep(1000);
		
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//span[text()='Next'][1]"))).click().build().perform();
		Thread.sleep(1000);
		ac.moveToElement(driver.findElement(By.xpath("//span[text()='Previous'][1]"))).click().build().perform();
		Thread.sleep(2000);
		//TestUtilDemo.clickElement(EngineeringExecutionReferenceLibOBJ.previousPagination, "link click");
	}
	
	@Then("Validate user click on the manageReference button")
	public void verify_manageReference_button() throws Throwable {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(EngineeringExecutionReferenceLibOBJ.manageReferencesbtn));
		Thread.sleep(2000);
		util.clickElement(EngineeringExecutionReferenceLibOBJ.manageReferencesbtn, "link click");
		Thread.sleep(1000);
		
	}
	
	@Then("validate user click on the back link")
	public void verify_backButton() throws Throwable {
		util.clickElement(EngineeringExecutionReferenceLibOBJ.backBtn, "link click");
		Thread.sleep(3000);
		util.clickElement(EngineeringExecutionReferenceLibOBJ.manageReferencesbtn, "link click");
		Thread.sleep(1000);
		
	}
	
	/*
	 * @Then("validate user fill the Newly added row with categoryName{string}, name{string}, ID, referenceSectionDD, responsibleDisciplineDD, link{string}"
	 * ) public void verify_add_new_category(String categoryName, String name,
	 * String link) throws Throwable {
	 * util.selectValueAndEnter(EngineeringExecutionReferenceLibOBJ.
	 * categoryTextBoxDD, categoryName);
	 * util.clearAnddoSendKeys(ReferenceLibraryOBJ.nameTextBox, name);
	 * Thread.sleep(1000); util.clearAnddoSendKeys(ReferenceLibraryOBJ.IDtextBox,
	 * refID); Thread.sleep(1000);
	 * util.dropDownSelectByIndex(EngineeringExecutionReferenceLibOBJ.
	 * referenceSectionDD, 1, "");
	 * util.dropDownSelectByIndex(EngineeringExecutionReferenceLibOBJ.
	 * responsibleDisciplineDD, 1, "");
	 * util.clearAnddoSendKeys(ReferenceLibraryOBJ.linkTextBox, link);
	 * Thread.sleep(3000);
	 * 
	 * 
	 * }
	 */
	
	
}
