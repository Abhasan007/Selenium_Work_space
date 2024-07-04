package Pop_ups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Passthedata_alertconfirmation 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[.='Prompt Alert Box']")).click();
	Thread.sleep(2000);
	Alert al = driver.switchTo().alert();
	al.sendKeys("yes");
	al.accept();	
}
}
