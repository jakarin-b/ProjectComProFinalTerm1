/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import int101.book.*;
import int101.foodtable.Menu;
import int101.base.Persona;
import int101.book.Food;

public class test {
    public static void main(String[] args) {
//        Booked s1 = new Booked();
//        s1.correctYourInfo("Jakarin","Chaibubpa",02345467);
//        s1.correctYourInfo("JJ","Rocker",015667526);
        Food s2 = new Food(ListFood.HAMBURGER,100);
        s2.checkfood();

    }
}
