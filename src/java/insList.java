
public class insList {
    private final String email;
    private final String name;
    private final String depar;
    private final String sub;

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getDepar() {
        return depar;
    }

    public String getSub() {
        return sub;
    }
    
    
    public insList(String email,String name,String depar,String sub){
        this.email = email;
         this.name =name;
          this.depar = depar;
          this.sub = sub;
    }
}
