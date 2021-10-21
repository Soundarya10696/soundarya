package Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {
    public static WebDriver driver;
    
    public static void browserLaunch(String browserName) {
	switch(browserName)	{
	
	case  "chrome" :
		WebDriverManager.chromedriver().setup();
		driver=new  ChromeDriver();
		break;
		
	case  "firefox" :
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		
		
	case   "edge"  :
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		 
		
		default:
			break;
	}	
			
    }
     
    //launch url
    public static void Launchurl(String url) {
	driver.get(url);
	}
    
     //geturl
    public static void geturl(String url) {
		driver.get(url);
		
	}
          //get current title
    
    public static String getcurrentTitle() {
    	
    	String text=driver.getTitle();
    	return text;
    	
    }
    
       //get current url
    public static String geturl() {
    	String url=driver.getCurrentUrl();
    	
    	return url;
    }
    
        //mouse click
    public static void clickbtn(WebElement  a) {
		a.click();
	}
		
    public static void sendvalues(WebElement  a,String value) {
		a.sendKeys(value);
	}
    
    public static void SelectByIndex(int index,WebElement a) {
	Select s=new Select(a);
	s.selectByIndex(index);

	}
    
    

	
}
    
 
    
	
	


	


