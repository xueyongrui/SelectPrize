package DrawFunction;

import java.io.IOException;

import ExcelReadWriter.ExcelRead;
import View.frame01;

public class FunctionRun3 {

	public static void run3() {

		FunctionRun2.str[0] = "b";
		new Thread(new Runnable() {
			public void run() {
				for (;;) {
					if (FunctionRun2.str[0] == "a")
						break;
					try {
						frame01.getTextField().setText(ExcelRead.ReadExcelReturnNamePhone());
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
}
