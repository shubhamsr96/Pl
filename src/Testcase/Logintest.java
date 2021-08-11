package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Objectrepository.LoginPage;

public class Logintest {

	
	@Test
	public void loginpage() {
		System.setProperty("webdriver.chrome.driver", "E:\\udemy\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.reddit.com/login/");
		LoginPage lp=new LoginPage(driver);
		
		lp.Email().sendKeys("hello");
		lp.Pass().sendKeys("pass");
		lp.register().click();
		lp.regmail().sendKeys("email");
		lp.contireg().click();
		
	}
}
