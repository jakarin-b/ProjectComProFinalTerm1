/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int101.base;


public class Personal {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    
    
    public Personal(String firstName,String lastName,String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return  "Name : " + firstName + " " + lastName + ", Phone : " + phoneNumber;
    }
    
}
