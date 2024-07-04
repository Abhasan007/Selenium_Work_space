package Morning_batch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Current_url 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.Amazon.in");
String url= driver.getCurrentUrl();
System.out.println(url);
driver.close();
}
}
