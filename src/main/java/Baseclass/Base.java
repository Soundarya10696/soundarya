package Baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Base extends demo {
	public static void main(String[] args) {
		browserLaunch("chrome");
		Launchurl("https://www.facebook.com/");
		
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("soundarya");
		
		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys("2345667");
		
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
		
		
	}

	
		
	

}
