/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int101.foodtable;


import int101.book.Booked;
import int101.book.History;

import java.util.Scanner;

public class Menu {
    private Scanner scn = new Scanner(System.in);
    private int i = 0;
    private int y = 0;

    Booked b1 = new Booked();

    public void start(){
        while(this.i != 2){
            System.out.println("Welcome to the restaurant\n" +"Do you want to start program?");
            System.out.println("1.yes 2.no:");
            this.i = scn.nextInt();
            switch (i) {
                case 1:
                 do{
                     System.out.println("select menu:");
                     System.out.println("1.New user\n"+"2.Change your information\n"+"3.Change your order\n"+"4.History Customer\n"+"0.Exit");
                     this.y = scn.nextInt();
                     switch (y){
                         case 1:
                             b1.EnterYourInfo();
                             b1.addFood();
                             b1.allInfoForEachPerson();
                             break;
                         case 2:
                             case 3:
                         case 4:
                           b1.allHistoryInfo();
                           break;
                     }
                 }while (y !=0 );
                case 2: break;
                default:
                    System.out.println("please try again");
            }
        }
        System.out.println("Thank you so much");
    }
    
}
