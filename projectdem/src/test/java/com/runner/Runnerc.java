package com.runner;

import java.io.File;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Baseclass;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/runn", glue="runn", tags="@acc or @per",
monochrome=true,
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class Runnerc extends Baseclass {
	public static Properties prop;
	public static WebDriver driver;

//	@BeforeAll
//	public static void setru() {
//	
//	-Dlog4j2.configurationFile=file:/Surgeworkspace/projectdem/src/test/resource/log4j2.properties;
//	}
//	
	@BeforeClass
	public static void setUp() throws Throwable {
		prop=readPropertyFile();
		String browser = prop.getProperty("browser");
		driver = Baseclass.getBrowser(browser);
	}

	@AfterClass
	public static void report() {
//		extent.flush();
//		driver.quit();
	}

}
