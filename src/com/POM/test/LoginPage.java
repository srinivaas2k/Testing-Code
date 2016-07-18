package com.POM.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
	@FindBy (id="btnreset")
	WebElement reset;
	@FindBy (id="username")
	WebElement UN;
	@FindBy (id="password")
	WebElement pwd;
	@FindBy (id="btnsubmit")
	WebElement Login;
	
	
	public void AdminLogin(String uname, String password)
	{
		reset.click();
		UN.sendKeys(uname);
		pwd.sendKeys(password);
		Login.click();
	}

}
