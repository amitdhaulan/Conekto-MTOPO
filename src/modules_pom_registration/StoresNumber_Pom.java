package modules_pom_registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import login_page_pom.Home_Pom;

public class StoresNumber_Pom {

	public WebElement clickStoreNumberTile(String str) {
		return Home_Pom.driver.findElement(By.xpath(str));
	}
}
