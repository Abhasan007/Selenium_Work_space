package Morning_batch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.instagram.com");
String source = driver.getPageSource();
System.out.println(source);
driver.close();
}
}
