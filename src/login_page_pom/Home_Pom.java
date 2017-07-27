package login_page_pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import modules_automation.Register;

public class Home_Pom {
	public static WebElement element;
	public static WebDriver driver;
	public static Properties properties;

	/* Reporting variables */
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	String testingReportFile = System.getProperty("user.dir") + "\\Report\\TestignStatusReport.html";

	public Home_Pom() throws IOException {
		extent = new ExtentReports(testingReportFile, false);
		extentTest = extent.startTest("Launching application in the browser ", "Opening!");
		properties = new Properties();
		InputStream inStream = new FileInputStream("Properties.properties");
		properties.load(inStream);
		System.setProperty("webdriver.gecko.driver",
				"D:\\amit\\testing_git\\soft\\selen" + "ium_accessories\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		DesiredCapabilities handlSSLErr = DesiredCapabilities.firefox();
		handlSSLErr.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		driver = new FirefoxDriver(handlSSLErr);
		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();

		if (driver.getTitle().equals("502 Bad Gateway")) {
			System.exit(0);
		}
		extentTest.log(LogStatus.INFO, "-----> Browser Launched");

		extent.endTest(Home_Pom.extentTest);
		extent.flush();
		// Register.conditionalWait(driver, "Navigated to the URL");
		Register.checkIfPageIsReady(Home_Pom.driver, "Loading the URL");
	}

	public static WebElement startButton() {
		return driver.findElement(By.partialLinkText(properties.getProperty("startButton")));
	}
}
