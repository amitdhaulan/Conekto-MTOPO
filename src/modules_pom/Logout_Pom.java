package modules_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logout_Pom {
	public WebElement clickLogout() {
		return Home_Pom.driver.findElement(By.xpath(Home_Pom.properties.getProperty("logoutButton")));
	}
}
