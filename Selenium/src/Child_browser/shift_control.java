package Child_browser;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shift_control 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	driver.findElement(By.xpath("//div[.='Services']")).click();
	Set<String> al_wd = driver.getWindowHandles();
	ArrayList<String> l= new ArrayList<>(al_wd);
	String c_id=l.get(1);
	driver.switchTo().window(c_id);
	driver.findElement(By.xpath("//span[.='LOGIN']")).click();
}
}
