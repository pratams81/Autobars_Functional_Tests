package Autobars_Automation_Functional_Suit.src.test.java.step_definitions;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;


public class BlankStepDefs {
    public WebDriver driver;

    public BlankStepDefs() {
        driver = Hooks.driver;
    }

    @Then("^I validate title and URL$")
    public void i_print_title_and_URL() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals("Selenium Framework | Selenium, Cucumber, Ruby, Java et al.", driver.getTitle());
        assertEquals("http://www.seleniumframework.com/", driver.getCurrentUrl());
    }


}