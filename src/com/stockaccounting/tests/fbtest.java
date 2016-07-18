package com.stockaccounting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fbtest
{

	public static void main(String[] args)
	{
		WebElement sr;
		String s;
		WebDriver d= new FirefoxDriver();
		d.get("https://www.facebook.com/");
		s=d.findElement(By.xpath(".//*[@id='blueBarDOMInspector']/div/div/div/div[1]/h1/a/i/u")).getText();
		System.out.println(s);
	}

}
