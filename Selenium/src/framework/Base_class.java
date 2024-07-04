package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import generic.Screenshot_generic;

public class Base_class implements Base_Constants
{
public WebDriver driver;
@BeforeMethod
public void open_app()
{
	System.setProperty(Chrome_key,Chrome_value);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
}
@AfterMethod
public void close_app()
{
	if (!driver.getTitle().equals("facebook"));
	{
		Screenshot_generic.sc(driver);
		
	}
	driver.quit();
}
}
