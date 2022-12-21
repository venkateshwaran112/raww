package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class POM1 {
	
	public WebDriver driver;


	public WebElement getFirstname() {
		return firstname;
	}


	public WebElement getAddress() {
		return address;
	}


	public WebElement getCountry() {
		return country;
	}


	public WebElement getCity() {
		return city;
	}


    public WebElement getState() {
		return state;
	}


	public WebElement getPostal() {
		return postal;
	}


	public WebElement getCell_number() {
		return cell_number;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getPhone() {
		return phone;
	}


	public WebElement getPgminterest() {
		return pgminterest;
	}


	public WebElement getReferral() {
		return referral;
	}


	public WebElement getRad() {
		return rad;
	}


	public WebElement getButton() {
		return button;
	}


	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name='address']")
	private WebElement address;
	
	@FindBy(xpath="//select[@id='country']")
	private WebElement country;
	
	@FindBy(xpath="//input[@id='city']")
	private WebElement city;
	
	@FindBy(xpath="//select[@id='state_territory_or_province_if_applicable']")
	private WebElement state;
	
	@FindBy(xpath="//select[@id='postal-code']")
	private WebElement postal;
	
	@FindBy(xpath="//select[@id='cell_number']")
	private WebElement cell_number;
	
	@FindBy(xpath="//select[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//select[@id='phone']")
	private WebElement phone;
	
	@FindBy(xpath="//select[@id='program_interest']")
	private WebElement pgminterest;
	
	@FindBy(xpath="//select[@id='referral']")
	private WebElement referral;
	
	@FindBy(xpath="//label[@for='radio-sms_permission-1-0']")
	private WebElement rad;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement button;
	

	public POM1(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}


	


	
	
}
