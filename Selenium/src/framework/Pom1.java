package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 
{
@FindBy(name="login")
private WebElement login;
public Pom1(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void login()
{
	login.click();
}
}
