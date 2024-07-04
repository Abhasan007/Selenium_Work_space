package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_assert 
{
@Test()
public void test()
{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	String title = driver.getTitle();
	SoftAssert s=new SoftAssert();
	s.assertEquals(title, "facebook");
	System.out.println("done");
	s.assertEquals(title, "google");
	System.out.println("done1");
	s.assertAll();
}
}
