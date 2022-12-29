package com.pomclass;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Accre {
    
	public WebDriver driver;
	
	@FindBy(partialLinkText = "Create an Account")
	private WebElement cre;
	
	public WebDriver getDriver() {
		return driver;
	}



	public WebElement getFirstname() {
		return firstname;
	}



	public WebElement getLastname() {
		return lastname;
	}



	public WebElement getEmail() {
		return email;
	}



	public WebElement getPass() {
		return pass;
	}



	public WebElement getErrpass() {
		return errpass;
	}



	public WebElement getButton() {
		return button;
	}

	public WebElement getCre() {
		return cre;
	}

	@FindBy(xpath="//input[@id='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@id='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@id='email_address']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement pass;
	
	public WebElement getCnfpass() {
		return cnfpass;
	}

	@FindBy(xpath="//input[@id='password-confirmation']")
	private WebElement cnfpass;
	
	@FindBy(xpath="//div[@id='password-error']")
	private WebElement errpass;
	
	@FindBy(xpath="//button[@title='Create an Account']")
    private WebElement button;
	
	@FindBy(xpath="(//button[@tabindex='-1'])[1]")
	private WebElement logbuton;
	
//	@FindBy(xpath="(//div[@class='customer-menu']//li[@class='authorization-link'])[1]")
//	private WebElement signout; 
	
	@FindBy(xpath="(//div[@class='customer-menu']//li//a)[3]")
	private WebElement sigout;

	public WebElement getSigout() {
		return sigout;
	}



	public WebElement getLogbuton() {
		return logbuton;
	}



//	public WebElement getSignout() {
//		return signout;
//	}



	public WebElement getlogButon() {
		return logbuton;
	}


	public Accre(WebDriver driver3) {
	this.driver = driver3;
	PageFactory.initElements(driver, this);
	}
	}

	
	

















