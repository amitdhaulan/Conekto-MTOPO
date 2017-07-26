package modules_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPOS_Pom {
	public WebElement clickFashionnAperal(String businessType) {
		return Home_Pom.driver.findElement(By.xpath(businessType));
	}

	public WebElement clicknextButtonAfterSelectingBuisnessType() {
		return Home_Pom.driver.findElement(By.partialLinkText(Home_Pom.properties.getProperty("nextButton")));
	}
}
