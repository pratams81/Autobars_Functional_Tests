package Autobars_Automation_Functional_Suit.src.test.java.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by bendre on 25/02/2016.
 */
public class Council_Tax_Screen extends BaseClass{
    public Council_Tax_Screen(WebDriver driver) { super(driver); }

    @FindBy(how= How.CLASS_NAME, using="heading-large")
    public static WebElement title;

    @FindBy(how= How.CSS, using="counciltax/submit")
    public static WebElement upload_reports;

    @FindBy(how= How.CSS, using="counciltax/history")
    public static WebElement previous_history;

    @FindBy(how= How.CLASS_NAME, using="logout")
    public static WebElement logout;
}
