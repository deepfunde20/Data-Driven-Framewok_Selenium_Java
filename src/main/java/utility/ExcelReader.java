package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelReader {
	//Just need to call this method and provide excel sheet path as an argument
	//it will return a two dimensional object array

String ExcelsheetPath ;
FileInputStream  src;
int RowCount;
XSSFSheet sh;



	public Object [][] readExcelSheet(String ExcelsheetPath)  {
		File file = new File (ExcelsheetPath);
		try {
			 src = new FileInputStream(file);
			 
			 XSSFWorkbook wb= new XSSFWorkbook (src);
	
sh= wb.getSheetAt(0);
				
			int LastRow=	sh.getLastRowNum();
			 RowCount = LastRow+1;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
Object [][]data = new Object [RowCount][2];
		
		for (int i =0; i<RowCount ; i++) {
			data[i][0]=sh.getRow(i).getCell(0).getStringCellValue();
			data[i][1]=sh.getRow(i).getCell(1).getStringCellValue();
		}
	
		return data;
		
	}
	

	}
	
	

	

