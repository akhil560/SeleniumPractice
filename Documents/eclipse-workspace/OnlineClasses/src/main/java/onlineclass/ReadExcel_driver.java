package onlineclass;

import cts.miniproject.utility.ExcelDataConfig;

public class ReadExcel_driver {
	public static void main(String[] args) {
		
		ExcelDataConfig excel = new ExcelDataConfig("C:\\Users\\akhildarling\\Documents\\eclipse-workspace\\OnlineClasses\\src\\test\\resources\\Excel\\Testdata.xlsx");
		System.out.println(excel.getData(0, 0, 0));
		
	}
}
