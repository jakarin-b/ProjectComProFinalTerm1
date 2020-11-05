/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int101.book;

/**
 *
 * @author Student
 */
public class Food {
    private ListFood list;
    private int amount;
    private ListFood food[];
    
    public Food(){
        
    }
    public Food(ListFood list,int amount){
        this.list = list;
        this.amount = amount;
    }
    public Food foodList(){
        for(int i = 0;i<=food.length;i++){
            System.out.println(food[i]);
        }
        return this;
    }
    @Override
    public String toString() {
        return "Food{" + "list=" + list + ", amount=" + amount + '}';
    }
    
}
