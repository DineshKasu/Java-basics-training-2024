/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.day1project;

/**
 *
 * @author dinesh
// */

class Car {
    
    int manufact_Year;
    String model;
    
    public void takeTurn(){
        System.out.println("Car has  taken turn"+model);
    }
    
    //method - having class name -Constructor Creation  (1st  Type without args)
   public Car(){
        System.out.println("Car Constructor has been called");
    }
    
   public Car(int year, String model){
       
       //this
       this.model = model;
       this.manufact_Year = year;
       
          System.out.println("Car Constructor has been called");
   }
   
   
    
    
}

public class DemoClass {
  public static void main(String[] args) {
      
      //Creating object from Car class syntac
      // ClassName ObjectName = new ClassName();
      
      Car TeslaX = new Car();      //Object Teslax Creation
      TeslaX.manufact_Year = 2024;
      TeslaX.model = "Tesla X";
      
      TeslaX.takeTurn();
      
        System.out.println("Tesla object"+TeslaX.toString());
      
      Car Bmw = new Car();
      Bmw.manufact_Year = 2022;
      Bmw.model = "BMW SUV";   
      Bmw.takeTurn();
      
       System.out.println("BMW object"+Bmw.toString());
       
       //JVM --> main () -> objc creation using class --> obj memory hexcode version
      
      
      
      
      
  }
}


