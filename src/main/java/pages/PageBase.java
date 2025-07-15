package pages;
import com.codeborne.selenide.SelenideElement;

public class PageBase {
	      public void clickButton(SelenideElement element){
	    	  element.click();
	    	  
	      }
	      public void setText(SelenideElement element, String value){
	    	  element.setValue(value);
	    	  
	      }
	

}
