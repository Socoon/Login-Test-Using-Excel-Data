package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;

public class loginPage extends PageBase {
	     private SelenideElement username = $(byId("user-name"));
	     private SelenideElement password = $(byId("password"));
	     private SelenideElement loginButton = $(byId("login-button"));
	     
	    
	     public void login(String user , String pass){
	    	 setText(username, user);
	    	 setText(password, pass);
	    	
	     }
	     public void clickLoginButton(){
	    	 clickButton(loginButton);
	     }
	     
} 
