package disabled_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class passdata_by_arguments {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Dell/Desktop/raja/Disabled_element.html");
	JavascriptExecutor j=(JavascriptExecutor)driver;
	WebElement ele = driver.findElement(By.xpath("//input[@id='a1']"));
	j.executeScript("arguments[0].value='abc';",ele);
	driver.quit();
}
}
