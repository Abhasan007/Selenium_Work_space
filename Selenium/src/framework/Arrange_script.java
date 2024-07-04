package framework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Arrange_script
{
	@Test(priority = 2)
	public void A()
	{
		Reporter.log("login",true);
	}
	@Test(priority = 1)
	public void B()
	{
		Reporter.log("signup",true);
	}
	@Test(priority = 3)
	public void C()
	{
		Reporter.log("like page",true);
	}

}

