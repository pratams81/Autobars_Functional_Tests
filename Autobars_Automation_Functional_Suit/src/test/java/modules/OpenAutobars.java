package Autobars_Automation_Functional_Suit.src.test.java.modules;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import Autobars_Automation_Functional_Suit.src.test.java.helpers.Log;
import java.util.HashMap;


/**
 * Created by bendre on 17/02/2016.
 */
public class OpenAutobars {

    public static void Execute(WebDriver driver, HashMap<String,String> map) throws Exception{


        driver.get(map.get("url"));

        Log.info(map.get("url"));

        Reporter.log("Application opened");

    }
}