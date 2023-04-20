import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RobotClass {

	WebDriver driver;

	void chromebrowser() throws InterruptedException, AWTException
	{
	ChromeOptions ops = new ChromeOptions(); 
	ops.addArguments("--remote-allow-origins=*");
	Robot robot = new Robot();	
    System.setProperty("webdriver.chrome.driver", "C:\\Software\\Selenium\\chromedriver.exe");
	driver= new ChromeDriver(ops);
	driver.get("https://smallpdf.com/word-to-pdf");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[1]/label[1]/div[1]/div[2]/form[1]/label[1]/div[1]/div[2]/button[1]")).click();
	
	robot.setAutoDelay(3000);
	
	StringSelection stringselection = new StringSelection("C:\\Users\\Gaurav\\Pictures\\Automation Testing\\Resume");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);

	robot.setAutoDelay(3000);
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	
	robot.setAutoDelay(3000);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	driver.quit();
	}
	

	
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		RobotClass obj = new RobotClass();
		obj.chromebrowser();
	}

}
