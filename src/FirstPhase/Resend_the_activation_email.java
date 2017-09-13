package FirstPhase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Resend_the_activation_email 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","E:\\Rama\\2\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
    	driver.get("http://test.devanagri.co.in/login");
    	System.out.println("Application title is ============="+driver.getTitle());
    	System.out.println("Welcome to login screen");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    	}

}
