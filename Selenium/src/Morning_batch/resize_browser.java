package Morning_batch;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class resize_browser 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	Dimension d = new Dimension(400, 300);
	Thread.sleep(2000);
	driver.manage().window().setSize(d);
	driver.quit();
	
	
}
}
