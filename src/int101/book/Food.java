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
    private Booked book = new Booked();
    private String l1;
    public Food(){
        
    }
    public Food(String list,int amount){
        this.list = list;
        this.amount = amount;
    }
    public void checkFood(String fd2,int amount){
        for(int i=0;i<food.length;i++){
            if(this.list.equals(food[i])){
                this.l1 = this.list;
            }
            }
        if(l1 == null){
            System.out.println("please try again");
            book.EnterYourFood();

        }
        else {
            System.out.println("Thank you");

        }
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
