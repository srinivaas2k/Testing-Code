package com.stockaccountingTestNG_Lib;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class StckaccountingLibrary 
{ 	
	public static WebDriver d;
	public static String Eval, Aval;
	public static String url = "http://webapp.qedgetech.com";
	public static String uid = "admin";
	public static String pwd = "master";
	
	public void LaunchingApp(String url)

	
	
	{
		Eval="Login";
		d=new FirefoxDriver();
		d.get(url);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Aval=d.findElement(By.id("btnsubmit")).getText();
		Assert.assertEquals(Aval, Eval, "app cannot be launched");
			
	}
	public void AdminLogin(String uid, String pwd)
	
	
		{
			Eval = "Administrator";
			d.findElement(By.id("btnreset")).click();
			d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			d.findElement(By.id("username")).sendKeys(uid);
			d.findElement(By.id("password")).sendKeys(pwd);
			d.findElement(By.id("btnsubmit")).click();
			Aval = d.findElement(By.linkText("Administrator")).getText();
			Assert.assertEquals(Aval, Eval, "Login Failed");
			
		}
		
	public static String  Suppliers(String Sname,String Sadd,String Scity,String Scoun, String Scon, String Sph, String Semail, String Smbl, String Snotes)
    {
	
    	Eval="Add succeeded";
    	d.findElement(By.xpath(".//*[@id='mi_a_suppliers']/a")).click();
    	d.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
    	d.findElement(By.id("x_Supplier_Name")).sendKeys(Sname);
    	d.findElement(By.id("x_Address")).sendKeys(Sadd);
    	d.findElement(By.id("x_City")).sendKeys(Scity);
    	d.findElement(By.id("x_Country")).sendKeys(Scoun);
    	d.findElement(By.id("x_Contact_Person")).sendKeys(Scon);
    	d.findElement(By.id("x_Phone_Number")).sendKeys(Sph);
    	d.findElement(By.id("x__Email")).sendKeys(Semail);
    	d.findElement(By.id("x_Mobile_Number")).sendKeys(Smbl);
    	d.findElement(By.id("x_Notes")).sendKeys(Snotes);
    	d.findElement(By.id("btnAction")).click();
    	d.findElement(By.xpath("html/body/div[*]/div[2]/div/div[4]/div[2]/button[1]")).click();
    	Aval=d.findElement(By.xpath("html/body/div[*]/div[2]/div/div[3]/div/div")).getText();
    	d.findElement(By.xpath("html/body/div[*]/div[2]/div/div[4]/div[2]/button")).click();
		Assert.assertEquals(Eval, Aval, "add failed");
		
		if (Eval.equalsIgnoreCase(Aval))
		{
			return "pass";
			
		}
		else
		{
			
			return "fail";
		}
		}
    
	public void Logout()
		{
			Aval = "Login";
			d.findElement(By.linkText("Logout")).click();
			d.findElement(By.xpath("html/body/div[*]/div[2]/div/div[4]/div[2]/button[1]")).click();
			Eval = d.findElement(By.id("btnsubmit")).getText();
			Assert.assertEquals(Aval, Eval, "logout failed");
		
		}
		
	public void CloseApp()
		{
			d.quit();
		}
		
}
	
	
	
	
	

