package Morning_batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classwork_3 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
WebElement login=driver.findElement(By.xpath("//a[.='Forgotten password?']"));
String text =login.getText();
System.out.println(text);
driver.quit();
}
}
