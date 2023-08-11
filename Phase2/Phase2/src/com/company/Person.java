package com.company;

import java.util.Comparator;
import java.util.Locale;

public class Person {

    private int id;
    private String f_name;
    private String s_name;
    private String dateBirth;
    private String mobnum;

    public static Comparator<Person>PersonComparator=new Comparator<Person>(){
         @Override
        public int compare(Person o1, Person o2) {
            String psurname1=o1.getS_name().toUpperCase();
            String psurname2=o2.getS_name().toUpperCase();
            return psurname1.compareTo(psurname2);
        }};

    @Override
    public String toString(){
        return id+" "+f_name+" "+s_name+" "+dateBirth+" "+mobnum;

    }

   // public String getString(){
     //   return toString();

    //}


    public int getId() {
        return id;
    }

    public void setId(int id) {
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



}
