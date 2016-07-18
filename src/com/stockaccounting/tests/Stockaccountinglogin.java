package com.stockaccounting.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Stockaccountinglogin {

	public static void main(String[] args) 
	{
	   String expval, actval;
	   expval = "Login";
	   
	   WebDriver driver = new FirefoxDriver();
	   driver.get("http://webapp.qedgetech.com");
	   
	   actval = driver.findElement(By.id("btnsubmit")).getText();
	   
	   driver.findElement(By.id("btnreset")).click();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.findElement(By.id("username")).sendKeys("admin");
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
	   driver.findElement(By.id("password")).sendKeys("master");
	   driver.findElement(By.id("btnsubmit")).click();
	   if (expval.equalsIgnoreCase(actval)) 
	   {
		System.out.println("pass");
		   
	}
	   else 
	{
System.out.println("fail");
	}
	  
	   
	}

}
