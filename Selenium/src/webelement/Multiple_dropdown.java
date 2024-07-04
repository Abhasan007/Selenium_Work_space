package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_dropdown 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Dell/Desktop/raja/Single_dropdown.html");
	WebElement d = driver.findElement(By.xpath("//select[@id='gender']"));
	Select s=new Select(d);
	s.selectByIndex(0);
	Thread.sleep(200);
	s.selectByValue("3");
	Thread.sleep(200);
	s.selectByVisibleText("Ice-cream");
	Thread.sleep(200);
	s.deselectAll();
}
}
