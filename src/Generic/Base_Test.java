package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Framework_constants
{public WebDriver driver;
@BeforeMethod
public void openAppl()
{
	System.setProperty(gecko_key,gecko_value);
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get(base_url);
	
}
@AfterMethod
public void closeAppln()
{
driver.quit();
}
}