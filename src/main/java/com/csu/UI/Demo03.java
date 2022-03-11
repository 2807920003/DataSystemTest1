package com.csu.UI;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Demo03 {
	//结构化数据管理界面3——删除表格页面
	public void display() {
		JFrame jf = new JFrame("结构化数据管理");
		jf.setBounds(630, 330, 500, 450);
		JPanel task = new JPanel();
		task = addCompent(task);
		jf.add(task);
		jf.setVisible(true);
		jf.setResizable(true);
	}
	
	private static JPanel addCompent(JPanel task4){

		
		task4.setOpaque(false);
		task4.setLayout(null);
    	
        JPanel p1 = new JPanel();    
        final JPanel p2 = new JPanel(); 
        JPanel p3 = new JPanel(); 
        
        JLabel l1 = new JLabel("输入表名");
//        final JTextField t1 = new JTextField("", 20);
        final JComboBox c2 = new JComboBox();     
        c2.addItem("表1                                ");
        c2.addItem("表2                                ");
        c2.addItem("表3                                ");
        c2.addItem("表4                                ");
        JButton btn1 = new JButton("删除表格");
        btn1.addActionListener(new AbstractAction(){
        	@Override
			public void actionPerformed(ActionEvent e) {
        		String arr = (String) c2.getSelectedItem();//选择表
        		boolean is_sussess = false;
				/*需要添加后端代码，后端代码删除表格
				 * 
				 * 
				 * */
				if(is_sussess == true)
					JOptionPane.showMessageDialog(p2, "表格删除成功\n", "成功",JOptionPane.INFORMATION_MESSAGE);
				else{
					JOptionPane.showMessageDialog(p2,"表格删除失败\n","失败",JOptionPane.ERROR_MESSAGE);
				}
        		
        	}
        });
        p1.add(l1);
        p1.add(c2);
        p1.add(btn1);
     
        
        p3.setBounds(0, 0, 480, 30);
        p1.setBounds(0, 30, 480, 500);

        task4.add(p3);
        task4.add(p1);
 
		return task4;
	}
	
	public static void main(String[] args) {
		
		 Demo03 d = new Demo03();
		 d.display();
		
	}

}
