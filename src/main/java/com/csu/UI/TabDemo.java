package com.csu.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class TabDemo {
	
	public static void display(){
		JFrame jf = new JFrame("结构化数据管理");
		
		JPanel task1 = new JPanel();
        JPanel task2 = new JPanel();
        JPanel task3 = new JPanel();
        JPanel task4 = new JPanel();
    	JTabbedPane tabbedPane = buildJTabbedPane(task1, task2, task3, task4);
    	jf.add(tabbedPane);
		jf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        // 设置布局
        jf.getContentPane().setLayout(new BorderLayout());
        jf.getContentPane().add(BorderLayout.CENTER, tabbedPane);
      
        
        jf.setMinimumSize(new Dimension(500, 560));
       
        // 调整此窗口的大小，以适合其子组件的首选大小和布局
        jf.pack();
        // 设置窗口相对于指定组件的位置
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
        
        jf.setResizable(true);// 设置窗口尺寸是否固定不变
        
		
		
	}
    private static JTabbedPane buildJTabbedPane(JPanel task1, JPanel task2, JPanel task3, JPanel task4) {
    	JTabbedPane tabbedPane = new JTabbedPane();
    	tabbedPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        tabbedPane.add("修改数据", task1);
        tabbedPane.add("数据插入", task2);
        tabbedPane.add("数据查询", task3);
        tabbedPane.add("数据删除", task4);
        addCompent1(task1);
        addCompent2(task2);
        addCompent3(task3);
        addCompent4(task4);
    	
    	return tabbedPane; 
    }
    
    private static void addCompent1(JPanel task1){

		
		task1.setOpaque(false);
		task1.setLayout(null);
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
        task1.add(p1);
        task1.add(p2);
		task1.add(p3);
		task1.add(p4);
		task1.add(p5);
		task1.add(p6);
		
    }
    
    private static void addCompent2(JPanel task2){
    	task2.setOpaque(false);
		task2.setLayout(null);
		JPanel p1 = new JPanel();    
        final JPanel p2 = new JPanel();  
        JPanel p3 = new JPanel();  
        JPanel p4 = new JPanel();    
        JPanel p5 = new JPanel();    
        JPanel p6 = new JPanel(); 
        JPanel p7 = new JPanel(); 
        JPanel p8 = new JPanel(); 
        JPanel p9 = new JPanel();
        JLabel l1 = new JLabel("结构化数据插入");
        Font font = new Font("宋体", Font.BOLD, 25);
		l1.setFont(font);
        p1.add(l1);
		
		JLabel l2 = new JLabel("属性1");
		final JTextField t1 = new JTextField("", 20);
		
		p2.add(l2);
		p2.add(t1);
		
		
		JLabel l3 = new JLabel("属性2");
		final JTextField t2 = new JTextField("", 20);
		
		p3.add(l3);
		p3.add(t2);
		
		
		JLabel l4 = new JLabel("属性3");
		final JTextField t3 = new JTextField("", 20);
		p4.add(l4);
		p4.add(t3);
		
		JLabel l5 = new JLabel("属性4");
		final JTextField t4 = new JTextField("", 20);	
		p5.add(l5);
		p5.add(t4);
	
		JButton btn1 = new JButton("保存");
		JButton btn2 = new JButton("清空");
		
		btn1.addActionListener(new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
				//保存功能的实现，上传到某表格中
				String pro1 = t1.getText();
				String pro2 = t2.getText();
				String pro3 = t3.getText();
				String pro4 = t4.getText();
				
				boolean is_sussess = false;//是否保存成功的状态
				/*需要添加后端代码，并改变保存成功的状态
				 * 
				 * 
				 * */
				if(is_sussess == true)
					JOptionPane.showMessageDialog(p2, "数据插入成功\n", "成功",JOptionPane.INFORMATION_MESSAGE);
				else{
					JOptionPane.showMessageDialog(p2,"数据插入失败\n","失败",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btn2.addActionListener(new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
				//清空
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");	
			}
		});

		p6.add(btn1);
		p6.add(btn2);
		
		p9.setBounds(0, 0, 480, 20);
		p1.setBounds(0, 20, 380, 60);
		p2.setBounds(0, 80, 480, 40);
		p3.setBounds(0, 120, 480, 40);
		p4.setBounds(0, 160, 480, 40);
		p5.setBounds(0, 200, 480, 40);
		p6.setBounds(0, 240, 480, 40);
		p7.setBounds(380, 20, 80, 60);
		p8.setBounds(0, 280, 480, 400);
		task2.add(p1);
		task2.add(p2);
		task2.add(p3);
		task2.add(p4);
		task2.add(p5);
		task2.add(p6);
		task2.add(p7);
		task2.add(p8);
		task2.add(p9);
    }
    
    private static void addCompent3(JPanel task3){
    	
    	task3.setOpaque(false);
		task3.setLayout(null);
    	JPanel p1 = new JPanel();    
        JPanel p2 = new JPanel();  
        JPanel p3 = new JPanel(); 
        JPanel p4 = new JPanel(); 
        JPanel p5 = new JPanel(); 
        
        JLabel l1 = new JLabel("输入表名");
        final JTextField t1 = new JTextField("", 20);
        JComboBox c1 = new JComboBox();
        c1.addItem("主键");      
        c1.addItem("属性1");
        c1.addItem("属性2");
        c1.addItem("属性3");
        p1.add(l1);
        p1.add(t1);
        p1.add(c1);
        
        JLabel l2 = new JLabel("输入属性");
        final JTextField t2 = new JTextField("", 20);
        p3.add(l2);
        p3.add(t2);
        final JButton btn1 = new JButton("查询");
        p3.add(btn1);
        
        final JTextArea ta = new JTextArea("查询结果:\n", 25, 37);
        p4.add(ta);
        
        btn1.addActionListener(new AbstractAction(){
        	@Override
			public void actionPerformed(ActionEvent e) {
        		
        		String tablename = t1.getText();//表名
        		String pro = t2.getText();//属性
        		String res = "";//结果
        		/*后端获取查询结果
        		 * 
        		 *
        		 * 查询有效才显示
        		*/
        		ta.append(tablename+":"+pro+":"+res+"\n");//将结果追加在文本框中
        		
        	}
        });
        	
        p1.setBounds(0, 20, 480, 40);
        p2.setBounds(0, 0, 480, 20);
		p3.setBounds(0, 60, 480, 40);
		p4.setBounds(0, 100, 460, 400);
		
        task3.add(p1);
        task3.add(p2);
        task3.add(p3);
        task3.add(p4);
    
    }
    
    private static void addCompent4(JPanel task4){
    	
        
		task4.setOpaque(false);
		task4.setLayout(null);
    	final JPanel p1 = new JPanel();    
        JPanel p2 = new JPanel(); 
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel(); 
        JPanel p5 = new JPanel();
        JPanel p6 = new JPanel(); 
		
        JLabel l1 = new JLabel("删除数据");
		Font font = new Font("宋体", Font.BOLD, 25);
		l1.setFont(font);
		p1.add(l1);
		
		JLabel l2 = new JLabel("输入主键    ");
		JLabel l3 = new JLabel("选择属性    ");
//		JLabel l4 = new JLabel("输入修改值 ");
		final JTextField t1 = new JTextField("", 14);
		final JComboBox c1 = new JComboBox();     
		c1.addItem("所有属性                               ");
        c1.addItem("属性1                                ");
        c1.addItem("属性2                                ");
        c1.addItem("属性3                                ");
        c1.addItem("属性4                                ");
//		final JTextField t2 = new JTextField("", 14);
		final JButton btn1 = new JButton("修改");
		
		
		btn1.addActionListener(new AbstractAction(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String key = t1.getText();
				String arr = (String) c1.getSelectedItem();//选择的属性
//				String value = t2.getText();//待修改的值
				Boolean is_success = false;
				/*修改按钮的后端代码
				 * 
				 * 
				 * 
				 * 
				 * */
				if(is_success == true)
					JOptionPane.showMessageDialog(p1, "记录删除成功\n", "成功",JOptionPane.INFORMATION_MESSAGE);
				else{
					JOptionPane.showMessageDialog(p1,"记录删除失败\n","失败",JOptionPane.ERROR_MESSAGE);
				}
       	}
        });
		
		
		p1.add(l1);
		p2.add(l2);
		p2.add(t1);
		p4.add(l3);
		p4.add(c1);
//		p5.add(l4);
//		p5.add(t2);
		p6.add(btn1);
		
		
		p3.setBounds(0, 0, 480, 20);
        p1.setBounds(0, 20, 480, 60);
        p2.setBounds(0, 80, 480, 40);
        p4.setBounds(0, 120, 480, 40);
        p5.setBounds(0, 160, 480, 40);
        p6.setBounds(0, 200, 480, 300);
        task4.add(p1);
        task4.add(p2);
        task4.add(p3);
        task4.add(p4);
        task4.add(p5);
        task4.add(p6);
    }
    
    public static void main(String[] args) {
    	
    	TabDemo demo = new TabDemo();
    	display();
    }
}
