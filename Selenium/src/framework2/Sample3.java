package framework2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample3
{
	@Test
	public void A()
	{
		Reporter.log("register",true);
	}
	@Test
	public void B()
	{
		Reporter.log("login",true);

	}
	@Test()
	public void C()
	{
		Reporter.log("homepage",true);
}
}
