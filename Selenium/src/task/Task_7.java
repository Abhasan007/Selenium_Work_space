package task;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Task_7 
{
public static void main(String[] args) throws InterruptedException, IOException
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	 driver.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]")).click();
	WebElement e = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input"));
	 e.click();
	Thread.sleep(2000);
	boolean n=driver.findElement(By.xpath("//div[@id='bar-notification']")).isDisplayed();
	if(n==false)
	{
	TakesScreenshot t=(TakesScreenshot)driver;
	File tc = t.getScreenshotAs(OutputType.FILE);
	File f = new File("C:\\Users\\Dell\\Desktop\\Screenshot\\Defect.jpeg");
	FileHandler.copy(tc, f);
	}
	else
	{
		System.out.println("no defect");
	}
	driver.quit();
}
}
