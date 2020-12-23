package 过程故障管理系统;

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
		JFreeChart chart = ChartFactory.createBarChart3D("故障记录", // 图表标题
				"故障种类", // 目录轴的显示标签
				"次数", // 数值轴的显示标签
				dataset, // 数据集
				PlotOrientation.VERTICAL, true, false, false);
		CategoryPlot plot = chart.getCategoryPlot();// 获取图表区域对象
		CategoryAxis domainAxis = plot.getDomainAxis(); // 水平底部列表
		domainAxis.setLabelFont(new Font("黑体", Font.BOLD, 14)); // 水平底部标题
		domainAxis.setTickLabelFont(new Font("宋体", Font.BOLD, 12)); // 垂直标题
		ValueAxis rangeAxis = plot.getRangeAxis();// 获取柱状
		rangeAxis.setLabelFont(new Font("黑体", Font.BOLD, 15));
		chart.getLegend().setItemFont(new Font("黑体", Font.BOLD, 15));
		chart.getTitle().setFont(new Font("宋体", Font.BOLD, 20));// 设置标题字体
	    ChartFrame t = new ChartFrame("故障记录",chart);
	    t.setBounds(100, 100, 800, 800);
	    t.setVisible(true);
	}
	 public CategoryDataset getDataSet() {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue((sz.count)+1, "设备", "设备");
		dataset.addValue((sz.count1)+1, "质量", "质量");
		dataset.addValue((sz.count2)+1, "物料", "物料");
		dataset.addValue((sz.count3)+1, "能源", "能源");
		return dataset;
	}
}
