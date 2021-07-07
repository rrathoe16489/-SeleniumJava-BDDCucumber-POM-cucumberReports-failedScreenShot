package com.qa.stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.factory.DriverFactory;
import com.qa.pages.ProjectInfoOBJ;
import com.qa.pages.WBSInformationOBJ;
import com.qa.util.TestUtilDemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @authorID Rat105478
 * @authorName RameshRathod
 */
public class ProjectInformationStep {
	private WebDriver driver = DriverFactory.getDriver();
	private TestUtilDemo util = new TestUtilDemo(DriverFactory.getDriver());

	public static By PROJECTSELECTION;
	public static String number = "hhmmss";
	static SimpleDateFormat sdf = new SimpleDateFormat(number);
	public static String projectCard = sdf.format(new Date());

	@Given("valildate user create new project card {string}")
	public void validate_user_create_new_project(String projectName) throws Throwable {
		Thread.sleep(10000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.createNewProject, "");
		Thread.sleep(10000);
		TestUtilDemo.doSendKeys(ProjectInfoOBJ.projectNumberTextBox, projectCard);
		Thread.sleep(1000);
		TestUtilDemo.doSendKeys(ProjectInfoOBJ.projectNameTextBox, projectName);
		Thread.sleep(1000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.createButton, "");
		Thread.sleep(10000);

	}

	@Given("valildate user can see createNewProject button")
	public void validate_user_can_see_createNewProjectButton() throws Throwable {
		Thread.sleep(10000);
		boolean flag = TestUtilDemo.isElementsPresent(ProjectInfoOBJ.createNewProject);
		Assert.assertTrue(flag);

	}

	@Given("validate user select newly created project card")
	public void validate_user_select_project() throws Throwable {
		/*
		 * ((JavascriptExecutor) driver).executeScript(
		 * "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})"
		 * , driver.findElement(By.xpath("//div[@class='card-body']/p[text()='" +
		 * projectCard + "']")));
		 * TestUtilDemo.clickElement(By.xpath("//div[@class='card-body']/p[text()='" +
		 * projectCard + "']"), "project selection"); Thread.sleep(5000);
		 */

		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(ProjectInfoOBJ.PROJECTSELECTIONTesting));

		TestUtilDemo.clickElement(ProjectInfoOBJ.PROJECTSELECTIONTesting, "Project Selection");
		Thread.sleep(7000);
		

	}

	@Given("validate user login as a {string} role")
	public void login_as_a_role(String value) throws Throwable {

		TestUtilDemo.doSendKeys(WBSInformationOBJ.userName, value);
		TestUtilDemo.clickElement(ProjectInfoOBJ.SIGNINBUTTON, "");
		Thread.sleep(20000);

		/*
		 * TestBase.initialization();
		 * TestUtilDemo.doSendKeys(WBSInformationOBJ.userName, value);
		 * Thread.sleep(2000); TestUtilDemo.clickElement(ProjectInfoOBJ.SIGNINBUTTON,
		 * ""); Thread.sleep(20000); scn.write("USER HAS LOGGED-IN SUCCESSFULLY");
		 */

	}

	@Then("validate {string} header is clicked")
	public void validate_headers_are_clicked(String value) throws Throwable {

		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(By.xpath("//div[text()='" + value + "']")));
		TestUtilDemo.clickElement(By.xpath("//div[text()='" + value + "']"), "select first activity");
		Thread.sleep(10000);

	}

	@Then("^validate ResetBtn is Display$")
	public void validate_reset_btn_is_display() {
		boolean flag = TestUtilDemo.isElementPresent(ProjectInfoOBJ.RESET_BUTTON, " Reset Button");
		Assert.assertTrue(flag);
	}

	@Then("^validate SaveBtn is Display$")
	public void validate_save_btn_is_display() {
		boolean flag = TestUtilDemo.isElementPresent(ProjectInfoOBJ.SAVE_BUTTON, " Save Button");
		Assert.assertTrue(flag);
	}

	@Then("^validate CompleteBtn is Display$")
	public void validate_complete_btn_is_display() {
		boolean flag = TestUtilDemo.isElementPresent(ProjectInfoOBJ.COMPLETE_BUTTON, " Complete Button");
		Assert.assertTrue(flag);
	}

	/**
	 * @role PLI
	 * @section GeneralProjectInformation
	 */

	@When("User click on the GeneralProjectInformation SubSection First Time")
	public void user_click_on_the_general_project_information_sub_section_first_time() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.GENERALPROJECTINFORMATION_SECTION,
				"GeneralProjectInformation Section Link");
		Thread.sleep(7000);
	}

	@Then("Validate BaiscProjectData Ttile is display at top")
	public void validate_baisc_project_data_ttile_is_display_at_top() {
		boolean flag = TestUtilDemo.isElementPresent(ProjectInfoOBJ.generalPISubsectionTitle,
				" BaiscProjectData Ttile Text");
		Assert.assertTrue(flag);

	}

	@When("Verify user can select value from the Project Type dropdown")
	public void verify_user_can_select_value_from_the_project_type_dropdown() throws Throwable {
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.projectTypeDropDown, "projectType Dropdown");
		TestUtilDemo.clickElement(ProjectInfoOBJ.projectTypeDropDownValue, "EPC Dropdown value");
		Thread.sleep(2000);
	}

	@Then("validate ResetBtn is Enable")
	public void validate_reset_btn_is_enable() {
		boolean flag = TestUtilDemo.isEnabled(ProjectInfoOBJ.RESET_BUTTON, " Reset Button");
		Assert.assertTrue(flag);
	}

	@Then("validate SaveBtn is Enable")
	public void validate_save_btn_is_enable() {
		boolean flag = TestUtilDemo.isEnabled(ProjectInfoOBJ.SAVE_BUTTON, "save button");
		Assert.assertTrue(flag);

	}

	@When("Validate user click on ResetButton")
	public void validate_user_click_on_reset_button() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.RESET_BUTTON, " Reset Button Link");
		Thread.sleep(2000);
	}

	@Then("Validate ResetPage modal is popUp")
	public void validate_reset_page_modal_is_pop_up() throws Throwable {
		boolean flag = TestUtilDemo.isElementPresent(ProjectInfoOBJ.resetPageModal, " ResetPage modal");
		Assert.assertTrue(flag);
		Thread.sleep(5000);
	}

	/*
	 * @Then("^validate Reset message is display under pop Modal$") public void
	 * validate_reset_message_is_display_under_pop_modal() throws Throwable { String
	 * resetMessageEX = prop.getProperty("resetMessage"); String resetMessageAC =
	 * TestUtilDemo.getTex(ProjectInfoOBJ.resetMessage);
	 * Assert.assertEquals(resetMessageAC, resetMessageEX); Thread.sleep(2000); }
	 */

	@Then("validate click on cancel button modal is disapear")
	public void validate_click_on_cancel_button_modal_is_disapear() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.cancelButton, " Cancel button click");
		Thread.sleep(5000);
	}

	@Then("validate again user click on reset button")
	public void validate_again_user_click_on_reset_button() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.RESET_BUTTON, " Again Reset Button click");
		Thread.sleep(2000);
	}

	@Then("validate user click on continue button")
	public void validate_user_click_on_continue_button() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.continueButton, "continue Button click");
		Thread.sleep(2000);
	}

	@When("Verify user can select value from the TypeOfFacility dropdown")
	public void verify_user_can_select_value_from_the_type_of_facility_dropdown() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.typeofFacilityDropDown, "TypeOfFacility Dropdown");
		TestUtilDemo.clickElement(ProjectInfoOBJ.typeofFacilityDropDownValue, "Fertilizer Dropdown value");
		Thread.sleep(2000);
	}

	@Then("Verify user can select value from the SupportingOffices dropdown")
	public void verify_user_can_select_value_from_the_supporting_offices_dropdown() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.supportingOfficesDropDown, "SupportingOffices Dropdown");
		TestUtilDemo.clickElement(ProjectInfoOBJ.supportingOfficesDropDownValue, "Dropdown value");
		Thread.sleep(2000);
	}

	@Then("Verify user can select radio button in RiskAssessmentCompleted field")
	public void verify_user_can_select_radio_button_in_risk_assessment_completed_field() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.riskAssessmentCompletedYRB, "RiskAssessmentCompleted radio button");
		Thread.sleep(2000);
	}

	@Then("Verify user can enter value in ProposalProjectRiskScore Textbox {string}")
	public void verify_user_can_enter_value_in_proposal_project_risk_score_textbox(String riskscore) throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.proposalProjectRiskScoreTF, "ProposalProjectRiskScore Textbox");
		TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.proposalProjectRiskScoreTF, riskscore);
		Thread.sleep(2000);
	}

	@Then("Verify user can enter value in ProposalProjectRiskLevel Textbox {string}")
	public void verify_user_can_enter_value_in_proposal_project_risk_level_textbox(String risklevel) throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.proposalProjectRiskLevelTF, "ProposalProjectRiskLevel Textbox");
		TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.proposalProjectRiskLevelTF, risklevel);
		Thread.sleep(2000);
	}

	@Then("Verify user can select value from the LeadOffice dropdown")
	public void verify_user_can_select_value_from_the_lead_office_dropdown() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.leadOfficeDropDown, "LeadOffice Dropdown");
		TestUtilDemo.clickElement(ProjectInfoOBJ.leadOfficeDropDownValue, " Dropdown value");
		Thread.sleep(2000);
	}

	@Then("Verify user can enter the value in FacilityTechnology textBox {string}")
	public void verify_user_can_enter_the_value_in_facility_technology_text_box(String FacilityTechnology)
			throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.facilityTechnologyTF, "FacilityTechnology Textbox");
		TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.facilityTechnologyTF, FacilityTechnology);
		Thread.sleep(5000);
	}

	@Then("Verify user can select value from the ConstructionContractType dropdown")
	public void verify_user_can_select_value_from_the_construction_contract_type_dropdown() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.constructionContractTypeDropDown, "ConstructionContractType Dropdown");
		TestUtilDemo.clickElement(ProjectInfoOBJ.constructionContractTypeDropDownValue, " Dropdown value");
		Thread.sleep(5000);
		TestUtilDemo.scrollDownToElementPresent(ProjectInfoOBJ.clientNameFN);
	}

	@Then("Verify user can enter value in ClientName Textbox {string}")
	public void verify_user_can_enter_value_in_client_name_textbox(String clientname) throws Throwable {
		String clientName = driver.findElement(ProjectInfoOBJ.clientNameTF).getAttribute("value");
		if (clientName.equals("Client Name Testing")) {
			TestUtilDemo.clickElement(ProjectInfoOBJ.clientNameTF, "FacilityTechnology Textbox");
			TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.clientNameTF, clientname);
			Thread.sleep(2000);
		} else {
			TestUtilDemo.doSendKeys(ProjectInfoOBJ.clientNameTF, clientname);
		}

	}

	@Then("^Verify user can select radio button from BrownAndGreen field$")
	public void verify_user_can_select_radio_button_from_brown_and_green_field() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.brownFieldBFRB, "BrownAndGreen field radioButton");
		Thread.sleep(5000);
	}

	@Then("Verify user can select radio button from IsBlackAndVeatch field")
	public void verify_user_can_select_radio_button_from_IsBlackAndVeatch_field() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.isBlackAndVeatchYRB, "IsBlackAndVeatch field radioButton");
		Thread.sleep(5000);
		TestUtilDemo.scrollDown();
	}

	@Then("Verify user can select radio button from AreThereForiegnContract field")
	public void verify_user_can_select_radio_button_from_are_there_foriegn_contract_field() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.areTheresForiegnContractYRB,
				"AreThereForiegnContract field radioButton");
		Thread.sleep(2000);
	}

	@Then("Validate ProjectLocation Ttile is display")
	public void validate_project_location_ttile_is_display() {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.projectLocationSubSectionTitle, "ProjectLocation Ttile ");

	}

	@Then("Validate AddField IconText is display")
	public void validate_add_field_icon_text_is_display() {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.addFieldIcon2, "AddField IconText ");

	}

	@Then("Verify user can enter value in ProjectLocationState Textbox {string}")
	public void verify_user_can_enter_value_in_project_location_state_textbox(String locationstate) throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.projectLocationStateTF, "ProjectLocationState Textbox");
		TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.projectLocationStateTF, locationstate);
		Thread.sleep(2000);
	}

	@Then("Verify user can enter value in ProjectLocationCountry Textbox {string}")
	public void verify_user_can_enter_value_in_project_location_country_textbox(String projectLocationcountry)
			throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.projectLocationCountryTF, "ProjectLocationCountry Textbox");
		TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.projectLocationCountryTF, projectLocationcountry);
		Thread.sleep(2000);
	}

	@Then("Verify user can enter value in ProjectLocationCity Textbox {string}")
	public void verify_user_can_enter_value_in_project_location_city_textbox(String projectLocationCity)
			throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.projectLocationCityTF, "ProjectLocationCity Textbox");
		TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.projectLocationCityTF, projectLocationCity);
		Thread.sleep(2000);
	}

	@Then("Validate KeyScheduleDates Ttile is display")
	public void validate_key_schedule_dates_ttile_is_display() {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.keyScheduleDatesSubSectionTitle, "KeyScheduleDates Ttile");

	}

	@Then("Verify user can enter value in EstEngineeringTimeframe Textbox {string}")
	public void verify_user_can_enter_value_in_est_engineering_timeframe_textbox(String engineeringTimeFrame)
			throws InterruptedException {
		TestUtilDemo.clickElement(ProjectInfoOBJ.engineeringTimeframeTF, "EstEngineeringTimeframe Textbox");
		TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.engineeringTimeframeTF, engineeringTimeFrame);
		Thread.sleep(2000);
	}

	@Then("Verify user can enter value in EstConstructionTimeframe Textbox {string}")
	public void verify_user_can_enter_value_in_est_construction_timeframe_textbox(String EngineeringConstrTimeframe)
			throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.constructionTimeframeTF, "EstConstructionTimeframe Textbox");
		TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.constructionTimeframeTF, EngineeringConstrTimeframe);
		Thread.sleep(2000);
	}

	@When("Validate user select OTHER from the dropDown")
	public void validate_user_select_other_from_the_drop_down() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.typeofFacilityDropDown, "TypeOfFacility Dropdown");
		TestUtilDemo.clickElement(ProjectInfoOBJ.typeofFacilityDropDownOtherValue, "Other Dropdown value");
		Thread.sleep(2000);
	}

	@When("Validate user click on the projectScope Section")
	public void validate_user_click_on_the_project_scope_section() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.PROJECTSCOPE_SECTION, "projectScope Section");
		Thread.sleep(5000);
	}

	@When("Validate user can Save the information by clicking on Save button")
	public void validate_user_can_save_the_information_by_clicking_on_save_button() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.SAVE_BUTTON, "Save the information");
		Thread.sleep(2000);
	}

	/*
	 * @Then("^Validate Saving information message is display$") public void
	 * validate_saving_information_message_is_display() throws Throwable { String
	 * savingMessageEX = prop.getProperty("savingMessage"); String savingMessageAC =
	 * TestUtilDemo.getTex(ProjectInfoOBJ.saveMessage);
	 * Assert.assertEquals(savingMessageAC, savingMessageEX); Thread.sleep(2000); }
	 */

	@Then("validate CompleteBtn is Enable")
	public void validate_CompleteBtn_is_Enable() throws Throwable {
		TestUtilDemo.isEnabled(ProjectInfoOBJ.COMPLETE_BUTTON, "Complete Button Enable");
		Thread.sleep(2000);
	}

	@When("Validate user enter the value in clientName field textbox {string}")
	public void validate_user_enter_the_value_in_client_name_field_textbox(String client_name) throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.clientNameTF, "FacilityTechnology Textbox");
		TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.clientNameTF, client_name);
		Thread.sleep(2000);
	}

	@When("Validate user click on the complete button")
	public void validate_user_click_on_the_complete_button() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.COMPLETE_BUTTON, "complete button");
		Thread.sleep(2000);
	}

	@Then("validate only Edit button is display")
	public void validate_only_edit_button_is_display() throws Throwable {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.EDIT_BUTTON, "Edit button");
		Thread.sleep(2000);
	}

	@Then("Vaidate the section have check next to the Section")
	public void vaidate_the_section_have_check_next_to_the_section() throws Throwable {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.GPICheckedMark, "GPICheckedMark");
		Thread.sleep(2000);
	}

	@Then("Validate user click on the Edit button")
	public void validate_user_click_on_the_edit_button() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.EDIT_BUTTON, "Edit button click");

	}

	@Then("Validate check next to the Section is removed")
	public void validate_check_next_to_the_section_is_removed() throws Throwable {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.GPIUnCheckedMark, "Edit button");
		Thread.sleep(2000);
	}

	@Then("validate CompleteBttn is Enable")
	public void validate_completeBttn_is_enable() throws Throwable {
		TestUtilDemo.isEnabled(ProjectInfoOBJ.COMPLETE_BUTTON, "COmplete button");
		Thread.sleep(2000);
	}

	@When("validate addField button is Display With BPD title")
	public void validate_add_field_button_is_display_with_bpd_title() {
		TestUtilDemo.scrollDownForLogPage();
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.addFieldIcon2, "AddField1 IconText ");

	}

	@Then("validate user click on AddField button")
	public void validate_user_click_on_add_field_button() throws Throwable {
		TestUtilDemo.scrollDownForLogPage();
		TestUtilDemo.clickElement(ProjectInfoOBJ.addFieldIcon2, "AddField1 IconText ");
		Thread.sleep(2000);
	}

	@Then("validate user enter value in fieldName textBox {string}")
	public void validate_user_enter_value_in_field_name_text_box(String fieldname) throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.fieldNameTextBox, "fieldName Textbox");
		TestUtilDemo.doSendKeys(ProjectInfoOBJ.fieldNameTextBox, fieldname);
		Thread.sleep(2000);
	}

	@Then("Validate user select value from the valueType dropDown")
	public void validate_user_select_value_from_the_value_type_drop_down() throws Throwable {
		TestUtilDemo.dropDownSelectByIndex(ProjectInfoOBJ.valueTypeDropDown, 2, "ValueType dropdown value");
		Thread.sleep(2000);
	}

	@Then("Validate user click on the cancel button")
	public void validate_user_click_on_the_cancel_button() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.addfieldCancelButton, "cancel button");
		Thread.sleep(2000);
	}

	@Then("validate PROJECTSETUP_TOPTEXT screen display")
	public void validate_PROJECTSETUP_TOPTEXT_screen_display() {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.PROJECTSETUP_TOPTEXT, "PROJECTSETUP_TOPTEXT screen");
	}

	@Then("validate user again click on AddField Btn")
	public void validate_user_again_click_on_add_field_btn() throws Throwable {
		TestUtilDemo.scrollDownForLogPage();
		TestUtilDemo.clickElement(ProjectInfoOBJ.addFieldIcon2, "AddField1 IconText ");
		Thread.sleep(2000);

	}

	@Then("validate user click on cross icon")
	public void validate_user_click_on_cross_icon() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.addFieldCrossIcon, "click on cross icon");
		Thread.sleep(2000);
	}

	@Then("Validate PROJECTSETUP_TOPTEXT screen is display")
	public void validate_PROJECTSETUP_TOPTEXT_screen_is_display() {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.PROJECTSETUP_TOPTEXT, "PROJECTSETUP_TOPTEXT screen");

	}

	@When("validate user click on AddField icon")
	public void validate_user_click_on_add_field_icon() throws Throwable {
		TestUtilDemo.scrollDownForLogPage();
		TestUtilDemo.clickElement(ProjectInfoOBJ.addFieldIcon2, "addFieldIcon2 IconText ");
		Thread.sleep(2000);
	}

	@Then("validate user click on the save button")
	public void validate_user_click_on_the_save_button() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.addfieldSaveButton, "click on the save button ");
		Thread.sleep(2000);
	}

	/*
	 * @Then("^validate filed validation eror message is display$") public void
	 * validate_filed_validation_eror_message_is_display() throws Throwable { String
	 * requiredMessageHeaderEX = prop.getProperty("requiredMessage"); String
	 * requiredMessageHeaderAC =
	 * TestUtilDemo.getTex(ProjectInfoOBJ.validationError1);
	 * Assert.assertEquals(requiredMessageHeaderAC, requiredMessageHeaderEX);
	 * 
	 * String requiredMessageHeaderEX1 = prop.getProperty("requiredMessage"); String
	 * requiredMessageHeaderAC1 =
	 * TestUtilDemo.getTex(ProjectInfoOBJ.validationError2);
	 * Assert.assertEquals(requiredMessageHeaderAC1, requiredMessageHeaderEX1);
	 * Thread.sleep(2000); }
	 */

	@When("validate user enter duplicate field name {string}")
	public void validate_user_enter_duplicate_field_name(String duplicatefield) throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.fieldNameTextBox, "fieldName Textbox");
		TestUtilDemo.doSendKeys(ProjectInfoOBJ.fieldNameTextBox, duplicatefield);
		Thread.sleep(2000);

	}

	/*
	 * @Then("^validate validation error message is display$") public void
	 * validate_validation_error_message_is_display() throws Throwable { String
	 * nameExistsMessageHeaderEX1 = prop.getProperty("nameExistsMessage"); String
	 * nameExistsMessageHeaderAC1 =
	 * TestUtilDemo.getTex(ProjectInfoOBJ.duplicateErrorMessage);
	 * Assert.assertEquals(nameExistsMessageHeaderAC1, nameExistsMessageHeaderEX1);
	 * Thread.sleep(2000); }
	 */

	@Then("Validate user select Numeric value from dropdown")
	public void validate_user_select_numeric_value_from_dropdown() throws Throwable {
		TestUtilDemo.dropDownSelect(ProjectInfoOBJ.valueTypeDropDown, "Numeric", "Numeric value from dropdown");
		Thread.sleep(2000);
	}

	@Then("validate UOMType and UOM option is display")
	public void validate_uom_type_and_uom_option_is_display() {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.UOMTypeText, "UOMType Text");
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.UOMTText, "UOM Text");
	}

	@Then("validate select value from the UOMType and UOM dropDown field")
	public void validate_select_value_from_the_uom_type_and_uom_drop_down_field() throws Throwable {
		TestUtilDemo.dropDownSelect(ProjectInfoOBJ.UOMTypeDropDown, "Volume", "UOMType Text");
		TestUtilDemo.dropDownSelect(ProjectInfoOBJ.UOMDropDown, "gallons", "UOM Text");
		Thread.sleep(2000);
	}

	@Then("Validate user enter fieldName {string}")
	public void validate_user_enter_field_name(String fieldname) throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.fieldNameTextBox, "fieldName Textbox");
		TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.fieldNameTextBox, fieldname);
		Thread.sleep(2000);
	}

	@Then("Validate user click on the Save button")
	public void validate_user_click_on_the_Save_button() {
		TestUtilDemo.clickElement(ProjectInfoOBJ.addfieldSaveButton, "addfield Save Button");
	}

	@Then("validate added field is display under BasicProjectData section")
	public void validate_added_field_is_display_under_basic_project_data_section() throws Throwable {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.newlyAddedField, "Newly Added Field");
		TestUtilDemo.scrollDown();
		Thread.sleep(5000);

	}

	@Then("validate pencil icon for edit is display")
	public void validate_pencil_icon_for_edit_is_display() {
		TestUtilDemo.scrollDown();
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.newlyAddedFieldEditIcon, "pencil icon for edit");
	}

	@Then("validate cross icon for delete is display")
	public void validate_cross_icon_for_delete_is_display() {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.newlyAddedCrossIcon, "cross icon for delete");
	}

	@When("validate user enter alphabet in numeric field {string}")
	public void validate_user_enter_alphabet_in_numeric_field(String alphabetinnumeric) throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.newlyAddedFieldTextBox, "newly AddedField TextBox");
		TestUtilDemo.doSendKeys(ProjectInfoOBJ.newlyAddedFieldTextBox, alphabetinnumeric);
		Thread.sleep(2000);
		TestUtilDemo.scrollDown();
	}

	/*
	 * @When("^Validate Validation error message is displays$") public void
	 * validate_validation_error_message_is_displays() throws Throwable {
	 * TestUtilDemo.scrollDown(); String numericMessageHeaderEX =
	 * prop.getProperty("numericMessage"); String numericMessageHeaderAC =
	 * TestUtilDemo.getTex(ProjectInfoOBJ.validationErrorMessageForNumeric);
	 * Assert.assertEquals(numericMessageHeaderAC, numericMessageHeaderEX);
	 * Thread.sleep(2000); }
	 */

	@Then("validate enter only numeric value {string}")
	public void validate_enter_only_numeric_value(String onlynumericvalue) throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.newlyAddedFieldTextBox, "Newly added Field TextBox");
		TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.newlyAddedFieldTextBox, onlynumericvalue);
		Thread.sleep(2000);
	}

	/*
	 * @Then("validate user click on save button") public void
	 * validate_user_click_on_save_button() throws Throwable {
	 * 
	 * TestUtilDemo.clickElement(ProjectInfoOBJ.SAVE_BUTTON,
	 * "Click on save button"); Thread.sleep(5000);
	 * 
	 * if(TestUtilDemo.clickElements(ProjectInfoOBJ.SAVE_BUTTON, "click")) {
	 * scn.write("User Has Been Clicked On Save Button Successfully"); } else {
	 * scn.write("User Are Not Able To Click On Save Button"); }
	 * 
	 * }
	 */

	/**
	 * @role PLI
	 * @section ProjectScope
	 */
	@When("Validate user click on the ProjectScope Subsection")
	public void validate_user_click_on_the_project_scope_Subsection() throws Throwable {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(ProjectInfoOBJ.PROJECTSCOPE_SECTION));
		TestUtilDemo.clickElement(ProjectInfoOBJ.PROJECTSCOPE_SECTION, " click on the ProjectScope Subsection");
		Thread.sleep(5000);

	}

	@Then("validate user select and check all mendetory field in ProjectScope and click on save then complete {string}")
	public void validate_user_select_and_check_all_mendetory_field_in_project_scope(String PerformanceResponsibility)
			throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.frontEndEngineering1, " click on the ProjectScope Subsection Button");
		TestUtilDemo.clickElement(ProjectInfoOBJ.DetailedEngineering, " click on the ProjectScope Subsection Button");
		TestUtilDemo.clickElement(ProjectInfoOBJ.Procurementby, " click on the ProjectScope Subsection Button");
		TestUtilDemo.clickElement(ProjectInfoOBJ.ConstructionManagement,
				" click on the ProjectScope Subsection Button");

		TestUtilDemo.clickElement(ProjectInfoOBJ.ConstructionLiaison, " click on the ProjectScope Subsection Button");
		TestUtilDemo.clickElement(ProjectInfoOBJ.ConstructionbyBlack, " click on the ProjectScope Subsection Button");
		TestUtilDemo.clickElement(ProjectInfoOBJ.ConstructabilityCoordinator,
				" click on the ProjectScope Subsection Button");

		TestUtilDemo.clickElement(ProjectInfoOBJ.StartupbyBlack, " click on the ProjectScope Subsection Button");
		TestUtilDemo.clickElement(ProjectInfoOBJ.StartupSupport, " click on the ProjectScope Subsection Button");
		TestUtilDemo.clickElement(ProjectInfoOBJ.OperatorTraining, " click on the ProjectScope Subsection Button");

		TestUtilDemo.tabFeature(ProjectInfoOBJ.PerformanceResponsibility, PerformanceResponsibility);
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.MaterialsManagement, " click on the ProjectScope Subsection Button");
		TestUtilDemo.scrollDown();
		TestUtilDemo.clickElement(ProjectInfoOBJ.MarineScope, " click on the ProjectScope Subsection Button");
		TestUtilDemo.scrollDown();
		TestUtilDemo.clickElement(ProjectInfoOBJ.ProjectEngineering, " click on the ProjectScope Subsection Button");
		TestUtilDemo.clickElement(ProjectInfoOBJ.ProjectControls, " click on the ProjectScope Subsection Button");
		Thread.sleep(5000);
	}

	/**
	 * @role PLI
	 * @section TechnicalRequirement
	 */
	@When("Validate user click on the TechnicalRequirement section")
	public void validate_user_click_on_the_technical_requirement_section() throws Throwable {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(ProjectInfoOBJ.TECHNICALREQUIREMENT_SECTION));
		TestUtilDemo.clickElement(ProjectInfoOBJ.TECHNICALREQUIREMENT_SECTION,
				"click on the TECHNICALREQUIREMENT_SECTION");
		Thread.sleep(5000);

	}

	@Then("validate user select and check all mendetory field in TechnicalRequirement and click on save then complete {string},{string},{string}")
	public void validate_user_select_and_check_all_mendetory_field_in_technical_requirement(String value, String value1,
			String value2) throws Throwable {

		WebDriverWait ww = new WebDriverWait(driver, 30000);
		ww.until(ExpectedConditions.elementToBeClickable(ProjectInfoOBJ.unitSystemDropDown));
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.unitSystemDropDown, value);
		Thread.sleep(3000);

		WebElement element = driver.findElement(ProjectInfoOBJ.unitSystemDropDown);
		element.sendKeys(value);
		element.sendKeys(Keys.ENTER);

		TestUtilDemo.tabFeature(ProjectInfoOBJ.authorityHaving, value1);
		TestUtilDemo.tabFeature(ProjectInfoOBJ.stateRegCode, value2);
		TestUtilDemo.clickElement(ProjectInfoOBJ.PhysicalDesignApproach, " click on the PhysicalDesignApproach");
		TestUtilDemo.clickElement(ProjectInfoOBJ.AWPusedonproject, " click on the AWPusedonproject");
		TestUtilDemo.scrollDown();
		TestUtilDemo.clickElement(ProjectInfoOBJ.Modulesonproject, " click on the Modulesonproject");
		Thread.sleep(2000);
	}

	/**
	 * @role PLI
	 * @section projectControl
	 */
	@When("Validate user click on the project control section")
	public void validate_user_click_on_projectControl() throws Throwable {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(ProjectInfoOBJ.projectControls_Section));
		TestUtilDemo.clickElement(ProjectInfoOBJ.projectControls_Section, " section click");
	}

	@Then("validate user select and check all mendetory field in projectControl {string}")
	public void validate_user_fill_projectControl_softwareSection(String costTrackingSoftware) throws Throwable {
		TestUtilDemo.doSendKeys(ProjectInfoOBJ.costTrackingSoftwareTB, costTrackingSoftware);
		// TestUtilDemo.doSendKeys(ProjectInfoOBJ.staffingSoftware, staffingSoftware);
	}

	/**
	 * @role PLI
	 * @section Procurement
	 */
	@When("Validate user click on the Procurement section")
	public void validate_user_click_on_procurement() throws Throwable {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(ProjectInfoOBJ.procurement_Section));
		TestUtilDemo.clickElement(ProjectInfoOBJ.procurement_Section, " section click");
		Thread.sleep(2000);

	}

	@Then("validate user select and check all mendetory field in Procurement Software {string}")
	public void validate_user_fill_procurement_softwareSection(String materialTracking) throws Throwable {
		TestUtilDemo.doSendKeys(ProjectInfoOBJ.materialTracking, materialTracking);
		// TestUtilDemo.doSendKeys(ProjectInfoOBJ.procurementTracking,
		// procurementTracking);
	}

	@Then("validate Top ProjectInformation header is completed with cheked mark")
	public void validate_ProjectInfoHeader_check_is_display() {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.completeHeaderIconProjectInfo, "complete Header icon");

	}

	@When("validate user updateORenter value in 2D Design Software Textbox {string} and then reset, save button is enable")
	public void valdiate_user_update_the_form(String designSoftware) throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.stressAnalysisSoftwareTextBox, "stressAnalysisSoftware TextBox ");
		Thread.sleep(4000);
		TestUtilDemo.clearAnddoSendKeys(ProjectInfoOBJ.stressAnalysisSoftwareTextBox, designSoftware);
		Thread.sleep(4000);
		TestUtilDemo.clickElement(ProjectInfoOBJ.formInfo, "threeDDesingTextBox click");
	}

	@When("validate reset and save button is disable and complete button is enabled")
	public void valdiate_reset_and_save_button_is_disable_and_complete_button_is_enabled() throws Throwable {
		TestUtilDemo.isEnabled(ProjectInfoOBJ.COMPLETE_BUTTON, "COMPLETE_BUTTON");

	}

	@When("validate user click on save button then reset and save button is disable and complete button is enabled")
	public void valdiate_save_click_and_complete_button_is_enabled() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		TestUtilDemo.isEnabled(ProjectInfoOBJ.COMPLETE_BUTTON, "COMPLETE_BUTTON");

	}

	@When("validate addField button is Display and click")
	public void validate_add_field_button_is_display_with_piping_title() throws Throwable {
		TestUtilDemo.isElementPresent(ProjectInfoOBJ.addFieldIcon, "AddField IconText ");
		TestUtilDemo.clickElement(ProjectInfoOBJ.addFieldIcon, "AddField IconText ");
		Thread.sleep(2000);
	}

	/**
	 * @role process
	 */
	@When("validate user updateORenter value in Design Review Facilitation Textbox {string},{string}")
	public void valdiate_user_update_the_form1(String processDataSoftware, String plantCapacity) throws Throwable {
		// TestUtilDemo.doSendKeys(ProjectInfoOBJ.processDataSoftwareTextBox,
		// processDataSoftware);
		// TestUtilDemo.doSendKeys(ProjectInfoOBJ.plantCapacityTextBox, plantCapacity);

	}

	@Then("Validate user click on the save button")
	public void validate_user_click_on_save_button() throws Throwable {

		TestUtilDemo.clickElement(ProjectInfoOBJ.SAVE_BUTTON, "SAVE_BUTTON  click ");
		Thread.sleep(5000);
		boolean flag = TestUtilDemo.isElementsPresent(ProjectInfoOBJ.COMPLETE_BUTTON);
		boolean flag1 = false;
		if (flag == flag1) {
			TestUtilDemo.clickElement(ProjectInfoOBJ.SAVE_BUTTON, "SAVE_BUTTON  click ");
			Thread.sleep(5000);
		}
	}

	@Then("validate complete button is enabled")
	public void validate_complete_button_is_enabled() throws Throwable {
		TestUtilDemo.isEnabled(WBSInformationOBJ.COMPLETE_BUTTON, "Complete button");
		Thread.sleep(2000);
	}

	@Then("validate user click on complete button")
	public void validate_user_click_on_complete_button() throws Throwable {

		TestUtilDemo.clickElement(WBSInformationOBJ.COMPLETE_BUTTON, "COMPLETE_BUTTON  click ");
		Thread.sleep(5000);

		/*
		 * boolean flag = TestUtilDemo.isElementsPresent(ProjectInfoOBJ.EDIT_BUTTON);
		 * boolean flag1 = false; if (flag == flag1) {
		 * TestUtilDemo.clickElement(WBSInformationOBJ.COMPLETE_BUTTON,
		 * "COMPLETE_BUTTON  click "); Thread.sleep(5000); }
		 */
	}

	@Then("validate click on complete button")
	public void validate_click_on_complete_button() throws Throwable {

		TestUtilDemo.clickElement(WBSInformationOBJ.COMPLETE_BUTTON, "COMPLETE_BUTTON  click ");
		Thread.sleep(5000);

	}

	@Then("validate the last section within the last header area with dependencies is being marked Complete and click on continue")
	public void validate_user_click_on_continued_button() throws Throwable {
		if (TestUtilDemo
				.isElementsPresent(By.xpath("//*[@class='bvModalButtonContainer']/button[text()='Continue']"))) {
			new WebDriverWait(driver, 2000).until(ExpectedConditions
					.elementToBeClickable(By.xpath("//*[@class='bvModalButtonContainer']/button[text()='Continue']")))
					.click();
			Thread.sleep(5000);

		}
	}

	@When("validate Edit button is display")
	public void edit_button_is_display_in_pipingSection() throws Throwable {
		boolean flag = TestUtilDemo.isElementsPresent(ProjectInfoOBJ.EDIT_BUTTON);
		org.junit.Assert.assertTrue(flag);
	}

	@Then("^closing the browser$")
	public void closebrowser() throws Throwable {
		driver.close();
		driver.quit();
	}
}
