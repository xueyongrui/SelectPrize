package DrawFunction;

import java.util.ArrayList;

public class FunctionRun6 {

public static String result06 = "";
	
	public static String ArrayList6String(ArrayList<String> arrayList6) {

		if (arrayList6 != null && arrayList6.size() > 0) {
			for (String item : arrayList6) {
				// 把列表中的每条数据用逗号分割开来，然后拼接成字符串
				result06 += item + "  ";
			}
			result06 = result06.substring(0, result06.length() - 1);
		}
		return result06;
	}
}
