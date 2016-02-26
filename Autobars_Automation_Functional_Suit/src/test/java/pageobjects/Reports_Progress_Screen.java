package Autobars_Automation_Functional_Suit.src.test.java.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by bendre on 25/02/2016.
 */
public class Reports_Progress_Screen extends BaseClass {
    public Reports_Progress_Screen(WebDriver driver) { super(driver); }

    @FindBy(how= How.CLASS_NAME, using="heading-large")
    public static WebElement title;

    @FindBy(how= How.CLASS_NAME, using="complete")
    public static WebElement complete_sign;

    @FindBy(how= How.CLASS_NAME, using="waiting")
    public static WebElement waiting_sign;

    @FindBy(how= How.ID, using="success")
    public static WebElement success;

    @FindBy(how= How.ID, using="total")
    public static WebElement total;

    @FindBy(how= How.ID, using="fail")
    public static WebElement fail;

    @FindBy(how= How.CSS, using="progress/failed")
    public static WebElement failed_link;

    @FindBy(how= How.ID, using="ok")
    public static WebElement ok_button;

    @FindBy(how= How.CLASS_NAME, using="logout")
    public static WebElement logout;
}
