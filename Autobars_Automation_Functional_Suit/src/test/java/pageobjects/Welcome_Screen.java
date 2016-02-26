package Autobars_Automation_Functional_Suit.src.test.java.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by bendre on 25/02/2016.
 */
public class Welcome_Screen extends BaseClass{
    public Welcome_Screen(WebDriver driver) { super(driver); }

    @FindBy(how= How.CLASS_NAME, using="heading-large")
    public static WebElement title;

    @FindBy(how= How.CSS, using="counciltax")
    public static WebElement council_tax;

    @FindBy(how= How.CSS, using="ndr")
    public static WebElement non_domestic_rates;

    @FindBy(how= How.ID, using="ba-username")
    public static WebElement ba_username;

    @FindBy(how= How.CLASS_NAME, using="logout")
    public static WebElement logout;

}
