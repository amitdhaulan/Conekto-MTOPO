package modules_automation;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import login_page_pom.Home_Pom;
import login_page_pom.Login_Pom;
import modules_pom_registration.RegisterPOS_Pom;
import modules_pom_registration.Register_Pom;
import modules_pom_registration.StoresNumber_Pom;

public class Register {
	Login_Pom loginpom;
	RegisterPOS_Pom registerPOS_Pom;
	static Register_Pom register_pom;

	@BeforeTest
	public void startUp() throws FindFailed, InterruptedException, AWTException {
		try {
			loginpom = new Login_Pom();
			
			registerPOS_Pom = new RegisterPOS_Pom();
			register_pom = new Register_Pom();
			if (Home_Pom.properties.getProperty("sikuli").equals("true")) {
				Sikuli_Automation automation = new Sikuli_Automation();
				automation.automationcript();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 0)
	public void clickStartButton() {
		try {
			Home_Pom.extentTest = Home_Pom.extent.startTest("In click Start button test", "");
			// conditionalWait(Home_Pom.driver, "startUp");
			checkIfPageIsReady(Home_Pom.driver, "Click Start Button");

			Home_Pom.startButton().click();
			Home_Pom.extentTest.log(LogStatus.INFO, "Start button clicked");
			Home_Pom.extent.endTest(Home_Pom.extentTest);
			Home_Pom.extent.flush();
		} catch (Exception exception) {
			Home_Pom.extentTest.log(LogStatus.ERROR, exception.getMessage());
			Home_Pom.extent.endTest(Home_Pom.extentTest);
			Home_Pom.extent.flush();
			throw (exception);
		}

	}

	@Test(priority = 1)
	public void clickRegister() {
		try {
			Home_Pom.extentTest = Home_Pom.extent.startTest("In click Register button test", "");
			// conditionalWait(Home_Pom.driver, "clickStartButton");
			checkIfPageIsReady(Home_Pom.driver, "Click Register");
			register_pom.clickRegister(Home_Pom.driver).click();
			Home_Pom.extentTest.log(LogStatus.INFO, "Register as a new user button clicked");

			Home_Pom.extent.endTest(Home_Pom.extentTest);
			Home_Pom.extent.flush();
		} catch (Exception exception) {
			Home_Pom.extentTest.log(LogStatus.ERROR, exception.getMessage());
			Home_Pom.extent.endTest(Home_Pom.extentTest);
			Home_Pom.extent.flush();
			throw (exception);
		}
	}

	@Test(priority = 2)
	public void clickBusinessType_FashionNApparel() {
		try {
			Home_Pom.extentTest = Home_Pom.extent.startTest("In click of Business Type test", "");
			// conditionalWait(Home_Pom.driver, "clickRegister");
			checkIfPageIsReady(Home_Pom.driver, "Click business type");
			clickBusinessTypeTile("fashionNApparel");
			Home_Pom.extentTest.log(LogStatus.INFO, "Business type clicked");

			Home_Pom.extent.endTest(Home_Pom.extentTest);
			Home_Pom.extent.flush();
		} catch (Exception exception) {
			Home_Pom.extentTest.log(LogStatus.ERROR, exception.getMessage());
			Home_Pom.extent.endTest(Home_Pom.extentTest);
			Home_Pom.extent.flush();
			throw (exception);
		}
	}

	public void clickBusinessTypeTile(String businessType) {
		registerPOS_Pom.clickFashionnAperal(Home_Pom.properties.getProperty(businessType)).click();
	}

	@Test(priority = 3)
	public void clickNextButtonAfterSelectingBuisnessType() {
		try {
			Home_Pom.extentTest = Home_Pom.extent.startTest("In click of Button after selecting business type", "");
			// conditionalWait(Home_Pom.driver, "clickBusinessType");
			checkIfPageIsReady(Home_Pom.driver, "Click next button");
			registerPOS_Pom.clicknextButtonAfterSelectingBuisnessType().click();
			Home_Pom.extentTest.log(LogStatus.INFO, "Button after selecting business type clicked");

			Home_Pom.extent.endTest(Home_Pom.extentTest);
			Home_Pom.extent.flush();
		} catch (Exception exception) {
			Home_Pom.extentTest.log(LogStatus.ERROR, exception.getMessage());
			Home_Pom.extent.endTest(Home_Pom.extentTest);
			Home_Pom.extent.flush();
			throw (exception);
		}

	}

	@Test(priority = 4)
	public void clickNumberofStores() {
		try {
			Home_Pom.extentTest = Home_Pom.extent.startTest("In click of Number of Stores", "");
			// conditionalWait(Home_Pom.driver,
			// "clickNextButtonAfterSelectingBuisnessType");
			checkIfPageIsReady(Home_Pom.driver, "Click number of stores");
			StoresNumber_Pom storesNumber_Pom = new StoresNumber_Pom();
			storesNumber_Pom.clickStoreNumberTile(Home_Pom.properties.getProperty("storeNumber")).click();
			Home_Pom.extentTest.log(LogStatus.INFO, "Number of Stores tile clicked");

			Home_Pom.extent.endTest(Home_Pom.extentTest);
			Home_Pom.extent.flush();

			clickNextButtonAfterSelectingBuisnessType();

		} catch (Exception exception) {
			Home_Pom.extentTest.log(LogStatus.ERROR, exception.getMessage());
			Home_Pom.extent.endTest(Home_Pom.extentTest);
			Home_Pom.extent.flush();
			throw (exception);
		}

	}

	@Test(priority = 5)
	public static void doRegister() {
		try {
			Home_Pom.extentTest = Home_Pom.extent.startTest("In Registration test", "");
			// conditionalWait(Home_Pom.driver, "clickNumberofStores");
			checkIfPageIsReady(Home_Pom.driver, "Doing registeration");
			register_pom.clickFieldName(Home_Pom.properties.getProperty("businessType"))
					.sendKeys("Fashion and Apparel"); // Business
			// Type
			Home_Pom.extentTest.log(LogStatus.INFO, "Entered business type");

			register_pom.clickFieldName(Home_Pom.properties.getProperty("firstName")).sendKeys("Test"); // First Name
			Home_Pom.extentTest.log(LogStatus.INFO, "Entered first name");

			register_pom.clickFieldName(Home_Pom.properties.getProperty("lastName")).sendKeys("User5"); // Last Name5
			Home_Pom.extentTest.log(LogStatus.INFO, "Entered last name");

			register_pom.clickFieldName(Home_Pom.properties.getProperty("email")).sendKeys("testuser@yopmail.com"); // Email
			Home_Pom.extentTest.log(LogStatus.INFO, "Entered email");

			register_pom.clickFieldName(Home_Pom.properties.getProperty("phone")).sendKeys("5555555555"); // Phone
			Home_Pom.extentTest.log(LogStatus.INFO, "Entered phone number");

			register_pom.clickFieldName(Home_Pom.properties.getProperty("city")).sendKeys("City5"); // City
			Home_Pom.extentTest.log(LogStatus.INFO, "Entered city");

			register_pom.clickFieldName(Home_Pom.properties.getProperty("country")).sendKeys("Country5"); // Country
			Home_Pom.extentTest.log(LogStatus.INFO, "Entered country");

			register_pom.clickFieldName(Home_Pom.properties.getProperty("password")).sendKeys("testuser5"); // Password
			Home_Pom.extentTest.log(LogStatus.INFO, "Entered password");

			register_pom.clickFieldName(Home_Pom.properties.getProperty("confirmPassword")).sendKeys("testuser5"); // Confirm
																													// Password
			Home_Pom.extentTest.log(LogStatus.INFO, "Entered confirm password");

			Home_Pom.extentTest.log(LogStatus.INFO, "Entrered all the fields");

			Home_Pom.extent.endTest(Home_Pom.extentTest);
			Home_Pom.extent.flush();

		} catch (Exception exception) {
			Home_Pom.extentTest.log(LogStatus.ERROR, exception.getMessage());
			Home_Pom.extent.endTest(Home_Pom.extentTest);
			Home_Pom.extent.flush();
			throw (exception);
		}

	}

	@Test(priority = 6)
	public static void clickRegisterButton() {
		try {
			Home_Pom.extentTest = Home_Pom.extent.startTest("In click of registration button", "");
			// conditionalWait(Home_Pom.driver, "doRegister");
			checkIfPageIsReady(Home_Pom.driver, "Clicked register");
			register_pom.clickRegisterbutton(Home_Pom.properties.getProperty("registerButton")).click();
			Home_Pom.extentTest.log(LogStatus.INFO, "Registration button clicked");
			Home_Pom.extent.endTest(Home_Pom.extentTest);
			Home_Pom.extent.flush();
		} catch (Exception exception) {
			Home_Pom.extentTest.log(LogStatus.ERROR, exception.getMessage());
			Home_Pom.extent.endTest(Home_Pom.extentTest);
			Home_Pom.extent.flush();
			throw (exception);
		}
	}

	/*
	 * public static void conditionalWait(WebDriver driver, String testName) { try {
	 * WebDriverWait wait = new WebDriverWait(driver, 30);
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("html")))
	 * ; } catch (TimeoutException exception) {
	 * System.out.println("--------> Timeout occurs in " + testName); } }
	 */

	public static void checkIfPageIsReady(WebDriver driver, String TestName) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Initially bellow given if condition will check ready state of page.
		if (js.executeScript("return document.readyState").toString().equals("complete")) {
			System.out.println("Page Is loaded.");
			return;
		}

		// This loop will rotate for 50 times to check If page Is ready after every 10
		// seconds.
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
			}
			// To check page ready state.
			if (js.executeScript("return document.readyState").toString().equals("complete")) {
				break;
			}
		}
	}

	@AfterClass
	public void afterClass() {
		Home_Pom.extent.close();
	}
}
