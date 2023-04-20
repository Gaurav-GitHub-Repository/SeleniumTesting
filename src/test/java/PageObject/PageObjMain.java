package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;



public class PageObjMain {

	
	@Test
	public void verifyreg() throws InterruptedException
	{
		ChromeOptions ops = new ChromeOptions(); 
		ops.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\Software\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(ops);
		
		driver.manage().window().maximize();
		
		IdentificationElements obj = new IdentificationElements(driver);
		
		//driver.manage().timeouts().implicitlyWait(10, Timeunits);
		Thread.sleep(5000);
		
		driver.get("https://www.facebook.com/");
		obj.username("gaurav@gmail.com");
		obj.password("abc");
	    obj.button();	
	
	}	
}
