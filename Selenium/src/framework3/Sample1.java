package framework3;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 
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

	}
	@Test()
	public void C()
	{
		Reporter.log("like page",true);
}
}
