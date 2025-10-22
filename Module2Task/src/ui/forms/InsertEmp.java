package ui.forms;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import backend.EmpPojo;
import backend.GetConnection;
import backend.OperationsImp;

public class InsertEmp extends JFrame{
	JLabel label1,label2;
	JTextField field1,field2;
	JButton button1,button2;
    public InsertEmp() {
    	setLayout(new FlowLayout());
		setSize(500,500);
		setVisible(true);
		label1=new JLabel("Id : ");
		label2=new JLabel("Name :");
		field1=new JTextField(20);
		field2=new JTextField(20);
		button1=new JButton("Submit");
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				EmpPojo emp=new EmpPojo();
				int id=Integer.parseInt(field1.getText());
				emp.setEmpId(id);
				emp.setEmpName(field2.getText());
				OperationsImp db=new OperationsImp();
				db.insertData(emp);
				System.out.println("employee added");
			}
		});
		button2=new JButton("Reset");
		add(label1);
		add(field1);
		add(label2);
		add(field2);
	    add(button1);
	    add(button2);
    }
    public static void main(String[] args) {
		new InsertEmp();
	}
}
