package com.qa.util;
/*
 * package com.wipro.qa.util;
 * 
 * import java.text.SimpleDateFormat; import java.util.Date;
 * 
 *//**
	 * @author rameshrathod
	 *
	 */
/*
 * import org.junit.Assert; import org.openqa.selenium.By; import
 * com.wipro.qa.base.TestBase;
 * 
 * import io.cucumber.java.en.Then;
 * 
 *//**
	 * @authorID Rat105478
	 * @authorName RameshRathod
	 *//*
		 * 
		 * public class StepCommonMethod extends TestBase {
		 * 
		 * public static void validate_top_header_is_Display_and_click(String
		 * propHeaderName, By header, By headerLink, String identifire) throws Throwable
		 * { Thread.sleep(4000); String informationHeaderEX =
		 * prop.getProperty(propHeaderName); String informationHeaderAC =
		 * TestUtilDemo.getTex(header); Assert.assertEquals(informationHeaderAC,
		 * informationHeaderEX); TestUtilDemo.clickElement(headerLink, identifire);
		 * Thread.sleep(5000);
		 * 
		 * }
		 * 
		 * public static void validate_sections_is_Display(String propHeaderName, By
		 * header, String identifire) throws Throwable { Thread.sleep(2000); String
		 * informationHeaderEX = prop.getProperty(propHeaderName); String
		 * informationHeaderAC = TestUtilDemo.getTex(header);
		 * Assert.assertEquals(informationHeaderAC, informationHeaderEX); }
		 * 
		 * public static void validate_subSection_is_Display_and_click(By headerName,
		 * String identifire) throws Throwable { Thread.sleep(2000);
		 * TestUtilDemo.isElementPresent(headerName, identifire);
		 * TestUtilDemo.clickElement(headerName, identifire); Thread.sleep(3000);
		 * 
		 * }
		 * 
		 * public static void save_complete_click_and_edit_display(By saveButton, By
		 * completeButton, By editButton, By checkedMark, String signInIdentifire)
		 * throws Throwable { TestUtilDemo.clickElement(saveButton, signInIdentifire);
		 * Thread.sleep(4000); TestUtilDemo.clickElement(completeButton,
		 * signInIdentifire); Thread.sleep(2000);
		 * TestUtilDemo.isElementPresent(editButton, signInIdentifire);
		 * TestUtilDemo.isElementPresent(checkedMark, signInIdentifire); }
		 * 
		 * public static void
		 * validate_empty_circle_next_to_the_Section_label_will_display(By
		 * unCheckedMark, String identifire) throws Throwable {
		 * TestUtilDemo.isElementPresent(unCheckedMark, identifire); }
		 * 
		 * public static void default_editable_section_display_as_toggled_off(By
		 * sectionPDE, By sectionPLD, String identifire) throws Throwable {
		 * TestUtilDemo.isElementPresent(sectionPDE, identifire);
		 * TestUtilDemo.isElementPresent(sectionPLD, identifire); Thread.sleep(3000);
		 * 
		 * }
		 * 
		 * public static void validate_toggle_is_on_the_name_field_will_enable(By form,
		 * By toggle, String identifire) throws Throwable {
		 * TestUtilDemo.clickElement(form, identifire); TestUtilDemo.scrollUpTop();
		 * Thread.sleep(2000); TestUtilDemo.clickElement(toggle, identifire);
		 * Thread.sleep(2000); }
		 * 
		 * public static void autoSearchName_in_dropdown_and_select(By PDEDropDownBox,
		 * By PDEDropDownValue, String identifire) throws Throwable {
		 * TestUtilDemo.clickElement(PDEDropDownBox, identifire); Thread.sleep(2000);
		 * TestUtilDemo.clickElement(PDEDropDownValue, identifire);
		 * TestUtilDemo.scrollUpTop(); }
		 * 
		 * public static void notify_and_define_user_permissions_option_is_activate(By
		 * defineUserPermissions, By notify, By SAVE_BUTTON, String identifire) throws
		 * Throwable { TestUtilDemo.isElementPresent(defineUserPermissions, identifire);
		 * TestUtilDemo.isElementPresent(notify, identifire); Thread.sleep(3000);
		 * TestUtilDemo.clickElement(SAVE_BUTTON, identifire); Thread.sleep(3000); }
		 * 
		 * public static void over_editing_save_button_will_enable(By form, By locator,
		 * By PDEDropDownBox, By PDEDropDownValue1, By SAVE_BUTTON, String identifire)
		 * throws Throwable { TestUtilDemo.clickElement(form, identifire);
		 * TestUtilDemo.scrollUpTop(); TestUtilDemo.clickElement(PDEDropDownBox,
		 * identifire); Thread.sleep(3000); TestUtilDemo.clickElement(PDEDropDownValue1,
		 * identifire); TestUtilDemo.scrollUpTop(); TestUtilDemo.isEnabled(SAVE_BUTTON,
		 * identifire);
		 * 
		 * }
		 * 
		 * public static void leaving_page_without_saving(By electricalLeadsSection,
		 * String identifire) throws Throwable {
		 * TestUtilDemo.clickElement(electricalLeadsSection, identifire);
		 * Thread.sleep(3000);
		 * 
		 * }
		 * 
		 * public static void saving_data_and_complete_button_enable(By SAVE_BUTTON, By
		 * form, By COMPLETE_BUTTON, String identifire) throws Throwable {
		 * TestUtilDemo.clickElement(SAVE_BUTTON, identifire); Thread.sleep(3000);
		 * TestUtilDemo.clickElement(form, identifire); TestUtilDemo.scrollUpTop();
		 * TestUtilDemo.isEnabled(COMPLETE_BUTTON, identifire);
		 * 
		 * }
		 * 
		 * public static void toggling_off_and_field_will_disable(By toggleAssignTeam,
		 * By SAVE_BUTTON, String identifire) throws Throwable {
		 * TestUtilDemo.clickElement(toggleAssignTeam, identifire); Thread.sleep(5000);
		 * TestUtilDemo.clickElement(SAVE_BUTTON, identifire); Thread.sleep(1000); }
		 * 
		 * public static void add_new_role(By addRoleButton, By PDEDropDownBox, By
		 * PDEDropDownValue, By SAVE_BUTTON, String identifire) throws Throwable {
		 * 
		 * TestUtilDemo.clickElement(addRoleButton, identifire); Thread.sleep(3000);
		 * TestUtilDemo.clickElement(PDEDropDownBox, identifire); Thread.sleep(3000);
		 * TestUtilDemo.clickElement(PDEDropDownValue, identifire); Thread.sleep(3000);
		 * TestUtilDemo.clickElement(SAVE_BUTTON, identifire); Thread.sleep(2000);
		 * 
		 * }
		 * 
		 * public static void edit_button_is_display(By COMPLETE_BUTTON, By EDIT_BUTTON,
		 * String identifire) throws Throwable {
		 * TestUtilDemo.clickElement(COMPLETE_BUTTON, identifire); Thread.sleep(5000);
		 * TestUtilDemo.isElementPresent(EDIT_BUTTON, identifire);
		 * 
		 * }
		 * 
		 * public static void checkMark_is_display_next_to_section(By assignCheckedMark,
		 * By EDIT_BUTTON, String identifire) throws Throwable {
		 * TestUtilDemo.isElementPresent(assignCheckedMark, identifire);
		 * Thread.sleep(5000); TestUtilDemo.clickElement(EDIT_BUTTON, identifire); }
		 * 
		 * public static void clicking_on_DefineUserPermissions(By form, By
		 * toggleAssignTeam, By PDEDropDownBox, By PDEDropDownValue, By
		 * defineUserPermissions, String identifire) throws Throwable {
		 * TestUtilDemo.clickElement(form, identifire); TestUtilDemo.scrollUpTop();
		 * Thread.sleep(3000); TestUtilDemo.clickElement(toggleAssignTeam, identifire);
		 * Thread.sleep(1000); TestUtilDemo.clickElement(PDEDropDownBox, identifire);
		 * TestUtilDemo.clickElement(PDEDropDownValue, identifire); Thread.sleep(5000);
		 * TestUtilDemo.clickElement(defineUserPermissions, identifire);
		 * Thread.sleep(3000);
		 * 
		 * }
		 * 
		 * public static void clicking_on_DefineUserPermissions_discipline(By form, By
		 * PDEDropDownBox, By PDEDropDownValue, By defineUserPermissions, String
		 * identifire) throws Throwable { TestUtilDemo.clickElement(form, identifire);
		 * TestUtilDemo.scrollUpTop(); Thread.sleep(3000);
		 * TestUtilDemo.clickElement(PDEDropDownBox, identifire);
		 * TestUtilDemo.clickElement(PDEDropDownValue, identifire); Thread.sleep(5000);
		 * TestUtilDemo.clickElement(defineUserPermissions, identifire);
		 * Thread.sleep(3000);
		 * 
		 * }
		 * 
		 * public static void validate_multiple_permissions_selection(By
		 * DisciplineSpecificProjectSetupRole, By gigCompleterRole, String identifire)
		 * throws Throwable {
		 * TestUtilDemo.clickElement(DisciplineSpecificProjectSetupRole, identifire);
		 * TestUtilDemo.clickElement(gigCompleterRole, identifire); Thread.sleep(3000);
		 * 
		 * }
		 * 
		 * public static void validate_hovering_over_i(By iIconForDisciplineSpecific, By
		 * hoverInformation, String identifire) throws Throwable {
		 * TestUtilDemo.mouseHover(iIconForDisciplineSpecific); Thread.sleep(5000);
		 * TestUtilDemo.isElementPresent(hoverInformation, identifire);
		 * Thread.sleep(3000);
		 * 
		 * }
		 * 
		 * public static void validate_user_can_save_selection(By saveForDefineUser, By
		 * SAVE_BUTTON, By COMPLETE_BUTTON, String identifire) throws Throwable {
		 * TestUtilDemo.clickElement(saveForDefineUser, identifire); Thread.sleep(3000);
		 * TestUtilDemo.clickElement(SAVE_BUTTON, identifire); Thread.sleep(3000);
		 * TestUtilDemo.clickElement(COMPLETE_BUTTON, identifire); Thread.sleep(3000);
		 * 
		 * }
		 * 
		 * public static void check_fill_the_data_in_activities_field(By locator1,
		 * String value1, By locator2, String identifier, String value2, By locator3,
		 * String value3, By locator4, String value4, By locator5, String value5) throws
		 * Throwable { TestUtilDemo.clearAnddoSendKeys(locator1, value1);
		 * TestUtilDemo.isElementPresent(locator2, identifier);
		 * TestUtilDemo.clearAnddoSendKeys(locator1, value2);
		 * TestUtilDemo.clearAnddoSendKeys(locator3, value3);
		 * TestUtilDemo.clearAnddoSendKeys(locator4, value4);
		 * TestUtilDemo.clearAnddoSendKeys(locator5, value5);
		 * TestUtilDemo.isElementPresent(locator5, value5); } }
		 */