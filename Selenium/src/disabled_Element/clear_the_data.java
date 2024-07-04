package disabled_Element;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear_the_data {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Dell/Desktop/raja/Disabled_element.html");
	JavascriptExecutor j=(JavascriptExecutor)driver;
	Thread.sleep(2000);
	j.executeScript("document.getElementById('a1').value=''");
	driver.quit();
	
}
}
