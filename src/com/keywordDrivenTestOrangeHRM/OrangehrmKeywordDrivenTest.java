package com.keywordDrivenTestOrangeHRM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import org.testng.xml.LaunchSuite;

public class OrangehrmKeywordDrivenTest 
{	@Test
	public void keyworddriventest() throws IOException
	{
		int tccount, tscount;
		String tcexeflg, tcid, tstcid, keyword;
		String tcres= "pass";
		boolean kwres = false;
		
	OrangehrmLib hrm = new OrangehrmLib();
	String kwxlpath = "D:\\SrinivasSelenuim\\ERP_StockAccounting\\src\\com\\stockaccounting\\testdata\\hrmtestcases.xlsx";
	String kwxlpathResults = "D:\\SrinivasSelenuim\\ERP_StockAccounting\\src\\com\\stockaccounting\\results\\hrmtestcasesResults.xlsx";
	FileInputStream fis = new FileInputStream(kwxlpath);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet ws1 = wb.getSheet("testcases");
	XSSFSheet ws2 = wb.getSheet("teststeps");
	tccount = ws1.getLastRowNum();
	tscount = ws2.getLastRowNum();
	for (int i = 1; i < tccount; i++) 
	{
		tcexeflg = ws1.getRow(i).getCell(2).getStringCellValue();
		if (tcexeflg.equalsIgnoreCase("y")) 
		{
			tcid = ws1.getRow(i).getCell(0).getStringCellValue();
			for (int j = 1; j < tscount; j++) 
			{
				tstcid = ws2.getRow(j).getCell(0).getStringCellValue();
				if (tcid.equalsIgnoreCase(tstcid)) 
				{
					keyword = ws2.getRow(j).getCell(4).getStringCellValue();
					switch (keyword.toUpperCase()) 
					{
					case "LAUNCHAPP":
						kwres=hrm.Launchapp(hrm.url);
						
						break;
					case "ADMINLOGIN";
						kwres=hrm.AdmLogin(hrm.uid, hrm.pwd);
						break;
					case "LOGOUT";
					kwres= hrm.AdminLogout();
					break;
					case "EMPREG";
					kwres=hrm.Empreg(hrm.fn, hrm.ln);
					break;
					if (kwres==true) 
					{
						ws2.getRow(j).createCell(3).setCellValue("pass");
					}
					else
					{
						ws2.getRow(j).createCell(3).setCellValue("fail");
						tcres="fail";
						
					}
					
					ws1.getRow(i).createCell(3).setCellValue(tcres);
					
					}
					
					}
						
				}
		}
			else
				
			{
				ws1.getRow(i).createCell(3).setCellValue("blocked");
				}
				
			}
			
			FileOutputStream fos = new FileOutputStream(kwxlpathResults);
			wb.write(fos);
			wb.close();
			
			
		}
}