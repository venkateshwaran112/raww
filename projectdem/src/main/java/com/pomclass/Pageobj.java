package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pageobj {
	public WebDriver driver;
	private POM1 wp1;
	private Accre wp2;
	
	
	public POM1 getWp1() {
		if(wp1==null) {
			wp1=new POM1(driver);
		}
		return wp1;
	}
	
	public Accre getwp2() {
		if(wp2==null) {
			wp2=new Accre(driver);
		}
		return wp2;
	}
	
	public Pageobj (WebDriver driver2) {
		this.driver = driver2;
//		PageFactory.initElements(driver, this);
	}


}
