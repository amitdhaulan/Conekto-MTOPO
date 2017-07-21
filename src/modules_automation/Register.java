package modules_automation;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import modules_pom.Home_Pom;
import modules_pom.Login_Pom;
import modules_pom.RegisterPOS_Pom;
import modules_pom.Register_Pom;
import modules_pom.StoresNumber_Pom;

public class Register {
	Log log;
	Login_Pom loginpom;
	RegisterPOS_Pom registerPOS_Pom;
	Register_Pom register_pom;

	@BeforeTest
	public void startUp() {
		try {
			loginpom = new Login_Pom();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 0)
	public void clickStartButton() {
		try {
			Home_Pom.extentTest = Home_Pom.extent.startTest("In click Start button test", "");
			conditionalWait(Home_Pom.driver, "startUp");
			Home_Pom.startButton().click();
			Home_Pom.extentTest.log(LogStatus.INFO, "----->Start button clicked");
			Home_Pom.extent.endTest(Home_Pom.extentTest);
			Home_Pom.extent.flush();
		} catch (Exception exception) {
			Home_Pom.extentTest.log(LogStatus.ERROR, exception.getMessage());
			Home_Pom.extent.endTest(Home_Pom.extentTest);
			Home_Pom.extent.flush();
		}

	}

	@Test(priority = 1)
	public void clickRegister() {
		try {
			Home_Pom.extentTest = Home_Pom.extent.startTest("In click Register button test", "");
			conditionalWait(Home_Pom.driver, "clickStartButton");
			loginpom.clickRegister(Home_Pom.driver).click();
			Home_Pom.extentTest.log(LogStatus.INFO, "----->register as a new user button clicked");

			Home_Pom.extent.endTest(Home_Pom.extentTest);
			Home_Pom.extent.flush();
		} catch (Exception exception) {
			Home_Pom.extentTest.log(LogStatus.ERROR, exception.getMessage());
			Home_Pom.extent.endTest(Home_Pom.extentTest);
			Home_Pom.extent.flush();
		}
	}

	@Test(priority = 2)
	public void clickBusinessType() {
		try {
			Home_Pom.extentTest = Home_Pom.extent.startTest("In click of Business Type test", "");
			conditionalWait(Home_Pom.driver, "clickRegister");
			registerPOS_Pom = new RegisterPOS_Pom();
			registerPOS_Pom.clickFashionnAperal().click();
			Home_Pom.extentTest.log(LogStatus.INFO, "----->Business type clicked");

			Home_Pom.extent.endTest(Home_Pom.extentTest);
			Home_Pom.extent.flush();
		} catch (Exception exception) {
			Home_Pom.extentTest.log(LogStatus.ERROR, exception.getMessage());
			Home_Pom.extent.endTest(Home_Pom.extentTest);
			Home_Pom.extent.flush();
		}
	}

	@Test(priority = 3)
	public void clickNextButtonAfterSelectingBuisnessType() {
		try {
			Home_Pom.extentTest = Home_Pom.extent.startTest("In click of Button after selecting business type", "");
			conditionalWait(Home_Pom.driver, "clickBusinessType");
			registerPOS_Pom = new RegisterPOS_Pom();
			registerPOS_Pom.clicknextButtonAfterSelectingBuisnessType().click();
			Home_Pom.extentTest.log(LogStatus.INFO, "----->Button after selecting business type clicked");

			Home_Pom.extent.endTest(Home_Pom.extentTest);
			Home_Pom.extent.flush();
		} catch (Exception exception) {
			Home_Pom.extentTest.log(LogStatus.ERROR, exception.getMessage());
			Home_Pom.extent.endTest(Home_Pom.extentTest);
			Home_Pom.extent.flush();
		}

	}

	@Test(priority = 4)
	public void clickNumberofStores() {
		try {
			Home_Pom.extentTest = Home_Pom.extent.startTest("In click of Number of Stores", "");
			conditionalWait(Home_Pom.driver, "clickNextButtonAfterSelectingBuisnessType");
			StoresNumber_Pom storesNumber_Pom = new StoresNumber_Pom();
			storesNumber_Pom.clickStoreNumberTile(Home_Pom.properties.getProperty("storeNumber")).click();
			Home_Pom.extentTest.log(LogStatus.INFO, "----->Number of Stores tile clicked");

			Home_Pom.extent.endTest(Home_Pom.extentTest);
			Home_Pom.extent.flush();
		} catch (Exception exception) {
			Home_Pom.extentTest.log(LogStatus.ERROR, exception.getMessage());
			Home_Pom.extent.endTest(Home_Pom.extentTest);
			Home_Pom.extent.flush();
		}

	}

	@Test(priority = 5)
	public void doRegister() {
		try {
			Home_Pom.extentTest = Home_Pom.extent.startTest("In Registration test", "");
			conditionalWait(Home_Pom.driver, "clickNumberofStores");
			register_pom = new Register_Pom();
			register_pom.clickFieldName(Home_Pom.properties.getProperty("businessType"))
					.sendKeys("Fashion and Apparel"); // Business
			// Type
			Home_Pom.extentTest.log(LogStatus.INFO, "----->Entered business type");

			register_pom.clickFieldName(Home_Pom.properties.getProperty("firstName")).sendKeys("Test"); // First Name
			Home_Pom.extentTest.log(LogStatus.INFO, "----->Entered first name");

			register_pom.clickFieldName(Home_Pom.properties.getProperty("lastName")).sendKeys("User4"); // Last Name
			Home_Pom.extentTest.log(LogStatus.INFO, "----->Entered last name");

			register_pom.clickFieldName(Home_Pom.properties.getProperty("email")).sendKeys("testuser@yopmail.com"); // Email
			Home_Pom.extentTest.log(LogStatus.INFO, "----->Entered email");

			register_pom.clickFieldName(Home_Pom.properties.getProperty("phone")).sendKeys("4444444444"); // Phone
			Home_Pom.extentTest.log(LogStatus.INFO, "----->Entered phone number");

			register_pom.clickFieldName(Home_Pom.properties.getProperty("city")).sendKeys("City4"); // City
			Home_Pom.extentTest.log(LogStatus.INFO, "----->Entered city");

			register_pom.clickFieldName(Home_Pom.properties.getProperty("country")).sendKeys("Country4"); // Country
			Home_Pom.extentTest.log(LogStatus.INFO, "----->Entered country");

			register_pom.clickFieldName(Home_Pom.properties.getProperty("password")).sendKeys("testuser4"); // Password
			Home_Pom.extentTest.log(LogStatus.INFO, "----->Entered password");

			register_pom.clickFieldName(Home_Pom.properties.getProperty("confirmPassword")).sendKeys("testuser4"); // Confirm
																													// Password
			Home_Pom.extentTest.log(LogStatus.INFO, "----->Entered confirm password");

			Home_Pom.extentTest.log(LogStatus.INFO, "----->Entrered all the fields");

			Home_Pom.extent.endTest(Home_Pom.extentTest);
			Home_Pom.extent.flush();

		} catch (Exception exception) {
			Home_Pom.extentTest.log(LogStatus.ERROR, exception.getMessage());
			Home_Pom.extent.endTest(Home_Pom.extentTest);
			Home_Pom.extent.flush();
		}

	}

	@Test(priority = 6)
	public void clickregister() {
		try {
			Home_Pom.extentTest = Home_Pom.extent.startTest("In click of registration button", "");
			conditionalWait(Home_Pom.driver, "doRegister");
			register_pom = new Register_Pom();
			register_pom.clickRegisterbutton(Home_Pom.properties.getProperty("registerButton")).click();
			Home_Pom.extentTest.log(LogStatus.INFO, "----->registration button clicked");
			Home_Pom.extent.endTest(Home_Pom.extentTest);
			Home_Pom.extent.flush();
		} catch (Exception exception) {
			Home_Pom.extentTest.log(LogStatus.ERROR, exception.getMessage());
			Home_Pom.extent.endTest(Home_Pom.extentTest);
			Home_Pom.extent.flush();
		}
	}

	public static void conditionalWait(WebDriver driver, String testName) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("html")));
		} catch (TimeoutException exception) {
			System.out.println("--------> Timeout occurs in " + testName);
		}
	}

	@AfterClass
	public void afterClass() {
		Home_Pom.extent.close();
	}
}
