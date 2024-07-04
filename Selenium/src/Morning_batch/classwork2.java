package Morning_batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classwork2 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chat.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abulhasan7031@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Md1bulh1s1n@");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("M1");
		Thread.sleep(2000);
		driver.get("https://chat.qspiders.com/student-dashboard/QKO-JSAJVD-M1");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Niranjan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_chat_listUser__7px9Q']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='message']")).sendKeys("hello sir i am from selenium morning batch");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='chatSubmitButton']")).click();
		driver.quit();
	}
}
