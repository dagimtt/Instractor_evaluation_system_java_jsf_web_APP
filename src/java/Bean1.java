import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;  
import javax.faces.bean.RequestScoped;  
  
@ManagedBean
@RequestScoped  
public class Bean1 {
public List<ugeter>list;  
public List<ugeter>getlist() throws ClassNotFoundException{
    list=new ArrayList<>();
 
    try {
      
      Statement st;
      DBConnection obj = new DBConnection();
       Connection conn = obj.connMethod();
        st=conn.createStatement();
        ResultSet rs=st.executeQuery("select * from RATING");
        while(rs.next()){
        String var1=rs.getString("INSTRACTOR");
        String var2=rs.getString("STATEMENT_1");
         String var3 = rs.getString("RATE");
          String var4 = rs.getString("GR");
        
      
      list.add(new ugeter(var1,var2,var3,var4));
 }
        
    } catch (SQLException ex) { 
        Logger.getLogger(ugeter.class.getName()).log(Level.SEVERE, null, ex);
    }
    return list;
}
}