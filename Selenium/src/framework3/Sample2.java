package framework3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample2 
{
	@Test
	public void A()
	{
		Reporter.log("comment",true);
	}
	@Test
	public void B()
	{
		Reporter.log("share",true);

	}
	@Test()
	public void C()
	{
		Reporter.log("message",true);
}
}
