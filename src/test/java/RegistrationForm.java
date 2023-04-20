import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RegistrationForm {

	WebDriver driver;
	
	void chrome() throws InterruptedException
	{
		ChromeOptions ops = new ChromeOptions(); 
		ops.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver(ops);
		driver.get("https://accounts.google.com/SignUp");
		Thread.sleep(2000);
		
		WebElement firstname = driver.findElement(By.name("firstName"));
		firstname.sendKeys("P");
		Thread.sleep(2000);
		
		WebElement lastname = driver.findElement(By.name("lastName"));
		lastname.sendKeys("Gaurav");
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.name("Username"));
		username.sendKeys("gp5013465@gmail.com");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.name("Passwd"));
		password.sendKeys("GauravPathange");
		Thread.sleep(2000);
		
		WebElement confirmpassword = driver.findElement(By.name("ConfirmPasswd"));
		confirmpassword.sendKeys("GauravPathange");
		Thread.sleep(2000);
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/span"));
		button.click();
		Thread.sleep(2000);
		
		driver.close();
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
	RegistrationForm obj = new RegistrationForm();
	obj.chrome();

	}

}
