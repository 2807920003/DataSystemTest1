package com.csu.UI;
import com.csu.service.TableData;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;




import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.TableModel;

public class panelTest extends JFrame{

	public String tablename;
	public int tableRowCount;
	DefaultTableModel dtm;
	List editRow=new ArrayList();
	List editColumn=new ArrayList();



	//定义组件
	JPanel jp1,jp3;
	JLabel lbl;
	JTextField jtf;
	JButton jbt1,jbt2,jbt3,jbt4,jbt5;
	//窗口中添加表格
	JTable table=new JTable();
	JScrollPane jsp;


	
	public static void main(String[] args) {
		panelTest dm=new panelTest("Basic_infor");


	}
 	
	
	
	//构造函数
	public panelTest(String tablen)
	{

		this.tablename=tablen;
		//创建组件
		//面板组件JPanel布局模式默认的是流式布局FlowLayout
		jp1=new JPanel();
		jp3=new JPanel();
		
		jbt1=new JButton("数据查询");
		jbt2=new JButton("数据插入");
		jbt3=new JButton("删除数据");
		jbt4=new JButton("修改数据");
		jbt5=new JButton("返回");
		jtf = new JTextField(10);
		lbl = new JLabel("输入病人病历号查询记：");
		
		//设置布局，JPanel默认布局FlowLayout,本案例运用到的刚好是流式布局，所以不用设置了
		//把组件添加JPanel
		//上    查询面板
		jp1.add(lbl);
		jp1.add(jtf);
		jp1.add(jbt1);
		this.add(jp1,BorderLayout.NORTH);

        //创建table

		try {
			dtm = new DefaultTableModel(TableData.getAllData(tablename),TableData.getColumns(tablename));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		table.setModel(dtm);
		tableRowCount=dtm.getRowCount();
		//System.out.println(dtm.getRowCount());
		//System.out.println(dtm.getValueAt(0,0));

		jsp = new JScrollPane(table);
		//添加空行
		addNullRow(5);

		//System.out.println(dtm.getRowCount());


//		//中  查询表格
//		DefaultTableModel dtm = new DefaultTableModel();
//		table.setModel(dtm);
//
//		dtm.addColumn("MR_No");
//		dtm.addColumn("P_Name");
//		dtm.addColumn("ID_Card_No");
//		dtm.addColumn("Sex");
//		dtm.addColumn("Age");
//		dtm.addColumn("Ph_No");
//		dtm.addColumn("Nation");
//		dtm.addColumn("Address");
//		dtm.addColumn("Marriage");
//
//		//添加数据---list--为List数组用于储存Score数据
//		for (int i = 0; i < list.size(); i++) {
//					Vector<Object> data = new Vector<Object>();
//					data.add(list.get(i).getMR_No());
//					data.add(list.get(i).getP_Name());
//					data.add(list.get(i).getID_Card_No());
//					data.add(list.get(i).getSex());
//					data.add(list.get(i).getAge());
//					data.add(list.get(i).getPh_No());
//					data.add(list.get(i).getNation());
//					data.add(list.get(i).getAddress());
//					data.add(list.get(i).getMarriage());
//
//					dtm.addRow(data);
//				}
//				//添加空表格
//		for (int i = 0; i < list.size(); i++) {
//					Vector<Object> data = new Vector<Object>();
//					data.add(null);
//					data.add(null);
//					data.add(null);
//					data.add(null);
//					data.add(null);
//					data.add(null);
//					data.add(null);
//					data.add(null);
//					data.add(null);
//
//					dtm.addRow(data);
//				}

		//放入中部
		this.add(jsp,BorderLayout.CENTER);
		//下 增删改查面板
		jp3.add(jbt2);
		jp3.add(jbt3);
		jp3.add(jbt4);
		jp3.add(jbt5);
		this.add(jp3,BorderLayout.SOUTH);
		this.setVisible(true);
		
		jp1.add(jbt1);
		jp1.add(jbt2);
		jp3.add(jbt3);
		jp3.add(jbt4);
		jp3.add(jbt5);
		
		
		//设置窗口属性
		
		this.setTitle("查询");
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

		final TableModelListener listener=new TableModelListener() {
			@Override
			public void tableChanged(TableModelEvent e) {
				System.out.println(e.getSource());
				int row=e.getFirstRow();
				//System.out.println(row);
				editRow.add(row);
			}
		};
		dtm.addTableModelListener(listener);
//
//		table.addMouseListener(new MouseListener() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				if(e.getClickCount()==2){
//					System.out.println(table.getEditingRow());
//					editRow.add(table.getEditingRow());
//					//editColumn.add(table.getEditingColumn());
//				}
//			}
//
//			@Override
//			public void mousePressed(MouseEvent e) {
//
//			}
//
//			@Override
//			public void mouseReleased(MouseEvent e) {
//
//			}
//
//			@Override
//			public void mouseEntered(MouseEvent e) {
//
//			}
//
//			@Override
//			public void mouseExited(MouseEvent e) {
//
//			}
//		});
		
		//添加按钮---鼠标点击不在输入框方可添加
				jbt2.addActionListener(new ActionListener() {
						
					public void actionPerformed(ActionEvent arg0) {
						int i=tableRowCount;
						for(;;i++){
							if(dtm.getRowCount()==i)
								break;
							else {
								int j=0;
								for(;j<dtm.getColumnCount();j++){
									if(dtm.getValueAt(i,j)!=null)
										break;
								}
								if(j==dtm.getColumnCount())
									break;;
							}
						}
//						while (dtm.getColumnCount()!=i && dtm.getValueAt(i,0)!=null){
//							System.out.println(i);
//							i++;
//						}
						Object [][] objects=new Object[i-tableRowCount][dtm.getColumnCount()];
						for(int j=tableRowCount;j<i;j++){
							for(int k=0;k< dtm.getColumnCount();k++){
								objects[j-tableRowCount][k]=dtm.getValueAt(j,k);
							}
						}
						List error = null;
						error=TableData.addData(objects,tablename);
						if(error.size()==0){
							JOptionPane.showMessageDialog(null,"添加成功");
						}
						else {
							String dialog = "";
							for(int j=0;j<error.size();j++){
								int r=(int)error.get(j)+tableRowCount;
								dialog+=r+" ";
								dtm.removeRow(r);

							}
							JOptionPane.showMessageDialog(null,"第"+dialog+"行数据添加错误");
						}
						tableRowCount=i-(int)error.size();

						//addNullRow(3);
//						List list=new ArrayList<>();
//						while (dtm.getValueAt(i,0)!=null){
//							Object[] objects=new Object[dtm.getColumnCount()];
//							for(int j=0;j<objects.length;j++){
//								objects[j]=dtm.getValueAt(i,j);
//							}
//							list.add(objects);
//							i++;
//						}


//						int row = table.getSelectedRow();
//						String MR_No = (String)dtm.getValueAt(row, 0);
//						String P_Name = (String)dtm.getValueAt(row, 1);
//						String ID_Card_No = (String)dtm.getValueAt(row, 2);
//						String sex = (String)dtm.getValueAt(row, 3);
//						String age = (String)dtm.getValueAt(row, 4);
//						String Ph_No = (String)dtm.getValueAt(row, 5);
//						String nation = (String)dtm.getValueAt(row, 6);
//						String address = (String)dtm.getValueAt(row, 7);
//						String marriage = (String)dtm.getValueAt(row, 8);
						
						
					 //   String str = sd.Insert(MR_No,P_Name,ID_Card_No,sex,age,Ph_No,nation,address,marriage);
						//JOptionPane.showMessageDialog(null, str);
					}
				});
				
				//删除按钮
				jbt3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						int [] rows=table.getSelectedRows();
						//System.out.println(rows[0]+rows[1]);
						String [] pks=new String[rows.length];
						int columnCount=0;
						if(tablename.equals("CheckProj_Infor"))
						{
							columnCount=2;
						}
						for(int i=0;i<rows.length;i++){
							pks[i]=dtm.getValueAt(rows[i],columnCount).toString();
						}
						for(int i=rows.length-1;i>-1;i--){
							dtm.removeRow(rows[i]);
						}
						TableData.deleteData(pks,tablename,dtm.getColumnName(columnCount));
						JOptionPane.showMessageDialog(null,"删除成功");
						tableRowCount-=rows.length;

						//int row = table.getSelectedRow();
//						Object o = dtm.getValueAt(row, 0);
//						dtm.removeRow(row);
//						String str = sd.Del(row+1);
						//JOptionPane.showMessageDialog(null, str);
					}
				});
				
				//修改按钮
		        jbt4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						int row = table.getSelectedRow();
						Object [][] objects=new Object[editRow.size()][dtm.getColumnCount()];
						for(int i=0;i<editRow.size();i++){
							for(int j=0;j<dtm.getColumnCount();j++){
								objects[i][j]=dtm.getValueAt((Integer) editRow.get(i),j);
							}

						}
						List error=TableData.updateData(objects,tablename);
						if (error.size()==0){

							JOptionPane.showMessageDialog(null,"修改成功");
						}
						else {
							String dialog = "";
							for(int j=0;j<error.size();j++) {
								int r = (int) editRow.get((Integer) error.get(j));
								dialog += r + " ";
							}
							JOptionPane.showMessageDialog(null,"第"+dialog+"行数据修改失败");
							jbt5.doClick();
						}
						editRow.clear();



//						String MR_No = dtm.getValueAt(row, 0).toString();
//						String P_Name = (String)dtm.getValueAt(row, 1);
////						System.out.println(P_Name);
//						String ID_Card_No = (String)dtm.getValueAt(row, 2);
////						System.out.println(ID_Card_No);
//						String sex = dtm.getValueAt(row, 3).toString();
//						String age = dtm.getValueAt(row, 4).toString();
//						String Ph_No = dtm.getValueAt(row, 5).toString();
//						String nation = dtm.getValueAt(row, 6).toString();
//						String address = dtm.getValueAt(row, 7).toString();
//						String marriage = dtm.getValueAt(row, 8).toString();
								
												
				//		String str = sd.Update(MR_No, P_Name, ID_Card_No, sex,age,Ph_No,nation,address,marriage);
						
					//	JOptionPane.showMessageDialog(null, str);
					}
				});
		        //查询按钮
		        jbt1.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent arg0) {
						//删除原有数据--把查询所得数据重新加入
						String mrNo=jtf.getText();
						Object [][] objects=TableData.getDataById(mrNo,tablename);
						dtm.setRowCount(0);
						for(int i=0;i<objects.length;i++){
							dtm.addRow(objects[i]);
						}
//						String[] str = sd.Select(jtf.getText());//获取输入的id
//						dtm.setRowCount(0);
//						Vector<Object> data = new Vector<Object>();
//						data.add(str[0]);
//						data.add(str[1]);
//						data.add(str[2]);
//						data.add(str[3]);
//						data.add(str[4]);
//						data.add(str[5]);
//						data.add(str[6]);
//						data.add(str[7]);
//						data.add(str[8]);
//						dtm.addRow(data);
					}
				});
		        //返回按钮
			    jbt5.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent arg0) {
						dtm.removeTableModelListener(listener);
						dtm.setRowCount(0);
						Object[][] objects = new Object[0][];
						try {
							objects=TableData.getAllData(tablename);
						} catch (ClassNotFoundException e) {
							e.printStackTrace();
						}
						for(int i=0;i<objects.length;i++){
							dtm.addRow(objects[i]);
						}
						tableRowCount=dtm.getRowCount();
						addNullRow(3);
						editRow.clear();
						dtm.addTableModelListener(listener);
						System.out.println(editRow.size());
						//删除查询的数据重新加入所有数据
//						dtm.setRowCount(0);
//						for (int i = 0; i < list.size(); i++) {
//							Vector<Object> data = new Vector<Object>();
//							data.add(list.get(i).getMR_No());
//							data.add(list.get(i).getP_Name());
//							data.add(list.get(i).getID_Card_No());
//							data.add(list.get(i).getSex());
//							data.add(list.get(i).getAge());
//							data.add(list.get(i).getPh_No());
//							data.add(list.get(i).getNation());
//							data.add(list.get(i).getAddress());
//							data.add(list.get(i).getMarriage());
//							dtm.addRow(data);
					//	}
//						//for (int i = 0; i < list.size(); i++) {
//							Vector<Object> data = new Vector<Object>();
//							data.add(null);
//							data.add(null);
//							data.add(null);
//							data.add(null);
//							data.add(null);
//							data.add(null);
//							data.add(null);
//							data.add(null);
//							data.add(null);
//
//							dtm.addRow(data);
//						}
						
					}
				});
		
		
	}

	public  void addNullRow(int k){
		Object[] o=new Object[dtm.getColumnCount()];
		for(int i=0;i<k;i++){
			dtm.addRow(o);
		}
	}
}
