package runner_class;

import org.testng.annotations.Test;

import framework.Base_pom;
import framework.Orange_Pom;



public class Orange_hrm extends Base_pom
{
@Test
void test() throws InterruptedException
{
	Orange_Pom p=new Orange_Pom(driver);
	p.username().sendKeys("Admin");
	p.password().sendKeys("admin123");
	Thread.sleep(2000);
	p.login().click();
	p.pim().click();
	p.emp().click();
	p.fn().sendKeys("Selenium");
	Thread.sleep(2000);
	p.mn().sendKeys("Java");
	p.ln().sendKeys("Manual");
	Thread.sleep(2000);
	p.sv().click();
}
}
