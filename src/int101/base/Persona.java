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
public class Persona {
    private String firstName;
    private String lastName;
    private long phoneNumber;
    
    
    public Persona(String firstName,String lastName,long phoneNumber){
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
    public long getPhoneNumber(){
        return this.phoneNumber;
    }
    public Persona setFirstname(String firstname) { 
        this.firstName = firstname; 
        return this; 
    }
    public Persona setLastname(String lastname) { 
        this.lastName = lastname; 
        return this; 
    }
    public Persona setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public String toString() {
        return "List : " + "Name : " + firstName + " " + lastName + ", Phone : " + phoneNumber;
    }
    
}
