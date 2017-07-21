package modules_pom;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Pom {
	Home_Pom homePom;

	public Login_Pom() throws IOException {
		try {
			homePom = new Home_Pom();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public WebElement clickRegister(WebDriver driver) {
		return driver.findElement(By.partialLinkText(Home_Pom.properties.getProperty("registerNewUser")));
	}
}
