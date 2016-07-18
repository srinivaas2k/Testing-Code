package com.stockaccounting.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class StockCategoriesAdd 
{

	public static void main(String[] args) 
	{
		   WebDriver driver = new FirefoxDriver();
		   driver.get("http://webapp.qedgetech.com");
		   driver.findElement(By.id("btnreset")).click();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.findElement(By.id("username")).sendKeys("admin");
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
		   driver.findElement(By.id("password")).sendKeys("master");
		   driver.findElement(By.id("btnsubmit")).click();
		   
		   Actions act = new Actions(driver);
		   act.moveToElement(driver.findElement(By.linkText("Stock Items"))).build().perform();
		   
		   driver.findElement(By.xpath(".//*[@id='mi_a_stock_categories']/a")).click();
		   driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
		   driver.findElement(By.id("x_Category_Name")).sendKeys("LAPS123");
		   driver.findElement(By.id("btnAction")).click();
		   driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
		   
		   
	}

}
