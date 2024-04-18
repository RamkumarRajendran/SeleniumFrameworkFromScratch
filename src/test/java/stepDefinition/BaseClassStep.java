package stepDefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClassStep {

	static WebDriver driver;
	static Logger log;
	static Properties p;
	
	
public static WebDriver getLauchApplication() throws IOException {
		
		String browser1 = readTestData().getProperty("browser");
		
		if(browser1.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", readTestData().getProperty("Driverpath"));
			driver = new ChromeDriver();
			logger().info("Chrome Browser Launched");
		}else if(browser1.equalsIgnoreCase("Firefox")){
			
			
			System.setProperty("webdriver.chrome.driver", readTestData().getProperty("DriverPath"));
			driver = new ChromeDriver();
			logger().info("Firefox browser launched");
		}else {
			System.out.println("Internet browser Launched");
		}
		driver.manage().deleteAllCookies();
		logger().info("Application Lauched");
		//logger().info("App Maximized");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//logger().info("Implicity wait completed");
		
		return driver;
	}
	
public static WebDriver getPropertiesInit() {
	
	return driver;
}



public static Logger logger() {
	log = LogManager.getLogger();
	
	return log;
	
}
  

public static Properties readTestData() throws IOException {
	String filePath = System.getProperty("user.dir")+"\\Properties\\TestDataTestEnvirolment.properties";
	FileInputStream file;  
	file =new FileInputStream(filePath);
	p = new Properties();
	 p.load(file);
	return p;
}
	
	}
