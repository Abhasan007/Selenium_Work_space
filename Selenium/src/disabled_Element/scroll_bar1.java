package disabled_Element;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_bar1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	JavascriptExecutor j=(JavascriptExecutor)driver;
	Thread.sleep(2000);
	j.executeScript("window.scrollBy(0,500)");
	Thread.sleep(2000);
	j.executeScript("window.scrollBy(0,-500)");
	driver.quit();
}
}