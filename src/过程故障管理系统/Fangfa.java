package ���̹��Ϲ���ϵͳ;

import java.util.Scanner;

public class Fangfa {
	Shuzu sz;
	Wenjian wenjian;

	

	public Fangfa(Shuzu sz) {
		this.sz = sz;
		wenjian = new Wenjian(sz);
	}

//	public void Add()  {
//
//		Scanner scan = new Scanner(System.in);
////		System.out.println("��������ϳ���ʱ��");
////		String time = scan.next();
////		System.out.println("��������ϳ��ֵص�");
////		String place = scan.next();
////		System.out.println("��������ϳ������");
////		String category = scan.next();
////		System.out.println("��������ϵľ������");
////		String behave = scan.next();
////		System.out.println("��������ϵĽ������");
////		String method = scan.next();
//		Jilu jilu = new Jilu(time, place, category, behave, method);
//		String s = "�豸";
//		String s1 = "����";
//		String s2 = "����";
//		String s3 = "��Դ";
//
//		if (category.equals(s)) {
//			
//			sz.add(jilu);
////			wenjian.Luru(sz.count);
//		}
//		if (category.equals(s1)) {
//			
//			sz.add1(jilu);
////		    wenjian.Lure1(sz.count1);
//		}
//		if (category.equals(s2)) {
//			
//			sz.add2(jilu);
////			wenjian.Lure2(sz.count2);
//		}
//		if (category.equals(s3)) {
//			
//			sz.add3(jilu);
////			wenjian.Lure3(sz.count3);
//		}
//	}
    public void deposit() {
    	wenjian.Deposit();

}
    public void deposit1() {
		wenjian.Deposit1();
}
    public void deposit2() {
		wenjian.Deposit2();
}
    public void deposit3() {
		wenjian.Deposit3();
}
	public  String shebeiLook(int count) {
		String a = "";
        	for(int j = 0;j<count;j++) {
        		 a += sz.shebei[j].toString();	
        	}
			return a;
        }
	public String zhiliangLook(int count1) {
		String b = "";
    	for(int j = 0;j<count1;j++) {
    		b += sz.zhiliang[j].toString();	
    	}
		return b;
    }
	public 	String wuliaoLook(int count2) {
    
		String c = "";
    	for(int j = 0;j<count2;j++) {
    		 c += sz.wuliao[j].toString();	
    	}
		return c;
    }
        
	public String nengyuanLook(int count3) {

		String d = "";
    	for(int j = 0;j<count3;j++) {
    		 d += sz.nengyuan[j].toString();	
    	}
		return d;
    }
}
