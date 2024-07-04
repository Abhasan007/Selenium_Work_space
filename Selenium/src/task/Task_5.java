package task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_5 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	driver.findElement(By.xpath("//a[@data-group='men']")).click();
	WebElement ele = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
	ele.sendKeys("hrx");
	Thread.sleep(2000);
	ele.sendKeys(Keys.ENTER);
	//driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
	//Thread.sleep(2000);
//driver.findElement(By.xpath("//img[@alt='HRX by Hrithik Roshan Men Brown Contrast Sole Lace Up Sneakers']")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("//p[.='7']")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//div[.='ADD TO BAG']")).click();
}
}
