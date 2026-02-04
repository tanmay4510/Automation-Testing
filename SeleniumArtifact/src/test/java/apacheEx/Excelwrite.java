package apacheEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelwrite {

	public static void main(String[] args) throws IOException {
		String path= System.getProperty("user.dir");
		
		FileInputStream fis = new FileInputStream(path+ "/Excels/exl.xlsx" );
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		System.out.println(sheet.getLastRowNum());
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		
		sheet.getRow(5).createCell(2).setCellValue("fail");
		
		FileOutputStream fout = new FileOutputStream(path+ "/Excels/exl.xlsx");
		System.out.println(sheet.getRow(2).getCell(2).getStringCellValue());


	}

}
