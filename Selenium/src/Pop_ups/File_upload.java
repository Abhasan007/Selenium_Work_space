package Pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Dell/Desktop/raja/File-upload.html");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Dell\\Downloads\\image001.png");
}
}
