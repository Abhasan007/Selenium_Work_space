package Pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_division 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/automation-practice-form");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='29']")).click();

}
}
