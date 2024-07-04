package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orange_Pom
{
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement login;
	@FindBy(xpath = "//span[.='PIM']")
	private WebElement pim;
	@FindBy(xpath = "//a[.='Add Employee']")
	private WebElement emp;
	@FindBy(name = "firstName")
	private WebElement fn;
	@FindBy(xpath = "//input[@name='middleName']")
	private WebElement mn;
	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement ln;
	@FindBy(xpath = " //button[.=' Save ']")
	private WebElement sv;
	public Orange_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement username()
	{
		return username;
		
	}
	public  WebElement password()
	{
		return password;
	}
	public WebElement login()
	{
		return login;
	}
	public WebElement pim()
	{
		return pim;
	}
	public WebElement emp()
	{
		return emp;
	}
	public WebElement fn()
	{
		return fn;
	}
	public WebElement mn()
	{
		return mn;
	}
	public WebElement ln()
	{
		return ln;
	}
	public WebElement sv()
	{
		return sv;
	}
}
