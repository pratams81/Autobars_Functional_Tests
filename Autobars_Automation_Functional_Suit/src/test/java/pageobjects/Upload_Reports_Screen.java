package Autobars_Automation_Functional_Suit.src.test.java.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by bendre on 25/02/2016.
 */
public class Upload_Reports_Screen extends BaseClass{
    public Upload_Reports_Screen(WebDriver driver) { super(driver); }

    @FindBy(how= How.CLASS_NAME, using="heading-large")
    public static WebElement title;

    @FindBy(how= How.TAG_NAME, using="u")
    public static WebElement attach_file;

    @FindBy(how= How.ID, using="submit")
    public static WebElement submit_button;

    @FindBy(how= How.CLASS_NAME, using="logout")
    public static WebElement logout;
}
