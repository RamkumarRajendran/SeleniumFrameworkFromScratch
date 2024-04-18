package stepDefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObject.LoginPage;


public class LoginPageStep extends BaseClassStep{


	LoginPage lp; 
	WebDriver webdriver;
	
	//public Logger log = LogManager.getLogger(LoginPageStep.class);
	@Given("user is on login page")
	public void user_is_on_login_page() throws IOException {
			
		lp = new LoginPage(getPropertiesInit());
			}

	//@When("user gets the title of the page")
	//public void user_gets_the_title_of_the_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	//}

	//@Then("page title should be {string}")
	//public void page_title_should_be(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	//}
	//
	//@Then("forget password link should be displayed")
	//public void forget_password_link_should_be_displayed() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	//}

	@When("user enter username {string}")
	public void user_enter_username(String string) throws InterruptedException {
		//lp =new LoginPage(driver);
		lp.getLoginPageEmail(string);
	}

	@When("user enter password {string}")
	public void user_enter_password(String string) {
		////lp =new LoginPage(driver);
		lp.getLoginPagePassword(string);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		//lp = new LoginPage(driver);
		lp.getLoginPageBtnLogin();
	}

	//@Then("user get the title of the page")
	//public void user_get_the_title_of_the_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	//}
	
	@When("check for login button backgroud color")
	public void check_for_login_button_backgroud_color() {
		//lp = new LoginPage(driver);
		lp.backgroundColorValidation();
		
	}

}
