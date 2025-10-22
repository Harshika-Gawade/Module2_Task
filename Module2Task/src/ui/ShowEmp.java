package ui;

import java.awt.FlowLayout;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import backend.EmpPojo;
import backend.OperationsImp;

public class ShowEmp extends JFrame {
	JTable table;
	JScrollPane pane;
   public ShowEmp() {
	   setLayout(new FlowLayout());
	   setSize(500,500);
	   setVisible(true);
	   OperationsImp db=new OperationsImp();
	   List<EmpPojo> list=db.show();
	   Iterator<EmpPojo> iterator=list.iterator();
	   String[][] data = new String[list.size()][2];
	   int i = 0;
       while (iterator.hasNext()) {
           EmpPojo emp = iterator.next();
           data[i][0] = String.valueOf(emp.getEmpId());
           data[i][1] = emp.getEmpName();
           i++;
       }

	   String columns[]= {"ID","Name"};
       table =new JTable(data,columns);
      pane=new JScrollPane(table);
      add(pane);
	   
	   
}
   
}
 
