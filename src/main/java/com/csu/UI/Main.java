package com.csu.UI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class Main  {
	
	JFrame jf = new JFrame("数据管理系统");
	//Infor information;
	public void main_display(){
		
		jf.setBounds(600, 300, 400, 250);
		jf.setLayout(new FlowLayout(FlowLayout.CENTER,100,15));
		JPanel p1 = new JPanel();    
        JPanel p2 = new JPanel(); 
        JPanel p3 = new JPanel();
        
		JLabel l1 = new JLabel("慧眼云平台数据管理系统");
		Font font = new Font("宋体", Font.BOLD, 25);
		l1.setFont(font);
		l1.setForeground(new Color(0,0,0));
		p1.add(l1);
		JButton btn1 = new JButton(" 结构化数据 ");
		JButton btn2 = new JButton("非结构化数据");
		
		btn1.addActionListener(new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//跳转页面demo1
				
				jf.setVisible(false);
				jf.dispose();
				Demo01 demo = new Demo01();
				//information=demo.findAllTables();
		    	demo.display();
			}
			
		});
		
		btn2.addActionListener(new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//跳转页面TabDemo2
				jf.setVisible(false);
				TabDemo2 demo2 = new TabDemo2();
		    	demo2.display();
			}
			
		});
		p2.add(btn1);
		p3.add(btn2);
		
		jf.add(p1);
		jf.add(p2);
		jf.add(p3);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}	
	
	public static void main(String args[]) {
		
		Main main = new Main();
		main.main_display();
	}

}
