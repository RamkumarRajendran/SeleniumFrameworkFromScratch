package pageObject;


import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import stepDefinition.LoginPageStep;
import utilities.UtilFrequentlyUsedMethod;


public class ApplicationLaucher {
	
	WebDriver driver;
	Properties ps = new Properties();
	UtilFrequentlyUsedMethod util = new UtilFrequentlyUsedMethod(driver);
	
	public ApplicationLaucher(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	public Logger log = LogManager.getLogger(LoginPageStep.class);
//	public void getLauchApplication() throws IOException {
//		
//		
//		//log.info("Driver instance Created");
//		String browser1 = util.readTestData("browser");
//		if(browser1.equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.chrome.driver", "D:\\Ramkumar\\Selenium\\SeleniumProjectNew\\loginwithZerodha\\Drivers\\chromedriver.exe");
//			driver = new ChromeDriver();
//			//DriverFactory.getDriver().get("https://www.facebook.com/login/");
//			//loginPS = new ApplicationLaucher(driver);	
//		}else if(browser1.equalsIgnoreCase("Firefox")){
//			
//			System.out.println("Firefox browser launched");
//			
////			System.setProperty("webdriver.chrome.driver", "D:\\Ramkumar\\Selenium\\SeleniumProjectNew\\loginwithZerodha\\Drivers\\chromedriver.exe");
////			driver = new ChromeDriver();
//			//DriverFactory.getDriver().get("https://www.facebook.com/login/");
//			//new LoginPage(driver);
//		}else {
//			System.out.println("Internet browser Launched");
//		}
//		driver.get("https://www.facebook.com/login/");
//		log.info("Application Lauched");
//		driver.manage().window().maximize();
//		log.info("App Maximized");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		log.info("Implicity wait completed");
//	}

}
