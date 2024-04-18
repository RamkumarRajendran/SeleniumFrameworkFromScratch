package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepDefinition.BaseClassStep;


public class UtilFrequentlyUsedMethod {
	
	public WebDriver driver;
	public Logger log = LogManager.getLogger(UtilFrequentlyUsedMethod.class);
	public UtilFrequentlyUsedMethod(WebDriver driver) {
		this.driver=driver;
		
		//PageFactory.initElements(driver, this);
		
		
	}
	
	public void waitForElementVisible(WebElement el, Duration st) {
		
		Wait<WebDriver> wait = new WebDriverWait(driver, st);
		
		wait.until(ExpectedConditions.visibilityOf(el));
		
	}
	
	Properties ps = new Properties();
	
//	String filePath = System.getProperty("user.dir")+"\\Properties\\TestDataTestEnvirolment.properties";
//	FileInputStream file; 
//	  
//	
//	public String readTestData(String s) throws IOException {
//		 file =new FileInputStream(filePath);
//		 ps.load(file);
//		String value =ps.getProperty(s);
//		log.info(s+"   Option Read from Properties File");
//		return value;
//	}
	
	}
