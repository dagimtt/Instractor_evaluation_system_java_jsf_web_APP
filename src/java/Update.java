
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AKAM
 */
@ManagedBean
public class Update {
    private String email;
       private String dep;
          private String subj;
           private String id;
       private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDp() {
        return dp;
    }

    public void setDp(String dp) {
        this.dp = dp;
    }
          private String dp;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getSubj() {
        return subj;
    }

    public void setSubj(String subj) {
        this.subj = subj;
    }
    
    
    
    
    
    public void upDate() throws ClassNotFoundException{
      try{
      
       DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();
      
          String sql = "UPDATE INSTRACTOR SET DEPARTMENT=?, SUBJECT=? WHERE E_MAIL=?";
           
             PreparedStatement ps = con.prepareStatement(sql);
 
           ps.setString(1, dep);     
                ps.setString(2, subj);
                  ps.setString(3, email);
                   
            ps.executeUpdate();
             FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Successfully updated",
                            ""));    
      }
      catch(SQLException e )
      
      {
      
      System.out.print(e);
      
      }
       
  }
     public void upDateStud() throws ClassNotFoundException{
      try{
      
       DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();
      
          String sql = "UPDATE DATA1 SET NAME=?, DEPARTMENT=? WHERE STUDENT_ID=?";
           
             PreparedStatement ps = con.prepareStatement(sql);
 
           ps.setString(1, name);     
                ps.setString(2, dp);
                  ps.setString(3,id);
                   
            ps.executeUpdate();
             FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Successfully updated",
                            ""));    
      }
      catch(SQLException e )
      
      {
      
      System.out.print(e);
      
      }
       
  }
}
