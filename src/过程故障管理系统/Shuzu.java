package ���̹��Ϲ���ϵͳ;



public class Shuzu {
	       int count  = 0;
           int count1 = 0;
           int count2 = 0;
           int count3 = 0;
    	   Jilu shebei[] = new Jilu[100];//�豸��������
    	   Jilu zhiliang[] = new Jilu[100];//������������
    	   Jilu wuliao[] = new Jilu[100];//���Ϲ�������
    	   Jilu nengyuan[] = new Jilu[100];//��Դ��������
       public void add(Jilu jilu) {//����
   		if(count<100) {
   			shebei[count] = jilu;
   			count++;
   		}
   	}
       public void add1(Jilu jilu) {//����
   		if(count1<100) {
   			zhiliang[count1] = jilu;
   			count1++;
   		}
   	}
       public void add2(Jilu jilu) {//����
   		if(count2<100) {
   			wuliao[count2++] = jilu;
   		}
   	}
       public void add3(Jilu jilu) {//����
   		if(count3<100) {
   			nengyuan[count3++] = jilu;
   		}
   	}
}
    