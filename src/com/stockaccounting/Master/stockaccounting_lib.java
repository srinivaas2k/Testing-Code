package com.stockaccounting.Master;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class stockaccounting_lib 
{
	//properties calling from properties file
	public static  Properties pr;
	public static FileInputStream fls;
	
	public static WebDriver driver;
	public static String Eval,Aval;

	   public static String openApp(String URL) throws IOException
	    {
		
		 //properties calling from properties and passing the values
		   pr = new Properties();
		   fls = new FileInputStream("D:\\SrinivasSelenuim\\ERP_StockAccounting\\src\\com\\stockaccounting\\properties\\Repository.properties");
		   pr.load(fls);
		   
	    Eval="Login";
	    driver=new FirefoxDriver();
	    
	    driver.get(URL);
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	    
	  //properties calling from properties and passing the values
	    Aval=driver.findElement(By.id(pr.getProperty("loginbutton"))).getText();
	    
	    if (Eval.equalsIgnoreCase(Aval)) 
	    {
	    	return "launching app pass";	
		}
	    else
	    {
	    	return "launching app fail";
	    }
	    
	    }

	   
	   public static String StockItemsCR(String Category,String SupplierNumber, String stname,String UnitOfMeasurement, String pprc, String sprc, String note)
	   {
		   Eval="Add succeeded";
		   driver.findElement(By.linkText("Stock Items")).click();
		   driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
		   
		   Select cat = new Select(driver.findElement(By.id("x_Category")));
		   cat.selectByVisibleText(Category);
		   Select sn = new Select(driver.findElement(By.id("x_Supplier_Number")));
		   sn.selectByVisibleText(SupplierNumber);
		   
		   driver.findElement(By.id("x_Stock_Name")).sendKeys(stname);
		   Select uom = new Select(driver.findElement(By.id("x_Unit_Of_Measurement")));
		   uom.selectByVisibleText(UnitOfMeasurement);
		   driver.findElement(By.id("x_Purchasing_Price")).sendKeys(pprc);
		   driver.findElement(By.id("x_Selling_Price")).sendKeys(sprc);
		   driver.findElement(By.id("x_Notes")).sendKeys(note);
		   driver.findElement(By.id("btnAction")).click();
		   driver.findElement(By.xpath("html/body/div[*]/div[2]/div/div[4]/div[2]/button[1]")).click();
		   Aval=driver.findElement(By.xpath("html/body/div[*]/div[2]/div/div[3]/div/div")).getText();
		   driver.findElement(By.xpath("html/body/div[*]/div[2]/div/div[4]/div[2]/button")).click();
		   if (Aval.equalsIgnoreCase(Eval)) 
		   {
			return "pass";
			
		}
		   else
		   {
			  return "fail";			  
		   }
		  
	   }
	   
	   public static void stockaccdel()
	   {
		   Aval = "Delete succeeded";
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.findElement(By.linkText("Stock Items")).click();
		   driver.findElement(By.id("el1_a_stock_items_checkbox")).click();
		   driver.findElement(By.id("el2_a_stock_items_checkbox")).click();
		   driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[2]/div/button")).click();
		   driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/a")).click();
		   driver.findElement(By.xpath("html/body/div[*]/div[2]/div/div[4]/div[2]/button[1]")).click();
		   driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[3]/div/div")).getText();
		   driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
		   if (Aval.equalsIgnoreCase(Eval)) 
		   {
			System.out.println("Delete succeeded");
		   }
		   else
		   {
			   System.out.println("Can not be Deleted");
		   }
		   
	   }
	   
	   public static void AdminLgn(String Uname,String Pwd)

	    {
	    	Eval="Administrator";
	    	//properties calling from properties and passing the values
	    	driver.findElement(By.id(pr.getProperty("reset"))).click();
	    	driver.findElement(By.id(pr.getProperty("uname"))).sendKeys(Uname);
	    	driver.findElement(By.id(pr.getProperty("pwd"))).sendKeys(Pwd);
	    	driver.findElement(By.id(pr.getProperty("loginbutton"))).click();
	    	Aval=driver.findElement(By.xpath(".//*[@id='msUserName']/font/strong")).getText();
	    	
	    	if (Eval.equalsIgnoreCase(Aval)) 
	        {
	    		
	    		System.out.println("Login Pass");
	        	//return "pass";	
	    	}
	        else
	        {
	        	
	        	System.out.println("Login Fail");
	        	//return "fail";
	        }
	  
	    
	    }

	   public static void  Suppliers(String Sname,String Sadd,String Scity,String Scoun, String Scon, String Sph, String Semail, String Smbl, String Snotes)
	    {
	    	Eval="Add succeeded";
	    	
	    	driver.findElement(By.id("x_Supplier_Name")).sendKeys(Sname);
	    	driver.findElement(By.id("x_Address")).sendKeys(Sadd);
	    	driver.findElement(By.id("x_City")).sendKeys(Scity);
	    	driver.findElement(By.id("x_Country")).sendKeys(Scoun);
	    	driver.findElement(By.id("x_Contact_Person")).sendKeys(Scon);
	    	driver.findElement(By.id("x_Phone_Number")).sendKeys(Sph);
	    	driver.findElement(By.id("x__Email")).sendKeys(Semail);
	    	driver.findElement(By.id("x_Mobile_Number")).sendKeys(Smbl);
	    	driver.findElement(By.id("x_Notes")).sendKeys(Snotes);
	    	driver.findElement(By.id("btnAction")).click();
	    	
	    	driver.findElement(By.xpath("html/body/div[*]/div[2]/div/div[4]/div[2]/button[1]")).click();
	    	Aval=driver.findElement(By.xpath("html/body/div[*]/div[2]/div/div[3]/div/div")).getText();
	    	driver.findElement(By.xpath("html/body/div[*]/div[2]/div/div[4]/div[2]/button")).click();
	    	
	    	if (Eval.equalsIgnoreCase(Aval)) 
		    {
		    	System.out.println("add succeeded");
			}
		    else
		    {
		    	System.out.println("not succeeded");
		    }
		
		}
	    
	   public static void Scat(String scname) 
	   {
		 Eval = "Add succeeded";
		   Actions act = new Actions(driver);
		   act.moveToElement(driver.findElement(By.linkText("Stock Items"))).build().perform();
		   
		   driver.findElement(By.xpath(".//*[@id='mi_a_stock_categories']/a")).click();
		   driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
		   driver.findElement(By.id("x_Category_Name")).sendKeys(scname);
		   driver.findElement(By.id("btnAction")).click();
		   driver.findElement(By.xpath("html/body/div[*]/div[2]/div/div[4]/div[2]/button[1]")).click();
		   driver.findElement(By.xpath("html/body/div[*]/div[2]/div/div[3]/div/div")).getText();
		   driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
		   if (Eval.equalsIgnoreCase(Aval)) 
		   {
			System.out.println("add succeeded");
		}
		   else
		   {
			   System.out.println(" not succeeded");
		   }
		   
		   
	}		
	
	   public static String uom (String u, String des)
	   {
		   
		    Eval = "Add succeeded";
		   Actions act = new Actions(driver);
		   act.moveToElement(driver.findElement(By.linkText("Stock Items"))).build().perform();
		   
		   driver.findElement(By.xpath(".//*[@id='mi_a_unit_of_measurement']/a")).click();
		   driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
		   driver.findElement(By.id("x_UOM_ID")).sendKeys(u);
		   driver.findElement(By.id("x_UOM_Description")).sendKeys(des);
		   driver.findElement(By.id("btnAction")).click();
		   driver.findElement(By.xpath("html/body/div[*]/div[2]/div/div[4]/div[2]/button[1]")).click();
		   Aval=driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[3]/div/div")).getText();
		   driver.findElement(By.xpath("html/body/div[*]/div[2]/div/div[4]/div[2]/button")).click();
		   if (Eval.equalsIgnoreCase(Aval))
		   {
			return "pass";
		}
		   else 
		   {
			 return "fail";
		}
		   
	   }
	     	
	

		}
	    
	    
	    
	    
	    
	    
	    
	    
	    

