package app;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multi_App_Call {
	public void call(String apptext) throws Exception {

	System.setProperty("webdriver.chrome.driver","E:\\test java\\TestScript\\ChromeDriver\\chromedriver.exe");
	WebDriver wd=new ChromeDriver();
	wd.manage().window().maximize();
	wd.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
	wd.get("https://staging-dashboard.plobuild.com/auth/login");
	
	//Login
	wd.findElement(By.xpath("//input[@id='input_0']")).sendKeys("sachin.plobal@gmail.com");
	wd.findElement(By.xpath("//input[@id='input_1']")).sendKeys("asdasd");
	wd.findElement(By.xpath("//button[@type='submit']")).click();
	System.out.println(wd.getCurrentUrl());
	
	//Appname
    WebElement AppName= wd.findElement(By.xpath("//div[@class='app-div']//div[@class='app-top-div']//h3[text()='"+apptext+"']"));
    System.out.println(AppName.getText());
    
    WebElement upgrade=wd.findElement(By.xpath("//div[@class='app-div']//div[@class='app-top-div']//h3[contains(text(),'"+apptext+"')]/..//a[@class='upgrage_button ng-binding']"));
    System.out.println(upgrade.getText());
    
    WebElement desc= wd.findElement(By.xpath("//div[@class='app-div']//div[@class='app-top-div']//h3[contains(text(),'"+apptext+"')]/../..//div[@class='app-bottom-div']//p[@class='sub-discription ng-binding']"));
    System.out.println(desc.getText());
    
    WebElement SelectButton = wd.findElement(By.xpath("//div[@class='app-div']//div[@class='app-top-div']//h3[text()='"+apptext+"']/../..//div[@class='app-bottom-div']//a[@class='md-raised pa-md-button md-button ng-scope md-ink-ripple']"));
    SelectButton.click();
    
    //Customize menu
	System.out.println(wd.getCurrentUrl());
	  
	wd.findElement(By.xpath("//i[@class='icon-edit-smartphone']")).click();
	  
	//drag and drop promo banner
	System.out.println(wd.getCurrentUrl());
	
	Thread.sleep(30000);
	  
	WebElement sourceLocator = wd.findElement(By.xpath("//img[@src='https://d3myyafggcycom.cloudfront.net/STAGING/assets/HL_colored_images/promo-banner.png']"));
	//WebElement targetLocator = wd.findElement(By.xpath("//div//div//div//ul[@class='emptyModule listB ng-pristine ng-untouched ng-valid ng-isolate-scope ui-sortable']"));
	WebElement targetLocator = wd.findElement(By.xpath("//div[contains(@class,'feature_label_div')]"));
	Actions action = new Actions(wd);
	action. dragAndDrop(sourceLocator, targetLocator). build(). perform();
	  
	//add promo
	Thread.sleep(5000);
	wd.findElement(By.xpath("//li[@class='parentList ng-scope lastListEl ui-sortable-handle']//a[@class='editButton'][contains(text(),'Add')]")).click();
	wd.findElement(By.xpath("//span[text()='+']")).click();
	  
	//add url
	wd.findElement(By.xpath("//span[text()='URL']")).click();
	  
	//open in app
	wd.findElement(By.xpath("//span[text()='Open in App']")).click();
	  
	wd.findElement(By.xpath("//input[@id='input_10']")).sendKeys("Plobal_App");
	wd.findElement(By.xpath("//input[@id='input_11']")).sendKeys("https://www.plobalapps.com/contact-us.php");
	wd.findElement(By.xpath("//*[@id=\"fileInput\"]")).sendKeys("E:\\test java\\Image.jpg");
	  
	Thread.sleep(20000);
	  
	wd.findElement(By.xpath("//button[@class='save-btn popupsave-btn addItemButton']")).click();
	  
	  
	//wd.findElement(By.xpath("//input[@id='editInputBan0']")).clear();
	//wd.findElement(By.xpath("//input[@id='editInputBan0']")).sendKeys("Plobal_App_Test");
	//wd.findElement(By.xpath("//div[contains(@class,'action-bottom')]//input[contains(@name,'fileInput')]")).sendKeys("C:\\Users\\admin\\Desktop\\Image\\2.jpg");
	  
	Thread.sleep(5000);
	wd.findElement(By.xpath("//button[@class='save-btn popupsave-btn']")).click();
	  
	
	wd.findElement(By.xpath("//button[@class='save-btn pa-flex']")).click();
	Thread.sleep(5000); 
	//Demo option
	wd.findElement(By.xpath("//div[contains(@class,'col-md-3 mobile-left-responsive')]//a[2]//md-list-item[1]")).click();		  
	System.out.println(wd.getCurrentUrl());
	
	
	  
	wd.findElement(By.xpath("//i[@class='icon-down-arrow']")).click();
	  
	wd.findElement(By.xpath("//span[text()='Logout']")).click();
	  
	wd.close();
    
}
}

