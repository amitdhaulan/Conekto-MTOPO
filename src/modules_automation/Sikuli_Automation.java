package modules_automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import login_page_pom.Home_Pom;

public class Sikuli_Automation {
	Robot robot;
	Pattern start = new Pattern("D:\\amit\\Java_programs\\Conekto-MTOPO\\libs\\images\\start.png");
	Pattern registerNewUser = new Pattern(
			"D:\\amit\\Java_programs\\Conekto-MTOPO\\libs\\images\\registernewuser_button.png");
	Pattern businessTypeTile = new Pattern("D:\\amit\\Java_programs\\Conekto-MTOPO\\libs\\images\\fashionNApparel.png");
	Pattern nextButton = new Pattern("D:\\amit\\Java_programs\\Conekto-MTOPO\\libs\\images\\nextAfterBusinessType.png");
	Pattern noOfStores = new Pattern("D:\\amit\\Java_programs\\Conekto-MTOPO\\libs\\images\\noOfStores.png");
	Pattern register = new Pattern("D:\\amit\\Java_programs\\Conekto-MTOPO\\libs\\images\\register.png");

	public void automationcript() throws FindFailed, InterruptedException, AWTException {
		robot = new Robot();
		Home_Pom.driver.manage().window().maximize();
		System.out.println("Sikuli Automation");
		Screen screen = new Screen();
		screen.click(start);
		Thread.sleep(10000);
		Register.checkIfPageIsReady(Home_Pom.driver, "start clicked");
		screen.click(registerNewUser);
		Register.checkIfPageIsReady(Home_Pom.driver, "Register New User button clicked");
		Thread.sleep(10000);
		zoomOut();
		robot.keyRelease(KeyEvent.VK_CONTROL);
		screen.click(businessTypeTile);
		Thread.sleep(10000);
		// scrollingNSleep(Home_Pom.driver);
		Register.checkIfPageIsReady(Home_Pom.driver, "Fashion and Apparel clicked");
		screen.click(nextButton);
		Register.checkIfPageIsReady(Home_Pom.driver, "Next button clicked");
		Thread.sleep(10000);
		screen.click(noOfStores);
		Register.checkIfPageIsReady(Home_Pom.driver, "Number of Stores clicked");
		Thread.sleep(10000);
		screen.click(nextButton);
		zoomIn();
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(10000);
		Register.checkIfPageIsReady(Home_Pom.driver, "Next button clicked");
		// screen.click(register);
		System.exit(0);
	}

	public void zoomOut() throws AWTException {
		for (int i = 0; i < 4; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_MINUS);
		}
	}

	public void zoomIn() throws AWTException {
		for (int i = 0; i < 4; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ADD);
		}
	}
}
