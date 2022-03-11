package com.csu.UI;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;


public class TabDemo2 {
	
	public static void display(){
		
		JFrame jf = new JFrame("非结构化数据管理");
		
		JPanel task1 = new JPanel();
        JPanel task2 = new JPanel();
        JPanel task3 = new JPanel();
       
    	JTabbedPane tabbedPane = buildJTabbedPane(task1, task2, task3);
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
    private static JTabbedPane buildJTabbedPane(JPanel task1, JPanel task2, JPanel task3) {
    	JTabbedPane tabbedPane = new JTabbedPane();
    	tabbedPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));        
        tabbedPane.add("数据插入", task1);
        tabbedPane.add("数据查询", task2);
        tabbedPane.add("数据删除", task3);
        addCompent1(task1);
        addCompent2(task2);
        addCompent3(task3);
    	
    	return tabbedPane; 
    }
    
    private static void addCompent1(JPanel task1){
    	
    	task1.setOpaque(false);
		task1.setLayout(null);
    	JPanel p1 = new JPanel();    
        JPanel p2 = new JPanel();  
        final JPanel p3 = new JPanel();    
        final JPanel p4 = new JPanel();
        final JPanel p5 = new JPanel();    
        final JPanel p6 = new JPanel();  
        final JPanel p7 = new JPanel();    
        final JPanel p8 = new JPanel();
        final JPanel p9 = new JPanel();    
     
        
        JLabel l1 = new JLabel("上传单条记录                   ");
        Font font = new Font("宋体", Font.BOLD, 25);
		l1.setFont(font);
        final JTextField t1 = new JTextField("", 26);
        JLabel l2 = new JLabel("   输入患者id    ");
        
        final JButton btn7 = new JButton("选择文件");
        final JTextField t2 = new JTextField("", 16);
        final JButton btn1 = new JButton("上传诊断报告");
        
        final JButton btn8 = new JButton("选择文件");
        final JTextField t3 = new JTextField("", 16);
        final JButton btn2 = new JButton(" 上传CT图像  ");
        
        final JButton btn9 = new JButton("选择文件");
        final JTextField t4 = new JTextField("", 16);
        final JButton btn3 = new JButton("上传眼底图像");
        p1.add(l1);
        p2.add(l2);
        p2.add(t1);
        
        p3.add(btn7);
        p3.add(t2);
        p3.add(btn1);
        
        p4.add(btn8);
        p4.add(t3);
        p4.add(btn2);
        
        p5.add(btn9);
        p5.add(t4);
        p5.add(btn3);
       
        
        JLabel l3 = new JLabel("批量上传");
		l3.setFont(font);
		JLabel l4 = new JLabel("文件格式必须按照id格式命名（例如：430426-111.jpg）");
		
		final JButton btn10 = new JButton("选择文件");
		final JTextField t5 = new JTextField("", 16);
		final JButton btn4 = new JButton("上传诊断报告");
        
		final JButton btn11 = new JButton("选择文件");
        final JTextField t6 = new JTextField("", 16);
        final JButton btn5 = new JButton(" 上传CT图像   ");
        
        final JButton btn12 = new JButton("选择文件");
        final JTextField t7 = new JTextField("", 16);
        final JButton btn6 = new JButton("上传眼底图像");
        p6.add(l3);
        p6.add(l4);
        p7.add(btn10);
        p7.add(t5);
        p7.add(btn4);
        p8.add(btn11);
        p8.add(t6);
        p8.add(btn5);
        p9.add(btn12);
        p9.add(t7);
        p9.add(btn6);
        
        btn1.addActionListener(new AbstractAction(){
        	@Override
			public void actionPerformed(ActionEvent e) {
        	    //获取id
        		String id = t1.getText();
        		String path = t2.getText(); 
        		boolean is_sussess = false;
				/*需要添加后端代码，上传诊断报告
				 * 
				 * 
				 * */
				if(is_sussess == true)
					JOptionPane.showMessageDialog(p3, "上传诊断报告成功\n", "成功",JOptionPane.INFORMATION_MESSAGE);
				else{
					JOptionPane.showMessageDialog(p3,"上传诊断报告失败\n","失败",JOptionPane.ERROR_MESSAGE);
				}
        		
        	}
        });
        btn2.addActionListener(new AbstractAction(){
        	@Override
			public void actionPerformed(ActionEvent e) {
        		String id = t1.getText();
        		String path = t3.getText(); 
        		boolean is_sussess = false;
				/*需要添加后端代码，删除文件
				 * 
				 * 
				 * */
				if(is_sussess == true)
					JOptionPane.showMessageDialog(p4, "上传CT图像成功\n", "成功",JOptionPane.INFORMATION_MESSAGE);
				else{
					JOptionPane.showMessageDialog(p4,"上传CT图像失败\n","失败",JOptionPane.ERROR_MESSAGE);
				}
        		
        	}
        });
        btn3.addActionListener(new AbstractAction(){
        	@Override
			public void actionPerformed(ActionEvent e) {
        		String id = t1.getText();
        		String path = t3.getText(); 
        		boolean is_sussess = false;
				/*需要添加后端代码，上传眼底图像
				 * 
				 * 
				 * */
				if(is_sussess == true)
					JOptionPane.showMessageDialog(p5, "上传眼底图像成功\n", "成功",JOptionPane.INFORMATION_MESSAGE);
				else{
					JOptionPane.showMessageDialog(p5,"上传眼底图像失败\n","失败",JOptionPane.ERROR_MESSAGE);
				}
        	}
        });
        btn4.addActionListener(new AbstractAction(){
        	@Override
			public void actionPerformed(ActionEvent e) {
        		String path = t4.getText(); 
        		boolean is_sussess = false;
				/*需要添加后端代码，上传诊断报告
				 * 
				 * 
				 * */
				if(is_sussess == true)
					JOptionPane.showMessageDialog(p7, "上传诊断报告成功\n", "成功",JOptionPane.INFORMATION_MESSAGE);
				else{
					JOptionPane.showMessageDialog(p7,"上传诊断报告失败\n","失败",JOptionPane.ERROR_MESSAGE);
				}
        		
        	}
        });
        btn5.addActionListener(new AbstractAction(){
        	@Override
			public void actionPerformed(ActionEvent e) {
        		String path = t5.getText(); 
        		boolean is_sussess = false;
				/*需要添加后端代码，上传CT图像
				 * 
				 * 
				 * */
				if(is_sussess == true)
					JOptionPane.showMessageDialog(p8, "上传CT图像成功\n", "成功",JOptionPane.INFORMATION_MESSAGE);
				else{
					JOptionPane.showMessageDialog(p8,"上传CT图像失败\n","失败",JOptionPane.ERROR_MESSAGE);
				}
        		
        	}
        });
        btn6.addActionListener(new AbstractAction(){
        	@Override
			public void actionPerformed(ActionEvent e) {
        		String path = t6.getText();
        		boolean is_sussess = false;
				/*需要添加后端代码，删除文件
				 * 
				 * 
				 * */
				if(is_sussess == true)
					JOptionPane.showMessageDialog(p9, "上传眼底图像成功\n", "成功",JOptionPane.INFORMATION_MESSAGE);
				else{
					JOptionPane.showMessageDialog(p9,"上传眼底图像失败\n","失败",JOptionPane.ERROR_MESSAGE);
				}
        	}
        });
        
        btn7.addActionListener(new AbstractAction(){
        	@Override
			public void actionPerformed(ActionEvent e) {
        		JFileChooser chooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("文件", "csv","txt","doc");
				chooser.setFileFilter(filter);
	             if (chooser.showOpenDialog(btn7)==JFileChooser.APPROVE_OPTION) {
	                
	            	File file = chooser.getSelectedFile();//文件名称
	            	String file_name = file.getPath();
	            	t2.setText(file_name);
	             }
        	}
        });
        
        btn8.addActionListener(new AbstractAction(){
        	@Override
			public void actionPerformed(ActionEvent e) {
        		JFileChooser chooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("文件", "csv","txt","doc");
				chooser.setFileFilter(filter);
	             if (chooser.showOpenDialog(btn8)==JFileChooser.APPROVE_OPTION) {
	                
	            	File file = chooser.getSelectedFile();//文件名称
	            	String file_name = file.getPath();
	            	t3.setText(file_name);
	             }
        	}
        });
        
        btn9.addActionListener(new AbstractAction(){
        	@Override
			public void actionPerformed(ActionEvent e) {
        		JFileChooser chooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("文件", "csv","txt","doc");
				chooser.setFileFilter(filter);
	             if (chooser.showOpenDialog(btn9)==JFileChooser.APPROVE_OPTION) {
	                
	            	File file = chooser.getSelectedFile();//文件名称
	            	String file_name = file.getPath();
	            	t4.setText(file_name);
	             }
        	}
        });
        
        btn10.addActionListener(new AbstractAction(){
        	@Override
			public void actionPerformed(ActionEvent e) {
        
        		JFileChooser chooser = new JFileChooser();
				chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				chooser.setDialogTitle("选择文件");
				if (chooser.showOpenDialog(btn10)==JFileChooser.APPROVE_OPTION) {   
	            	File file = chooser.getSelectedFile();
	            	String path = file.getPath();
	            	t5.setText(path);
	             }
        	}
        });
        
        btn11.addActionListener(new AbstractAction(){
        	@Override
			public void actionPerformed(ActionEvent e) {
        
        		JFileChooser chooser = new JFileChooser();
				chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				chooser.setDialogTitle("选择文件");
				if (chooser.showOpenDialog(btn11)==JFileChooser.APPROVE_OPTION) {   
	            	File file = chooser.getSelectedFile();
	            	String path = file.getPath();
	            	t6.setText(path);
	             }
        	}
        });
        
        
        btn12.addActionListener(new AbstractAction(){
        	@Override
			public void actionPerformed(ActionEvent e) {
        
        		JFileChooser chooser = new JFileChooser();
				chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				chooser.setDialogTitle("选择文件");
				if (chooser.showOpenDialog(btn12)==JFileChooser.APPROVE_OPTION) {   
	            	File file = chooser.getSelectedFile();
	            	String path = file.getPath();
	            	t7.setText(path);
	             }
        	}
        });
        
        
        
        p1.setBounds(0, 0, 480, 40);
        p2.setBounds(0, 40, 480, 40);
        p3.setBounds(0, 80, 480, 40);
        p4.setBounds(0, 120, 480, 40);
        p5.setBounds(0, 160, 480, 60);
        p6.setBounds(0, 220, 480, 40);
        p7.setBounds(0, 260, 480, 40);
        p8.setBounds(0, 300, 480, 40);
        p9.setBounds(0, 340, 480, 160);
    	
		task1.add(p1);
		task1.add(p2);
		task1.add(p3);
		task1.add(p4);
		task1.add(p5);
		task1.add(p6);
		task1.add(p7);
		task1.add(p8);
		task1.add(p9);
		
    }
    
    private static void addCompent2(JPanel task2){
    	task2.setOpaque(false);
		task2.setLayout(null);
		JPanel p1 = new JPanel();    
        JPanel p2 = new JPanel();  
        final JPanel p3 = new JPanel();  
        JPanel p4 = new JPanel();    
        JPanel p5 = new JPanel();    
        
        
        JLabel l1 = new JLabel("输入患者id                ");
        final JTextField t1 = new JTextField("", 20);
        JLabel l2 = new JLabel("查询类型                    ");
        
        final JComboBox c1 = new JComboBox(); 
        c1.addItem("眼底图像                                               ");      
        c1.addItem("OCT图像                                                ");
        c1.addItem("诊断报告                                              ");
        //JLabel l3 = new JLabel("输入保存地址");
        final JButton btn2 = new JButton("选择保存地址");
        final JTextField t3 = new JTextField("", 20);
        btn2.addActionListener(new AbstractAction(){
        	@Override
			public void actionPerformed(ActionEvent e) {
        		//下载数据
        		String path = "";
        		
        		JFileChooser chooser = new JFileChooser();
				chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				chooser.setDialogTitle("选择数据存储的位置");
				if (chooser.showOpenDialog(btn2)==JFileChooser.APPROVE_OPTION) {   
	            	File file = chooser.getSelectedFile();
	            	path = file.getPath();
	            	t3.setText(path);
	             }
        	}
        });
        
        JButton btn1 = new JButton("下载数据");
        btn1.addActionListener(new AbstractAction(){
        	@Override
			public void actionPerformed(ActionEvent e) {
        		//下载数据
        		String id = t1.getText();
        		String type = (String) c1.getSelectedItem();
        		String path = t3.getText();
        		
        		boolean is_sussess = false;
				/*需要添加后端代码，下载数据
				 * 
				 * 
				 * */
				if(is_sussess == true)
					JOptionPane.showMessageDialog(p3, "数据下载成功\n", "成功",JOptionPane.INFORMATION_MESSAGE);
				else{
					JOptionPane.showMessageDialog(p3,"数据下载失败\n","失败",JOptionPane.ERROR_MESSAGE);
				}
        	}
        });
        p1.add(l1);
        p1.add(t1);
        p2.add(l2);
        p2.add(c1);
        p3.add(btn2);
        p3.add(t3);
        p4.add(btn1);
		
        p5.setBounds(0, 0, 480, 20);
		p1.setBounds(0, 20, 480, 40);
		p2.setBounds(0, 60, 480, 40);
		p3.setBounds(0, 100, 480, 40);
		p4.setBounds(0, 140, 480, 400);
		
		task2.add(p5);
		task2.add(p1);
		task2.add(p2);
		task2.add(p3);
		task2.add(p4);
    }
    
    private static void addCompent3(JPanel task3){
    	
    	task3.setOpaque(false);
		task3.setLayout(null);
    	JPanel p1 = new JPanel();    
        JPanel p2 = new JPanel();  
        final JPanel p3 = new JPanel(); 
        JPanel p4 = new JPanel(); 
        JPanel p5 = new JPanel(); 
        
        JLabel l1 = new JLabel("输入主键              ");
        final JTextField t1 = new JTextField("", 17);
        JLabel l2 = new JLabel("删除类型              ");
        final JComboBox c1 = new JComboBox(); 
        c1.addItem("眼底图像                                    ");      
        c1.addItem("OCT图像                                      ");
        c1.addItem("诊断报告                                    ");
        JButton btn = new JButton("  删除文件  ");
        p1.add(l1);
        p1.add(t1);
        p2.add(l2);
        p2.add(c1);
        p3.add(btn);
        btn.addActionListener(new AbstractAction(){
        	@Override
			public void actionPerformed(ActionEvent e) {
        		
        		String key = t1.getText();
        		String type = (String) c1.getSelectedItem();
        		//调用后端代码删除文件
        		
        		boolean is_sussess = false;
				/*需要添加后端代码，删除文件
				 * 
				 * 
				 * */
				if(is_sussess == true)
					JOptionPane.showMessageDialog(p3, "文件删除成功\n", "成功",JOptionPane.INFORMATION_MESSAGE);
				else{
					JOptionPane.showMessageDialog(p3,"文件删除失败\n","失败",JOptionPane.ERROR_MESSAGE);
				}
        		
        	}
        });
        
        p5.setBounds(0, 0, 480, 20);
        p1.setBounds(0, 20, 480, 40);        
		p2.setBounds(0, 60, 480, 40);
		p3.setBounds(0, 100, 480, 40);
		p4.setBounds(0, 140, 480, 360);
		
		task3.add(p5);
        task3.add(p1);
        task3.add(p2);
        task3.add(p3);
        task3.add(p4);
    }
    
   
    
    public static void main(String[] args) {
    	
    	TabDemo2 demo = new TabDemo2();
    	display();
    }
}

