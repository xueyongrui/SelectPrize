package DrawFunction;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ExcelReadWriter.ExcelRead;

public class FunctionRun4 {

	static int num;
	static int j;
	public static String k;
	public static boolean bool;
	@SuppressWarnings("rawtypes")
	public static List listnum00 = new ArrayList();

	@SuppressWarnings("unchecked")
	public static int run4() throws IOException {

		num = ExcelRead.ReadExcelNum();
		random();
//		while(bool = listnum00.contains(k))
//			random();
		booleannum1();
		listnum00.add(k);
		return j;
	}

	public static void random() {
		j = (int) (Math.random() * num);
		k = String.valueOf(j);
	}

	public static void booleannum1() {
		if (bool = listnum00.contains(k)) {
			random();
		}
		if (bool = listnum00.contains(k)) {
			booleannum2();
		}
	}

	public static void booleannum2() {
		if (bool = listnum00.contains(k)) {
			random();
		}
		if (bool = listnum00.contains(k)) {
			booleannum1();
		}
	}
}
