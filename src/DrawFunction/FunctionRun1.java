package DrawFunction;

import java.io.IOException;
import ExcelReadWriter.ExcelRead;

public class FunctionRun1 {
	static int num;
	static int j;
	
	public static int run1() throws IOException {
		num = ExcelRead.ReadExcelNum();
		j = (int) (Math.random() * num) + 1;
//		FunctionRun4.k = String.valueOf(j);
//		FunctionRun4.listnum00.add(FunctionRun4.k);
		return j;
	}
}
