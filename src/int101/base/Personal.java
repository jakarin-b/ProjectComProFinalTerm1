/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int101.base;

/**
 *
 * @author Student
 */
public class Personal {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    
    
    public Personal(String firstName,String lastName,String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
    public String getFirstName(){
        return this.firstName;
    } 
    public String getLastName(){
        return this.lastName;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public Personal setFirstname(String firstname) { 
        this.firstName = firstname; 
        return this; 
    }
    public Personal setLastname(String lastname) { 
        this.lastName = lastname; 
        return this; 
    }
    public Personal setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public String toString() {
        return "List : " + "Name : " + firstName + " " + lastName + ", Phone : " + phoneNumber;
    }
    
}
