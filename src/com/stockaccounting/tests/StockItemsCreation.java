package com.stockaccounting.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StockItemsCreation 
{

	public static void main(String[] args) 
	{
		   WebDriver driver = new FirefoxDriver();
		   driver.get("http://webapp.qedgetech.com");
		   driver.manage().window().maximize();
		   driver.findElement(By.id("btnreset")).click();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.findElement(By.id("username")).sendKeys("admin");
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
		   driver.findElement(By.id("password")).sendKeys("master");
		   driver.findElement(By.id("btnsubmit")).click();
		   driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a")).click();
		   driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
		   driver.findElement(By.id("x_Category"));
		   
		   Select cat = new Select(driver.findElement(By.id("x_Category")));
		   cat.selectByVisibleText("LAPTOPS99");
		   
		   Select suplno = new Select(driver.findElement(By.id("x_Supplier_Number")));
		   suplno.selectByVisibleText("Redmi");
		   
		   driver.findElement(By.id("x_Stock_Name")).sendKeys("Lappy's");
		   
		   Select uom = new Select(driver.findElement(By.id("x_Unit_Of_Measurement")));
		   uom.selectByVisibleText("100 Tons");
		   
		   driver.findElement(By.id("x_Purchasing_Price")).sendKeys("1500000");
		   driver.findElement(By.id("x_Selling_Price")).sendKeys("1700000");
		   driver.findElement(By.id("x_Notes")).sendKeys(" LAPTOPS FOR SELLING");
		   driver.findElement(By.id("btnAction")).click();
		   driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
		   
	}

}
