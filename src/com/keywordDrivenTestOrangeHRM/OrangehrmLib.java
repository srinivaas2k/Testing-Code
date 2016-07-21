package com.keywordDrivenTestOrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class OrangehrmLib 
{
	public static WebDriver d;
	public static String url = "http://192.168.1.100:8080/orangehrm";
	public static String uid = "Admin";
	public static String pwd = "admin";
	public static String Eval, Aval;
	public static String fn, ln;
	
	public void Launchapp(String url)
	{	
		Eval="LOGIN";
		d=new FirefoxDriver();
		d.get(url);
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.manage().window().maximize();
		Aval = d.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(Eval, Aval, "App cannot be launched");
		
	}
	
	public void AdmLogin(String uid, String pwd)
	{
		Eval="Welcome Admin";
		d.findElement(By.id("txtUsername")).sendKeys(uid);
		d.findElement(By.id("txtPassword")).sendKeys(pwd);
		d.findElement(By.id("btnLogin")).click();
		Aval = d.findElement(By.linkText("Welcome Admin")).getText();
		Assert.assertEquals(Eval, Aval, "login failed");
		
	}
	
	public void AdminLogout()
	{
		Eval = "LOGIN";
		d.findElement(By.partialLinkText("Welcome")).click();
		d.findElement(By.linkText("Logout")).click();
		Aval = d.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(Aval, Eval, "logout failed");
		
	}
	
	public void CloseApp()
	{
		d.quit();
	}
	
	public void Empreg(String fn, String ln)
	{	
		Eval = fn+" "+ln;
		d.findElement(By.linkText("PIM")).click();
		d.findElement(By.linkText("Add Employee")).click();
		d.findElement(By.id("firstName")).sendKeys(fn);
		d.findElement(By.id("firstName")).sendKeys(ln);
		d.findElement(By.id("btnSave")).click();
		Aval = d.findElement(By.xpath(".//*[@id='profile-pic']/h1")).getText();
		Assert.assertEquals(Aval, Eval, "Reg failed");
	}
	
}
