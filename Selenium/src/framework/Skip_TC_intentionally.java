package framework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Skip_TC_intentionally 
{
@Test(enabled = false)
public void A()
{
	Reporter.log("signup",true);
}
}
