package runner_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import framework.Orange_Pom;

public class pom1 
{
	@Test
	void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.facebook.com");
		 Orange_Pom p=new Orange_Pom(driver);
		 p.login().click();
		 Thread.sleep(2000);
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 p.login().click();
		 
	}
}
