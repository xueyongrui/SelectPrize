package Main;

import java.io.File;
import javax.swing.JOptionPane;
import View.frame01;

public class mainlucky {

	public static void main(String[] args) {
		File file = new File("D:/test01.xls");
		if (file.exists()) {
			frame01 lkf = new frame01();
			lkf.go();
		} else {
			String st1 = "指定路径下没有该文件，请先将含有员工信息的test01.xls放入D盘根目录，再重新启动该应用";
			new JOptionPane();
			JOptionPane.showMessageDialog(null, st1);
			return;
		}
	}
}
