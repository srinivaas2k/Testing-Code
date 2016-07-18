package com.stockaccounting.Master;

import java.io.IOException;



public class StockAccounting_testcases 
{
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
		
		stockaccounting_lib SA = new stockaccounting_lib();		
		String A = SA.openApp("http://webapp.qedgetech.com/login.php");
		System.out.println(A);
		
		SA.AdminLgn("admin", "master");
		
		/*// TEST DATA PATH
		FileInputStream fls = new FileInputStream("D:\\SrinivasSelenuim\\ERP_StockAccounting\\src\\com\\stockaccounting\\testdata\\UOM.xlsx");
		
		//Creating WORK BOOK
		XSSFWorkbook WB = new XSSFWorkbook(fls);
		XSSFSheet WS = WB.getSheet("UOM");
		int RowsCount = WS.getLastRowNum();
		System.out.println("Last row Num is " +RowsCount);
		
		for (int i = 1; i <=RowsCount; i++) 
			 
		{
			
		XSSFRow WRow = WS.getRow(i);
		XSSFCell WC1 = WRow.getCell(0);
		XSSFCell WC2 = WRow.getCell(1);
		XSSFCell WC3 = WRow.createCell(2);
		String UID = WC1.getStringCellValue();
		String UDesc = WC2.getStringCellValue();
		
		A=SA.uom(UID, UDesc);
		System.out.println(A);
		WC3.setCellValue(A);
			
		}
	
		FileOutputStream fos = new FileOutputStream("D:\\SrinivasSelenuim\\ERP_StockAccounting\\src\\com\\stockaccounting\\results\\UOMRES.xlsx");
		WB.write(fos);
		WB.close();
	*/
		
		
		
		/*
		//Creating work book for StockItemCR
		FileInputStream fis = new FileInputStream("D:\\SrinivasSelenuim\\ERP_StockAccounting\\src\\com\\stockaccounting\\testdata\\st1.xlsx");
		XSSFWorkbook WB = new XSSFWorkbook(fis);
		XSSFSheet WS = WB.getSheet("stcreation");
		int RowsCount = WS.getLastRowNum();
		System.out.println("Last row Number is " +RowsCount);
		for (int i = 1; i <=RowsCount; i++) 
		{
			XSSFRow WRow = WS.getRow(i);
			XSSFCell WC1 = WRow.getCell(0);
			XSSFCell WC2 = WRow.getCell(1);
			XSSFCell WC3 = WRow.getCell(2);
			XSSFCell WC4 = WRow.getCell(3);
			XSSFCell WC5 = WRow.getCell(4);
			XSSFCell WC6 = WRow.getCell(5);
			XSSFCell WC7 = WRow.getCell(6);
			XSSFCell WC8= WRow.getCell(7);
			XSSFCell WC9 = WRow.createCell(7);
			
			String Category= WC1.getStringCellValue();
			String SupplierNumber = WC2.getStringCellValue();
			String stockname = WC3.getStringCellValue();
			String UnitOfMeasurement = WC4.getStringCellValue();
			String PurchasingPrice = WC5.getStringCellValue();
			String SellingPrice = WC6.getStringCellValue();
			String Note = WC7.getStringCellValue();
		
			
			A=stockaccounting_lib.StockItemsCR(Category, SupplierNumber, stockname, UnitOfMeasurement, PurchasingPrice, SellingPrice, Note);
			System.out.println(A);
			WC9.setCellValue(A);
			
		}
		
		FileOutputStream fos = new FileOutputStream("D:\\SrinivasSelenuim\\ERP_StockAccounting\\src\\com\\stockaccounting\\results\\stcreationResults.xlsx");
		WB.write(fos);
		WB.close();
		
	*/

		/*stockaccounting_lib sup = new stockaccounting_lib();
		sup.Suppliers("Lenovo6000P", "hyderabad, kukatpally", "hyderabad", "India", "srinivas", "040 2464949", "sri@gmail.com", "8801100720", "lenovo is the china company");
		*/
		
		//SUPPLIER WORKBOOK  CREATION
		




		
		
	
		
		/*
		stockaccounting_lib scat = new stockaccounting_lib();
		scat.Scat("Srinivas Lenovo");
		
	
		stockaccounting_lib stdel = new stockaccounting_lib();
		stdel.stockaccdel();
		*/
		
	
	
	}
}
	
	

