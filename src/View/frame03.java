package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import DrawFunction.FunctionRun5;

public class frame03 {

	public JFrame frame03;
	public JLabel jlabel033;
	public JLabel jlabel031;
	public JTextArea ja03;
	public JButton ensurebutton03;
	public JScrollPane jscrollPane;

	public void go03() {

		frame03 = new JFrame();
		frame03.setLayout(null);

		// 设置面板大小和位置
		frame03.setBounds(1400, 200, 460, 380);
		frame03.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame03.setUndecorated(true);
		frame03.setVisible(true);

		// 设置确认按钮
		ensurebutton03 = new JButton("关闭");
		ensurebutton03.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		ensurebutton03.setBackground(Color.orange);
		ensurebutton03.setBounds(190, 320, 100, 50);
		ensurebutton03.addActionListener(new Myensure03ButtonListener());
		// 添加结束按钮
		frame03.add(ensurebutton03);

		// 设置label033
		jlabel033 = new JLabel("奖项设置结果");
		jlabel033.setBackground(Color.black);
		jlabel033.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		jlabel033.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel033.setBounds(125, 20, 200, 50);
		frame03.add(jlabel033);

		// 设置结果显示区
		ja03 = new JTextArea(6, 3);
		ja03.setTabSize(4);
		ja03.setBackground(Color.white);
		ja03.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		ja03.setLineWrap(true);// 激活自动换行功能
		ja03.setWrapStyleWord(true);// 激活断行不断字功能
		jscrollPane = new JScrollPane(ja03);
		jscrollPane.setBounds(50, 75, 360, 220);
		ja03.append(FunctionRun5.result);
		ja03.setEditable(false);
		frame03.add(jscrollPane);
	}

	// 确认按钮监听类
	class Myensure03ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frame03.dispose();
		}
	}

}