package testCases;

import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.*;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    @BeforeSuite
    public void startBrowser() {
        Configuration.browser = "chrome";
        open("https://www.saucedemo.com/");
       
    }

    @AfterSuite
    public void closeBrowser() {
        closeWebDriver();
    }
        
    }

