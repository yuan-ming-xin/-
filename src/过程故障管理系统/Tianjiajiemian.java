package ���̹��Ϲ���ϵͳ;

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

public class Tianjiajiemian extends JFrame{
	Shuzu sz;
	public void Tianjiajiemian(Shuzu sz) {
		this.sz = sz;
	JFrame f=new JFrame();
//	Container con =  f.getContentPane() ;
//	JPanel pan = new JPanel(); 	
//	con.add(pan);
	f.setLayout(null);
	JLabel time= new JLabel("��������Ϸ���ʱ��");
	JTextField input = new JTextField();
	f.add(time);
	time.setBounds(80 , 100, 200, 50);
	f.add(input);
	input.setBounds(300, 100, 400, 50);
	time.setFont(new Font("����",Font.BOLD,20));
	
	JLabel place = new JLabel("��������Ϸ����ص�");
	JTextField input1 = new JTextField();
	f.add(place);
	place.setBounds(80, 200, 200, 50);
	f.add(input1);
	input1.setBounds(300, 200, 400, 50);
	place.setFont(new Font("����",Font.BOLD,20));
	
	JLabel lb = new JLabel("��������Ϸ������");
	JTextField input2 = new JTextField();
	f.add(lb);
	lb.setBounds(80, 300, 200, 50);
	f.add(input2);
	input2.setBounds(300, 300, 400, 50);
	lb.setFont(new Font("����",Font.BOLD,20));
	
	JLabel bx = new JLabel("��������ϵı���");
	JTextField input3 = new JTextField();
	f.add(bx);
	bx.setBounds(80, 400, 200, 50);
	f.add(input3);
	input3.setBounds(300, 400, 400, 50);
	bx.setFont(new Font("����",Font.BOLD,20));
	
	JLabel ff = new JLabel("������������");
	JTextField input4 = new JTextField();
		f.add(ff);
		ff.setBounds(80, 500, 200, 50);
	f.add(input4);
	input4.setBounds(300, 500, 400, 50);
	ff.setFont(new Font("����",Font.BOLD,20));
	JButton jbu = new JButton("���");
	f.add(jbu);
	jbu.setBounds(600, 600, 80, 50);
	jbu.setFont(new Font("����",Font.BOLD,20));
	jbu.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Fangfa fangfa = new Fangfa(sz);
			Jilu jilu = new Jilu(input.getText(), input1.getText(), input2.getText(), input3.getText(), input4.getText());
			String s = "�豸";
			String s1 = "����";
			String s2 = "����";
			String s3 = "��Դ";
			if (input2.getText().equals(s)) {
				
				sz.add(jilu);
				fangfa.deposit();
			}
			if (input2.getText().equals(s1)) {
				
				sz.add(jilu);
				fangfa.deposit1();
			}
			if (input2.getText().equals(s2)) {
	
				sz.add(jilu);
				fangfa.deposit2();
		}
			if (input2.getText().equals(s3)) {
	
				sz.add(jilu);
				fangfa.deposit3();
}

//			fangfa.Add();
			if(input2.getText().equals(s)||input2.getText().equals(s1)||input2.getText().equals(s2)||input2.getText().equals(s3)) {
			JOptionPane.showMessageDialog(null,"��ӳɹ�");
			}else {
				JOptionPane.showMessageDialog(null,"���ʧ��");
			}
		}
	});
	f.setTitle("����");
	f.setLocation(500, 150);
	f.setSize(900, 800);
	f.setVisible(true);
	}
	public Tianjiajiemian() {
		Tianjiajiemian(sz);
	}
	

}
