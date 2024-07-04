package disabled_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_bar {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	JavascriptExecutor j=(JavascriptExecutor)driver;
	Thread.sleep(2000);
	for(int i=0;i<9.2;i++)
	j.executeScript("window.scrollBy(0,500)");
	Thread.sleep(2000);
	//j.executeScript("window.scrollBy(0,-500)");
	WebElement ele = driver.findElement(By.xpath("//a[.='About Us']"));
	j.executeScript("arguments[0].click();",ele);
	//ele.click();
	
}
}
