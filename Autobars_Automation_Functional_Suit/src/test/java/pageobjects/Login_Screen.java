package Autobars_Automation_Functional_Suit.src.test.java.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by bendre on 17/02/2016.
 */
public class Login_Screen extends BaseClass{

    public Login_Screen(WebDriver driver) { super(driver); }

    @FindBy(how= How.CLASS_NAME, using="heading-large")
    public static WebElement title;

    @FindBy(how=How.ID, using="UserName")
    public static WebElement UserName;

    @FindBy(how=How.ID, using="UserPassword")
    public static WebElement UserPassword;

    @FindBy(how=How.ID, using="RememberMe")
    public static WebElement RememberMe_checkbox;

    @FindBy(how=How.CLASS_NAME, using="button")
    public static WebElement signin_button;

    @FindBy(how= How.TAG_NAME, using="h1")
    public static WebElement error_title;

    @FindBy(how= How.CLASS_NAME, using="error-summary")
    public static WebElement error_message;
}
