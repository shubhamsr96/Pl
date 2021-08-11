package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/*
	 * By username= By.xpath("//input[@id='loginUsername']"); By password=
	 * By.xpath("//input[@id='loginPassword']"); By login=
	 * By.xpath("//button[contains(text(),'Log In')]");
	 */

	@FindBy(xpath = "//input[@id='loginUsername']")
	WebElement username;

	@FindBy(xpath = "//input[@id='loginPassword']")
	WebElement password;

	@FindBy(xpath = "//button[contains(text(),'Log In')]")
	WebElement login;

	@FindBy(xpath = "//a[contains(text(),'username')]")
	WebElement forgotusername;

	@FindBy(xpath = "//a[contains(text(),'password')]")
	WebElement forgotpassword;

	 
	@FindBy(xpath = "//a[contains(text(),'Sign up')]")
	WebElement signup;
	
	@FindBy(xpath = "//input[@id='regEmail']")
	WebElement regemail;
	
	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	WebElement contineu;
	
	
	public WebElement Email() {
		return username;
	}

	public WebElement Pass() {
		return password;
	}

	public WebElement submit() {
		return login;
	}

	public WebElement forgetuser() {
		return forgotusername;
	}

	public WebElement forgetpass() {
		return forgotpassword;
	}
	public WebElement register() {
		return signup;
	}
	
    public WebElement regmail() {
    	return regemail;
    }
    
    public WebElement contireg() {
    	return contineu;
    }
}
