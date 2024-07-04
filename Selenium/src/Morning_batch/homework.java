package Morning_batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Dell/Desktop/raja/webElements.html");
	WebElement ele = driver.findElement(By.id("a1"));
	Thread.sleep(2000);
	ele.sendKeys("Q_spiders");
	Thread.sleep(2000);
	driver.findElement(By.id("a2")).sendKeys("Raja");
	Thread.sleep(2000);
	driver.findElement(By.id("m")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("a4")).click(); 
	Thread.sleep(2000);
	driver.findElement(By.className("c3")).click();
	driver.close();
	
}
}
