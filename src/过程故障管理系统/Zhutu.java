package ���̹��Ϲ���ϵͳ;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
public class Zhutu {
	Shuzu sz ;
		public Zhutu(Shuzu sz) {
			this.sz = sz;
		}
	public Zhutu() {
	}
	public void shutu() {
		CategoryDataset dataset =  getDataSet();
		JFreeChart chart = ChartFactory.createBarChart3D("���ϼ�¼", // ͼ�����
				"��������", // Ŀ¼�����ʾ��ǩ
				"����", // ��ֵ�����ʾ��ǩ
				dataset, // ���ݼ�
				PlotOrientation.VERTICAL, true, false, false);
		CategoryPlot plot = chart.getCategoryPlot();// ��ȡͼ���������
		CategoryAxis domainAxis = plot.getDomainAxis(); // ˮƽ�ײ��б�
		domainAxis.setLabelFont(new Font("����", Font.BOLD, 14)); // ˮƽ�ײ�����
		domainAxis.setTickLabelFont(new Font("����", Font.BOLD, 12)); // ��ֱ����
		ValueAxis rangeAxis = plot.getRangeAxis();// ��ȡ��״
		rangeAxis.setLabelFont(new Font("����", Font.BOLD, 15));
		chart.getLegend().setItemFont(new Font("����", Font.BOLD, 15));
		chart.getTitle().setFont(new Font("����", Font.BOLD, 20));// ���ñ�������
	    ChartFrame t = new ChartFrame("���ϼ�¼",chart);
	    t.setBounds(100, 100, 800, 800);
	    t.setVisible(true);
	}
	 public CategoryDataset getDataSet() {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue((sz.count)+1, "�豸", "�豸");
		dataset.addValue((sz.count1)+1, "����", "����");
		dataset.addValue((sz.count2)+1, "����", "����");
		dataset.addValue((sz.count3)+1, "��Դ", "��Դ");
		return dataset;
	}
}
