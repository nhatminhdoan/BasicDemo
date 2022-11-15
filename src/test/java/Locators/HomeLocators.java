package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeLocators {
	 @FindBy(xpath = "//div[@class='orangehrm-login-error']")
     public  WebElement homePageUserName;
}
