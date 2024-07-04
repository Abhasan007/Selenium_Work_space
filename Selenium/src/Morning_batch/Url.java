package Morning_batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.youtube.com");
driver.findElement(By.cssSelector("input[id='search']")).sendKeys("kgf trailer");
Thread.sleep(2000);
driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("div[id='channel-info']")).click();
Thread.sleep(2000);
driver.close();
}
}
