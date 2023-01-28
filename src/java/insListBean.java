
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class insListBean {
     public List<insList>list;  
public List<insList>getlist() throws ClassNotFoundException{
    list=new ArrayList<>();
 
    try {
      
      Statement st;
      DBConnection obj = new DBConnection();
       Connection conn = obj.connMethod();
        st=conn.createStatement();
        ResultSet rs=st.executeQuery("select * from INSTRACTOR");
        while(rs.next()){
        String var1=rs.getString("E_MAIL");
        String var2=rs.getString("NAME");
        String var3=rs.getString("DEPARTMENT");
        String var4=rs.getString("SUBJECT");
      list.add(new insList(var1,var2,var3,var4));
 }
        
    } catch (SQLException ex) { 
   
    }
    return list;
   
}




  
}

