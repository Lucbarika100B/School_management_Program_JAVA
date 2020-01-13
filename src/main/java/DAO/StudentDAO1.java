/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import model.Student; 
/**
 *
 * @author lucanthony
 */
public interface StudentDAO1 {
    
    void create(Student std);
    void find_All();
    void update(int id); 
    void delete(int id);
}
