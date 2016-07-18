package com.stockaccounting.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGtest 
{
	@BeforeSuite
	public void initialisation()
	{
		System.out.println("initialisation");
	}
	
	@AfterSuite
	public void driverkill()
	{
		System.out.println("driver killed");
		
	}
	@BeforeTest
	public void deletecookies()
	{
		System.out.println("cookies deleted");
	}
	@AfterTest
	public void closeallbrowsers()
	{
		System.out.println("all browsers closed");
	}
	@BeforeClass
	public void openapp()
	{
		System.out.println("app opened");
	}
	@AfterClass
	public void closeapp()
	{
		System.out.println("app closed");
	}
	@BeforeMethod
	public void login()
	{
		System.out.println("login ok");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("logout ok");
	}
	
	@Test
	public void sendmail()
	{
		System.out.println("send mail ok");
	}
	@Test
	public void recievemail()
	{
		System.out.println("recieve mail ok");
	}
		
}

