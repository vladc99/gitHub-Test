/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. First Commit from github!
 */

package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author Vlad Crihan
 */
public class PartTimeStudents extends Student{
    
    private int noOfHours; 
    
    //Subclass constructor.
    
    public PartTimeStudents(String name,String stdId,int hours){
        super(name,stdId);
        this.noOfHours = hours;
    }
    
    //getter and setters    
    
    public int getNoOfHours() {
        return noOfHours;
    }

    public void setNoOfHours(int noOfHours) {
        this.noOfHours = noOfHours;
    }
    
    
}
