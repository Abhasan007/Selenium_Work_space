package Morning_batch;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swap 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/Dell/Desktop/raja/task.html");
	driver.manage().window().maximize();
	WebElement ele = driver.findElement(By.name("n1"));
	Thread.sleep(2000);
	ele.sendKeys(Keys.CONTROL + "a" + Keys.CONTROL + "Api");
	Thread.sleep(2000);
	WebElement ele3 = driver.findElement(By.name("n3"));
	ele3.sendKeys(Keys.CONTROL + "v", "selenium");
	//Thread.sleep(2000);
	//WebElement ele2 = driver.findElement(By.name("n2"));
	//Thread.sleep(2000);
	//ele2.sendKeys(Keys.CONTROL + "x" + Keys.DELETE+ "v");
	//Thread.sleep(2000);
	
	//Thread.sleep(2000);
	//Thread.sleep(2000);
	//ele.sendKeys("Api");
	//Thread.sleep(2000);
	//ele3.sendKeys(Keys.CONTROL + "x" + Keys.DELETE+ "v");
	//Thread.sleep(2000);
	//ele2.sendKeys("selenium");
	//Thread.sleep(2000);
	//ele3.sendKeys("Api");
	//Thread.sleep(2000);
	//ele3.sendKeys(Keys.CONTROL + "x" + Keys.DELETE+ "v");
	//Thread.sleep(2000);
	//driver.quit();
	
	
}
}
