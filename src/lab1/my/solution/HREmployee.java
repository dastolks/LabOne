/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.my.solution;

/**
 *  UH, THIS IS A NEW CLASS TO USE EMPLOYEE AND UH, ORIENTATE THEM, YEAH
 *  THAT'S RIGHT, ORIENTATE THEM.
 * 
 * @author Alec
 */
public class HREmployee {
    private Employee emp;

    public HREmployee() {
        this.emp = new Employee();
    }
    
    public void orientateNewEmployee(String firstName, String lastName, String ssn, String area){
        this.emp.setName(firstName, lastName);
        this.emp.setSsn(ssn);
        this.emp.performOrientation(area);
    }
    public String getStatus(){
        return this.emp.getStatus();
    }
}
