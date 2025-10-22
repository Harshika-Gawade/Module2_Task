package backend;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OperationsImp  implements Operations{

	@Override
	public void insertData(EmpPojo emp) {
		try {
			PreparedStatement statement=GetConnection.getConnection().prepareStatement("insert into empData values(?,?)");
			statement.setInt(1, emp.getEmpId());
			statement.setString(2, emp.getEmpName());
			statement.executeUpdate();
			System.out.println("Employee Added Successfully");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Employee not added....");
		}
		
		
	}

	@Override
	public void updateData(EmpPojo emp) {
		try {
			PreparedStatement statement=GetConnection.getConnection().prepareStatement("update empData set name = ? where id = ?");
			statement.setString(1, emp.getEmpName());
			statement.setInt(2, emp.getEmpId());
			statement.executeUpdate();
			System.out.println("Employee Data Updated Successfully.... ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteData(EmpPojo emp) {
		try {
			PreparedStatement statement=GetConnection.getConnection().prepareStatement("delete from empData where id = ?");
			statement.setInt(1, emp.getEmpId());
			statement.executeUpdate();
			System.out.println("Employee Data Deleted Successfully.... ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<EmpPojo> show() {
		List<EmpPojo> empList = new ArrayList<EmpPojo>();
		try {
			ResultSet set=GetConnection.getConnection().prepareStatement("select * from empData ").executeQuery();
			while(set.next()) {
				System.out.println(set.getInt(1) + " : " + set.getString(2) );
				EmpPojo emp=new EmpPojo();
				emp.setEmpId(set.getInt(1));
				emp.setEmpName(set.getString(2));
				empList.add(emp);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		return empList;
		
	}

}
