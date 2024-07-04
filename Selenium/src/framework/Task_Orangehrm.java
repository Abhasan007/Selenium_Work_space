package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task_Orangehrm extends Base_pom
{
	public WebDriver driver;
@Test
public void org()
{
//	String key="webdriver.chrome.driver";
//	String value ="./softwares/chromedriver.exe";
//			System.setProperty(key, value);
			driver=new ChromeDriver();
	//driver.manage().window().maximize();
	//driver.get("url");
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	//Assert.assertEquals(true, driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']")).isDisplayed(),"checking login button is present");
	//System.out.println("done");
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	driver.findElement(By.xpath(" //button[@type='submit']")).click();
}
@Test(dependsOnMethods = "org")
public void org1()
{
	Assert.assertEquals(true, driver.findElement(By.xpath(" //img[@alt='client brand banner']")).isDisplayed(),"image is present");
	System.out.println("done");
	WebElement dp = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
	dp.click();
	//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	//driver.findElement(By.xpath("//a[.='Logout']")).click();
	
}
}

