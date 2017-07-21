package modules_automation;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
//		conditionalWait(Home_Pom.driver, "startUp");
		Home_Pom.startButton().click();
		System.out.println("---------> Start Button clicked");
	}

	@Test(priority = 1)
	public void clickRegister() {
//		conditionalWait(Home_Pom.driver, "clickStartButton");
		loginpom.clickRegister(Home_Pom.driver).click();
		System.out.println("---------> Register as a New User clicked");
	}

	@Test(priority = 2)
	public void clickBusinessType() {
//		conditionalWait(Home_Pom.driver, "clickRegister");
		registerPOS_Pom = new RegisterPOS_Pom();
		registerPOS_Pom.clickFashionnAperal().click();
		System.out.println("---------> clickBusinessType clicked");
	}

	@Test(priority = 3)
	public void clickNextButtonAfterSelectingBuisnessType() {
//		conditionalWait(Home_Pom.driver, "clickBusinessType");
		registerPOS_Pom = new RegisterPOS_Pom();
		registerPOS_Pom.clicknextButtonAfterSelectingBuisnessType().click();
		System.out.println("---------> Next Button After Selecting Buisness Type clicked");
	}

	@Test(priority = 4)
	public void clickNumberofStores() {
//		conditionalWait(Home_Pom.driver, "clickNextButtonAfterSelectingBuisnessType");
		StoresNumber_Pom storesNumber_Pom = new StoresNumber_Pom();
		storesNumber_Pom.clickStoreNumberTile(Home_Pom.properties.getProperty("storeNumber")).click();
		System.out.println("---------> Number of Stores clicked");
		registerPOS_Pom = new RegisterPOS_Pom();
		registerPOS_Pom.clicknextButtonAfterSelectingBuisnessType().click();
	}

	@Test(priority = 5)
	public void doRegister() {
//		conditionalWait(Home_Pom.driver, "clickNumberofStores");
		register_pom = new Register_Pom();
		register_pom.clickFieldName(Home_Pom.properties.getProperty("businessType")).sendKeys("Fashion and Apparel"); // Business
		// Type
		register_pom.clickFieldName(Home_Pom.properties.getProperty("firstName")).sendKeys("Test"); // First Name
		register_pom.clickFieldName(Home_Pom.properties.getProperty("lastName")).sendKeys("User3"); // Last Name
		register_pom.clickFieldName(Home_Pom.properties.getProperty("email")).sendKeys("testuser@yopmail.com"); // Email
		register_pom.clickFieldName(Home_Pom.properties.getProperty("phone")).sendKeys("3333333333"); // Phone
		register_pom.clickFieldName(Home_Pom.properties.getProperty("city")).sendKeys("City3"); // City
		register_pom.clickFieldName(Home_Pom.properties.getProperty("country")).sendKeys("Country3"); // Country
		register_pom.clickFieldName(Home_Pom.properties.getProperty("password")).sendKeys("testuser3"); // Password
		register_pom.clickFieldName(Home_Pom.properties.getProperty("confirmPassword")).sendKeys("testuser3"); // Confirm
																												// Password
	}

	@Test(priority = 6)
	public void clickregister() {
//		conditionalWait(Home_Pom.driver, "doRegister");
		register_pom = new Register_Pom();
		register_pom.clickRegisterbutton(Home_Pom.properties.getProperty("registerButton")).click();
	}

	/*public static void conditionalWait(WebDriver driver, String testName) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("html")));
		} catch (TimeoutException exception) {
			System.out.println("--------> Timeout occurs in " + testName);
		}
	}*/
}
