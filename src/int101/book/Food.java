/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int101.book;
import int101.book.Booked;
import java.util.ArrayList;
import java.util.Arrays;

public class Food {
    private String list;
    private int amount;
    private String[] food ;
    private FoodList ls;

    public Food(){

    }
    public void setFoodOrder(String list, int amount) {
        this.list = list;
        this.amount = amount;
    }


//    public void foodList(){
//        for(int i = 0;i<=food.length;i++){
//            System.out.println(food[i]);
//        }
//
//    }
    @Override
    public String toString() {
        return "[Food:" +  list + ", amount:" + amount + ']';
    }
    
}
