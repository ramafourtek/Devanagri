package FirstPhase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login 
{
	 public static void main(String[] args) throws InterruptedException
	    {
	    	System.setProperty("webdriver.gecko.driver","E:\\Rama\\2\\geckodriver.exe");
	    	 // if above property is not working or not opening the application in browser then try below property

	    	             //System.setProperty("webdriver.firefox.marionette","G:\\Selenium\\Firefox driver\\geckodriver.exe");

	    	 WebDriver driver = new FirefoxDriver();
	    	driver.get("http://test.devanagri.co.in/login");
	    	//System.out.println("Application title is ============="+driver.getTitle());
	    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    }
}
