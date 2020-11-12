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
    private String list;
    private int amount;
    private ListFood food[];
    private History listlist;
    
    public Food(){
        
    }
    public Food(String list,int amount){
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
