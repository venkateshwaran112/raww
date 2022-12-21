package runn;


import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import java.util.List;

import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.status.StatusLogger;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.baseclass.Baseclass;
import com.pomclass.Pageobj;
import com.runner.Runnerc;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class pinf extends Baseclass  {
	
  public static WebDriver driver = Runnerc.driver;
  public static java.util.Properties pro = Runnerc.prop;
  Pageobj pg = new Pageobj(driver);
  private static final Logger LOGGER = LogManager.getLogger(pinf.class);
  
  
  
	 @Before
	 public void beforeHooks(Scenario s) {
		 String Nmae = s.getName();
		 System.out.println("Scenario Name :"+ Nmae);
	
	}
	
	 @After
	 public void afterHooks(Scenario s) {
		 Status statusOfScenario = s.getStatus();
		 System.out.println("statusOfScenario :"+ statusOfScenario);
		 
//		 if (s.isFailed()) {
//			 screenShot("F:\\musheik2\\Sneha Projects\\Maven\\Adcitin_And_Cucumber\\Screenshots\\failed.png");
//			
		}
	
	@Given("user has to launch the application admission page")
	public void user_has_to_launch_the_application_admission_page() throws InterruptedException {
		
		LOGGER.info("URL has started");
		getUrl();
	
	}

	@When("user has to fill the pson information in form of textbox fields")
	public void user_has_to_fill_the_pson_information_in_form_of_textbox_fields(DataTable dataTable) throws InterruptedException {
		LOGGER.info("User personal information entry has started");
		List<String> asl = dataTable.asList(String.class);
//		System.out.println(asl.size());
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    waitforElementVisiblity(pg.getWp1().getFirstname());
		Actions ac = new Actions(driver);
		ac.click(pg.getWp1().getFirstname()).sendKeys(asl.get(0) +Keys.TAB).sendKeys(Keys.TAB)
		.sendKeys(asl.get(1) +Keys.TAB).sendKeys(asl.get(2)+Keys.TAB).sendKeys(asl.get(3)+Keys.TAB+Keys.TAB)
		.sendKeys(asl.get(4)+Keys.TAB).sendKeys(asl.get(5)+Keys.TAB).sendKeys(asl.get(6)+Keys.TAB)
		.sendKeys(asl.get(7)+Keys.TAB).sendKeys(asl.get(8)+Keys.TAB+Keys.TAB).sendKeys(asl.get(9)).perform();
		LOGGER.info("User personal information entry has completed");
	}

	@When("user has to fill the pson information in the form of dropdowns")
	public void user_has_to_fill_the_pson_information_in_the_form_of_dropdowns(DataTable dataTable) {
        LOGGER.info("User dropdowns entry has started");
		List<String> asL = dataTable.asList(String.class);  
		selectDropDownOption(pg.getWp1().getCountry(), "index", asL.get(0));
		selectDropDownOption(pg.getWp1().getPgminterest(), "index", asL.get(1));
		selectDropDownOption(pg.getWp1().getReferral(), "index", asL.get(2));           
		LOGGER.info("User dropdowns entry has been completed");
	}
	@When("user has to click their required radio button")
	public void user_has_to_click_their_required_radio_button() {
		pg.getWp1().getRad().click();
	  
	}
//
	@Then("click the submit button")
	public void click_the_submit_button() {
	    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		pg.getWp1().getButton().click();
	   String te = driver.findElement(By.xpath("//span[@class='fusion-alert-content']")).getText();
	  if( te.contains("THANK YOU")) {
		  System.out.println("Submit is successful");
	  }
	}

}
