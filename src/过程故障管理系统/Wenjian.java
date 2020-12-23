package 过程故障管理系统; 

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
public class Wenjian{
//Shuzu sz = new Shuzu();
	Shuzu sz ;
public Wenjian() {
	// TODO 自动生成的构造函数存根
}
	public Wenjian(Shuzu sz) {
		this.sz = sz;
	}
	public void Deposit() {
		Luru(sz.count);
	}
	public void Deposit1() {
		Luru1(sz.count1);
	}
	public void Deposit2() {
		Luru2(sz.count2);
	}
	public void Deposit3() {
		Luru3(sz.count3);
	}	
	File f = new File("设备.txt");
	public void Luru(int count){
		try (PrintWriter bw = new PrintWriter(new FileWriter(f))) {
			for (int i = 0; i <count; i++) {
				bw.println(sz.shebei[i].toString());
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	File f1 = new File("质量.txt");
	public void Luru1(int count1) {
		try (PrintWriter bw1 = new PrintWriter(new FileWriter(f1))) {
			for (int i = 0; i < count1; i++) {
				bw1.println(sz.zhiliang[i].toString());
			}
		}catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	File f2 = new File("物料.txt");
	public void Luru2(int count2)  {
		try (PrintWriter bw2 = new PrintWriter(new FileWriter(f2))) {
			for (int i = 0; i < count2; i++) {
				bw2.println(sz.wuliao[i].toString());
			}
		}catch (IOException e2) {
			e2.printStackTrace();
		}
	}
	File f3 = new File("能源.txt");
	public void Luru3(int count3)  {
		try (PrintWriter bw3 = new PrintWriter(new FileWriter(f3))) {
			for (int i = 0; i < count3; i++) {
				bw3.println(sz.nengyuan[i].toString());
			}
		}catch (IOException e3) {
			e3.printStackTrace();
		}
	}
	/*public void Luru(int count){
		File f = new File("设备.txt");
		try {
			f.createNewFile();
			OutputStream out = new FileOutputStream(f, true);
			for (int i = 0; i < sz.shebei.length; i++) {
				byte b[] = sz.shebei[i].toString().getBytes();
				out.write(b);
			}
			out.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	public void Lure1(int count1) {
		File f1 = new File("质量.txt");
		try {
			f1.createNewFile();
			OutputStream out1 = new FileOutputStream(f1, true);
			for (int i = 0; i < sz.zhiliang.length; i++) {
				byte b[] = sz.zhiliang[i].toString().getBytes();
				out1.write(b);
			}
			out1.close();
		}catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	public void Lure2(int count2)  {
		File f2 = new File("物料.txt");
		try {
			f2.createNewFile();
			OutputStream out2 = new FileOutputStream(f2, true);
			for (int i = 0; i < sz.wuliao.length; i++) {
				byte b[] = sz.wuliao[i].toString().getBytes();
				out2.write(b);
			}
			out2.close();
		}catch (IOException e2) {
			e2.printStackTrace();
		}

		
	}
	public void Lure3(int count3)  {
		File f3 = new File("能源.txt");
		try {
			f3.createNewFile();
			OutputStream out3 = new FileOutputStream(f3, true);
			for (int i = 0; i < sz.nengyuan.length; i++) {
				byte b[] = sz.nengyuan[i].toString().getBytes();
				out3.write(b);
			}
			out3.close();
		}catch (IOException e3) {
			e3.printStackTrace();
		}

		
	}*/
/*	public void Wenjian() throws Exception {
		File f = new File("e:"+File.separator+"设备.txt");
		File f1 = new File("e:"+File.separator+"质量.txt");
		File f2 = new File("e:"+File.separator+"物料.txt");
		File f3 = new File("e:"+File.separator+"能源.txt");
		try {
			f.createNewFile();
		}catch (IOException e) {
			e.printStackTrace();
		}
		try {
			f1.createNewFile();
		}catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			f2.createNewFile();
		}catch (IOException e2) {
			e2.printStackTrace();
		}
		try {
			f3.createNewFile();
		}catch (IOException e3) {
			e3.printStackTrace();
		}
		OutputStream out = new FileOutputStream(f, true);
		for (int i = 0; i < sz.shebei.length; i++) {
			byte b[] = sz.shebei[i].toString().getBytes();
			out.write(b);
		}
		out.close();
		OutputStream out1 = new FileOutputStream(f, true);
		for (int i = 0; i < sz.zhiliang.length; i++) {
			byte b[] = sz.zhiliang[i].toString().getBytes();
			out1.write(b);
		}
		out.close();
		OutputStream out2 = new FileOutputStream(f, true);
		for (int i = 0; i < sz.wuliao.length; i++) {
			byte b[] = sz.wuliao[i].toString().getBytes();
			out2.write(b);
		}
		out.close();
		OutputStream out3 = new FileOutputStream(f, true);
		for (int i = 0; i < sz.nengyuan.length; i++) {
			byte b[] = sz.nengyuan[i].toString().getBytes();
			out3.write(b);
		}
		out.close();
	}*/
	public void Duqu() throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(f));
		String str;
		String[] strs = null;
		while((str = in.readLine())!=null) {
			strs = str.split(",");
			Jilu jilu=new Jilu(strs[0], strs[1], strs[2], strs[3], strs[4]);
			sz.add(jilu);
		}
	}
	public void Duqu1() throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(f1));
		String str1;
		String[] strs1 = null;
		while((str1 = in.readLine())!=null) {
			strs1 = str1.split(",");
			Jilu jilu1=new Jilu(strs1[0], strs1[1], strs1[2], strs1[3], strs1[4]);
		sz.add1(jilu1);
		}
	}
	public void Duqu2() throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(f2));
		String str2;
		String[] strs2 = null;
		while((str2 = in.readLine())!=null) {
			strs2 = str2.split(",");
			Jilu jilu2=new Jilu(strs2[0], strs2[1], strs2[2], strs2[3], strs2[4]);
		sz.add2(jilu2);
		}
	}
	public void Duqu3() throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(f3));
		String str3;
		String[] strs3 = null;
		while((str3 = in.readLine())!=null) {
			strs3 = str3.split(",");
				Jilu jilu3 = new Jilu(strs3[0], strs3[1], strs3[2], strs3[3], strs3[4]);
		sz.add3(jilu3);
		}
	}
}
