package ExcelReadWriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import DrawFunction.FunctionRun1;
import DrawFunction.FunctionRun4;

public class ExcelRead {
	public static int excelnum;
	public static int rownum01;
	static String namephone1;
	
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

	public static int ReadExcelNum() throws IOException {

		String filePath = "D:/test01.xls";
		Workbook workbook;
		workbook = getWeebWork(filePath);
		Sheet sheet = workbook.getSheetAt(0);
		// 获取总行数
		excelnum = sheet.getLastRowNum();
		return excelnum;
	}

	public static String ReadExcelReturnNamePhone() throws IOException {
		/**
		 * 读取Excel表中的所有数据
		 */
		String filePath = "D:/test01.xls";
		Workbook workbook;
		workbook = getWeebWork(filePath);
		Sheet sheet = workbook.getSheetAt(0);
		// 获取总行数
		rownum01 = sheet.getLastRowNum();
		// 读取指定位置的单元格
		Row row = sheet.getRow(FunctionRun1.run1());
		Cell cell1 = row.getCell(1);
		Cell cell2 = row.getCell(2);
		// 将Cell类型转换为String类型
		//String name = new String(cell1.getStringCellValue());
		String name = cell1.getStringCellValue();
		// 将科学计数法表示的数据转化为String类型
		BigDecimal big = new BigDecimal(cell2.getNumericCellValue());
		 String namephone = String.valueOf(name) + "  " + String.valueOf(big);
		return namephone;
	}
	
	
	public static String ReadExcelReturnNamePhone1() throws IOException {
		/**
		 * 读取Excel表中的所有数据
		 */
		String filePath = "D:/test01.xls";
		Workbook workbook;
		workbook = getWeebWork(filePath);
		Sheet sheet = workbook.getSheetAt(0);
		// 获取总行数
		rownum01 = sheet.getLastRowNum();
		// 读取指定位置的单元格
		Row row = sheet.getRow(FunctionRun4.run4());
		Cell cell1 = row.getCell(1);
		Cell cell2 = row.getCell(2);
		// 将Cell类型转换为String类型
		//String name = new String(cell1.getStringCellValue());
		String name = cell1.getStringCellValue();
		// 将科学计数法表示的数据转化为String类型
		BigDecimal big = new BigDecimal(cell2.getNumericCellValue());
		namephone1 = String.valueOf(name) + "  " + String.valueOf(big);
		return namephone1;
	}
}
