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
public class Student {
    private String firstName; 
    private String lastName; 
    private double courseGrade1;
    private double courseGrade2;
    private double gpa; 
    private String programOfStudy;
    private int age; 
    private boolean passOrFail;
    private int studentID;
    private double average;

    public Student(String firstName, String lastName, double courseGrade1, double courseGrade2, double gpa, String programOfStudy, int age, boolean passOrFail, int studentID, double average ) {
   
    this.firstName = firstName; 
    this.lastName = lastName; 
    this.courseGrade1 = courseGrade1; 
    this.courseGrade2 = courseGrade2; 
    this.gpa = gpa; 
    this.programOfStudy = programOfStudy; 
    this.age = age; 
    this.passOrFail = passOrFail;
    this.studentID = studentID; 
    this.average = average; 
    }
    
    public Student(){
    
    this.firstName = " "; 
    this.lastName = " "; 
    this.courseGrade1 = 0.0; 
    this.courseGrade2 = 0.0;
    this.gpa = 0.0; 
    this.age = 0; 
    this.passOrFail = false;
    this.studentID = 0; 
    this.average = 0;
  
    }

    
   
    @Override 
    public String toString(){
        return "Student{" + "firstName = " + firstName + "lastName = " 
                + lastName + "courseGrade1 = " + courseGrade1 + "courseGrade2 =" 
                + courseGrade2 + "gpa = " + gpa + "Date of birth =" + age + 
                "Did the student pass ?" + passOrFail + "Student ID = " + studentID;};
   
    public String getfirstName(){
       return firstName;
    }
    
    public String setfirstName(String lN){
       return this.firstName = lN;
    
    }
    
    public String getlastName(){
        return lastName;
    }
    
    
    public String setlastName(String lN){
        return this.lastName = lN;
    }
    
    public double getcourseGrade1(){
        return courseGrade1;
    }
    
    public double setcourseGrade1(double cG1){
       return this.courseGrade1 = cG1; 
    }
    
    public double getcourseGrade2(){
        return courseGrade2;
    }
    
    public double setcourseGrade2(double cG2){
        return this.courseGrade2 = cG2;
    }
    
    public double getgpa(){
        return gpa; 
    }
    
    public double setgpa(double courseGrade1, double courseGrade2){
        return this.gpa = (courseGrade1 + courseGrade2) / 2;
    }
    
    public String getprogramOfStudy(){
        return programOfStudy;
    }
    
    public String setprogramOfStudy(String program){
        return this.programOfStudy = program;
    }
    
    public int getage(){
        return age;
    }
    
    public int setage(int dateOfB){
        return this.age = dateOfB; 
     }
    
    public boolean getpassOrFail(){
        return passOrFail;
    }
    
    public boolean setpassOrFail(boolean passOrFail){
        
        if(gpa >= 60){
            System.out.println(passOrFail = true);
        }
        else {
        passOrFail = false;
        }
        return this.passOrFail = passOrFail ;
    }
    
    public int getstudentID(){
        return studentID;
    }
    
    public int setstudentID(int studentID){
        return this.studentID = studentID;
    }
}

