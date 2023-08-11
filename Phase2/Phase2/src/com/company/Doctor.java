package com.company;

import java.util.ArrayList;

public class Doctor extends Person

{


        static ArrayList<Person> Personlist=new ArrayList<>(10);
        private static ArrayList<String> licensenum=new ArrayList<>(10);
        private static ArrayList<String> Special=new ArrayList<>(10);


    public static ArrayList<String> getLicensenum() {
        return licensenum;
    }

    public static void setLicensenum(ArrayList<String> licensenum) {
        Doctor.licensenum = licensenum;
    }


    public static ArrayList<String> getSpecial() {
        return Special;
    }

    public static void setSpecial(ArrayList<String> special) {
        Special = special;
    }
}





