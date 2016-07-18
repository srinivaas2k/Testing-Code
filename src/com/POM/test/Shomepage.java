package com.POM.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Shomepage 
{
	@FindBy (linkText="Stock Items")
	WebElement stockitems;
	@FindBy (linkText="Suppliers")
	WebElement suppliers;
	@FindBy (linkText="Purchases")
	WebElement purchases;
	@FindBy (linkText="Customers")
	WebElement customers;
	@FindBy(linkText="Sales")
	WebElement sales;
	@FindBy (linkText="Outstandings")
	WebElement outstandings;
	

	public void Shomepage()
	{
		stockitems.click();
		suppliers.click();
		purchases.click();
		customers.click();
		sales.click();
		outstandings.click();
	}	
		
		
	
	
	}