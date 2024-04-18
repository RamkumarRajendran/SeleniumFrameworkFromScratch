package stepDefinition;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;

public class Hooks {
	
	
	WebDriver driver;
	Properties p;
	Logger log;
	
	
	@Before()
	public void setUp() throws IOException {
		driver = BaseClassStep.getLauchApplication();
		p=BaseClassStep.readTestData();
		log = BaseClassStep.logger();
		driver.get(p.getProperty("URL"));
		log.info(" App URL : "+p.get("URL"));
		driver.manage().window().maximize();
		log.info("App Maximized");
	}
	
	@After()
	public void tearDown(Scenario se) {
		driver=BaseClassStep.getPropertiesInit();
		driver.quit();
	}
	
	@AfterStep()
	public void takeScreenshots(Scenario se) {
		if(se.isFailed()) {
		
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			byte[] shot = ts.getScreenshotAs(OutputType.BYTES);
			
			se.embed(shot, "image/png");
			
		}
	}

}
