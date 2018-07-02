package ExcelReadWriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import DrawFunction.FunctionRun1;

public class ExcelShiftRows {

	public static Workbook getWeebWork(String filename) throws IOException {
		Workbook workbook;
		workbook = null;
		if (null != filename) {
			String fileType = filename.substring(filename.lastIndexOf("."), filename.length());
			FileInputStream fileStream = new FileInputStream(new File(filename));
			if (".xls".equals(fileType.trim().toLowerCase())) {
				workbook = new HSSFWorkbook(fileStream);// 创建 Excel 2003 工作簿对象
			} else if (".xlsx".equals(fileType.trim().toLowerCase())) {
				workbook = new XSSFWorkbook(fileStream);// 创建 Excel 2007 工作簿对象
			}
		}
		return workbook;
	}
	
	public static void ShiftRows() throws IOException {
		String filePath = "D:/test01.xls";
		Workbook workbook;
		workbook = getWeebWork(filePath);
		Sheet sheet = workbook.getSheetAt(0);
		int rownum = sheet.getLastRowNum();
		if(FunctionRun1.run1()>=0&&FunctionRun1.run1()<rownum){
		sheet.shiftRows(FunctionRun1.run1(), rownum, -1);
		}
		if(FunctionRun1.run1()==rownum){
			Row removingRow=sheet.getRow(FunctionRun1.run1());
			if(removingRow!=null)  
	            sheet.removeRow(removingRow);  
		}
		FileOutputStream os = new FileOutputStream("D:/test01.xls");
		workbook.write(os);
		os.close();
	}
}
