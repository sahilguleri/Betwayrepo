package Packages;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Betway_catchdata extends Base{
	
	private static Logger log=LogManager.getLogger(Betway_catchdata.class.getName());
	// this is for logging the log comments in ".log" files in "log" folder
	
	WebDriver driver;
	
	
	@Test
	public void sample() throws IOException
	{

		try {
			
		
		driver=initializeddriver();
		log.debug("Assert if the page Title is correct!!!!!:- "+driver.getTitle());
		Assert.assertTrue(false);
		
		
		
		
		
		} 
		catch (AssertionError ae) {
			log.fatal("==========" +ae.getMessage()+"==========");
			System.out.println("==============Assertion error======================");
			ae.printStackTrace();
			driver.quit();
		}
		
		catch (Exception e) {
			log.fatal("==========" +e.getMessage()+"==========");
			System.out.println("==============Exception======================");
			e.printStackTrace();
			driver.quit();

		}
	}
	
	
	
	
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
		log.info("tear down");
	}

}
