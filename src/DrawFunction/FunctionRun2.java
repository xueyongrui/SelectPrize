package DrawFunction;

import java.io.IOException;
import java.util.ArrayList;
import ExcelReadWriter.ExcelRead;
import View.frame01;

public class FunctionRun2 {
	public static ArrayList<String> unionlist = new ArrayList<String>();
	public static String[] str = new String[2];

	public static void run2() {
		str[0] = "a";
		frame01.getTextField().getText();
	}

	public static void run22() throws IOException {
		str[0] = "a";
		frame01.getTextField().setText(null);
		frame01.getTextField().getText();
		frame01.getTextField().setText(ExcelRead.ReadExcelReturnNamePhone1());
		frame01.getTextField().getText();
		//unionlist.add(frame02.a1);
		unionlist.add(frame01.getTextField().getText());
	}
}
