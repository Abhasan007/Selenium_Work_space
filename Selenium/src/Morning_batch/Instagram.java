package Morning_batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@autocorrect='off']")).sendKeys("abulhasan7031@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("md1bulh1s1nr1j1");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Not now']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[contains(text(),'Not Now')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Search']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@autocapitalize='none']")).sendKeys("niranjan_ka_18");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@style='line-height: var(--base-line-clamp-line-height); --base-line-clamp-line-height: 18px;']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='button']")).click();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//div[@role='button']")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Close']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@role='button']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@aria-label='Message']")).sendKeys("good afternoon sir");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(text(),'Send')]")).click();
	Thread.sleep(2000);
    driver.quit();
	}
	
}
