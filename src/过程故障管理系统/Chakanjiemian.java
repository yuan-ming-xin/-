package 过程故障管理系统;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Chakanjiemian {
	Shuzu sz;
	public void Chakanjiemian1(Shuzu sz) {
		this.sz=sz;
	JFrame f=new JFrame();
	f.setLayout(null);
	JButton sb = new JButton("设备故障");
	JButton zl = new JButton("质量故障");
	JButton wl = new JButton("物料故障");
	JButton ny = new JButton("能源故障");
	f.add(sb);
	f.add(zl);
	f.add(wl);
	f.add(ny);
	JLabel sb1= new JLabel( );
	JLabel zl1= new JLabel( );
	JLabel wl1= new JLabel( );
	JLabel ny1= new JLabel( );
	f.add(sb1);
	f.add(zl1);
	f.add(wl1);
	f.add(ny1);
	sb.setFont(new Font("宋体",Font.BOLD,20));
	sb1.setFont(new Font("宋体",Font.BOLD,20));
	sb.setBounds(45, 20, 200, 100);
	sb.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {

			Fangfa ff = new Fangfa(sz);
			sb1.setText(ff.shebeiLook(sz.count));
			sb1.setBounds(0, 100, 900, 200);
			
		}
	});
	zl.setFont(new Font("宋体",Font.BOLD,20));
	zl1.setFont(new Font("宋体",Font.BOLD,20));
	zl.setBounds(245, 20, 200, 100);
	zl.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {

			Fangfa ff = new Fangfa(sz);
			zl1.setText(ff.zhiliangLook(sz.count1));
			zl1.setBounds(0, 200, 900, 200);
			
		}
	});
	wl.setFont(new Font("宋体",Font.BOLD,20));
	wl1.setFont(new Font("宋体",Font.BOLD,20));
	wl.setBounds(445, 20, 200, 100);
	wl.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {

			Fangfa ff = new Fangfa(sz);
			wl1.setText(ff.wuliaoLook(sz.count2));
			wl1.setBounds(0, 300, 900, 200);
			
		}
	});
	ny.setFont(new Font("宋体",Font.BOLD,20));
	ny1.setFont(new Font("宋体",Font.BOLD,20));
	ny.setBounds(645, 20, 200, 100);
    ny.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {

			Fangfa ff = new Fangfa(sz);
			ny1.setText(ff.nengyuanLook(sz.count3));
			ny1.setBounds(0, 400, 900, 200);
			
		}
	});
	f.setTitle("查看");
	f.setLocation(500, 150);
	f.setSize(900, 800);
	f.setVisible(true);
	}
	public Chakanjiemian() {
		Chakanjiemian1(sz);
	}
	
}
