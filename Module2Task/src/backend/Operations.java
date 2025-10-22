package backend;

import java.util.List;

public interface Operations {
      void insertData(EmpPojo emp);
      void updateData(EmpPojo emp);
      void deleteData(EmpPojo emp);
      List<EmpPojo> show();
}
