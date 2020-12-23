package 过程故障管理系统;



public class Shuzu {
	       int count  = 0;
           int count1 = 0;
           int count2 = 0;
           int count3 = 0;
    	   Jilu shebei[] = new Jilu[100];//设备故障数组
    	   Jilu zhiliang[] = new Jilu[100];//质量故障数组
    	   Jilu wuliao[] = new Jilu[100];//物料故障数组
    	   Jilu nengyuan[] = new Jilu[100];//能源故障数组
       public void add(Jilu jilu) {//增加
   		if(count<100) {
   			shebei[count] = jilu;
   			count++;
   		}
   	}
       public void add1(Jilu jilu) {//增加
   		if(count1<100) {
   			zhiliang[count1] = jilu;
   			count1++;
   		}
   	}
       public void add2(Jilu jilu) {//增加
   		if(count2<100) {
   			wuliao[count2++] = jilu;
   		}
   	}
       public void add3(Jilu jilu) {//增加
   		if(count3<100) {
   			nengyuan[count3++] = jilu;
   		}
   	}
}
    