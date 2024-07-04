package Morning_batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/Dell/Desktop/raja/sel_classwork.html");
WebElement ele=driver.findElement(By.name("n3"));
Thread.sleep(2000);
ele.sendKeys("Q_spiders");
driver.close();

}
}
