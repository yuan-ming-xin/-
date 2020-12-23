package 过程故障管理系统;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUI1 extends JFrame {
		Shuzu sz;
public GUI1(Shuzu sz){
	this.sz = sz;
	JFrame f = new JFrame("Grid Layout");
	Container con = f.getContentPane();
	JPanel pan = new JPanel();
	con.add(pan);
	pan.setLayout(/*new BorderLayout(),*/new GridLayout(5,1));
	JButton tj = new JButton("添加");
	JButton ck = new JButton("查看");
	JButton zzt = new JButton("显示柱状图");
	JButton bzt = new JButton("显示饼状图");
	JButton yj = new JButton("发送邮件");
	pan.add(tj/*,BorderLayout.CENTER*/);
	pan.add(ck/*,BorderLayout.CENTER*/);
	pan.add(zzt/*,BorderLayout.CENTER*/);
	pan.add(bzt/*,BorderLayout.CENTER*/);
	pan.add(yj/*,BorderLayout.CENTER*/);
	
	tj.setFont(new Font("宋体",Font.BOLD,30));
	tj.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Tianjiajiemian tianjia =new Tianjiajiemian();
			tianjia.Tianjiajiemian(sz);
			
		}
	});
	ck.setFont(new Font("宋体",Font.BOLD,30));
	ck.setFont(new Font("宋体",Font.BOLD,30));
	ck.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Chakanjiemian chakan = new Chakanjiemian();
			chakan.Chakanjiemian1(sz);
			
		}
	});
	zzt.setFont(new Font("宋体",Font.BOLD,30));
	zzt.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			Zhutu zt = new Zhutu(sz);
			zt.shutu();
			
		}
	});
	bzt.setFont(new Font("宋体",Font.BOLD,30));
	bzt.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Bingtu bt = new Bingtu(sz);
			bt.Bingtu();
		}
	});
	yj.setFont(new Font("宋体",Font.BOLD,30));
	yj.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Javamail mail = new Javamail();
			try {
				mail.mail();
				JOptionPane.showMessageDialog(null,"发送成功");
			} catch (Exception e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
		}
	});
	f.setTitle("故障管理系统");
	f.setLocation(500, 150);
	f.setSize(900, 800);
	f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	f.setVisible(true);
}
}
