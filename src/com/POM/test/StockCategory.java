package com.POM.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StockCategory
{
	@FindBy (linkText="Stock Categories")
	WebElement StockCategories;
	@FindBy (xpath=".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")
	WebElement add;
	@FindBy (id="x_Category_Name")
	WebElement CatName;
	@FindBy (id="btnAction")
	WebElement ok;
	@FindBy (xpath="html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")
	WebElement addOk;
	@FindBy (xpath="html/body/div[17]/div[2]/div/div[4]/div[2]/button")
	WebElement success;
	
	public void Scategory(String catname)
	{
		StockCategories.click();
		add.click();
		CatName.sendKeys(catname);
		ok.click();
		addOk.click();
		success.click();
		
		
	}
	
	
	
	
}
	
