package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_4 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Rajesh");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Khanna");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("rajeshkhanna@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[.='Male']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("7031252556");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='29']")).click();
	Thread.sleep(2000);
	 //driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("E");
	driver.findElement(By.xpath("//label[.='Sports']")).click();
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//*[@focusable='svg']"));
	
}
}
