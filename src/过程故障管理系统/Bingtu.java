package ���̹��Ϲ���ϵͳ;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;  
import java.text.NumberFormat;  
  
import javax.swing.JPanel;  
  
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;  
import org.jfree.chart.JFreeChart;  
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;  
import org.jfree.chart.plot.PiePlot;  
import org.jfree.data.general.DefaultPieDataset;  
  
public class Bingtu {  
	Shuzu sz ;
	public Bingtu(Shuzu sz) {
		this.sz = sz;
	}
    public Bingtu(){  

    }  
    public void Bingtu() {
    	          DefaultPieDataset data = getDataSet();  
          JFreeChart chart = ChartFactory.createPieChart3D("���ϼ�¼",data,true,false,false);  
        //���ðٷֱ�  
          PiePlot pieplot = (PiePlot) chart.getPlot();  
          DecimalFormat df = new DecimalFormat("0.00%");//���һ��DecimalFormat������Ҫ������С������  
          NumberFormat nf = NumberFormat.getNumberInstance();//���һ��NumberFormat����  
          StandardPieSectionLabelGenerator sp1 = new StandardPieSectionLabelGenerator("{0}  {2}", nf, df);//���StandardPieSectionLabelGenerator����  
          pieplot.setLabelGenerator(sp1);//���ñ�ͼ��ʾ�ٷֱ�  
        
      //û�����ݵ�ʱ����ʾ������  
          pieplot.setNoDataMessage("��������ʾ");  
          pieplot.setCircular(false);  
          pieplot.setLabelGap(0.02D);  
        
          pieplot.setIgnoreNullValues(true);//���ò���ʾ��ֵ  
          pieplot.setIgnoreZeroValues(true);//���ò���ʾ��ֵ  
//         frame1=new ChartPanel (chart,true);  
  
          chart.getTitle().setFont(new Font("����",Font.BOLD,20));//���ñ�������  
          PiePlot piePlot= (PiePlot) chart.getPlot();//��ȡͼ���������  
          piePlot.setLabelFont(new Font("����",Font.BOLD,10));//�������  
          chart.getLegend().setItemFont(new Font("����",Font.BOLD,10)); 
          ChartFrame t = new ChartFrame("���ϼ�¼",chart);
  	      t.setBounds(100, 100, 800, 400);
  	      t.setVisible(true);
    }
   public DefaultPieDataset getDataSet() {  
        DefaultPieDataset dataset = new DefaultPieDataset();  
        dataset.setValue("�豸����",(sz.count)+1);  
        dataset.setValue("��������",(sz.count1)+1);  
        dataset.setValue("���Ϲ���",(sz.count2)+1);  
        dataset.setValue("��Դ����",(sz.count3)+1);  
        return dataset;  
}


}  