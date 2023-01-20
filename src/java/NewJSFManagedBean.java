/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class NewJSFManagedBean {

    String iname;
    String idep;
    String email;
    String sub;

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    public String getIdep() {
        return idep;
    }

    public void setIdep(String idep) {
        this.idep = idep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }
     private String instractor;
    List<String> instractorList;

    public String getInstractor() {
        return instractor;
    }

    public void setInstractor(String instractor) {
        this.instractor = instractor;
    }

    public List<String> getInstractorList() {
        return instractorList;
    }

    public void setInstractorList(List<String> instractorList) {
        this.instractorList = instractorList;
    }
    public NewJSFManagedBean() {
        
       instractorList = new ArrayList<>();
       
       instractorList.add("mr x");
       instractorList.add("mr y");
       
       
    }
    
    
    
    public void toInsert(){
        try{
        
            DBConnection db = new DBConnection();
              Connection con = db.connMethod();
              String sql1 = "Insert into INSTRACTOR(E_MAIL,NAME,DEPARTMENT,SUBJECT) values(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql1);
            ps.setString(1, email);
            ps.setString(2, iname);
            ps.setString(3, idep);
             ps.setString(4, sub);
            ps.executeUpdate();
           
        } catch (ClassNotFoundException | SQLException e) {
        }
    }
}
