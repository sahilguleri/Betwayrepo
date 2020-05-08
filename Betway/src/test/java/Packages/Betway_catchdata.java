package Packages;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Betway_catchdata extends Base{
	
	private static Logger log=LogManager.getLogger(Betway_catchdata.class.getName());
	// this is for logging the log comments in ".log" files in "log" folder
	
	WebDriver driver;
	
	@Test
	public void sample() throws IOException
	{
		driver=initializeddriver();
		log.debug("check if the page Title is correct "+driver.getTitle());
		driver.close();
		log.info("tear down");
	}

}
