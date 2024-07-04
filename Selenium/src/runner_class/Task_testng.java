package runner_class;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import framework.Baseclass_testng_task;

public class Task_testng extends Baseclass_testng_task
{
	@Test
	public void A()
	{
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("Gender")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Md Abul");
		driver.findElement(By.name("LastName")).sendKeys("Hasan");
		driver.findElement(By.name("Email")).sendKeys("abulhasan7031@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("r1j1@007");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("r1j1@007");
		driver.findElement(By.name("register-button")).click();	
	}
	@Test(dependsOnMethods = "A")
	public void B() 
	{
		driver.findElement(By.xpath("//a[.='Log in']")).click();
		driver.findElement(By.name("Email")).sendKeys("abulhasan7031@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("r1j1@007");
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		
	}
	@Test(dependsOnMethods = "B") 
	public void C()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]")).click();
	}
}
