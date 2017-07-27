package modules_pom_registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import login_page_pom.Home_Pom;

public class Register_Pom {

	/* Registration page fields */
	public WebElement clickFieldName(String name) {
		return Home_Pom.driver.findElement(By.xpath(name));
	}

	/* Register button */
	public WebElement clickRegisterbutton(String str) {
		return Home_Pom.driver.findElement(By.linkText(str));
	}
	
	public WebElement clickRegister(WebDriver driver) {
		return driver.findElement(By.partialLinkText(Home_Pom.properties.getProperty("registerNewUser")));
	}
}
