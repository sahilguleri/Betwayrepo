package Packages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Betway_catchdata extends Base{
	
	WebDriver driver;
	
	@Test
	public void sample() throws IOException
	{
		driver=initializeddriver();
		System.out.println(driver.getTitle());
		driver.close();
	}

}
