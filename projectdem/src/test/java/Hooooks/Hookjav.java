package Hooooks;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.runner.Runnerc;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

public class Hookjav {
	
		
	
	
	@Before
	 public void beforeHooks(Scenario s) {
		s.log("Entering :  " +s.getName()); 
		String Nmae = s.getName();
		 System.out.println("Scenario Name :"+ Nmae);
		
	}
	
	 @After
	 public void afterHooks(Scenario s) {
		 if(s.isFailed())
		   {
			   s.log("Scenario failed");
		   }
		 else {
			 s.log("Scenario Passed");
		 }
		 Status statusOfScenario = s.getStatus();
		 System.out.println("statusOfScenario :"+ statusOfScenario);
		 
		 
//		 if (s.isFailed()) {
//			 screenShot("F:\\musheik2\\Sneha Projects\\Maven\\Adcitin_And_Cucumber\\Screenshots\\failed.png");
			
		}
	 @AfterStep
	 public void attachscreenshot(Scenario s) {
		 if(s.isFailed()) {
		final byte[] scre = ((TakesScreenshot)Runnerc.driver).getScreenshotAs(OutputType.BYTES);
		 s.attach(scre, "image/png", "errorscreen");
		 }
		 else {
			 s.log(s.getLine() +"is Passed");
		 }
	 }
	 
	 
	
		
//		@Before
//		public void bf(Scenario scenario)
//		{
//			base.setDriver();
//			base.setScenario(scenario);
//		}
		
//		@After
//		public void af(Scenario scenario) throws IOException
//		{
//		   if(scenario.isFailed())
//		   {
//			   scenario.log("scenario failed");
//		   }
//			scenario.log("closing the browser.");
//			ExtentCucumberAdapter.addTestStepLog("this is my log");
//
//		    base.getDriver().quit();
//		    scenario.log("Browser closed");
//		}
	 

}
