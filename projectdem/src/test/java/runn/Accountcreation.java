package runn;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.baseclass.Baseclass;
import com.pomclass.Pageobj;
import com.runner.Runnerc;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Accountcreation extends Baseclass{
	
	  public static WebDriver driver = Runnerc.driver;
	  public static java.util.Properties pro = Runnerc.prop;
	  Pageobj pg = new Pageobj(driver);
	  private static final Logger LOGGER = LogManager.getLogger(Accountcreation.class);
	  
	  
		 @Before
		 public void beforeHooks(Scenario s) {
			 String Nmae = s.getName();
			 System.out.println("Scenario Name :"+ Nmae);
		}
		
		 @After
		 public void afterHooks(Scenario s) {
			 Status statusOfScenario = s.getStatus();
			 System.out.println("statusOfScenario :"+ statusOfScenario);
			 
//			 if (s.isFailed()) {
//				 screenShot("F:\\musheik2\\Sneha Projects\\Maven\\Adcitin_And_Cucumber\\Screenshots\\failed.png");
//				
			}
		 
		 @Given("User enter the url click create and account page")
		 public void user_enter_the_url_click_create_and_account_page() {
			 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			 getaccUrl(); 
				pg.getwp2().getCre().click();
			}
		 
		 @When("user enter Personal Information {string} and {string}")
		 public void user_enter_personal_information_and(String string, String string2) {
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 pg.getwp2().getFirstname().click();
		   pg.getwp2().getFirstname().sendKeys(string);
		   pg.getwp2().getLastname().click();
		   pg.getwp2().getLastname().sendKeys(string2);
		   
		 }

		 @When("User has to enter the Sign in information {string} {string} {string}")
		 public void user_has_to_enter_the_sign_in_information(String string, String string2, String string3) throws InterruptedException {
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 pg.getwp2().getEmail().click();
	        pg.getwp2().getEmail().sendKeys(string);
	        pg.getwp2().getPass().click();
	        pg.getwp2().getPass().sendKeys(string2);
	        pg.getwp2().getCnfpass().click();
	        pg.getwp2().getCnfpass().sendKeys(string3);
	        Thread.sleep(3000);
	        String ati = pg.getwp2().getErrpass().getAttribute("style");
	        if(ati.contains("display: none;")) {
	        	org.testng.Assert.assertTrue(true);
	        	System.out.println("Result is pass");
	        }else {
	        	
	        	org.testng.Assert.assertFalse(false);
	        	System.out.println("Result is fail");
	        }
	        pg.getwp2().getButton().click();
	        Thread.sleep(2000);
	        String ti = driver.getTitle();
			 if(ti.contains("https://magento.softwaretestingboard.com/customer/account/")) {
				 org.testng.Assert.assertTrue(true);
			 }
			 else {
               org.testng.Assert.assertFalse(false);
			 }
		 }

		 @When("click create account")
		 public void click_create_account() throws InterruptedException {
		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			mouseHoverToElement(pg.getwp2().getButon());
			Actions s = new Actions(driver);
			s.sendKeys(Keys.TAB); s.sendKeys(Keys.TAB);s.sendKeys(Keys.TAB).click();
			
			 
		 }

		

		 
		 
		 
		 
		 
		 
		 
		 
		 
	  

		 
		
		
	
			

//		@When("user enter Personal Information {string} and {string}")
//		public void user_enter_personal_information_and(String string, String string2) {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//		@When("User has to enter the Sign in information {string} {string} {string}")
//		public void user_has_to_enter_the_sign_in_information(String string, String string2, String string3) {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//		@When("click create account")
//		public void click_create_account() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}
//
//		@Then("user has to enter into accounts page")
//		public void user_has_to_enter_into_accounts_page() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}


}
