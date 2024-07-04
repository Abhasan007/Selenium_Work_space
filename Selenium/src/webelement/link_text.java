package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class link_text 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	List<WebElement> all_link = driver.findElements(By.xpath("//a"));
	int count = all_link.size();
	System.out.println(count);
	for(int i=0; i<=count-1; i++)
	{
		WebElement link = all_link.get(i);
		String text = link.getText();
		System.out.println(text);
	}
}
}