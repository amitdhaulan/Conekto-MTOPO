package modules_automation;

import java.io.IOException;

import org.testng.annotations.BeforeTest;

import login_page_pom.Login_Pom;

public class Login {
	Login_Pom loginpom;
	@BeforeTest
	public void startUp() throws IOException {
		loginpom = new Login_Pom();
	}
}
