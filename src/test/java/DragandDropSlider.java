import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragandDropSlider {

	WebDriver driver;
	
	void chromebrowser() throws InterruptedException
	{
		ChromeOptions ops = new ChromeOptions(); 
		ops.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Software\\Selenium\\chromedriver.exe");
	    driver= new ChromeDriver(ops);	
	    
	    driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
	    driver.manage().window().maximize();
	    
	    Thread.sleep(5000);
	    
        WebElement element = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));	  
        
        Actions act = new Actions(driver);
        act.dragAndDropBy(element, 300, 100).perform();
        
        driver.close();

	}
	
	public static void main(String[] args) throws InterruptedException {
	
		DragandDropSlider obj = new DragandDropSlider();
		obj.chromebrowser();
	}

}
