package login_page_pom;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Pom {
	Home_Pom homePom;

	public Login_Pom() throws IOException {
		homePom = new Home_Pom();
	}

	public WebElement userName(WebDriver driver) {
		return driver.findElement(By.id(Home_Pom.properties.getProperty("userName")));
	}

	public WebElement password(WebDriver driver) {
		return driver.findElement(By.id(Home_Pom.properties.getProperty("password")));
	}

	public WebElement logIn(WebDriver driver) {
		return driver.findElement(By.id(Home_Pom.properties.getProperty("password")));
	}
}
