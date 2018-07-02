package DrawFunction;

import java.util.ArrayList;

public class FunctionRun5 {
	public static String result = "";
	
	public static String ArrayList2String(ArrayList<String> arrayList) {

		if (arrayList != null && arrayList.size() > 0) {
			for (String item : arrayList) {
				// 把列表中的每条数据用逗号分割开来，然后拼接成字符串
				result += item + " ,";
			}
			result = result.substring(0, result.length() - 1);
		}
		return result;
	}
}
