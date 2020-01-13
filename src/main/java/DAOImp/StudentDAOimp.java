/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImp;

import java.util.Scanner; 
import DAO.StudentDAO1; 
import java.util.ArrayList; 
import model.Student; 


/**
 *
 * @author lucanthony
 */
public class StudentDAOimp implements StudentDAO1 {
    ArrayList<Student> listOfStudents = new ArrayList<Student>();
    int id; 
    
    Scanner sc = new Scanner(System.in);
    
    @Override 
    public void create(Student std){
        
        System.out.println("If you are a student, enter your first name;");
        
        String fN = sc.nextLine();
        std.setfirstName(fN);
        
        System.out.println("If you are a student, enter your last name;");
        String lN = sc.nextLine(); 
        std.setlastName(lN); 
        
        System.out.println("Enter your first course grade;");
        double firstGrade  = sc.nextDouble(); 
        std.setcourseGrade1(firstGrade);
        
        System.out.println("Enter your second course grade;");
        double secondGrade = sc.nextDouble();
        std.setcourseGrade2(secondGrade); 
        
        std.setgpa(firstGrade, secondGrade);
        
        System.out.println("Right now your gpa is : " );
        
        listOfStudents.add(std);
        
    }

    @Override
    public void find_All() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     

    
}
