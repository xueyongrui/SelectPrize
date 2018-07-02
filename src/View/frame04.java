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

import DrawFunction.FunctionRun6;

public class frame04 {

	public JFrame frame04;
	public JLabel jlabel04;
	public JTextArea ja04;
	public JButton ensurebutton04;
	public JScrollPane jscrollPane04;

	public void go04() {

		frame04 = new JFrame();
		frame04.setLayout(null);
		// 设置面板大小和位置
		frame04.setBounds(670, 200, 450, 800);
		frame04.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame04.setUndecorated(true);
		frame04.setVisible(true);

		// 设置确认按钮
		ensurebutton04 = new JButton("关闭");
		ensurebutton04.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		ensurebutton04.setBackground(Color.orange);
		ensurebutton04.setBounds(150, 720, 120, 50);
		ensurebutton04.addActionListener(new Myensure04ButtonListener());
		// 添加结束按钮
		frame04.add(ensurebutton04);

		// 设置label033
		jlabel04 = new JLabel("获奖名单");
		jlabel04.setBackground(Color.black);
		jlabel04.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		jlabel04.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel04.setBounds(100, 20, 200, 50);
		frame04.add(jlabel04);

		// 设置获奖名单显示区
		ja04 = new JTextArea();
		ja04.setTabSize(4);
		ja04.setBackground(Color.white);
		ja04.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		ja04.setLineWrap(true);// 激活自动换行功能
		ja04.setWrapStyleWord(true);// 激活断行不断字功能
		jscrollPane04 = new JScrollPane(ja04);
		jscrollPane04.setBounds(100, 80, 230, 600);
		ja04.append(FunctionRun6.result06);
		ja04.setEditable(false);
		frame04.add(jscrollPane04);
	}

	// 确认按钮监听类
	class Myensure04ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frame04.dispose();
		}
	}
}

