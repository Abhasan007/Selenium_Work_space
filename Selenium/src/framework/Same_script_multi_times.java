package framework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Same_script_multi_times 
{
@Test(invocationCount = 1)
public void A()
{
	Reporter.log("login",true);

}
@Test(invocationCount = 2)
public void B()
{
	Reporter.log("signup",true);
}
@Test(invocationCount = 3)
public void C()
{
	Reporter.log("like page",true);
}
}
