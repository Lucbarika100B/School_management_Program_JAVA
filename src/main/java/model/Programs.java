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
public class Programs {
    private String programName; 
    private int programID; 
   
    
    public String getprogramName(){
        return programName;
    }
    
    public String setprogramName(String pN){
        return this.programName = pN;
    }
    
    public int getprogramID(){
        return programID;
    }
    
    public int setprogramID(int pID){
        return this.programID = pID;
    }
    
}
