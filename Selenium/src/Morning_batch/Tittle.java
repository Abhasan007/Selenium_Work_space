package Morning_batch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tittle 
{
public static void main(String[] args) 
{
System.setProperty("webDriver.gecko.driver","./softwares/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.Amazon.in");
String title=driver.getTitle();
System.out.println(title);
driver.close();
}
}
