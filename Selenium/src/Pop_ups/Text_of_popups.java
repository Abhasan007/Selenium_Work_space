package Pop_ups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_of_popups 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/delete_customer.php");	
	Thread.sleep(2000);
	driver.findElement(By.name("cusid")).sendKeys("srk");
	Thread.sleep(2000);
	driver.findElement(By.name("submit")).click();
	Alert al = driver.switchTo().alert();
	String text = al.getText();
	System.out.println(text);
	
}
}
