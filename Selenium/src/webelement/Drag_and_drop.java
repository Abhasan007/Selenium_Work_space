package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	WebElement source = driver.findElement(By.xpath("(//a[.=' 5000 ']"));
	Thread.sleep(2000);
	WebElement terget = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	Actions act = new Actions(driver);
	Thread.sleep(2000);
	act.dragAndDrop(source, terget).build().perform();
	Thread.sleep(200);
	driver.quit();	
}
}
