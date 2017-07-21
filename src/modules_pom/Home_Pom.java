package modules_pom;

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

public class Home_Pom {
	public static WebElement element;
	public static WebDriver driver;
	public static Properties properties;

	public Home_Pom() throws IOException {
		properties = new Properties();
		InputStream inStream = new FileInputStream("Properties.properties");
		properties.load(inStream);
		System.setProperty("webdriver.gecko.driver",
				"D:\\amit\\testing_git\\soft\\selen" + "ium_accessories\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		DesiredCapabilities handlSSLErr = DesiredCapabilities.firefox();
		handlSSLErr.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		driver = new FirefoxDriver(handlSSLErr);
		driver.manage().window().maximize();
		driver.get(properties.getProperty("URL"));
//		Register.conditionalWait(driver, "Navigated to the URL");
	}

	public static WebElement startButton() {
		return driver.findElement(By.partialLinkText(properties.getProperty("startButton")));
	}
}
