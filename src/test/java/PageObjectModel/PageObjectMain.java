package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

//import Module8.Mod8Assignment4;

public class PageObjectMain {

	
	@Test
	public void verifyreg() throws InterruptedException
	{
		ChromeOptions ops = new ChromeOptions(); 
		ops.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\Software\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(ops);
		
		driver.manage().window().maximize();
		
		IdentificationElement obj = new IdentificationElement(driver);
		
		//driver.manage().timeouts().implicitlyWait(10, Timeunits);
		Thread.sleep(5000);
		
		driver.get("https://www.saucedemo.com/");
		obj.username("standard_user");
		obj.password("secret_sauce");
	    obj.button();	
	
	    
	}	
}
