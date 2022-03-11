package com.csu.UI;

import com.csu.service.DatabseData;
import com.csu.service.ImportData;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Demo04 {
	//结构化数据管理界面4——新建表格
	public void display() {
		JFrame jf = new JFrame("结构化数据管理");
		jf.setBounds(640, 340, 500, 450);
		JPanel task = new JPanel();
		task = addCompent(task);
		jf.add(task);

		jf.setVisible(true);
		jf.setResizable(true);
		jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}

	private static JPanel addCompent(JPanel task4) {
		task4.setOpaque(false);
		task4.setLayout(null);
		final JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();

		JLabel l1 = new JLabel("导入表格");
		Font font = new Font("宋体", Font.BOLD, 25);
		l1.setFont(font);
		p1.add(l1);

		JLabel l2 = new JLabel("选择表格文件");
		final JTextField t1 = new JTextField("", 16);
		t1.setSize(30, 40);
		final JButton btn1 = new JButton("  浏览    ");
		final JButton btn2 = new JButton("    上传       ");

		JLabel l3=new JLabel("选择目标表格");
		final JComboBox c1=new JComboBox();
		Object [][] objects= DatabseData.getAllTableName();
		for(int i=0;i<objects.length;i++){
			c1.addItem(objects[i][0]);
		}
		c1.addItem("自动分配");

		btn1.addActionListener(new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 选择文件
				JFileChooser chooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter(
						"表格", "xml","xls", "csv");
				chooser.setFileFilter(filter);
				if (chooser.showOpenDialog(btn1) == JFileChooser.APPROVE_OPTION) {

					File file = chooser.getSelectedFile();// 文件名称
					String file_name = file.getPath();
					/*后端添加上传代码
					 * 
					 * 
					 * 
					 * */
					t1.setText(file_name);
				}
			}

		});

		btn2.addActionListener(new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 上传表格
				String file_name = t1.getText();// 文件路径
				Boolean is_success = false;
				List error = null;
				try {
					error=ImportData.importToOneTable(c1.getSelectedItem().toString(),file_name);
				} catch (IOException ioException) {
					ioException.printStackTrace();
				}
				if(error.size()==0)
					JOptionPane.showMessageDialog(p1, "表格上传成功\n" + file_name,
							"上传成功", JOptionPane.INFORMATION_MESSAGE);
				else{
					String str="";
					for(int i=0;i<error.size();i++){
						str+=i+" ";
					}
					JOptionPane.showMessageDialog(p1, "第"+str+"行数据添加失败","部分失败", JOptionPane.ERROR_MESSAGE);
				}
				/*
				 * 调用后端代码进行上传
				 * 
				 * 
				 */
//				if(is_success == true){
//					JOptionPane.showMessageDialog(p1, "表格上传成功\n" + file_name,
//							"上传成功", JOptionPane.INFORMATION_MESSAGE);
//				}else{
//					JOptionPane.showMessageDialog(p1, "上传失败\n" + file_name,
//							"上传失败", JOptionPane.ERROR_MESSAGE);
//				}
				
			}

		});

		p2.add(l2);
		p2.add(t1);
		p2.add(btn1);
		p4.add(btn2);
		p5.add(l3);
		p5.add(c1);
		p3.setBounds(0, 0, 480, 20);
		p1.setBounds(0, 20, 480, 60);
		p2.setBounds(0, 80, 480, 40);
		p5.setBounds(0,120,480,40);
		p4.setBounds(0, 160, 480, 400);

		task4.add(p1);
		task4.add(p2);
		task4.add(p3);
		task4.add(p4);

		task4.add(p5);

		return task4;

	}

	public static void main(String[] args) {

		Demo04 d = new Demo04();
		d.display();
	}

}
