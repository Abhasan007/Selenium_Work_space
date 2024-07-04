package Child_browser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_pcBrowser 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	String p_id = driver.getWindowHandle();
	driver.findElement(By.xpath("//div[.='Services']")).click();
	Set<String> al_id = driver.getWindowHandles();
	for (String w : al_id)
	{
	Thread.sleep(2000);
	driver.switchTo().window(w);
	if (p_id.equals(w)) 
	{
	driver.close();	
	}
	}	
}
}
