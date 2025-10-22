package ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import ui.forms.DeleteEmp;
import ui.forms.InsertEmp;
import ui.forms.UpdateEmp;

public class Home extends JFrame{
	JMenuBar menuBar;
	JMenu menu1,menu2,menu3;
	JMenuItem item1,item2,item3,item4;
     public Home() {
    	 setLayout(new FlowLayout());
		 setSize(500,500);
		 setVisible(true);
		 menuBar=new JMenuBar();
		 menu1=new JMenu("Employee");
		 menu2=new JMenu("Manager");
		 menu3=new JMenu("HelpDesk");
		 item1=new JMenuItem("Add Employee");
		 item1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new InsertEmp();
				
			}
		});
		 item2=new JMenuItem("Update Data");
		 item2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new UpdateEmp();
				
			}
		});
		 item3=new JMenuItem("Delete Employee");
		 item3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new DeleteEmp();
				
			}
		});
		 item4=new JMenuItem("Show Employees");
		 item4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new ShowEmp();
				
			}
		});
		 menu1.add(item1);
		 menu1.add(item2);
		 menu1.add(item3);
		 menu1.add(item4);
		 menuBar.add(menu1);
		 menuBar.add(menu2);
		 menuBar.add(menu3);
		 setJMenuBar(menuBar);
		 
		 
		 
	}
     public static void main(String[] args) {
		new Home();
	}
}
