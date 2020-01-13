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
public class Courses {
    private int courseID; 
    private String courseName; 
    private String courseProgram;
   
    
    
    public int getcourseID(){
        return courseID; 
    }
    
    public int setcourseID(int cN){
        return this.courseID = cN; 
    }
    
    public  String getcourseName(){
        return courseName;
    }
    
    public String setCourseName(String cN){
        return this.courseName = cN;
    }
    
    public String getcourseProgram(){
        return courseProgram;
    }
    
    public String setcourseProgram(String cP){
        return this.courseProgram = cP;
    }
    
}

