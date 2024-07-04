package Morning_batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demowebshop 
{
	public static void main(String[] args)

{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.name("Gender")).click();
	driver.findElement(By.name("FirstName")).sendKeys("Md Abul");
	driver.findElement(By.name("LastName")).sendKeys("Hasan");
	driver.findElement(By.name("Email")).sendKeys("abulhasan7031@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("r1j1@007");
	driver.findElement(By.name("ConfirmPassword")).sendKeys("r1j1@007");
	driver.findElement(By.name("register-button")).click();
	driver.findElement(By.linkText("login")).click();
	driver.quit();
	
}
}