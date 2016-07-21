package com.POM.test;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class SAccountingTest 
{
	@Test
	public void excecution() throws InterruptedException
	{	
		java.util.List<WebElement> list = null;
		String lst;int i;
		WebDriver d = new FirefoxDriver();
		d.get("http://webapp.qedgetech.com");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		LoginPage lp = PageFactory.initElements(d, LoginPage.class);
		lp.AdminLogin("admin", "master");
		
		Shomepage hp= PageFactory.initElements(d, Shomepage.class);
		
		/*list=d.findElements(By.tagName("a"));
		for ( i = 0; i < list.size(); i++) 
		{
			lst=list.get(i).getText();
			System.out.println(lst);
		}
		System.out.println(i);*/
		hp.Shomepage();
		
		Actions act = new Actions(d);
		act.moveToElement(d.findElement(By.linkText("Stock Items"))).build().perform();
		
		StockCategory sc = PageFactory.initElements(d, StockCategory.class);
		sc.Scategory("srinivas001");
		
		Thread.sleep(2000);
		act.moveToElement(d.findElement(By.linkText("Stock Items"))).build().perform();
		UOM uom = PageFactory.initElements(d, UOM.class);
		uom.UOM("2005", "salesof mobiles");
		
		
		}
		
	}
