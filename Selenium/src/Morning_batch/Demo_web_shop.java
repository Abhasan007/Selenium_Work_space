package Morning_batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_web_shop 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demowebshop.tricentis.com/");
Thread.sleep(2000);
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("abulhasan7031@gmail.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("r1j1@007");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@value='Log in']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='add-to-cart-button-5']")).click();
Thread.sleep(2000);				
driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
Thread.sleep(2000);
driver.quit();


}
}
