package com.qa.stepDefinition;

import com.qa.factory.DriverFactory;
import com.qa.pages.Gig_WorkflowsOBJ;
import com.qa.util.TestUtilDemo;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class GigaWorkflowStep {
	private WebDriver driver = DriverFactory.getDriver();
	private TestUtilDemo util = new TestUtilDemo(DriverFactory.getDriver());
	WebDriverWait webDriverWait = new WebDriverWait(driver, 30000);
	
	@And("user select  giga workflow from top menu")
	public void userSelectGigaWorkflowFromTopMenu() {
		TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigHeader, " Click on Giga workflow");
	}

	@And("user select the option gig workflow  dropdown")
	public void userSelectTheOptionGigWorkflowDropdown() {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(Gig_WorkflowsOBJ.activityDropdownbox));
		TestUtilDemo.clickElement(Gig_WorkflowsOBJ.activityDropdownbox, "click on the drop down");
	}

	@And("user select activity information")
	public void userSelectActivityInformationAndFillTheDetails(DataTable activity) throws InterruptedException {
		List<List<String>> activityinfo = activity.asLists();
		String step1activity;
		step1activity = Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace", activityinfo.get(1).get(0))
				.replaceAll("By.xpath:", "");
		TestUtilDemo.clickElement(By.xpath(step1activity), "select first activity");
		Thread.sleep(1000);
		Actions act = new Actions(driver);
	}

	@And("user click edit button to edit existing details.")
	public void userClickEditButtonToEditExistingDetails() throws InterruptedException {
		Actions act = new Actions(driver);
		if (driver.findElements(Gig_WorkflowsOBJ.gigEditbtn).size() > 0) {
			driver.findElement(Gig_WorkflowsOBJ.gigEditbtn).click();
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
					driver.findElement(Gig_WorkflowsOBJ.subtypedrpdnR));
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.deletesubtypedrpdnR, "subtype selected");
			Thread.sleep(1000);
		}
	}

	@And("user fill activity information form")
	public void userFillActivityInformationForm() throws InterruptedException {
		Actions act = new Actions(driver);
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(Gig_WorkflowsOBJ.subtypedrpdnR));
		TestUtilDemo.clickElement(Gig_WorkflowsOBJ.subtypedrpdnR, "subtype selected");
		act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
		Thread.sleep(1000);

		if (driver.findElements(By.xpath(
				"//p[text()='Discipline/Subject Specific' or text()='WBS']/parent::div/..//p[text()='Equipment Tag/Name']/parent::div/div[1]//input[@disabled]"))
				.size() == 0) {
			Thread.sleep(2000);
			if (driver.findElements(Gig_WorkflowsOBJ.equipmenttagorNamedrpdnR).size() == 1) {
				((JavascriptExecutor) driver).executeScript(
						"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
						driver.findElement(Gig_WorkflowsOBJ.equipmenttagorNamedrpdnR));
				TestUtilDemo.clickElement(Gig_WorkflowsOBJ.equipmenttagorNamedrpdnR, "Equipment Tag/Name");
				Thread.sleep(1000);
				act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
			}
		}
		
		if (TestUtilDemo.isElementsPresent(Gig_WorkflowsOBJ.gigSavebtn)) {
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "save button");
			Thread.sleep(2000);
		}
		if (TestUtilDemo.isElementsPresent(Gig_WorkflowsOBJ.gigContinuebtn)) {
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinuebtn, "continue button");
		}
		//TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "Save button");
		//Thread.sleep(2000);
		//TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinuebtn, "continue button");
	}

	@And("user select Customize Fragnet")
	public void userSelectCustomizeFragnetAndFillTheDetails(DataTable fragnet) throws InterruptedException {
		List<List<String>> customizeFragnet = fragnet.asLists();
		String step2activity;
		step2activity = Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace", customizeFragnet.get(1).get(0))
				.replaceAll("By.xpath:", "");
		TestUtilDemo.clickElement(By.xpath(step2activity), "select first activity");
		Thread.sleep(3000);

	}

	@And("user click edit button and change fileds on customize fragnet page")
	public void userClickEditButtonOnCustomizeFragnetPage() throws InterruptedException {
		Actions act = new Actions(driver);
		if (driver.findElements(Gig_WorkflowsOBJ.gigEditbtn).size() > 0) {
			driver.findElement(Gig_WorkflowsOBJ.gigEditbtn).click();
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
					driver.findElement(Gig_WorkflowsOBJ.togglebtnInHouseReview));
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.togglebtnInHouseReview, "change in house review");
			Thread.sleep(1000);
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.togglebtnInHouseReview, "change in house review");
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
					driver.findElement(Gig_WorkflowsOBJ.btnApply));
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.btnApply, "Click on button Apply");
			act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
			Thread.sleep(1000);
		}
	}

	@And("user click save continue button")
	public void userclickSaveContinuebutton() throws InterruptedException {
		TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "Save button");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinuebtn, "continue button");
	}

	@And("user select FragnetStepInformation tab")
	public void userSelectFragnetStepInformationAndFillTheDetails(DataTable custfragnet) throws InterruptedException {

		List<List<String>> cFragnet = custfragnet.asLists();
		String step3activity;
		step3activity = Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace", cFragnet.get(1).get(0))
				.replaceAll("By.xpath:", "");
		TestUtilDemo.clickElement(By.xpath(step3activity), "select first activity");
		Thread.sleep(3000);
	}

	@And("user click edit button and change fileds on FragnetStepInformation")
	public void userClickEditButtonAndChangeFiledsOnFragnetStepInformation() throws InterruptedException {
		Actions act = new Actions(driver);
		if (driver.findElements(Gig_WorkflowsOBJ.gigEditbtn).size() > 0) {
			driver.findElement(Gig_WorkflowsOBJ.gigEditbtn).click();
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
					driver.findElement(Gig_WorkflowsOBJ.firstinputFragnetStepInform));
			String totalbudget = TestUtilDemo.getTex(Gig_WorkflowsOBJ.firstinputFragnetStepInform);
			driver.findElement(Gig_WorkflowsOBJ.firstinputFragnetStepInform).clear();
			Thread.sleep(1000);
			driver.findElement(Gig_WorkflowsOBJ.firstinputFragnetStepInform).sendKeys(totalbudget);
		}

		// below code added after new changes

		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(By.xpath(
						"//tr[4]//td[@class='tableCellWidth manhourBudgetTableBorder' or @class ='tableCellWidth false']//input")));

		int manhours = Integer.parseInt(driver
				.findElement(By.xpath(
						"//div[@class='totalAvailableBudgetBox']//div[@class='manhourBudgetSectionValue']/div/div[1]"))
				.getText().split(" ")[0]);
		int deviser = driver.findElements(By.xpath(
				"//tr[4]//td[@class='tableCellWidth manhourBudgetTableBorder' or @class ='tableCellWidth false']//input"))
				.size();
		float dividend = (float) manhours / (float) deviser;
		// below code added for testing purpose
		DecimalFormat df3 = new DecimalFormat("#.##");
		double twoDecimalofDivident1 = Double.parseDouble(df3.format(dividend));
		float remainder = (float) (deviser * twoDecimalofDivident1 - manhours);
		boolean firstvalue = true;
		List<WebElement> elemanhours = driver.findElements(By.xpath(
				"//tr[4]//td[@class='tableCellWidth manhourBudgetTableBorder' or @class ='tableCellWidth false']//input"));
		for (WebElement e : elemanhours) {
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", e);
			e.clear();
			if (firstvalue) {
				e.sendKeys("" + (twoDecimalofDivident1 + remainder));
				firstvalue = false;
			}
			e.sendKeys("" + twoDecimalofDivident1);

		}

		// below code added for testing purpose for budget if budget is greater than
		// total bugdet
		if (TestUtilDemo.isElementsPresent(By.xpath("//div[@class='manhourBudgetSectionValueFailure']/div"))) {
			if (Double.parseDouble(driver.findElement(By.xpath("//div[@class='manhourBudgetSectionValueFailure']/div"))
					.getText().split(" ")[0]) > manhours) {

				double lstvalue1 = Double.parseDouble(
						driver.findElement(By.xpath("//div[@class='manhourBudgetSectionValueFailure']/div")).getText()
								.split(" ")[0])
						- manhours;

				double totalDiffValue = Double
						.parseDouble(elemanhours.get(elemanhours.size() - 1).getAttribute("value")) - lstvalue1;

				DecimalFormat dfd = new DecimalFormat("#.##");
				double twoDecimalofDivident2 = Double.parseDouble(df3.format(totalDiffValue));
				System.out.println("two decimal val : " + twoDecimalofDivident2);
				elemanhours.get(elemanhours.size() - 1).clear();
				elemanhours.get(elemanhours.size() - 1).sendKeys(twoDecimalofDivident2 + "");
			}
		}

		// below code added for testing purpose for budget if budget is less than total
		// bugdet
		if (TestUtilDemo.isElementsPresent(By.xpath("//div[@class='manhourBudgetSectionValueFailure']/div"))) {
			if (Double.parseDouble(driver.findElement(By.xpath("//div[@class='manhourBudgetSectionValueFailure']/div"))
					.getText().split(" ")[0]) < manhours) {

				double lstvalue1 = manhours - Double.parseDouble(
						driver.findElement(By.xpath("//div[@class='manhourBudgetSectionValueFailure']/div")).getText()
								.split(" ")[0]);

				double lastvalue = Double.parseDouble(elemanhours.get(elemanhours.size() - 1).getAttribute("value"));
				double finalvalue = lstvalue1 + lastvalue;
				// System.out.println("total diff : " +finalvalue);
				double d = finalvalue;
				DecimalFormat dfd = new DecimalFormat("#.##");
				double twoDecimalofDivident3 = Double.parseDouble(dfd.format(d));
				System.out.println("two decimal val : " + twoDecimalofDivident3);
				elemanhours.get(elemanhours.size() - 1).clear();
				elemanhours.get(elemanhours.size() - 1).sendKeys(twoDecimalofDivident3 + "");
			}
		}

	}

	@And("User selects Stepfour Customize Gignet")
	public void UserselectsStepfourCustomizeGignetandcompletegigslidemenu() throws InterruptedException {
		// select step 4 and check or uncheck Customize Gignet

		String step4activity;
		step4activity = Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace", "Customize Gignet")
				.replaceAll("By.xpath:", "");
		TestUtilDemo.clickElement(By.xpath(step4activity), "select first activity");
		Thread.sleep(1000);

	}

	@And("user click edit button for edit")
	public void userClickEditButtonForedit() throws InterruptedException {
		Actions act = new Actions(driver);
		if (driver.findElements(Gig_WorkflowsOBJ.gigEditbtn).size() > 0) {
			driver.findElement(Gig_WorkflowsOBJ.gigEditbtn).click();
			Thread.sleep(1000);

		}
	}

	@And("user remove all selected customie gignet")
	public void userRemoveAllSelectedCustomieGignet(DataTable slidemenus) throws InterruptedException {
		List<List<String>> smenu = slidemenus.asLists();
		for (int i = 0; i < smenu.size(); i++) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='gigSidebar']//ul//li//p[text()='" + smenu.get(i).get(0) + "']"))
					.click();
			Thread.sleep(3000);
			if (driver.findElements(Gig_WorkflowsOBJ.step4Editdrnd).size() > 0) {
				TestUtilDemo.clickElement(Gig_WorkflowsOBJ.step4Editdrnd, "Edit button on Gignet");
			}

		}
	}

	@And("user fill values and completed stepfour Customize Gignet and save continue allprocess")
	public void userFillValuesAndCompletedStepfourCustomizeGignetAndSaveContinueAllprocess(DataTable slidemenus)
			throws InterruptedException {
		List<List<String>> smenu = slidemenus.asLists();
		for (int i = 0; i < smenu.size(); i++) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='gigSidebar']//ul//li//p[text()='" + smenu.get(i).get(0) + "']"))
					.click();
			Thread.sleep(3000);

			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "Save button");
			Thread.sleep(2000);

			if (driver.findElements(By.xpath(Gig_WorkflowsOBJ.step4completedrnd.toString().replaceAll("By.xpath:", "")))
					.size() == 1) {
				((JavascriptExecutor) driver).executeScript(
						"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
						driver.findElement(Gig_WorkflowsOBJ.step4completedrnd));
				TestUtilDemo.clickElement(Gig_WorkflowsOBJ.step4completedrnd, "select first activity");
				Thread.sleep(1000);
			}
		
		}

		TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinuebtn, "continue button");
		/*
		 * if
		 * (driver.findElements(By.xpath("//div[@class='fragmentStepsDetailsGray']")).
		 * size() == 1) { Thread.sleep(1000);
		 * TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinuebtn,
		 * "continue button"); }
		 */
		Thread.sleep(1000);

	}

	@And("user select StepFive Gig Information")
	public void userSelectStepFiveGigInformation(DataTable custgig) throws InterruptedException {
		// select step 5 and process the gig information
		String step5activity;
		step5activity = Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace", "Gig Information")
				.replaceAll("By.xpath:", "");
		TestUtilDemo.clickElement(By.xpath(step5activity), "select first activity");
		Thread.sleep(1000);

	}

	@And("user remove all selected Giginformation")
	public void userRemoveAllSelectedGiginformation(DataTable custgig) throws InterruptedException {
		List<List<String>> gigcustomize = custgig.asLists();
		for (int col1 = 0; col1 < gigcustomize.size(); col1++) {
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
					driver.findElement(By.xpath(
							"//div[@class='gigSidebar']//ul//li//p[text()='" + gigcustomize.get(col1).get(0) + "']")));
			driver.findElement(
					By.xpath("//div[@class='gigSidebar']//ul//li//p[text()='" + gigcustomize.get(col1).get(0) + "']"))
					.click();
			Thread.sleep(3000);
			if (driver.findElements(Gig_WorkflowsOBJ.step4Editdrnd).size() > 0) {
				TestUtilDemo.clickElement(Gig_WorkflowsOBJ.step4Editdrnd, "Edit button on Gignet");
			}

		}

	}

	@And("user selects Selected values in Stepfive and complete slide menu on Gig information")
    public void userselectsSelectedvaluesinStepfiveandcompleteslidemenuonGiginformation(DataTable custgig) throws InterruptedException {
        //validate  ENGR and  US
        String step5activity = Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace", "Gig Information").replaceAll("By.xpath:", "");
        TestUtilDemo.clickElement(By.xpath(step5activity), "select first activity");

        List<List<String>> gigcustomize = custgig.asLists();
        for (int col1 = 0; col1 < gigcustomize.size(); col1++) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",  driver.findElement(By.xpath("//div[@class='gigSidebar']//ul//li//p[text()='"+ gigcustomize.get(col1).get(0) +"']")));
            driver.findElement(By.xpath("//div[@class='gigSidebar']//ul//li//p[text()='"+ gigcustomize.get(col1).get(0) +"']")).click();
            Thread.sleep(2000);
            List<WebElement> centerwindow=driver.findElements(By.xpath("//div[@style='margin-left: 25%; width: 75%; overflow: hidden auto;']"));
            if(centerwindow.size()>0)
            {
            	WebDriverWait ww = new WebDriverWait(driver, 30000);
            	ww.until(ExpectedConditions.elementToBeClickable(centerwindow.get(0)));
				Thread.sleep(3000);
				Actions ac = new Actions(driver);
				ac.moveToElement(centerwindow.get(0)).click().build().perform();
				Thread.sleep(5000);
            	
				//below code commented for testing purpose 
				 //centerwindow.get(0).click();
            }
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

            int days = Integer.parseInt(driver.findElement(By.xpath("//div[@class='durationSectionValue']")).getText().replaceAll("[\\D]", ""));
            int deviser = driver.findElements(By.xpath("//tr[1]//td[@class='tableCellWidth manhourBudgetTableBorder' or @class='tableCellWidth false']//input")).size();
            float dividend = (float) days / (float) deviser;
            //below code added for testing purpose
			DecimalFormat df = new DecimalFormat("#.##");
			double twoDecimalofDivident = Double.parseDouble(df.format(dividend));
			System.out.println("two decimal val : " + twoDecimalofDivident);
			float remainder = (float) (deviser * twoDecimalofDivident - days);

			boolean firstvalue = true;
			List<WebElement> durtion = driver.findElements(By.xpath(
					"//tr[1]//td[@class='tableCellWidth manhourBudgetTableBorder' or @class='tableCellWidth false']//input"));
			for (WebElement e : durtion) {
				((JavascriptExecutor) driver).executeScript(
						"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", e);
				e.clear();
				if (firstvalue) {
					// e.sendKeys("" + (dividend + remainder));
					e.sendKeys("" + twoDecimalofDivident);
					firstvalue = false;
				}
				e.sendKeys("" + twoDecimalofDivident);
			}
			
			// below code added for testing purpose for duration if total duration is greater than available duration
			if (TestUtilDemo.isElementsPresent(
					By.xpath("//div[@class='manhourBudgetSectionValueFailure durationSectionValue']"))) {
				if (Double.parseDouble(driver
						.findElement(By.xpath("//div[@class='manhourBudgetSectionValueFailure durationSectionValue']"))
						.getText().split(" ")[0]) > days) {

					double lstvalue1 = Double.parseDouble(driver
							.findElement(By.xpath("//div[@class='manhourBudgetSectionValueFailure durationSectionValue']"))
							.getText().split(" ")[0]) - days;
					
					double lastvalue = Double.parseDouble(durtion.get(durtion.size() - 1).getAttribute("value")) - lstvalue1;
					DecimalFormat df1 = new DecimalFormat("#.##");
					durtion.get(durtion.size() - 1).clear();
					durtion.get(durtion.size() - 1).sendKeys(df1.format(lastvalue) + "");
				}
			}

			// below code added for testing purpose for duration if total duration is less than available duration

			if (TestUtilDemo.isElementsPresent(
					By.xpath("//div[@class='manhourBudgetSectionValueFailure durationSectionValue']"))) {
				if (Double.parseDouble(driver
						.findElement(By.xpath("//div[@class='manhourBudgetSectionValueFailure durationSectionValue']"))
						.getText().split(" ")[0]) < days) {
					double lstvalue1 = days - Double.parseDouble(driver
							.findElement(
									By.xpath("//div[@class='manhourBudgetSectionValueFailure durationSectionValue']"))
							.getText().split(" ")[0]);

					double lastvalue = Double.parseDouble(durtion.get(durtion.size() - 1).getAttribute("value"));
					double finalvalue = lastvalue + lstvalue1;
					double d = finalvalue;
					DecimalFormat df2 = new DecimalFormat("#.##");
					double decimalValue = Double.parseDouble(df2.format(d));
					// System.out.println("two decimal val : " +df2.format(d));
					durtion.get(durtion.size() - 1).clear();
					durtion.get(durtion.size() - 1).sendKeys(decimalValue + "");
				}
			}

            if (driver.findElements(By.cssSelector("input:checked[type='radio'] ~label[for^='DSGN']")).size()>0) {
                List<WebElement> rndENGR = driver.findElements(By.xpath("//input[contains(@id,'ENGR')]"));
                for(WebElement engr: rndENGR){
                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", engr);
                    engr.click();
                }
            }

            if (driver.findElements(By.cssSelector("input:checked[type='radio'] ~label[for^='OUS']")).size()>0) {
                List<WebElement> rndENGR = driver.findElements(By.xpath("//input[starts-with(@id,'US')]"));
                for(WebElement us: rndENGR){
                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", us);
                    us.click();
                }
            }

			float manhours = Float.parseFloat(driver.findElement(By.xpath("//div[@class='totalAvailableBudgetBox']//div[@class='manhourBudgetSectionValue']/div/div[1]")).getText().split(" ")[0]);
			deviser = driver.findElements(By.xpath("//tr[2]//td[@class='tableCellWidth manhourBudgetTableBorder' or @class ='tableCellWidth false']//input")).size();
			dividend = (float) manhours / (float) deviser;
			// below code added for testing purpose
			DecimalFormat df3 = new DecimalFormat("#.##");
			double twoDecimalofDivident1 = Double.parseDouble(df3.format(dividend));
			remainder = (float) (deviser * twoDecimalofDivident1 - manhours);

			List<WebElement> elemanhours = driver.findElements(By.xpath("//tr[2]//td[@class='tableCellWidth manhourBudgetTableBorder' or @class ='tableCellWidth false']//input"));
			 for (WebElement e : elemanhours) {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", e);
				e.clear();
				if (firstvalue) {
					e.sendKeys("" + (twoDecimalofDivident1 + remainder));
					firstvalue = false;
				}
				e.sendKeys("" + twoDecimalofDivident1); 

			}
			

			
			  // below code added for testing purpose for budget if budget is greater than total bugdet 
				if (TestUtilDemo.isElementsPresent(By.xpath("//div[@class='manhourBudgetSectionValueFailure']/div"))) {
					if (Double.parseDouble(
							driver.findElement(By.xpath("//div[@class='manhourBudgetSectionValueFailure']/div"))
									.getText().split(" ")[0]) > manhours) {

						double lstvalue1 =  Double.parseDouble(
								driver.findElement(By.xpath("//div[@class='manhourBudgetSectionValueFailure']/div"))
										.getText().split(" ")[0]) - manhours;

						double totalDiffValue = Double
								.parseDouble(elemanhours.get(elemanhours.size() - 1).getAttribute("value")) - lstvalue1;
						
						DecimalFormat dfd = new DecimalFormat("#.##");
						double twoDecimalofDivident2 = Double.parseDouble(df3.format(totalDiffValue));
						System.out.println("two decimal val : " + twoDecimalofDivident2);
						elemanhours.get(elemanhours.size() - 1).clear();
						elemanhours.get(elemanhours.size() - 1).sendKeys(twoDecimalofDivident2 + "");
					}
				}
			
			// below code added for testing purpose for budget if budget is less than total bugdet
			if (TestUtilDemo.isElementsPresent(By.xpath("//div[@class='manhourBudgetSectionValueFailure']/div"))) {
				if (Double.parseDouble(
						driver.findElement(By.xpath("//div[@class='manhourBudgetSectionValueFailure']/div")).getText()
								.split(" ")[0]) < manhours) {

					double lstvalue1 = manhours - Double.parseDouble(
							driver.findElement(By.xpath("//div[@class='manhourBudgetSectionValueFailure']/div"))
									.getText().split(" ")[0]);

					double lastvalue = Double
							.parseDouble(elemanhours.get(elemanhours.size() - 1).getAttribute("value"));
					double finalvalue = lstvalue1 + lastvalue;
					// System.out.println("total diff : " +finalvalue);
					double d = finalvalue;
					DecimalFormat dfd = new DecimalFormat("#.##");
					double twoDecimalofDivident3 = Double.parseDouble(dfd.format(d));
					System.out.println("two decimal val : " + twoDecimalofDivident3);
					elemanhours.get(elemanhours.size() - 1).clear();
					elemanhours.get(elemanhours.size() - 1).sendKeys(twoDecimalofDivident3 + "");
				}
			}
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "Save button");
            Thread.sleep(5000);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
            		driver.findElement(By.xpath("//span[text()='Mark as Completed']")));
            //TestUtilDemo.clickElement(Gig_WorkflowsOBJ.step4completedrnd, "select first activity");
            driver.findElement(By.xpath("//span[text()='Mark as Completed']")).click();
            Thread.sleep(5000);
            
			// below code written due to click issue on mark as complete in step5
			boolean flag = false;
			if (TestUtilDemo.isElementsPresent(By.xpath("//span[text()='Edit']")) == flag) {
				driver.findElement(By.xpath("//span[text()='Mark as Completed']")).click();
				Thread.sleep(5000);
			} 
                        
            String[] submenus= gigcustomize.get(col1).get(1).split(",");

            for (int row = 0; row < submenus.length ; row++) {
                Actions act = new Actions(driver);
                if (!submenus[row].contains("SPACE")) {
                    String ReviewProcessDatasheets;
                    ReviewProcessDatasheets = Gig_WorkflowsOBJ.equipmentdatasheetlist.toString().replace("textToReplace", submenus[row]).replaceAll("By.xpath:", "");
                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(By.xpath(ReviewProcessDatasheets)));
                    TestUtilDemo.clickElement(By.xpath(ReviewProcessDatasheets), "select first activity");
                    Thread.sleep(2000);
                } else {
                    String ReviewProcessDatasheets;
                    ReviewProcessDatasheets = Gig_WorkflowsOBJ.equipmentdatasheetlist.toString().replace("textToReplace", submenus[row].replaceAll("SPACE"," ")).replaceAll("By.xpath:", "").concat(" ");
                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(By.xpath(ReviewProcessDatasheets)));
                    TestUtilDemo.clickElement(By.xpath(ReviewProcessDatasheets), "select first activity");
                    Thread.sleep(2000);
                }
                if (driver.findElements(By.xpath("//p[text()='Fill In Activity Information']")).size()>0)
                {
                    TestUtilDemo.clickElement(By.xpath("//p[text()='Fill In Activity Information']"), "test");
                }
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.worktype));
                webDriverWait.until(ExpectedConditions.elementToBeClickable(Gig_WorkflowsOBJ.worktype));
                TestUtilDemo.clickElement(Gig_WorkflowsOBJ.worktype, "select worktype");
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.PreferredPerformerLocation));
                if (driver.findElements(By.xpath("//p[text()='Preferred Performer Location']/parent::div//div/input[@disabled]")).size()==0) {
                    TestUtilDemo.clickElement(Gig_WorkflowsOBJ.PreferredPerformerLocation, "select preferred");
                    Thread.sleep(2000);
                }
                //TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "select first activity");
                Thread.sleep(1000);
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.step4completedrnd));
                TestUtilDemo.clickElement(Gig_WorkflowsOBJ.step4completedrnd, "select first activity");
                Thread.sleep(4000);
            }

          }
        Thread.sleep(1000);
		if (TestUtilDemo.isElementsPresent(Gig_WorkflowsOBJ.gigFinishbtn)) {
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigFinishbtn, "continue button");
			Thread.sleep(4000);
		}
		if (TestUtilDemo.isElementsPresent(Gig_WorkflowsOBJ.btncomplete)) {
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.btncomplete, "Completed button");
			Thread.sleep(4000);
		}
    }

	/** Scenario one completed */

	@And("user select the option gig workflow  dropdown {string}")
	public void userSelectTheOptionGigWorkflowDropdown(String gigflow) throws InterruptedException {
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.click(driver.findElement(Gig_WorkflowsOBJ.dropdownSelectoption)).build().perform();
		Thread.sleep(3000);
		String optiongigworkflow;
		optiongigworkflow = Gig_WorkflowsOBJ.optionselect.toString().replace("textToReplace", gigflow)
				.replaceAll("By.xpath:", "");
		act.click(driver.findElement(By.xpath(optiongigworkflow))).build().perform();
//        TestUtilDemo.clickElement(By.xpath(optiongigworkflow), "test");
		Thread.sleep(3000);

	}

	// Process
	@And("user select activity information and fill the details for Process")
	public void userSelectActivityInformationAndFillTheDetailsForProcess(DataTable gig) throws InterruptedException {

		List<List<String>> giginfo = gig.asLists();
		String step1activity;
		step1activity = Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace", giginfo.get(1).get(0))
				.replaceAll("By.xpath:", "");
		TestUtilDemo.clickElement(By.xpath(step1activity), "select first activity");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(Gig_WorkflowsOBJ.subtypedrpdnR));
		webDriverWait.until(ExpectedConditions.elementToBeClickable(Gig_WorkflowsOBJ.subtypedrpdnR));
		TestUtilDemo.clickElement(Gig_WorkflowsOBJ.subtypedrpdnR, "subtype selected");
		act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
		Thread.sleep(3000);

		if (driver.findElements(Gig_WorkflowsOBJ.equipmenttagorNamedrpdnR).size() == 1) {
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
					driver.findElement(Gig_WorkflowsOBJ.equipmenttagorNamedrpdnR));
			Thread.sleep(2000);
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.equipmenttagorNamedrpdnR, "Equipment Tag/Name selected");
			act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
			Thread.sleep(3000);
		}
		if (driver.findElements(Gig_WorkflowsOBJ.equipmentCategorydrpdnR).size() == 1) {
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
					driver.findElement(Gig_WorkflowsOBJ.equipmentCategorydrpdnR));
			Thread.sleep(2000);
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.equipmentCategorydrpdnR, "Equipment Category selected");
			act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
		}

		Thread.sleep(300);
		if (driver.findElements(Gig_WorkflowsOBJ.electricalEquiNuorNadrpdnR).size() == 1) {
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
					driver.findElement(Gig_WorkflowsOBJ.electricalEquiNuorNadrpdnR));
			Thread.sleep(2000);
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.electricalEquiNuorNadrpdnR,
					"Electrical Equipment Number/Name selected");
			act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
		}

		if (driver.findElements(Gig_WorkflowsOBJ.powerhouseTagNadrpdnR).size() == 1) {
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
					driver.findElement(Gig_WorkflowsOBJ.powerhouseTagNadrpdnR));
			Thread.sleep(2000);
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.powerhouseTagNadrpdnR, "Powerhouse Tag/Name selected");
			act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
		}
		if (driver.findElements(Gig_WorkflowsOBJ.controlRoomNuorNamdrpdnR).size() == 1) {
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
					driver.findElement(Gig_WorkflowsOBJ.controlRoomNuorNamdrpdnR));
			Thread.sleep(2000);
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.controlRoomNuorNamdrpdnR, "Control Room Number/Name selected");
			act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
		}
		if (driver.findElements(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR).size() == 1) {
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
					driver.findElement(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR));
			Thread.sleep(3000);
			act.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN).build().perform();
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR,
					"Instrument Purchase Specification Number selected");
			act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
			Thread.sleep(2000);
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR,
					"Instrument Purchase Specification Number selected");
			act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();

		}

		if (driver.findElements(Gig_WorkflowsOBJ.foundatiotagnamepdnR).size() == 1) {
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
					driver.findElement(Gig_WorkflowsOBJ.foundatiotagnamepdnR));
			Thread.sleep(2000);
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.foundatiotagnamepdnR, "Control Room Number/Name selected");
			act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
		}

		if (TestUtilDemo.isElementsPresent(Gig_WorkflowsOBJ.gigSavebtn)) {
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "save button");
			Thread.sleep(2000);
		}
		if (TestUtilDemo.isElementsPresent(Gig_WorkflowsOBJ.gigContinuebtn)) {
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinuebtn, "continue button");
		}
		//TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "Save button");
		// changed sync time from 6000 to 4000
		//Thread.sleep(2000);
//        webDriverWait.until(ExpectedConditions.elementToBeClickable(Gig_WorkflowsOBJ.gigContinueenabledbtn));
		//TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinuebtn, "Save button");

	}

	// pipe process
	@And("user select Gig Information and fill the details for Process")
	public void userSelectGigInformationAndFillTheDetailsForProcess(DataTable gig) throws InterruptedException {
		List<List<String>> giginfo = gig.asLists();
		String step5activity;
		step5activity = Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace", giginfo.get(1).get(0))
				.replaceAll("By.xpath:", "");
		TestUtilDemo.clickElement(By.xpath(step5activity), "select first activity");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "Save button");
		Thread.sleep(3000);
		WebDriverWait ww = new WebDriverWait(driver, 30000);
		ww.until(ExpectedConditions.elementToBeClickable(Gig_WorkflowsOBJ.step4completedrnd));
		Thread.sleep(3000);
		TestUtilDemo.clickElement(Gig_WorkflowsOBJ.step4completedrnd, "select first activity");
		Thread.sleep(3000);

		for (int row = 2; row < giginfo.size(); row++) {

			Actions act = new Actions(driver);
			if (row < 7) {
				String ReviewProcessDatasheets;
				ReviewProcessDatasheets = Gig_WorkflowsOBJ.equipmentdatasheetlist.toString()
						.replace("textToReplace", giginfo.get(row).get(0)).replaceAll("By.xpath:", "");
				TestUtilDemo.clickElement(By.xpath(ReviewProcessDatasheets), "select first activity");
				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(3000);
			}

			// TestUtilDemo.clickElement(By.xpath("//p[text()='Fill In Activity
			// Information']"), "test");
			act.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).build().perform();
			if (driver.findElements(Gig_WorkflowsOBJ.worktype).size() > 0) {
				Thread.sleep(3000);
				((JavascriptExecutor) driver).executeScript(
						"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
						driver.findElement(Gig_WorkflowsOBJ.worktype));
				webDriverWait.until(ExpectedConditions.elementToBeClickable(Gig_WorkflowsOBJ.worktype));
				TestUtilDemo.clickElement(Gig_WorkflowsOBJ.worktype, "select worktype");
				act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
				Thread.sleep(3000);
			}
			if (driver.findElements(Gig_WorkflowsOBJ.txtgiginsturctionR).size() > 0) {
				TestUtilDemo.scrollUpToElementPresent(Gig_WorkflowsOBJ.txtgiginsturctionR);
				TestUtilDemo.doSendKeys(Gig_WorkflowsOBJ.txtgiginsturctionR, "Gig flow autmation");
			}
			act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
			Thread.sleep(3000);
			if (driver.findElements(Gig_WorkflowsOBJ.PreferredPerformerLocation).size() > 0) {
				TestUtilDemo.scrollUpToElementPresent(Gig_WorkflowsOBJ.PreferredPerformerLocation);
				TestUtilDemo.clickElement(Gig_WorkflowsOBJ.PreferredPerformerLocation, "select preferred");
			}
			act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
			Thread.sleep(4000);
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "select first activity");
			Thread.sleep(2000);
			TestUtilDemo.scrollUpTop();
			Thread.sleep(2000);
			// why we comment below code ?
			if (driver.findElements(Gig_WorkflowsOBJ.step4completedrnd).size() > 0) {
				TestUtilDemo.clickElement(Gig_WorkflowsOBJ.step4completedrnd, "select first activity");
			}
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinueenabledbtn, "Finish Gig flow button clicked");
			Thread.sleep(2000);

		}

		if (driver.findElements(Gig_WorkflowsOBJ.btncomplete).size() > 0) {
			Thread.sleep(3000);
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.btncomplete, "itration completed and final complete");
		}
	}

	@And("uncheck all FragnetStep Information nonreview steps and select first  nonreview step")
	public void uncheckAllFragnetStepInformationNonreviewStepsAndSelectFirstNonreviewStep()
			throws InterruptedException {
		Thread.sleep(3000);
		int i = 0;
		List<WebElement> allprocess = driver
				.findElements(By.xpath("//div[@class='rectangleBoxes rectangleBoxes_checked']//label"));
		for (WebElement we1 : allprocess) {
			if (driver.findElements(By.xpath("//div[@class='rectangleBoxes rectangleBoxes_disable']")).size() > 0) {
				((JavascriptExecutor) driver).executeScript(
						"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", we1);
				i = i + 1;
			}

			if (i > 0) {
				((JavascriptExecutor) driver).executeScript(
						"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", we1);
				we1.click();
			}

			i++;
		}

	}

	@And("User selects Stepfour gigents checkbox and it validates all the selected values in Stepfive {string},{string} IandC")
	public void userSelectsStepfourGigentsCheckboxAndItValidatesAllTheSelectedValuesInStepfiveIandC(String arg0,
			String submenus) throws InterruptedException {

		// select step 4 and check or uncheck Customize Gignet

		String[] gigcustomize = submenus.split(",");
		String step4activity;
		step4activity = Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace", "Customize Gignet")
				.replaceAll("By.xpath:", "");
		TestUtilDemo.clickElement(By.xpath(step4activity), "select first activity");
		Thread.sleep(1000);
		// we will removed all checked process
		List<WebElement> allprocess = driver
				.findElements(By.xpath("//div[@class='rectangleBoxes rectangleBoxes_checked']//label"));
		for (WebElement we1 : allprocess) {
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", we1);
			we1.click();
		}
		Thread.sleep(1000);

		for (int row = 0; row < gigcustomize.length; row++) {
			String giginroproces;
			giginroproces = Gig_WorkflowsOBJ.checkUncheckprocess.toString().replace("textToReplace", gigcustomize[row])
					.replaceAll("By.xpath:", "");
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
					driver.findElement(By.xpath(giginroproces)));
			TestUtilDemo.clickElement(By.xpath(giginroproces), "select process");

		}
		Thread.sleep(1000);

		TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "Save button");
		Thread.sleep(1000);

		if (driver.findElements(By.xpath(Gig_WorkflowsOBJ.step4completedrnd.toString().replaceAll("By.xpath:", "")))
				.size() == 1) {
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
					driver.findElement(Gig_WorkflowsOBJ.step4completedrnd));
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.step4completedrnd, "select first activity");
			Thread.sleep(1000);
		}
		TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinuebtn, "continue button");
		if (driver.findElements(By.xpath("//div[@class='fragmentStepsDetailsGray']")).size() == 1) {
			Thread.sleep(1000);
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinuebtn, "continue button");
		}

		// select step 5 and process the gig information
		String step5activity;
		step5activity = Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace", "Gig Information")
				.replaceAll("By.xpath:", "");
		TestUtilDemo.clickElement(By.xpath(step5activity), "select first activity");
		Thread.sleep(1000);
		TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "Save button");
		Thread.sleep(1000);
		WebDriverWait ww = new WebDriverWait(driver, 30000);
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(Gig_WorkflowsOBJ.step4completedrnd));
		TestUtilDemo.clickElement(Gig_WorkflowsOBJ.step4completedrnd, "select first activity");
		Thread.sleep(2000);

		for (int row = 0; row < gigcustomize.length; row++) {
			Actions act = new Actions(driver);
			if (row < 5 || row == 8) {
				String ReviewProcessDatasheets;
				ReviewProcessDatasheets = Gig_WorkflowsOBJ.equipmentdatasheetlist.toString()
						.replace("textToReplace", gigcustomize[row]).replaceAll("By.xpath:", "");
				TestUtilDemo.clickElement(By.xpath(ReviewProcessDatasheets), "select first activity");
				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(3000);
			} else {
				String ReviewProcessDatasheets;
				ReviewProcessDatasheets = Gig_WorkflowsOBJ.equipmentdatasheetlist.toString()
						.replace("textToReplace", gigcustomize[row]).replaceAll("By.xpath:", "").concat(" ");
				TestUtilDemo.clickElement(By.xpath(ReviewProcessDatasheets), "select first activity");
				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(3000);
			}

			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
					driver.findElement(By.xpath("//p[text()='Fill In Activity Information']")));
//            TestUtilDemo.clickElement(By.xpath("//p[text()='Fill In Activity Information']"), "test");
//            act.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).build().perform();
			webDriverWait.until(ExpectedConditions.elementToBeClickable(Gig_WorkflowsOBJ.worktype));

			if (driver.findElements(Gig_WorkflowsOBJ.worktype).size() > 0) {
				((JavascriptExecutor) driver).executeScript(
						"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
						driver.findElement(Gig_WorkflowsOBJ.worktype));
				TestUtilDemo.clickElement(Gig_WorkflowsOBJ.worktype, "select worktype");
				act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
			}

			if (driver.findElements(Gig_WorkflowsOBJ.txtgiginsturctionR).size() > 0) {
				((JavascriptExecutor) driver).executeScript(
						"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
						driver.findElement(Gig_WorkflowsOBJ.txtgiginsturctionR));
				TestUtilDemo.doSendKeys(Gig_WorkflowsOBJ.txtgiginsturctionR, "Gig flow autmation");
			}
			if (driver.findElements(Gig_WorkflowsOBJ.PreferredPerformerLocation).size() > 0) {
				Thread.sleep(2000);
				((JavascriptExecutor) driver).executeScript(
						"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
						driver.findElement(Gig_WorkflowsOBJ.PreferredPerformerLocation));
				TestUtilDemo.clickElement(Gig_WorkflowsOBJ.PreferredPerformerLocation, "select preferred");
				act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
				Thread.sleep(2000);
			}

			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "select first activity");
			Thread.sleep(3000);

			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
					driver.findElement(Gig_WorkflowsOBJ.step4completedrnd));
			if (driver.findElements(Gig_WorkflowsOBJ.step4completedrnd).size() > 0) {
				Thread.sleep(1000);
				TestUtilDemo.clickElement(Gig_WorkflowsOBJ.step4completedrnd, "select first activity");
			}
			Thread.sleep(1000);
			if (driver.findElements(Gig_WorkflowsOBJ.step4completedrnd).size() > 0) {
				Thread.sleep(1000);
				TestUtilDemo.scrollUpTop();
				((JavascriptExecutor) driver).executeScript(
						"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
						driver.findElement(Gig_WorkflowsOBJ.step4completedrnd));
//                TestUtilDemo.clickElement(Gig_WorkflowsOBJ.step4completedrnd, "select first activity");
				driver.findElement(By.xpath("//span[text()='Mark as Completed']/parent::button")).click();
			}

			if (driver.findElements(By.xpath("//div[@class='sidemenu-item list-group-item active']//img"))
					.size() == 0) {
				Thread.sleep(1000);
				TestUtilDemo.scrollUpTop();
				((JavascriptExecutor) driver).executeScript(
						"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
						driver.findElement(Gig_WorkflowsOBJ.step4Editdrnd));
				Thread.sleep(1000);
				driver.findElement(By.xpath("//span[text()='Edit']/parent::button")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//span[text()='Mark as Completed']/parent::button")).click();

			}

		}

		Thread.sleep(2000);

		if (TestUtilDemo.isElementsPresent(Gig_WorkflowsOBJ.gigFinishbtn)) {
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigFinishbtn, "continue button");
			Thread.sleep(2000);

		}
		if (TestUtilDemo.isElementsPresent(Gig_WorkflowsOBJ.btncomplete)) {
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.btncomplete, "Completed button");
		}

	}

	@And("user select activity information and fill the details for Structural")
	public void userSelectActivityInformationAndFillTheDetailsForStructural(DataTable gig) throws InterruptedException {

		List<List<String>> giginfo = gig.asLists();
		String step1activity;
		step1activity = Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace", giginfo.get(1).get(0))
				.replaceAll("By.xpath:", "");
		TestUtilDemo.clickElement(By.xpath(step1activity), "select first activity");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				driver.findElement(Gig_WorkflowsOBJ.subtypedrpdnR));
		webDriverWait.until(ExpectedConditions.elementToBeClickable(Gig_WorkflowsOBJ.subtypedrpdnR));
		TestUtilDemo.clickElement(Gig_WorkflowsOBJ.subtypedrpdnR, "subtype selected");
		act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
		Thread.sleep(3000);

		if (driver.findElements(Gig_WorkflowsOBJ.equipmenttagorNamedrpdnR).size() > 0) {
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
					driver.findElement(Gig_WorkflowsOBJ.equipmenttagorNamedrpdnR));
			Thread.sleep(2000);
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.equipmenttagorNamedrpdnR, "Equipment Tag/Name selected");
			act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
			Thread.sleep(3000);
		}
		if (driver.findElements(Gig_WorkflowsOBJ.equipmentCategorydrpdnR).size() > 0) {
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
					driver.findElement(Gig_WorkflowsOBJ.equipmentCategorydrpdnR));
			Thread.sleep(2000);
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.equipmentCategorydrpdnR, "Equipment Category selected");
			act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
		}

		Thread.sleep(2000);
		if (driver.findElements(Gig_WorkflowsOBJ.electricalEquiNuorNadrpdnR).size() > 0) {
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
					driver.findElement(Gig_WorkflowsOBJ.electricalEquiNuorNadrpdnR));
			Thread.sleep(2000);
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.electricalEquiNuorNadrpdnR,
					"Electrical Equipment Number/Name selected");
			act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
		}

		if (driver.findElements(Gig_WorkflowsOBJ.powerhouseTagNadrpdnR).size() > 0) {
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
					driver.findElement(Gig_WorkflowsOBJ.powerhouseTagNadrpdnR));
			Thread.sleep(2000);
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.powerhouseTagNadrpdnR, "Powerhouse Tag/Name selected");
			act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
		}
		if (driver.findElements(Gig_WorkflowsOBJ.controlRoomNuorNamdrpdnR).size() > 0) {
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
					driver.findElement(Gig_WorkflowsOBJ.controlRoomNuorNamdrpdnR));
			Thread.sleep(2000);
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.controlRoomNuorNamdrpdnR, "Control Room Number/Name selected");
			act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
		}
		if (driver.findElements(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR).size() > 0) {
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
					driver.findElement(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR));
			Thread.sleep(3000);
			act.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN).build().perform();
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR,
					"Instrument Purchase Specification Number selected");
			act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
			Thread.sleep(2000);
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR,
					"Instrument Purchase Specification Number selected");
			act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();

		}

		if (driver.findElements(Gig_WorkflowsOBJ.foundatiotagnamepdnR).size() > 0) {
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
					driver.findElement(Gig_WorkflowsOBJ.foundatiotagnamepdnR));
			Thread.sleep(2000);
			TestUtilDemo.clickElement(Gig_WorkflowsOBJ.foundatiotagnamepdnR, "Control Room Number/Name selected");
			act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
		}

		TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "Save button");
		// changed sync time from 6000 to 4000
		Thread.sleep(2000);
//        webDriverWait.until(ExpectedConditions.elementToBeClickable(Gig_WorkflowsOBJ.gigContinueenabledbtn));
		TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinuebtn, "Save button");

	}

}
