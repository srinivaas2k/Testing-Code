package com.stockaccounting.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class UnitofMeasurement 
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
	   
	   driver.findElement(By.xpath(".//*[@id='mi_a_unit_of_measurement']/a")).click();
	   driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
	   driver.findElement(By.id("x_UOM_ID")).sendKeys("M46");
	   driver.findElement(By.id("x_UOM_Description")).sendKeys("M46 laps available");
	   driver.findElement(By.id("btnAction")).click();
	   driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
	   
	   
	   
	   
	   
	}

}
