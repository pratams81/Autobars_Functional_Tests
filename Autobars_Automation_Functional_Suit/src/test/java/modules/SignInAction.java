package Autobars_Automation_Functional_Suit.src.test.java.modules;

import Autobars_Automation_Functional_Suit.src.test.java.helpers.Log;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import Autobars_Automation_Functional_Suit.src.test.java.pageobjects.LoginPage;


public class SignInAction {

	public static void Execute(WebDriver driver,HashMap<String,String> map) throws Exception{
		
		LoginPage.signin_button.click();
		Log.info("Click action is perfromed on My Account link" );

		LoginPage.usrname.sendKeys(map.get("username"));

		Log.info(" is entered in UserName text box" );
		

		Log.info(" is entered in Password text box" );LoginPage.pswd.sendKeys(map.get("password"));

		LoginPage.signin_button.click();
		Log.info("Click action is performed on Submit button");

		Reporter.log("SignIn Action is successfully perfomred");

	}
}
