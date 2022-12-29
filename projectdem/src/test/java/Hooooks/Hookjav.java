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
		 String Nmae = s.getName();
		 System.out.println("Scenario Name :"+ Nmae);
	}
	
	 @After
	 public void afterHooks(Scenario s) {
		 Status statusOfScenario = s.getStatus();
		 System.out.println("statusOfScenario :"+ statusOfScenario);
		 
//		 if (s.isFailed()) {
//			 screenShot("F:\\musheik2\\Sneha Projects\\Maven\\Adcitin_And_Cucumber\\Screenshots\\failed.png");
			
		}
	 @AfterStep
	 public void attachscreenshot(Scenario sce) {
		 if(sce.isFailed()) {
		final byte[] scre = ((TakesScreenshot)Runnerc.driver).getScreenshotAs(OutputType.BYTES);
		 sce.attach(scre, "image/png", "errorscreen");
		 
		 }
	 }

}
