package onlineclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File excel = new File("C:\\Users\\akhildarling\\Documents\\eclipse-workspace\\OnlineClasses\\src\\test\\resources\\Excel\\Testdata.xlsx");
		FileInputStream fis = new FileInputStream(excel);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1  =  wb.getSheetAt(0);
		System.out.println(sheet1.getRow(0).getCell(0).getStringCellValue());
		
	}

}
