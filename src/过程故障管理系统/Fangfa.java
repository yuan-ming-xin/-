package 过程故障管理系统;

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
////		System.out.println("请输入故障出现时间");
////		String time = scan.next();
////		System.out.println("请输入故障出现地点");
////		String place = scan.next();
////		System.out.println("请输入故障出现类别");
////		String category = scan.next();
////		System.out.println("请输入故障的具体表现");
////		String behave = scan.next();
////		System.out.println("请输入故障的解决方法");
////		String method = scan.next();
//		Jilu jilu = new Jilu(time, place, category, behave, method);
//		String s = "设备";
//		String s1 = "质量";
//		String s2 = "物料";
//		String s3 = "能源";
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
