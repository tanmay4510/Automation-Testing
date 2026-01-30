package apacheEx;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelEx {

	public static void main(String[] args) throws IOException {
		String path= System.getProperty("user.dir");
		XSSFWorkbook workbook= new XSSFWorkbook(path + "/Excels/exl.xlsx/");
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int x= sheet.getPhysicalNumberOfRows();
		
		System.out.println(x);
		System.out.println(sheet.getRow(2).getCell(2).getStringCellValue());

	}

}
