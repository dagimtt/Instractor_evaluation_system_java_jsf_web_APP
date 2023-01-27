
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class stdListBean {
    public List<stdList>list;  
public List<stdList>getlist() throws ClassNotFoundException{
    list=new ArrayList<>();
 
    try {
      
      Statement st;
      DBConnection obj = new DBConnection();
       Connection conn = obj.connMethod();
        st=conn.createStatement();
        ResultSet rs=st.executeQuery("select * from DATA1");
        while(rs.next()){
        String var1=rs.getString("STUDENT_ID");
        String var2=rs.getString("NAME");
        String var3=rs.getString("DEPARTMENT");
  
      
      list.add(new stdList(var1,var2,var3));
 }
        
    } catch (SQLException ex) { 
   
    }
    return list;
}

 
}
