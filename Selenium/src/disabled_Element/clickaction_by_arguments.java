package disabled_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickaction_by_arguments {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	JavascriptExecutor j=(JavascriptExecutor)driver;
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.name("login"));
	Thread.sleep(2000);
	j.executeScript("arguments[0].click();",ele);
	driver.quit();
	
}
}
