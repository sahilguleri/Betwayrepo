package Packages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Base {
	
	@Test
	public WebDriver initializeddriver() throws IOException
	{
		WebDriver driver = null;
		String downloadPath=System.getProperty("user.dir");  //inorder to give the generalized location to the properties file. I am using base location of project 
		
		
		Properties prop= new Properties();       
		FileInputStream fis=new FileInputStream(downloadPath+"\\src\\main\\java\\Packages\\universaldata.properties");   
		prop.load(fis); 
		
		
		if (prop.getProperty("browser").contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    		driver=new ChromeDriver();

		}
		
		else if(prop.getProperty("browser").contains("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver= new FirefoxDriver();

		}
		
		
		
		else 
		{
			System.out.println("you have to choose from \"chrome\", \"firefox\" or \"headlessbrowser\"");

		}
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);   //All the waits are defined here
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		
		
		driver.get(prop.getProperty("url"));
		return driver;
	}

}
