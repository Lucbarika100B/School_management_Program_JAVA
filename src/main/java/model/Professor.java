/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lucanthony
 */
public class Professor {
   private String firstName;
   private String lastName; 
   private int profID; 
   
   public String getfirstName(){
       return firstName;
   }
   
   public String setfirstName(String firstName){
       return this.firstName = firstName; 
   }
   
   public int getprofID(){
       return profID;
   }
   
   public int setprofID(int profID){
       return this.profID = profID;
   }
   
  
}
