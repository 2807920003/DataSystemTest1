package com.csu.UI;

import com.csu.dao.BasicInforDao;
import com.csu.entity.BasicInfor;
import com.csu.service.TableData;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import java.util.Vector;

public class Demo06 {
	//结构化数据管理界面——表中查找数据
	//public String tablename;
	public void display() {
		JFrame jf = new JFrame("结构化数据管理");
		jf.setBounds(630, 330, 500, 450);
		JPanel task = new JPanel();
		task = addCompent(task);
		jf.add(task);
		Object[] ob=new Object[BasicInfor.class.getDeclaredFields().length];
		for(int i=0;i<ob.length;i++){
			ob[i]=BasicInfor.class.getDeclaredFields()[i].getName();
		}



////		Vector<Object> v=new Vector();
////		v.add("a");
////		Vector<Object> v2=new Vector();
////		v2.add("b");
////		Vector<Vector<Object>> d=new Vector<Vector<Object>>();
////		d.add(v);
////		d.add(v2);
////		Vector<String> v5=new Vector();
////		v5.add("asd");
////		DefaultTableModel dtm=new DefaultTableModel(d,v5);
////		JTable table=new JTable(dtm);
//
//
//		//dtm.addRow(d);
//		JTable table=null;
//			try {
//				table=new JTable(TableData.getAllData("Basic_Infor"),ob);
//			} catch (ClassNotFoundException e) {
//				e.printStackTrace();
//			}
//
//
//		//JTable table=new JTable(v4,v3);
//	jf.add(new JScrollPane(table));
		jf.setVisible(true);
		jf.setResizable(true);
	}
	
	private static JPanel addCompent(JPanel task4){
		task4.setOpaque(false);
		task4.setLayout(null);
    	
        JPanel p1 = new JPanel();    
        final JPanel p2 = new JPanel(); 
        JPanel p3 = new JPanel(); 
        
        JLabel l1 = new JLabel("输入病人ID查询记录");
        final JTextField t1 = new JTextField("", 20);
        JButton btn1 = new JButton("查询");

		btn1.addActionListener(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 跳转到查询页面
				String id = t1.getText();
				String[] arr = new String[]{" "," "," "," "};
				
				/*
				 * 后端代码，查询，将查询得到的结果保存在下面的属性中
				 * arr[0] = "";
				   arr[1] = "";
				   arr[2] = "";
				   arr[3] = "";
				 * 
				*/
				
				
				Demo07 d7 = new Demo07();
				d7.display(id, arr);
			}
		});
        p1.add(l1);
        p1.add(t1);
        p1.add(btn1);
     
        
        p3.setBounds(0, 0, 480, 30);
        p1.setBounds(0, 30, 480, 500);

        task4.add(p3);
        task4.add(p1);
 
		return task4;
	}
	
	public static void main(String[] args) {
		
		 Demo06 d = new Demo06();
		 d.display();
		
	}



}
