package 过程故障管理系统;

import java.awt.GridLayout;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) throws IOException {
		Shuzu sz = new Shuzu();
	Wenjian wj = new Wenjian(sz);
		wj.Duqu();
		wj.Duqu1();
		wj.Duqu2();
		wj.Duqu3();
		new GUI1(sz);
	}
}
