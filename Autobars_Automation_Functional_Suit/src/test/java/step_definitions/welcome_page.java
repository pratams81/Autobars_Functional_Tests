package Autobars_Automation_Functional_Suit.src.test.java.step_definitions;

import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import Autobars_Automation_Functional_Suit.src.test.java.pageobjects.Welcome_Screen;
import org.openqa.selenium.support.PageFactory;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by bendre on 25/02/2016.
 */
public class welcome_page {
    public WebDriver driver;
    public welcome_page()
    {
        driver = Hooks.driver;
    }

    @Then("^landing page is displayed$")
    public void landingPageForEalingIsDisplayed() throws Throwable {
        System.out.println(driver.getTitle());
        assertEquals("Local Government Digital Portal", driver.getTitle());

    }

    @Then("^logout button should be displayed$")
    public void logoutButtonShouldBeDisplayed() throws Throwable {
        PageFactory.initElements(driver, Welcome_Screen.class);
        assertEquals("Logout", Welcome_Screen.logout.getText());
    }
}
