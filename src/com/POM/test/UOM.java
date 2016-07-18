package com.POM.test;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class UOM 
{	
	@FindBy (id="mi_a_unit_of_measurement")
	WebElement uom;
	@FindBy (xpath=".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")
	WebElement addUOM;
	@FindBy (xpath=".//*[@id='x_UOM_ID']")
	WebElement UOMID;
	@FindBy (id="x_UOM_Description")
	WebElement UOMDESC;
	@FindBy (id="btnAction")
	WebElement UOMADDbtn;
	@FindBy (xpath="html/body/div[*]/div[2]/div/div[4]/div[2]/button[1]")
	WebElement ok;
	@FindBy (xpath="html/body/div[*]/div[2]/div/div[4]/div[2]/button")
	WebElement addok;

	public void UOM(String uomid, String uomdesc)
	{	
		uom.click();
		addUOM.click();
		UOMID.sendKeys(uomid);
		UOMDESC.sendKeys(uomdesc);
		UOMADDbtn.click();
		ok.click();
		addok.click();
		
	}
	
}
