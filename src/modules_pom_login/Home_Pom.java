package modules_pom_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Home_Pom {

	public WebElement buttons() {
		return login_page_pom.Home_Pom.driver.findElement(By.linkText("sell"));
	}

	public WebElement tiles() {
		return login_page_pom.Home_Pom.driver.findElement(By.linkText("sell"));
	}

	// public WebElement preSellButton() {
	// return null;
	// }
	//
	// public WebElement extrasButton() {
	// return null;
	// }
	//
	// public WebElement dashboardButton() {
	// return null;
	// }
	//
	//
	// public WebElement inventoryButton() {
	// return null;
	// }
	//
	// public WebElement employeesButton() {
	// return null;
	// }
	//
	// public WebElement reportsButton() {
	// return null;
	// }
	//
	// public WebElement branchesButton() {
	// return null;
	// }
	//
	// public WebElement growButton() {
	// return null;
	// }
	//
	// public WebElement marketingButton() {
	// return null;
	// }
	//
	// public WebElement capitalButton() {
	// return null;
	// }
	//
	// public WebElement trainingButton() {
	// return null;
	// }
	//
	// public WebElement settingsButton() {
	// return null;
	// }
	// public WebElement signoutButton() {
	// return null;
	// }
}
