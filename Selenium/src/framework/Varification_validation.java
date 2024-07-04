package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Varification_validation 
{
@Test
void Test()
{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	String title = driver.getTitle();
	Assert.assertEquals(title, "Facebook – log in or sign up", "title is not matching");
	Assert.assertEquals(true, driver.findElement(By.name("login")).isDisplayed(),"checking login button is present");
	System.out.println("done");
}
}
