/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int101.book;
import int101.book.Booked;


public class Food {
    private String list;
    private int amount;
    private String[] food = new String[]{"FRIED_CHICKEN","HAMBURGER","FRIEND_FRIES","OMLETS","STEAK","FRIED_RICE"};
    private History listlist;
    String[] j;
    private FoodList a = new FoodList();
    private Booked book = new Booked();
    public Food(){

    }
    public void setFoodOrder(String list, int amount) {
        this.list = list;
        this.amount = amount;
    }


    public void foodList(){
        for(int i = 0;i<=food.length;i++){
            System.out.println(food[i]);
        }

    }
    @Override
    public String toString() {
        return "Food{" + "list=" + list + ", amount=" + amount + '}';
    }
    
}
