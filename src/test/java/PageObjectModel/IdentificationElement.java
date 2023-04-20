package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IdentificationElement {

	WebDriver driver;

	By username = By.name("user-name");
	
	By password = By.name("password");
	
	By button = By.name("login-button");
	
	
	IdentificationElement(WebDriver d)
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
