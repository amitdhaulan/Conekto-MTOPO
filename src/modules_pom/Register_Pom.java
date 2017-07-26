package modules_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Register_Pom {

	/* Registration page fields */
	public WebElement clickFieldName(String name) {
		return Home_Pom.driver.findElement(By.xpath(name));
	}

	/* Register button */
	public WebElement clickRegisterbutton(String str) {
		return Home_Pom.driver.findElement(By.linkText(str));
	}
}
