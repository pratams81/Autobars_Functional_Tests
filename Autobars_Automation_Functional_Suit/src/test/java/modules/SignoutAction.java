package Autobars_Automation_Functional_Suit.src.test.java.modules;

import Autobars_Automation_Functional_Suit.src.test.java.helpers.Log;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import Autobars_Automation_Functional_Suit.src.test.java.pageobjects.LoginPage;



public class SignoutAction {

	public static void Execute(WebDriver driver) throws Exception{
		
		LoginPage.signin_button.click();
		Log.info("Sign out is performed");

		Reporter.log("Sign out is performed");

	}
}
