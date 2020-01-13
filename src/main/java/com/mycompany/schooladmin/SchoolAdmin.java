/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.schooladmin;
import DAOImp.StudentDAOimp;
import model.Student; 
import java.util.Scanner; 
import DAO.StudentDAO1;

/**
 *
 * @author lucanthony
 */
public class SchoolAdmin {
    
    
   
    
    
    public static void main(String [] args){
        Student std = new Student();
        StudentDAOimp stDao = new StudentDAOimp(); 
    
        int menuKeys = 0; 
        
        while(menuKeys != 5) {
        System.out.println("Menu: \n 1. Add a Student  \n 2. Display All the Students \n 3. Remove a Student from you data base  \n 4. Update some Information  \n 5. Exit the program");
        Scanner sc = new Scanner(System.in);
        menuKeys = Integer.parseInt(sc.nextLine());
        
        switch(menuKeys){
            case 1: 
                stDao.create(std);
                break; 
            case 2: 
                stDao.find_All();
                break;
                
            case 3:
                System.out.println("Enter the ID of the student you want to delete");
                int id;
                id = Integer.parseInt(sc.nextLine());
                stDao.delete(id);
                break;
                
            case 4:
                System.out.println("Please enter the id of the student you want to edit");
                id = Integer.parseInt(sc.nextLine());
                stDao.update(id);
                break;
                
            case 5:
                System.out.println("Exiting the programm right now");
                break;
                
            }
        }
    
    }
    
}
