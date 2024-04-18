package pageObject;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import stepDefinition.BaseClassStep;
import stepDefinition.LoginPageStep;

public class LoginPage {

public WebDriver driver;
//BaseClassStep	bs = new BaseClassStep();
public Logger log = LogManager.getLogger(LoginPageStep.class);
Properties ps = new Properties();
	
	
	//2. Constructor 
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	// 1. Locators
//		private By email = By.xpath("//input[@id='email']");
//		private By password = By.xpath("//input[@id='pass']");
//		private By Login = By.xpath("//button[@id='loginbutton']");
	//	
		@FindBy(xpath="//input[@id='email']")
		@CacheLookup
		WebElement email;
		@FindBy(xpath="//input[@id='pass']")
		@CacheLookup
		WebElement password;
		@FindBy(xpath="//button[@id='loginbutton']")
		@CacheLookup
		WebElement Login;
	
// 3. Page Actions Methods
		
		
		
	public void getLoginPageEmail(String emails) throws InterruptedException {
		Thread.sleep(5000);
		email.sendKeys(emails);
	}
	
public void getLoginPagePassword(String passwords) {
		
	password.sendKeys(passwords);
	}


public void getLoginPageBtnLogin() {
		
	Login.click();
	}

public void backgroundColorValidation() {
	
	String color = Login.getCssValue("background-color");
	 Color.fromString(color).getColor();
	//String c = Login.getCssValue(color)
	
	System.out.println(color);
	System.out.println( Color.fromString(color).asRgb());
	System.out.println( Color.fromString(color).asHex());
	
	
	Assert.assertEquals("#1877f2", Color.fromString(color).asHex());
	
}

}
