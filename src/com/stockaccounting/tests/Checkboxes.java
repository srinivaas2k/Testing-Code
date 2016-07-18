package com.stockaccounting.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkboxes 
{

	public static void main(String[] args)
	{
	WebDriver d = new FirefoxDriver();
	d.get("http://google.com");
	d.manage().window().maximize();
	d.findElement(By.linkText("Gmail")).click();
	d.findElement(By.id("Email")).sendKeys("srinivas.koose");
	d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	d.findElement(By.id("next")).click();
	d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	d.findElement(By.id("PersistentCookie")).click();
	
	}

}
