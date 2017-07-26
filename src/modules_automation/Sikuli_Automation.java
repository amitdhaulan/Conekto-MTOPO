package modules_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import modules_pom.Home_Pom;

public class Sikuli_Automation {
	Pattern start = new Pattern("D:\\amit\\Java_programs\\Conekto-MTOPO\\libs\\images\\start.png");
	Pattern registerNewUser = new Pattern(
			"D:\\amit\\Java_programs\\Conekto-MTOPO\\libs\\images\\registernewuser_button.png");
	Pattern businessTypeTile = new Pattern("D:\\amit\\Java_programs\\Conekto-MTOPO\\libs\\images\\fashionNApparel.png");
	Pattern nextButton = new Pattern("D:\\amit\\Java_programs\\Conekto-MTOPO\\libs\\images\\nextAfterBusinessType.png");
	Pattern noOfStores = new Pattern("D:\\amit\\Java_programs\\Conekto-MTOPO\\libs\\images\\noOfStores.png");
	Pattern register = new Pattern("D:\\amit\\Java_programs\\Conekto-MTOPO\\libs\\images\\register.png");

	public void automationcript() throws FindFailed, InterruptedException {
		Home_Pom.driver.manage().window().maximize();
		System.out.println("Sikuli Automation");
		Screen screen = new Screen();
		screen.click(start);
		Register.checkIfPageIsReady(Home_Pom.driver, "start clicked");
		screen.click(registerNewUser);
		Register.checkIfPageIsReady(Home_Pom.driver, "Register New User button clicked");
		screen.click(businessTypeTile);
//		scrollingNSleep(Home_Pom.driver);
		
		zoomOut();
		Register.checkIfPageIsReady(Home_Pom.driver, "Fashion and Apparel clicked");
		screen.click(nextButton);
		Register.checkIfPageIsReady(Home_Pom.driver, "Next button clicked");
		screen.click(noOfStores);
		Register.checkIfPageIsReady(Home_Pom.driver, "Number of Stores clicked");
		screen.click(nextButton);
		Register.checkIfPageIsReady(Home_Pom.driver, "Next button clicked");
		// screen.click(register);
		System.exit(0);
	}

	public void scrollingNSleep(WebDriver driver) throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
	}

	public void zoomOut() {
		for (int i = 0; i < 3; i++) {
			Home_Pom.driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
		}
	}
}
