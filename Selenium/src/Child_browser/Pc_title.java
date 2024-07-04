package Child_browser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pc_title 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	driver.findElement(By.xpath("//div[.='Services']")).click();
	Thread.sleep(2000);
	Set<String> al_id = driver.getWindowHandles();
	for (String w : al_id)
	{
	Thread.sleep(2000);
	driver.switchTo().window(w);
	String title = driver.getTitle();
	System.out.println(title);	
	}	
}
}
