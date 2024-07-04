package task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task_2 
{
public static void main(String[] args) throws InterruptedException, AWTException 
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login/");
	WebElement ele = driver.findElement(By.xpath("//a[.='हिन्दी']"));
	Actions act = new Actions(driver);
	Thread.sleep(2000);
	act.contextClick(ele).build().perform();
	Thread.sleep(2000);
	 Robot r= new Robot();
	 r.keyPress(KeyEvent.VK_T);
	 r.keyRelease(KeyEvent.VK_T);
	 Thread.sleep(200);
	 r.keyPress(KeyEvent.VK_ALT);
	 r.keyPress(KeyEvent.VK_F4);
	 r.keyRelease(KeyEvent.VK_ALT);
	 r.keyRelease(KeyEvent.VK_F4);
	 //driver.quit();
}
}
