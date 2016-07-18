package com.stockaccountingTestNG_Lib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StockAccountingLoginTestcase 

{	
	StckaccountingLibrary st = new StckaccountingLibrary();
	@Test
	public void SupplierCreation() throws IOException
	{
	FileInputStream fis = new FileInputStream("D:\\SrinivasSelenuim\\ERP_StockAccounting\\src\\com\\stockaccounting\\testdata\\st1.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet ws=wb.getSheet("SupplierCreation");
	int rowcount;
	rowcount=ws.getLastRowNum();
	System.out.println(rowcount);
	for (int i = 1; i <=rowcount; i++) 
	{
		XSSFRow wrow = ws.getRow(i);
		XSSFCell wc1 = wrow.getCell(0);
		XSSFCell wc2 = wrow.getCell(1);
		XSSFCell wc3 = wrow.getCell(2);
		XSSFCell wc4 = wrow.getCell(3);
		XSSFCell wc5 = wrow.getCell(4);
		XSSFCell wc6 = wrow.getCell(5);
		XSSFCell wc7 = wrow.getCell(6);
		XSSFCell wc8 = wrow.getCell(7);
		XSSFCell wc9 = wrow.getCell(8);
		XSSFCell wc10 = wrow.createCell(9);
		
		
		String SupplierName	= wc1.getStringCellValue();
		String Address = wc2.getStringCellValue();
		String City = wc3.getStringCellValue();
		String Country = wc4.getStringCellValue();
		String ContactPerson = wc5.getStringCellValue();
		String PhoneNumber = wc6.getStringCellValue();
		String Email = wc7.getStringCellValue();
		String MobileNumber = wc8.getStringCellValue();
		String Notes = wc9.getStringCellValue();
		
		String res = StckaccountingLibrary.Suppliers(SupplierName, Address, City, Country, ContactPerson, PhoneNumber, Email, MobileNumber, Notes);
		System.out.println(res);
		wc10.setCellValue(res);
	}
		
		FileOutputStream fos = new FileOutputStream("D:\\SrinivasSelenuim\\ERP_StockAccounting\\src\\com\\stockaccounting\\testdata\\st1.xlsx");
		wb.write(fos);
		wb.close();
		
	
	}
	
	
	StckaccountingLibrary sl = new StckaccountingLibrary();
	
	@BeforeTest
	public void LaunchingAppInit_()
	{
		sl.LaunchingApp(sl.url);
		
	}
	@AfterTest
	public void Logout()
	{
		sl.Logout();
	
	}
	@Test
	public void Check_AdminLogin()
	{
		sl.AdminLogin(sl.uid, sl.pwd);
		
	}
	

}