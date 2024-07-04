package runner_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import framework.Baseclass_testng_task;
import generic.Screenshot_generic;

public class screenshot extends Baseclass_testng_task 
{
	@Test
	void test() 
	{
		driver.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]")).click();
		WebElement e = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input"));
		 e.click();
		
	}
}
