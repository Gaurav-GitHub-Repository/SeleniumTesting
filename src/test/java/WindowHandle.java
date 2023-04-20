import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandle {

    WebDriver driver;
	
	void chromelaunch() throws InterruptedException
	{
		ChromeOptions ops = new ChromeOptions(); 
		ops.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver(ops);
		
		//TC2
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		//TC3
		driver.manage().window().maximize();   
		
		//TC4
		String title = driver.getTitle();
        System.out.println(title);
        
        //TC5
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='login_page']")));
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[contains(text(),'Know')])[2]")).click();
        
		//TC6
        ArrayList<String> windowids = new ArrayList<String>(driver.getWindowHandles()); 
	    System.out.println(windowids);
	    driver.switchTo().window(windowids.get(1));
	    Thread.sleep(5000); 
	    
	    //TC7
	    String title1 = driver.getTitle();
	    System.out.println(title1);
	    
	    //TC8
        driver.switchTo().window(windowids.get(0));
		Thread.sleep(5000);
		
		//TC9
		String title2 = driver.getTitle();
	    System.out.println(title2);
	    
	  //TC10
	    driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
	
	WindowHandle obj = new WindowHandle();
	obj.chromelaunch();
	}

}
