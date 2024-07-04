package runner_class;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import framework.Base_class;

public class Testng extends Base_class
{
@Test
void test() 
{
	driver.findElement(By.name("email")).sendKeys("selenium");
	driver.findElement(By.name("pass")).sendKeys("1234");
	driver.findElement(By.name("login")).click();
	String t = driver.getTitle();
//	String title = driver.getTitle();
	Assert.assertEquals(t, "log in to Facebook");
}

}
