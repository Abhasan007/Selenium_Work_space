package framework;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class create_dependancy 
{
	@Test
	public void A()
	{
		Reporter.log("signup",true);
	}
	@Test
	public void B()
	{
		Reporter.log("login",true);
		Assert.fail();
	}
	@Test(dependsOnMethods = "B")
	public void C()
	{
		Reporter.log("like page",true);
}
}