
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;


@ManagedBean
public class Addins {
   private String name;
   private String dep;
   private String mail;
    private String ub;
    public Addins(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUb() {
        return ub;
    }

    public void setUb(String ub) {
        this.ub = ub;
    }


    
    public void toInsert(){
        try{
        
            DBConnection db = new DBConnection();
            Connection con = db.connMethod();
            String sql = "Insert into INSTRACTOR(E_MAIL,NAME,DEPARTMENT,SUBJECT) values(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, mail);
            ps.setString(2, name);
            ps.setString(3, dep);
            ps.setString(4, ub);
            ps.executeUpdate();
             FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Successfully Inserted",
                            "")); 
        } catch (ClassNotFoundException | SQLException e) {
        }
    }
   
}
