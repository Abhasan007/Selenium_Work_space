package Morning_batch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSources 
{
		public static void main(String[] args) 
		{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Dell/Desktop/raja/webElements.html");
		String source = driver.getPageSource();
		System.out.println(source);
		driver.close();
		}
}
