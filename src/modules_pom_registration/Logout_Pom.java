package modules_pom_registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import login_page_pom.Home_Pom;

public class Logout_Pom {
	public WebElement clickLogout() {
		return Home_Pom.driver.findElement(By.xpath(Home_Pom.properties.getProperty("logoutButton")));
	}
}
