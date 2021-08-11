package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	By username= By.xpath("//input[@id='loginUsername']");
	By password= By.xpath("//input[@id='loginPassword']");
	By login= By.xpath("//button[contains(text(),'Log In')]");
	
	
}
