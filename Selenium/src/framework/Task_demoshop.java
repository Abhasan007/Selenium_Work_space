package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Task_demoshop 
{
	 public WebDriver driver;
	@Test
	public void A()
	{
		String key="webdriver.chrome.driver";
		String value ="./softwares/chromedriver.exe";
				System.setProperty(key, value);
				driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
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
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("abulhasan7031@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("r1j1@007");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[.='Log in']")).click();	
	}
	@Test(dependsOnMethods = "B")
	public void c()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]")).click();
		
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-5']")).click();
				
		driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
		
		driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
		
	}
	
}
