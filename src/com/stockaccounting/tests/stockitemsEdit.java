package com.stockaccounting.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class stockitemsEdit 
{

	public static void main(String[] args) 
	{
	WebDriver d = new FirefoxDriver();
	d.get("http://webapp.qedgetech.com");
	d.manage().window().maximize();
	d.findElement(By.id("btnreset")).click();
	d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	d.findElement(By.id("username")).sendKeys("admin");
	d.findElement(By.id("password")).sendKeys("master");
	d.findElement(By.id("btnsubmit")).click();
	d.findElement(By.linkText("Stock Items")).click();
	d.findElement(By.xpath(".//*[@id='r1_a_stock_items']/td[3]/div/div/a[2]")).click();
	d.findElement(By.id("x_Category"));
	
	Select edt = new Select(d.findElement(By.id("x_Category")));
	edt.selectByVisibleText("LAPTOPS99");
	
	Select sn = new Select(d.findElement(By.id("x_Supplier_Number")));
	sn.selectByVisibleText("sunny");
	
	d.findElement(By.id("x_Stock_Number")).clear();
	d.findElement(By.id("x_Stock_Number")).sendKeys("2007");
	d.findElement(By.id("x_Stock_Name")).clear();
	d.findElement(By.id("x_Stock_Name")).sendKeys("mobiles");
	
	Select uom = new Select(d.findElement(By.id("x_Unit_Of_Measurement")));
	uom.selectByVisibleText("asd");
	
	d.findElement(By.id("x_Purchasing_Price")).clear();
	d.findElement(By.id("x_Purchasing_Price")).sendKeys("60000");	
	d.findElement(By.id("x_Selling_Price")).clear();
	d.findElement(By.id("x_Selling_Price")).sendKeys("70000");
	d.findElement(By.id("x_Quantity")).clear();
	d.findElement(By.id("x_Quantity")).sendKeys("5");
	d.findElement(By.id("x_Notes")).clear();
	d.findElement(By.id("x_Notes")).sendKeys("mobiles for sale in good condition");
	d.findElement(By.id("btnAction")).click();
	d.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
	
	
	
	
	
	
	
	
	}

}
