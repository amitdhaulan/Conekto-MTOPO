package modules_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StoresNumber_Pom {

	public WebElement clickStoreNumberTile(String str) {
		return Home_Pom.driver.findElement(By.xpath(str));
	}
}
