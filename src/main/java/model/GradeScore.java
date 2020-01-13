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
public class GradeScore {
    private int profID;
    private int studentID;
    private double gradeScore1;
    private double gradeScore2; 
    private int courseID;
    
    public int getprofID(){
        return profID;
    }
    
    public int setprofID(int pID){
        return this.profID = pID; 
    }
    
    public int getstudentID(){
        return studentID; 
    } 
    
    public double setstudentID(int sID){
        return this.studentID = sID; 
    
    }
    
    public double getgradeScore1(){
        return gradeScore1;
    }
    
    public double setgradeScore1(double grade1){
        return this.gradeScore1 = grade1;
       
    }
    
    public double getgradeScore2(){
        return gradeScore2;
    }
    
    public double setgradeScore2(double grade2){
        return gradeScore2;
    }
    
}
