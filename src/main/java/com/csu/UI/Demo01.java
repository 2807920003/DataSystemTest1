package com.csu.UI;

import com.csu.dao.UniversalDao;
import com.csu.service.DatabseData;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;



public class Demo01 extends JFrame{

	ArrayList<String> tableList =new ArrayList<>();
	int length=0;
	private DefaultTableModel dtm;
	private JTable table = new JTable();
	//构造函数
	public Demo01() {
		String url = "jdbc:sqlserver:// 8.tcp.ngrok.io:18290;DatabaseName=demo";
		 String user = "sa";
		 String password = "csu123456.";
		 
		 try {
			 // 连接数据库
			 conn = DriverManager.getConnection(url, user, password);
	         // 建立Statement对象
	         stmt = conn.createStatement();
	         System.out.println("数据库连接成功");
	    } catch (SQLException e) {
	            e.printStackTrace();
	            System.out.println("数据库连接失败");
	    }
		//
		 
		 
	}
	//获取数据库中的所有表名
//	public Infor findAllTables(){
//        try {
//            ResultSet resultSet = stmt.executeQuery("SELECT name FROM demo..sysobjects Where xtype='U' ORDER BY name");
//            while(resultSet.next()){//如果对象中有数据，就会循环打印出来
////                System.out.println(resultSet.getString("name"));
//                tableList.add(resultSet.getString("name"));
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        //统计所有表
//        length=tableList.size();
//        //删除系统表
//
//        tableList.remove(length-1);
//        length=length-1;
//        System.out.print(tableList);
//      	System.out.print(length);
//      	Infor groupInfor=new Infor(tableList, length);
//      	return groupInfor;
//    }
	public static void main(String[] args) {
		
//		 String url = "jdbc:sqlserver://43f53986v8.zicp.vip:15599;DatabaseName=demo";
//		 String user = "sa";
//		 String password = "csu123456.";
//
//		 try {
//			 // 连接数据库
//			 conn = DriverManager.getConnection(url, user, password);
//	         // 建立Statement对象
//	         stmt = conn.createStatement();
//	         System.out.print("数据库连接成功");
//	    } catch (SQLException e) {
//	            e.printStackTrace();
//	            System.out.println("数据库连接失败");
//	    }
      
		Demo01 d = new Demo01();
		//Infor in=d.findAllTables();
		d.display();

	}
		
//	public JTable createTable(Infor infor) {
//
//		Infor informInfor=infor;
//		int rows=informInfor.i;
//		ArrayList<String> tables=informInfor.arrayList;
//		JTable table = new JTable(rows,1);
//		String[] tableHeads = new String[]{"表单"};
//		DefaultTableModel dtm = (DefaultTableModel)table.getModel();
//		dtm.setColumnIdentifiers(tableHeads);
//		String[] dataStrings=new String[rows];
//
//		Vector vector=new Vector();
//		int count=0;
//		while(count<rows) {
//			vector.add(tables.get(count));
//			dataStrings[count] =tables.get(count);
//			count++;
//		}
////		System.out.println(vector);
//		dtm.addRow(dataStrings);
//		dtm.addRow(dataStrings);
//		dtm.addRow(dataStrings);
//		return table;
//	}
	private Object typeof(String[] arrString) {
		// TODO Auto-generated method stub
		return null;
	}
	//结构化数据管理界面1
	public void display() {
		//this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//		JFrame jf = new JFrame("结构化数据管理");
		
		setBounds(610, 310, 500, 450);
		JPanel J1=new JPanel();
		JPanel J2=new JPanel();
	      JLabel l1 = new JLabel("输入病历号查询");
	      final JTextField t1 = new JTextField("", 16);
		  final JButton btn1 = new JButton("查询");
		  final JButton btn2 = new JButton("导入新表");
		  final JButton btn3 = new JButton("删除表格");
//		JPanel task1 = new JPanel();
//		jf.add(task1);
		
//		Infor inform=information;
//		String[][] datas = new String[inform.arrayList.size()][1];
//		String temp=new String();
//
//		int i = inform.i;
////		System.out.print(i);
//		int count=0;
//		while(count<i) {
//			datas[count][0]=inform.arrayList.get(count);
//			count++;
//		}
//	      String[] titles = { "所有表单"};
//	      model = new DefaultTableModel(datas, titles) {
//	    	// 设置单元格不可编辑
//	    	    public boolean isCellEditable(int rowIndex, int ColIndex) {
//	    	        return false;
//	    	    }
//	      };
		  Object [] o={"所有表单"};
		  dtm=new DefaultTableModel(DatabseData.getAllTableName(),o){
			  public boolean isCellEditable(int rowIndex, int ColIndex) {
	    	        return false;
	    	    }
		  };
		  table.setModel(dtm);
//	      table = new JTable(DatabseData.getAllTableName(),o){
//			  public boolean isCellEditable(int rowIndex, int ColIndex) {
//	    	        return false;
//	    	    }
//		  };
	      JScrollPane sc = new JScrollPane(table);
	      setTitle("结构化数据");
	      add(J1,BorderLayout.NORTH);
	      //J1.add(l1);
	      //J1.add(t1);
	     // J1.add(btn1);
	      add(sc,BorderLayout.CENTER);
	      add(J2,BorderLayout.SOUTH);
	      J2.add(btn2);
	      J2.add(btn3);
	      setVisible(true);
			setResizable(true);
			table.addMouseListener(new MouseListener() {

				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					// 点击几次，这里是双击事件
			        if (e.getClickCount() == 2) {
			            int row = table.getSelectedRow();
			            //System.out.println(inform.arrayList.get(row));
//			            Demo06 demo6 = new Demo06(inform.arrayList.get(row));
//				    	demo6.display();
						System.out.println(table.getValueAt(row,0).toString());
						new panelTest(table.getValueAt(row,0).toString());

			        }

				}
			});
			btn1.addActionListener(new AbstractAction() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// 跳转到Demo02，查询结果页面
					String id = t1.getText();
					String[] arr = new String[]{" "," "," "," "};
					
					 String sql = "select * from Basic_Infor where MR_No="+id;
					 // 执行数据库查询语句
			         try {
						rs = stmt.executeQuery(sql);
						 while (rs.next()) {
				                String MR_No = rs.getString("MR_No");
				                String P_Name = rs.getString("P_Name");
				                String ID_Card_No = rs.getString("ID_Card_No");
				                String sex = rs.getString("sex");
				                String age = rs.getString("age");
				                String Ph_No = rs.getString("Ph_No");
				                String nation = rs.getString("nation");
				                String address = rs.getString("address");
				                String marriage = rs.getString("marriage");
				                arr[0] = MR_No+P_Name+ID_Card_No+sex+age+Ph_No+nation+address+marriage;
				                System.out.println("病历号 "+MR_No+" 姓名 "+P_Name+" 身份证号码 "+ID_Card_No+" 性别 "
				                +sex+" 年龄 "+age+" 身份证号码 "+Ph_No+" 国籍 "+nation+" 住址 "+address+" 婚姻 "+marriage);
				            }
				            if (rs != null) {
				                rs.close();
				                rs = null;
				            }
				            if (stmt != null) {
				                stmt.close();
				                stmt = null;
				            }
				            if (conn != null) {
				                conn.close();
				                conn = null;
				            }
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					Demo02 d2 = new Demo02();
					d2.display(id, arr);
				}
			});

			btn2.addActionListener(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 跳转到Demo04,导入新表
				Demo04 d4 = new Demo04();
				d4.display();
			}
		});
		btn3.addActionListener(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//删除表格
				int[] rows=table.getSelectedRows();
				String [] tableNames=new String[rows.length];
				for(int i=0;i<rows.length;i++){
					tableNames[i]= (String) table.getValueAt(rows[i],0);
				}
				DatabseData.dropTable(tableNames);
				JOptionPane.showMessageDialog(null,"删除成功");
				dtm.setRowCount(0);
				Object [][] objects=DatabseData.getAllTableName();
				for(int i=0;i<objects.length;i++){
					//System.out.println(objects[i]);
					dtm.addRow(objects[i]);
				}



//				// 跳转到Demo06，对应表查询
//				Demo06 demo6 = new Demo06();
//				demo6.display();
			}
		});
			this.addWindowListener(new WindowListener() {
				@Override
				public void windowOpened(WindowEvent e) {

				}

				@Override
				public void windowClosing(WindowEvent e) {
				//	System.out.println("asd");
					new Main().main_display();

				}

				@Override
				public void windowClosed(WindowEvent e) {

				}

				@Override
				public void windowIconified(WindowEvent e) {

				}

				@Override
				public void windowDeiconified(WindowEvent e) {

				}

				@Override
				public void windowActivated(WindowEvent e) {

				}

				@Override
				public void windowDeactivated(WindowEvent e) {

				}
			});


	}



	private static JPanel addCompent1(JPanel task2) {
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
		JPanel p10 = new JPanel();
		JPanel p11 = new JPanel();
		JPanel p12 = new JPanel();
		JPanel p13 = new JPanel();
		JLabel l1 = new JLabel("输入病人病历号查询记录");
		final JTextField t1 = new JTextField("", 16);
		final JButton btn1 = new JButton("查询");
		
		final JButton btn2 = new JButton("基本信息表");
		final JButton btn3 = new JButton("就诊记录表");
		final JButton btn4 = new JButton("检查记录表");
		final JButton btn5 = new JButton("血常规检查表");
		final JButton btn8 = new JButton("眼常规检查表");
		final JButton btn9 = new JButton("心血管常规检查表");
		final JButton btn10 = new JButton("影像数据表");
		final JButton btn11 = new JButton("影像智能诊断表");
		final JButton btn12 = new JButton("住院记录表");
		
		final JButton btn6 = new JButton("导入新表");
		final JButton btn7 = new JButton("删除表格");

		btn1.addActionListener(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 跳转到Demo02，查询结果页面
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
				
				
				 String sql = "select * from Basic_Infor where MR_No="+id;
				 // 执行数据库查询语句
		         try {
					rs = stmt.executeQuery(sql);
					 while (rs.next()) {
			                String MR_No = rs.getString("MR_No");
			                String P_Name = rs.getString("P_Name");
			                String ID_Card_No = rs.getString("ID_Card_No");
			                String sex = rs.getString("sex");
			                String age = rs.getString("age");
			                String Ph_No = rs.getString("Ph_No");
			                String nation = rs.getString("nation");
			                String address = rs.getString("address");
			                String marriage = rs.getString("marriage");
			                arr[0] = MR_No+P_Name+ID_Card_No+sex+age+Ph_No+nation+address+marriage;
			                System.out.println("病历号 "+MR_No+" 姓名 "+P_Name+" 身份证号码 "+ID_Card_No+" 性别 "
			                +sex+" 年龄 "+age+" 身份证号码 "+Ph_No+" 国籍 "+nation+" 住址 "+address+" 婚姻 "+marriage);
			            }
			            if (rs != null) {
			                rs.close();
			                rs = null;
			            }
			            if (stmt != null) {
			                stmt.close();
			                stmt = null;
			            }
			            if (conn != null) {
			                conn.close();
			                conn = null;
			            }
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        
				
				
				Demo02 d2 = new Demo02();
				d2.display(id, arr);
			}
		});
		
		btn2.addActionListener(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 跳转到Demo06，对应表查询
				Demo06 demo6 = new Demo06();
		    	demo6.display();
			}
		});
		btn3.addActionListener(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 跳转到Demo06，对应表查询
				Demo06 demo6 = new Demo06();
		    	demo6.display();
			}
		});
//		btn4.addActionListener(new AbstractAction() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// 跳转到Demo06，对应表查询
//				Demo06 demo6 = new Demo06();
//		    	demo6.display();
//			}
//		});
//		btn5.addActionListener(new AbstractAction() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// 跳转到Demo06，对应表查询
//				Demo06 demo6 = new Demo06();
//		    	demo6.display();
//			}
//		});
//		
		btn6.addActionListener(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 跳转到Demo04,导入新表
				Demo04 d4 = new Demo04();
				d4.display();
			}
		});
//		btn7.addActionListener(new AbstractAction() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// 跳转到Demo03，删除表格
//				Demo03 d3 = new Demo03();
//				d3.display();
//			}
//		});
//		
//		
//		btn8.addActionListener(new AbstractAction() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// 跳转到Demo06，对应表查询
//				Demo06 demo6 = new Demo06();
//		    	demo6.display();
//			}
//		});
//		btn9.addActionListener(new AbstractAction() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// 跳转到Demo06，对应表查询
//				Demo06 demo6 = new Demo06();
//		    	demo6.display();
//			}
//		});
//		btn10.addActionListener(new AbstractAction() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// 跳转到Demo06，对应表查询
//				Demo06 demo6 = new Demo06();
//		    	demo6.display();
//			}
//		});
//		btn11.addActionListener(new AbstractAction() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// 跳转到Demo06，对应表查询
//				Demo06 demo6 = new Demo06();
//		    	demo6.display();
//			}
//		});
//		btn12.addActionListener(new AbstractAction() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// 跳转到Demo06，对应表查询
//				Demo06 demo6 = new Demo06();
//		    	demo6.display();
//			}
//		});

		p2.add(l1);
		p2.add(t1);
		p2.add(btn1);
		p3.add(btn2);
		p4.add(btn3);
		p5.add(btn4);
		p6.add(btn5);
		p7.add(btn6);
		p8.add(btn7);
		p9.add(btn8);
		p10.add(btn9);
		p11.add(btn10);
		p12.add(btn11);
		p13.add(btn12);
		

		p1.setBounds(0, 0, 480, 40);
		
		p2.setBounds(0, 40, 480, 60);
		
		p3.setBounds(-80, 100, 480, 50);
		p4.setBounds(-80, 150, 480, 50);
		p5.setBounds(-80, 200, 480, 50);
		p6.setBounds(-80, 250, 480, 90);
		
		p7.setBounds(100, 350, 140, 200);
		p8.setBounds(240, 350, 140, 200);
		
		p9.setBounds(80, 100, 480, 50);
		p10.setBounds(80, 150, 480, 50);
		p11.setBounds(80, 200, 480, 50);
		p12.setBounds(80, 250, 480, 50);
		p13.setBounds(0, 300, 480, 50);

		task2.add(p1);
		task2.add(p2);
		task2.add(p3);
		task2.add(p4);
		task2.add(p5);
		task2.add(p6);
		task2.add(p7);
		task2.add(p8);
		task2.add(p9);
		task2.add(p10);
		task2.add(p11);
		task2.add(p12);
		task2.add(p13);
		
		return task2;
	}

	
	static Connection conn;
	static Statement stmt;
	static ResultSet rs;
	 
}
