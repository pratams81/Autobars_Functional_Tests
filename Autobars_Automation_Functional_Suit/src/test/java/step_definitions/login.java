package Autobars_Automation_Functional_Suit.src.test.java.step_definitions;

import Autobars_Automation_Functional_Suit.src.test.java.pageobjects.Login_Screen;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by bendre on 17/02/2016.
 */
public class login {
    public WebDriver driver;
    public login()
    {
        driver = Hooks.driver;
    }

    @Given("^User is on the Autobars login page$")
    public void userIsOnTheAutobarsLoginPage() throws Throwable {
        driver.get("https://autobars-alpha.herokuapp.com/login");
        assertEquals("https://autobars-alpha.herokuapp.com/login", driver.getCurrentUrl());
        assertEquals("Login",driver.getTitle());
    }



    @When("^I enter \"([^\"]*)\" username$")
    public void iEnterAValidUsername(String username) throws Throwable {
        PageFactory.initElements(driver, Login_Screen.class);
        Login_Screen.UserName.clear();
        Login_Screen.UserName.sendKeys(username);
        //System.out.println("Firstname html "+firstName.getAttribute("outerHTML"));
    }

    @When("^I enter \"([^\"]*)\" password$")
    public void iEnterAValidPassword(String password) throws Throwable {
        Login_Screen.UserPassword.clear();
        Login_Screen.UserPassword.sendKeys(password);
    }

    @When("^I click Signin button$")
    public void signinIsClicked() throws Throwable {
       Login_Screen.signin_button.click();
    }


    @Then("^Login page is displayed$")
    public void loginPageIsDisplayed() throws Throwable {
        assertEquals("Login",driver.getTitle());
    }

    @Then("^the error message title should be \"([^\"]*)\"$")
    public void theErrorMessageTitleShouldBe(String title) throws Throwable {
        assertEquals(Login_Screen.error_title, title);
    }


}

