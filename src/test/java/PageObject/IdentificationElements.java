package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IdentificationElements {

	
	WebDriver driver;

	By username = By.name("email");
	
	By password = By.name("pass");
	
	By button = By.name("login");

	
	IdentificationElements( WebDriver d)
	{
		driver = d;
	}

	public void username(String un)
	{
		driver.findElement(username).sendKeys(un);
	}
	
	public void password(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}

	public void button()
	{
		driver.findElement(button).click();
	}
	
}
