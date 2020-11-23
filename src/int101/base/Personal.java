/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int101.base;


/**
 * This class is get information of person from user
 */
public class Personal {
    private String firstName;
    private String lastName;
    private String phoneNumber;


    /**
     * get information from user to type String
     * @param firstName receive firstname from user
     * @param lastName receive lastname from user
     * @param phoneNumber receive phonenumber from user
     */
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
