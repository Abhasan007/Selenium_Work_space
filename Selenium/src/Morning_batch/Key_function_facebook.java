package Morning_batch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Key_function_facebook 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement login = driver.findElement(By.name("email"));
	Thread.sleep(2000);
	login.sendKeys("Api", Keys.TAB + "Selenium", Keys.ENTER );
	//login.sendKeys(Keys.ENTER);
}
}
