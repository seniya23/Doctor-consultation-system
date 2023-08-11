package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;

import static com.company.Doctor.*;
import java.util.ArrayList;
import java.util.List;

public class WestminsterSkinConsultationManager {

    static Scanner scanner = new Scanner(System.in);
    static String reply;
    static int b = 0;
    static int i=0;
    static String lnum="";
    static String vlno="";
    static String spe="";
    static int q = 0;
    static String f = "";
    static String s = "";
    static String d = "";
    static String m = "";
    static String vlnum="";
    static int TotDslots = 10;
    static List<String> list=new ArrayList<String>();  

    public static void main(String[] args) throws IOException {


        do {
            System.out.println("\nEnter V to view all Doctor details\n" +
                    "Enter A to add Doctors\n" +
                    "Enter EX to Exit the Program\n" +
                    "Enter D to delete Doctors\n" +
                    "Enter S to store Doctor details into files\n");
            System.out.print("Enter the suitable keyword according to your need : ");
            reply = scanner.nextLine();
            switch (reply) {
                case "V":
                    viewDoctors();
                    break;
                case "A":
                    addDoctors();
                    break;  
                case "EX":
                    exit();
                    break;
                case "D" :
                    removeDoctors();
                    break;
                case "S" :
                    storeProgramData();
                    break;

            }
        }
        while (true);
    }


    public static void addDoctors() {


        if (TotDslots == 0) {
            System.out.println("Maximum num of Doctors exceeded");
            scanner.nextLine();
        }
        else {

            Person pa=new Person();
           
           
            try {
                 System.out.print("Doctor Id:");
                    pa.setId(scanner.nextInt());
                      System.out.print("First name:");
            pa.setF_name(scanner.next());
            System.out.print("Surname:");
            pa.setS_name(scanner.next());
            System.out.print("Date of Birth:");
            pa.setDateBirth(scanner.next());
            System.out.print("Mobile number:");
            pa.setMobnum(scanner.next());


            Doctor p1 = new Doctor();
            System.out.print("License Number:");
            getLicensenum().add(scanner.next());
            System.out.print("Specialisation:");
            getSpecial().add(scanner.next());

            Personlist.add(pa);
            TotDslots--;
            
                } catch (Exception e) {
                    System.out.println("Please Enter Numbers");
                      System.exit(0);
                    }
             
           
           

        }

    }



       public static void viewDoctors() {


           Collections.sort(Personlist,Person.PersonComparator);

   
           

           for(Person str:Personlist){
               
                
               System.out.println(str+getLicensenum().get(b)+getSpecial().get(b));
               
               
               
                
               

           }

        }
       



        public static void removeDoctors() {

            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Enter Doctor License number: ");
            lnum = scanner1.next();
             System.out.print("Is this License number correct (yes/no) ? ");
             String confirmation = scanner.nextLine();
                if (confirmation.equals("yes") == true) {
                    
                    for (i=0;i<Personlist.size();i++) {


                vlno = getLicensenum().get(i);


                if (vlno.equals(lnum)) {
                    vlnum = getLicensenum().get(i);
                    getLicensenum().remove(lnum);
                    spe = getSpecial().get(i);
                    getSpecial().remove(spe);
                    q = Personlist.get(i).getId();
                    f = Personlist.get(i).getF_name();
                    s = Personlist.get(i).getS_name();
                    d = Personlist.get(i).getDateBirth();
                    m = Personlist.get(i).getMobnum();
                    Personlist.remove(i);

                }

                    System.out.print("Deleted record information ");
                    System.out.println("\n");
                    System.out.println("Doctor id:" + q);
                    System.out.println("First name:" + f);
                    System.out.println("Surname:" + s);
                   System.out.println("Date of Birth:" + d);
                   System.out.println("Mobile number:" + m);
                   System.out.println("License Number:" + vlnum);
                   System.out.println("Specialisation: " + spe);
            }

            System.out.println("Successfully removed");
            System.out.println("Available Doctors:"+Personlist.size());
                    
        }
             
       
        }


    public static void storeProgramData() throws IOException {
        File myObj = new File("filename.txt");
        myObj.createNewFile();
        System.out.println("File created: " + myObj.getName());

        FileWriter myWriter = new FileWriter("filename.txt");
        for (int i = 0; i < Personlist.size(); i++) {
            myWriter.write("Doctor id:"+Personlist.get(i).getId() + "\n");
            myWriter.write("First name:"+Personlist.get(i).getF_name() + "\n");
            myWriter.write("Surname:"+Personlist.get(i).getS_name() + "\n");
            myWriter.write("Date of Birth:"+Personlist.get(i).getDateBirth() + "\n");
            myWriter.write("Mobile Number"+Personlist.get(i).getMobnum() + "\n");
            myWriter.write("License number:"+getLicensenum().get(i) + "\n");
            myWriter.write("Specialisation:"+getSpecial().get(i) + "\n\n");
        }
        myWriter.close();
        System.out.println("Successfully wrote to the file.");

    }





        public static void exit() {
            System.out.println("Exit");
            // Terminate JVM
            System.exit(0);
    }



    }





