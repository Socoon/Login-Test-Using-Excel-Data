package testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import helper.ExcelReader;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;
import pages.loginPage;

public class LoginCase extends TestBase {
    loginPage loginpageobject = new loginPage();

    @DataProvider(name = "loginData")
    public Object[][] loginData() throws Exception {
        String path = System.getProperty("user.dir")+"/src/test/java/helper/Data.xlsx";
    	return ExcelReader.readExcel(path);
    }

    @Test(dataProvider = "loginData")
    public void loginSteps(String username, String password) {
        loginpageobject.login(username, password);
        loginpageobject.clickLoginButton();

        if ($(byCssSelector(".error-message-container.error")).isDisplayed()) {
            Assert.fail("Invalid user or password");
        }
    }
}
