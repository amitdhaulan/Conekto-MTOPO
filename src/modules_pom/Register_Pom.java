package modules_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Register_Pom {
	public WebElement clickFieldName(String name) {
		return Home_Pom.driver.findElement(By.xpath(name));
	}

	public WebElement clickRegisterbutton(String str) {
		return Home_Pom.driver.findElement(By.linkText(str));
	}
}
