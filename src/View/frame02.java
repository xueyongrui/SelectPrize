package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import DrawFunction.FunctionRun5;
//import View.luckyframe.MySetButtonListener;

import javax.swing.*;

public class frame02 {

	public Image temp;
	public JLabel jl_bg;
	public ImageIcon img;
	public JFrame frame02;
	public JLabel jlabel00;
	public JLabel jlabel01;
	public JLabel jlabel02;
	public JLabel jlabel03;
	public JRadioButton jrb1;
	public JRadioButton jrb2;
	public JTextField text021;
	public JTextField text022;
	public JButton lookbutton;
	public JButton ensurebutton;
	public JButton savebutton;
	public JComboBox<String> prizeList;
	public static String a1;
	public static String a2;
	public static String a3;
	public static int a4;
	public static String a5;
	public static int a6;
	public static int a7;
	public static String i;
	public static int size;
	public static int num1;
	public static int num2;
	public static String[] array;

	static ArrayList<String> listdata = new ArrayList<String>();
	static ArrayList<String> listdata1 = new ArrayList<String>();
	static ArrayList<String> listdata2 = new ArrayList<String>();
	static ArrayList<String> listdata3 = new ArrayList<String>();

	public void go02() {

		frame02 = new JFrame();
		frame02.setLayout(null);

		// 设置面板大小和位置
		frame02.setBounds(550, 200, 800, 600);
		frame02.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame02.setUndecorated(true);
		frame02.setVisible(true);

		// 设置label01
		jlabel00 = new JLabel("是否重复得奖");
		jlabel00.setBackground(Color.black);
		jlabel00.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		jlabel00.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel00.setBounds(75, 100, 136, 50);
		frame02.add(jlabel00);

		// 设置label01
		jlabel01 = new JLabel("奖项选择");
		jlabel01.setBackground(Color.black);
		jlabel01.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		jlabel01.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel01.setBounds(75, 200, 136, 50);
		frame02.add(jlabel01);

		// 设置label02
		jlabel02 = new JLabel("奖项数量");
		jlabel02.setBackground(Color.black);
		jlabel02.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		jlabel02.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel02.setBounds(75, 300, 136, 50);
		frame02.add(jlabel02);

		// 设置label03
		jlabel03 = new JLabel("奖品名称");
		jlabel03.setBackground(Color.black);
		jlabel03.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		jlabel03.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel03.setBounds(75, 400, 136, 50);
		frame02.add(jlabel03);

		// 设置保存按钮
		savebutton = new JButton("保存");
		savebutton.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		savebutton.setBackground(Color.orange);
		savebutton.setBounds(600, 400, 100, 40);
		savebutton.addActionListener(new MysaveButtonListener());
		// 添加结束按钮
		frame02.add(savebutton);

		// 设置查看按钮
		lookbutton = new JButton("设置结果查看");
		lookbutton.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		lookbutton.setBackground(Color.orange);
		lookbutton.setBounds(520, 500, 180, 50);
		lookbutton.addActionListener(new MyLookButtonListener());
		// 添加查看按钮
		frame02.add(lookbutton);

		// 设置确认按钮
		ensurebutton = new JButton("关闭");
		ensurebutton.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		ensurebutton.setBackground(Color.orange);
		ensurebutton.setBounds(360, 500, 100, 50);
		ensurebutton.addActionListener(new MyensureButtonListener());
		// 添加结束按钮
		frame02.add(ensurebutton);

		// 添加单选按钮jrb1和jrb2
		jrb1 = new JRadioButton("重复得奖");
		jrb2 = new JRadioButton("不重复得奖", true);
		jrb1.setBounds(400, 80, 200, 60);
		jrb2.setBounds(400, 120, 200, 60);
		jrb1.addItemListener(new Myjrb1Listener());
		jrb2.addItemListener(new Myjrb2Listener());
		frame02.add(jrb1);
		frame02.add(jrb2);
		// 添加ButtonGroup来实现JRadioButton的单选功能
		ButtonGroup bg = new ButtonGroup();
		
		bg.add(jrb1);
		bg.add(jrb2);

		// 设置奖项下拉菜单
		String[] prizeString = { "五等奖", "四等奖", "三等奖", "二等奖", "一等奖", "特等奖" };
		prizeList = new JComboBox<String>(prizeString);
		// 设置默认选中
		prizeList.setSelectedIndex(0);
		// 添加条目选中状态改变的监听器
		prizeList.addItemListener(new MyItemLister());
		prizeList.setBounds(400, 200, 150, 40);
		frame02.add(prizeList);

		// 设置奖品名称文本框
		text021 = new JTextField();
		text021.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		text021.setBounds(400, 400, 160, 40);
		text021.setColumns(20);
		text021.addCaretListener(new MyCaretListener01());
		text021.setText("0");
		// 添加单行文本到面板
		frame02.add(text021);

		// 设置奖品数量文本框
		text022 = new JTextField(null);
		text022.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		text022.setBounds(400, 310, 120, 40);
		text022.setColumns(10);
		text022.addActionListener(new MyActionListener02());
		text022.setText("0");
		// 添加单行文本到面板
		frame02.add(text022);
	}

	// 保存按钮监听类
	class MysaveButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// 点击保存按钮时获得a1 a2 a3
			char[] charArray1 = text021.getText().toCharArray();
			char[] charArray2 = text022.getText().toCharArray();
			// a6专门用来检测奖品数量是否为0
			a6 = Integer.parseInt(text022.getText());

			for (int k = 0; k < charArray1.length; k++) {
				num1 = (int) charArray1[k];
			}
			for (int j = 0; j < charArray2.length; j++) {
				num2 = (int) charArray2[j];

				// if (num2 > 47 && num2 < 58 && num1 != 48 && a6 > 0) {
				if (num2 > 47 && num2 < 58 && num1 != 48 && text022!=null) {
					
//					if (a6 > 0) {
						a1 = (String) prizeList.getSelectedItem();
						a2 = text021.getText();
						a3 = text022.getText();
						a5 = a3;// 将奖品数量信息保存到a5中（a3接下来会被加入非数字字符）
						a7 = Integer.valueOf(a3);
						a7 += a7;
						// 将原始数据放入数组备用
						listdata1.add(a1);
						listdata2.add(a2);
						listdata3.add(a3);
						// luckyframe.cde++;
						i = "奖品等级为：" + a1;
						a2 = "奖品名称为：" + a2;
						a3 = "奖品数量为：" + a3;
						// 将获得的数据存到ArrayList数组里
						listdata.add(i);
						listdata.add(a2);
						listdata.add(a3);
						// 清空输入框
						prizeList.setSelectedIndex(0);
						text021.setText("0");
						text022.setText("0");
//					} else {
//						String st1 = "奖品数量必须大于0";
//						new JOptionPane();
//						JOptionPane.showMessageDialog(null, st1);
//						return;
//					}
				}

				else {
					String st1 = "奖品数量和奖品名称不允许非空，或奖品数量不允许出现出现非数字";
					new JOptionPane();
					JOptionPane.showMessageDialog(null, st1);
					return;
				}
			}
		}
	}

	// 确认按钮监听类
	class MyensureButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frame01.abc1 = true;
			frame02.dispose();
		}
	}

	// 数据来源按钮监听类
	class MydataButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

		}
	}

	// 奖项选择监听器
	class MyItemLister implements ItemListener {
		public void itemStateChanged(ItemEvent e) {

		}
	}
	class Myjrb1Listener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(jrb1.isSelected())
				 frame01.abc4 = true;
		}
	}
	
	class Myjrb2Listener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(jrb2.isSelected())
				 frame01.abc4 = false;
		}
	}

	class MyCaretListener01 implements CaretListener {
		public void caretUpdate(CaretEvent e) {

		}
	}

	class MyActionListener02 implements ActionListener {
		public void actionPerformed(ActionEvent e) {

		}
	}

	// 设置查看按钮监听类
	class MyLookButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frame03 lkf03 = new frame03();
			// 点击查看按钮时将ArrayList数组的数据转换成字符串
			FunctionRun5.ArrayList2String(listdata);
			lkf03.go03();
		}
	}

	
}