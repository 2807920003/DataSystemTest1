package com.csu.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Demo5 {
	//结构化数据管理界面5——修改数据
	public void display() {
		JFrame jf = new JFrame("结构化数据管理");
		jf.setBounds(650, 350, 500, 450);
		JPanel task = new JPanel();
		task = addCompent(task);
		jf.add(task);
		
		jf.setVisible(true);
		jf.setResizable(true);
	}
	
	private static JPanel addCompent(JPanel task5){
		
		task5.setOpaque(false);
		task5.setLayout(null);
    	final JPanel p1 = new JPanel();    
        JPanel p2 = new JPanel(); 
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel(); 
        JPanel p5 = new JPanel();
        JPanel p6 = new JPanel(); 
		
        JLabel l1 = new JLabel("修改数据");
		Font font = new Font("宋体", Font.BOLD, 25);
		l1.setFont(font);
		p1.add(l1);
		
		JLabel l2 = new JLabel("输入主键    ");
		JLabel l3 = new JLabel("选择属性    ");
		JLabel l4 = new JLabel("输入修改值 ");
		final JTextField t1 = new JTextField("", 14);
		final JComboBox c1 = new JComboBox();     
        c1.addItem("属性1                                ");
        c1.addItem("属性2                                ");
        c1.addItem("属性3                                ");
        c1.addItem("属性4                                ");
		final JTextField t2 = new JTextField("", 14);
		final JButton btn1 = new JButton("修改");
		
		
		btn1.addActionListener(new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				String key = t1.getText();
				String arr = (String) c1.getSelectedItem();//选择的属性
				String value = t2.getText();//待修改的值
				Boolean is_success = false;
				/*修改按钮的后端代码
				 * 
				 * 
				 * 
				 * 
				 * */
				if(is_success == true){
					JOptionPane.showMessageDialog(p1, "修改成功\n" + arr+"="+value,
							"成功", JOptionPane.INFORMATION_MESSAGE);
				}else{
					JOptionPane.showMessageDialog(p1, "修改失败\n" ,
							"失败", JOptionPane.ERROR_MESSAGE);
				}
			}
			
		});
		
		
		p1.add(l1);
		p2.add(l2);
		p2.add(t1);
		p4.add(l3);
		p4.add(c1);
		p5.add(l4);
		p5.add(t2);
		p6.add(btn1);
		
		
		p3.setBounds(0, 0, 480, 20);
        p1.setBounds(0, 20, 480, 60);
        p2.setBounds(0, 80, 480, 40);
        p4.setBounds(0, 120, 480, 40);
        p5.setBounds(0, 160, 480, 40);
        p6.setBounds(0, 200, 480, 300);
		task5.add(p1);
		task5.add(p2);
		task5.add(p3);
		task5.add(p4);
		task5.add(p5);
		task5.add(p6);
		return task5;
	}
	
	public static void main(String[] args) {
		
		Demo5 d = new Demo5();
	
		d.display();
	}
}

