package framework;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import generic.Screenshot_generic;

public class Baseclass_testng_task 
{
	@BeforeSuite
	public void a_suite()
	{
		System.out.println("before suite is executed");
	}
	@BeforeTest
	public void b_test()
	{
		System.out.println("before test executed");
	}
	@BeforeClass
	public void b_class()
	{
	System.out.println("before class printed");	
	}

	public WebDriver driver;
	@BeforeMethod
	public void open_app()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void close_app()
	{
		boolean n=driver.findElement(By.xpath("//div[@id='bar-notification']")).isDisplayed();
		if(n==false)
		{
			Screenshot_generic.sc(driver);
			driver.quit();
		}	
	}
	@AfterClass
	public void a_class()
	{
	System.out.println("after class executed");
	}
	@AfterTest
	public void a_test()
	{
		System.out.println("after class printed");
	}
	@AfterSuite (alwaysRun= true)
	public void a_sutie()
	{
		System.out.println("after suite printed");
	}
}
