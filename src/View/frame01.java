package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import DrawFunction.*;

public class frame01 {

	public static JFrame frame;
	public JLabel jlabel;
	public JLabel jl_bg;
	public JButton startButton;
	public JButton stopButton;
	public JButton setButton;
	public JButton winlistbutton;
	public JButton closeButton;
	public JButton dataButton;
	public JPanel panel;
	public ImageIcon img;
	public Image temp;
	public static JTextField textnamephone;
	public JComboBox<String> prizeList;
	public static JTextField text01;
	public static JTextField text02;
	public static JTextField text03;
	public JLabel jlabel01;
	public JLabel jlabel02;
	public JLabel jlabel03;
	public JLabel jlabel04;
	public static String b0;
	public static String bcd1;
	public static String bcd2;
	public static String bcd3;
	public static boolean abc1 = false;
	public static boolean abc2 = true;
	public static boolean abc3 = false;
	public static boolean delete = false;
	public static String s2;
	public static boolean abc4 = false;
	@SuppressWarnings("rawtypes")
	public static List listnum = new ArrayList();

	public void go() {
		frame = new JFrame();
		frame.setLayout(null);

		// 设置label
		jlabel = new JLabel("抽奖系统");
		jlabel.setBackground(Color.black);
		jlabel.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		jlabel.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel.setBounds(820, 21, 136, 50);
		frame.add(jlabel);

		// 设置开始按钮
		startButton = new JButton("开始");
		startButton.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		startButton.setBackground(Color.green);
		startButton.setBounds(1760, 700, 100, 50);
		startButton.addActionListener(new MyStartButtonListener());
		// 添加开始按钮
		frame.add(startButton);

		// 设置设置按钮
		setButton = new JButton("抽奖设置");
		setButton.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		setButton.setBackground(Color.GRAY);
		setButton.setBounds(1710, 600, 150, 50);
		setButton.addActionListener(new MySetButtonListener());
		// 添加开始按钮
		frame.add(setButton);
		
		// 设置中奖名单按钮
		winlistbutton = new JButton("中奖名单查看");
		winlistbutton.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		winlistbutton.setBackground(Color.GRAY);
		winlistbutton.setBounds(1650, 120, 200, 50);
		winlistbutton.addActionListener(new MyWinlistButtonListener());
		// 添加开始按钮
		frame.add(winlistbutton);

		// 设置结束按钮
		stopButton = new JButton("停止");
		stopButton.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		stopButton.setBackground(Color.orange);
		stopButton.setBounds(1760, 800, 100, 50);
		stopButton.addActionListener(new MyStopButtonListener());
		// 添加结束按钮
		frame.add(stopButton);

		// 设置退出功能
		closeButton = new JButton("退出");
		closeButton.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		closeButton.setBackground(Color.cyan);
		closeButton.setBounds(50, 950, 150, 70);
		closeButton.addActionListener(new MycloseButtonListener());
		// 添加退出按钮
		// frame.add(closeButton);

		// 设置单行文本
		textnamephone = new JTextField("");
		textnamephone.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		textnamephone.setBounds(750, 130, 300, 50);
		textnamephone.setColumns(10);
		textnamephone.setEditable(false);
		// 添加单行文本
		frame.add(textnamephone);
		frame.repaint();
		frame.validate();
		frame.invalidate();
		frame.validate();

		// 设置奖项下拉菜单
		String[] prizeString = { "五等奖", "四等奖", "三等奖", "二等奖", "一等奖", "特等奖" };
		prizeList = new JComboBox<String>(prizeString);
		// 设置默认选中
		prizeList.setSelectedIndex(5);
		// 添加条目选中状态改变的监听器
		prizeList.addItemListener(new MyItemLister());
		prizeList.setBounds(1700, 200, 150, 40);
		frame.add(prizeList);

		// 设置奖品名称文本框
		text01 = new JTextField("");
		text01.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		text01.setBounds(1700, 300, 160, 40);
		text01.setColumns(20);
		text01.setEditable(false);
		text01.addCaretListener(new MyCaretListener001());
		// 添加单行文本
		frame.add(text01);

		// 设置奖品数量文本框
		text02 = new JTextField("");
		text02.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		text02.setBounds(1700, 400, 160, 40);
		text02.setColumns(10);
		text02.setEditable(false);
		text02.addActionListener(new MyActionListener002());
		// 添加单行文本
		frame.add(text02);

		// 设置奖品数量文本框
		text03 = new JTextField("");
		text03.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		text03.setBounds(1700, 500, 160, 40);
		text03.setColumns(10);
		text03.setEditable(false);
		text03.addActionListener(new MyActionListener003());
		// 添加单行文本
		frame.add(text03);
		// text03实时刷新
		frame.repaint();
		frame.validate();
		frame.invalidate();
		frame.validate();

		// 设置label01
		jlabel01 = new JLabel("当前奖品等级");
		jlabel01.setBackground(Color.black);
		jlabel01.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		jlabel01.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel01.setBounds(1400, 200, 190, 50);
		frame.add(jlabel01);

		// 设置label02
		jlabel02 = new JLabel("奖品名称");
		jlabel02.setBackground(Color.black);
		jlabel02.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		jlabel02.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel02.setBounds(1400, 300, 136, 50);
		frame.add(jlabel02);

		// 设置label03
		jlabel03 = new JLabel("该奖品数量");
		jlabel03.setBackground(Color.black);
		jlabel03.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		jlabel03.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel03.setBounds(1400, 400, 150, 50);
		frame.add(jlabel03);

		// 设置label04
		jlabel04 = new JLabel("剩余数量");
		jlabel04.setBackground(Color.black);
		jlabel04.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		jlabel04.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel04.setBounds(1400, 500, 136, 50);
		frame.add(jlabel04);

		// 设置背景图片
		img = new ImageIcon("Image/BackGround/4900.gif");// 创建图片对象
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();// 得到电脑屏幕的大小
		img.getImage();
		temp = img.getImage().getScaledInstance((int) screenSize.getWidth(), (int) screenSize.getHeight(),
				Image.SCALE_DEFAULT);// 设置图片大小跟屏幕大小一致
		img = new ImageIcon(temp);// 背景图片等于设置好后大小的图片
		jl_bg = new JLabel(img);
		jl_bg.setBounds(0, 0, (int) screenSize.getWidth(), (int) screenSize.getHeight());
		frame.getLayeredPane().add(jl_bg, new Integer(Integer.MIN_VALUE));
		((JPanel) frame.getContentPane()).setOpaque(false); // 设置上层背景透明，底层图片得以显示出来

		// 设置面板大小和位置
		frame.setLocation(0, 0);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);// JFrame最大化
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.setVisible(true);
		frame.addMouseListener(new MouseAdapter() {
			// 三击退出
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 3) {
					frame.dispose();
				}
			}
		});
	}

	public static JTextField getTextField() {
		return textnamephone;
	}

	public static JTextField getTextField01() {
		return text01;
	}

	public static JTextField getTextField02() {
		return text02;
	}

	// 开始按钮监听类
	class MyStartButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (frame02.a6 > 0) {
				abc2 = false;
				abc3 = true;
				s2 = String.valueOf(--frame02.a4);
				text03.setText(s2);
				text03.getText();
				if (frame02.a4 >= 0) {
					// if(delete){
					// try {
					// //当点击停止按钮时，会记录抽中的信息，并把该人员从信息表中删除，更新信息表
					// ExcelShiftRows.ShiftRows();
					// } catch (IOException e1) {
					// String st1 = "程序出错";
					// new JOptionPane();
					// JOptionPane.showMessageDialog(null, st1);
					// }
					// }
					FunctionRun3.run3();
				} else {
					String st1 = "该等级奖品发放完毕，请更换奖项";
					new JOptionPane();
					JOptionPane.showMessageDialog(null, st1);
					return;
				}
			} else {
				String st1 = "请先输入奖品信息";
				new JOptionPane();
				JOptionPane.showMessageDialog(null, st1);
				return;
			}
		}
	}

	// 结束按钮监听类
	class MyStopButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(abc4){
			 FunctionRun2.run2();
			}else{
			try {
				FunctionRun2.run22();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
			// delete = true;

			// String k = String.valueOf(Controllerlucky.j);
			// if (listnum.contains(k)){
			// //Controllerlucky.run();
			// try {
			// Controllerlucky.run3();
			// } catch (IOException e1) {
			// e1.printStackTrace();
			// }
			// }
			// listnum.add(k);
			// try {
			// //当点击停止按钮时，会记录抽中的信息，并把该人员从信息表中删除，更新信息表
			// ExcelReadWriter.ShiftRows();
			// } catch (IOException e1) {
			// String st1 = "程序出错";
			// new JOptionPane();
			// JOptionPane.showMessageDialog(null, st1);
			// }

		}
	}

	// 设置按钮监听类
	class MySetButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frame02 lkf02 = new frame02();
			lkf02.go02();
		}
	}
	// 中奖名单查看按钮监听类
	class MyWinlistButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frame04 lkf04 = new frame04();
			FunctionRun6.ArrayList6String(FunctionRun2.unionlist);
			lkf04.go04();
		}
	}

	// 关闭功能监听类
	class MycloseButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frame01.frame.dispose();
		}
	}

	// 奖项选择监听器
	class MyItemLister implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			int i = prizeList.getSelectedIndex();
			// }
			if (abc1) {
				// 将奖品数量信息转换为String类型
				// luckyframe02.a4 = Integer.parseInt(luckyframe02.a5);
				bcd2 = frame02.listdata2.get(i);// 随着奖项的选择显示不同的奖品
				bcd3 = frame02.listdata3.get(i);// 随着奖项的选择显示不同奖品的数量
				frame02.a4 = Integer.parseInt(frame01.bcd3);
				text01.setText(bcd2);
				text01.getText();
				text02.setText(bcd3);
				text02.getText();
				text03.setText("");
			}
		}
	}

	class MyCaretListener001 implements CaretListener {
		public void caretUpdate(CaretEvent e) {
		}
	}

	class MyActionListener002 implements ActionListener {
		public void actionPerformed(ActionEvent e) {

		}
	}

	class MyActionListener003 implements ActionListener {
		public void actionPerformed(ActionEvent e) {

		}
	}
}