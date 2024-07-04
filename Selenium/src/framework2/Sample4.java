package framework2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample4 
{
	@Test
	public void A()
	{
		Reporter.log("status",true);
	}
	@Test
	public void B()
	{
		Reporter.log("call",true);

	}
	@Test()
	public void C()
	{
		Reporter.log("mute",true);
}
}
