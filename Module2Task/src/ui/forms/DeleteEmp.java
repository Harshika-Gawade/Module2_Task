package ui.forms;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import backend.EmpPojo;
import backend.OperationsImp;

public class DeleteEmp extends JFrame{
	JLabel label1;
	JTextField field1;
	JButton button1,button2;
    public DeleteEmp() {
       setLayout(new FlowLayout());
 	   setSize(500,500);
 	   setVisible(true);
 	   label1=new JLabel("Id : ");
 	   field1=new JTextField(20);
 	   button1=new JButton("Submit");
 	   button1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			EmpPojo emp=new EmpPojo();
			int id=Integer.parseInt(field1.getText());
			emp.setEmpId(id);
			OperationsImp db=new OperationsImp();
			db.deleteData(emp);
			
		}
	});
 	   button2=new JButton("Reset");
 	   add(label1);
 	   add(field1);
 	   add(button1);
 	   add(button2);}
}
