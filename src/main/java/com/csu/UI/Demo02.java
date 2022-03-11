package com.csu.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Demo02 {
	//结构化数据管理界面2——查询结果
	public void display(String id, String[] arr) {
		JFrame jf = new JFrame("结构化数据管理");
		jf.setBounds(620, 320, 500, 450);
		

		JPanel task = new JPanel();
		task = addCompent(task, id, arr);
		jf.add(task);
		
		jf.setVisible(true);
		jf.setResizable(true);
	}
	
	private static JPanel addCompent(JPanel task3, String id, String[] arr){
    
    	task3.setOpaque(false);
		task3.setLayout(null);
    	JPanel p1 = new JPanel();    
        JPanel p2 = new JPanel();  
        JPanel p3 = new JPanel(); 
        JPanel p4 = new JPanel(); 
        JPanel p5 = new JPanel(); 
      
        JLabel l1 = new JLabel("查询结果");
		Font font = new Font("宋体", Font.BOLD, 15);
		l1.setFont(font);
		l1.setForeground(new Color(0,0,0));
		p1.add(l1);
        
        final JButton btn1 = new JButton(arr[0]+"-"+id);
        final JButton btn2 = new JButton(arr[1]+"-"+id);
        final JButton btn3 = new JButton(arr[2]+"-"+id);
        final JButton btn4 = new JButton(arr[3]+"-"+id);
        
        btn1.addActionListener(new AbstractAction(){
        	@Override
			public void actionPerformed(ActionEvent e) {
        		//跳转到TabDemo----增删改查界面
//        		Demo5 d5 = new Demo5();
//				d5.display();
//				jf.setVisible(false);
				TabDemo demo = new TabDemo();
		    	demo.display();
        	}
        });
        btn2.addActionListener(new AbstractAction(){
        	@Override
			public void actionPerformed(ActionEvent e) {
        		//跳转到TabDemo----增删改查界面
        		TabDemo demo = new TabDemo();
		    	demo.display();
        	}
        });
        btn3.addActionListener(new AbstractAction(){
        	@Override
			public void actionPerformed(ActionEvent e) {
        		//跳转到TabDemo----增删改查界面
        		TabDemo demo = new TabDemo();
		    	demo.display();
        	}
        });
        btn4.addActionListener(new AbstractAction(){
        	@Override
			public void actionPerformed(ActionEvent e) {
        		//跳转到TabDemo----增删改查界面
        		TabDemo demo = new TabDemo();
		    	demo.display();
        	}
        });
        
     
        p2.add(btn1);
        p3.add(btn2);
        p4.add(btn3);
        p5.add(btn4);
   
        p1.setBounds(0, 0, 470, 40);
        p2.setBounds(0, 40, 470, 60);
		p3.setBounds(0, 100, 470, 60);
		p4.setBounds(0, 160, 470, 60);
		p5.setBounds(0, 220, 470, 300);
		
		
        task3.add(p1);
        task3.add(p2);
        task3.add(p3);
        task3.add(p4);
        task3.add(p5);
        return task3;
    }
	
	public static void main(String[] args) {
		
		Demo02 d = new Demo02();
		String id = "";
		String[] arr = new String[4];
		
		d.display(id, arr);

	}

}
