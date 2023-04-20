import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertClass {

WebDriver driver;
	
    void firefox() throws InterruptedException
    {
    	
    	System.setProperty("webdriver.gecko.driver", "C:\\Software\\Selenium\\geckodriver.exe");
    	driver=new FirefoxDriver();
    	driver.manage().window().maximize();
    	
    	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
    	WebElement frame = driver.findElement(By.name("iframeResult")); 
    	driver.switchTo().frame(frame);
    	driver.findElement(By.xpath("//button[text()='Try it']")).click();
    	Alert alert = driver.switchTo().alert();
    	alert.sendKeys("Gaurav");
    	Thread.sleep(5000);
    	alert.accept();
    	String message=driver.findElement(By.cssSelector("p")).getText();
    	System.out.println(message);
    	
    	driver.navigate().refresh();
    	
    	WebElement iframe = driver.findElement(By.name("iframeResult")); 
    	driver.switchTo().frame(iframe);
    	driver.findElement(By.xpath("//button[text()='Try it']")).click();
    	Alert simplealert = driver.switchTo().alert();
    	simplealert.sendKeys("Gaurav");
    	Thread.sleep(5000);
    	simplealert.dismiss();
    	String text =driver.findElement(By.cssSelector("p")).getText();
    	System.out.println(text);
    	
    	driver.close();
    }

	
	
	public static void main(String[] args) throws InterruptedException {
	
    AlertClass obj = new AlertClass();		
    obj.firefox();
	}

}
