package org.example;

import java.util.Calendar;
import java.util.Date;

public class Spaceship {
     private String name = String.valueOf(Calendar.getInstance().getTimeInMillis());
     private int age;
     //We have created spaceship constant object
     private static Spaceship INSTANCE=null;
     private Spaceship(){
     }

    public static Spaceship getInst(){
         if(INSTANCE == null){
             INSTANCE= new Spaceship();
         }
         return INSTANCE;
    }
    public  void display(){
        System.out.println("Age is:"+age +" "+name);
    }


    public static void main(String[] args) {
        try {
            Spaceship sship = Spaceship.getInst(); //new Spaceship();
            System.out.println(sship);
            sship.display();

            sship = Spaceship.getInst();
            System.out.println(sship);
            sship.display();

            sship = Spaceship.getInst();
            System.out.println(sship);
            sship.display();

            System.out.println("Welcome");
        } catch (Exception e) {

        }


    }
}

