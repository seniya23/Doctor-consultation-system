package Phase3;



import java.util.ArrayList;
import java.util.Comparator;

public class Person1 {

    private String id;
    private String f_name;
    private String s_name;
    private String dateBirth;
    private String mobnum;
    private String dspecialisation;
    private String dlnum;

    public static Comparator<Person1>PersonComparator=new Comparator<Person1>(){
       @Override
        public int compare(Person1 o1, Person1 o2) {
           String psurname1=o1.getS_name().toUpperCase();
           String psurname2=o2.getS_name().toUpperCase();
           return psurname1.compareTo(psurname2);
        }};
    
    @Override
    public String toString(){
        return id+" "+f_name+" "+s_name+" "+dateBirth+" "+mobnum+" "+dspecialisation+" "+dlnum;
        
    }
    
    public String getString(){
    return toString();
    
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getMobnum() {
        return mobnum;
    }

    public void setMobnum(String mobnum) {
        this.mobnum = mobnum;
    }

    /**
     * @return the dspecialisation
     */
    public String getDspecialisation() {
        return dspecialisation;
    }

    /**
     * @param dspecialisation the dspecialisation to set
     */
    public void setDspecialisation(String dspecialisation) {
        this.dspecialisation = dspecialisation;
    }

    /**
     * @return the dlnum
     */
    public String getDlnum() {
        return dlnum;
    }

    /**
     * @param dlnum the dlnum to set
     */
    public void setDlnum(String dlnum) {
        this.dlnum = dlnum;
    }



}
