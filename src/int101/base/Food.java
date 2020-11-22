/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int101.base;


public class Food {
    private String list;
    private int amount;


    public void setFoodOrder(String list, int amount) {
        this.list = list;
        this.amount = amount;
    }


    @Override
    public String toString() {
        return "[Food:" +  list + ", amount:" + amount + ']';
    }
    
}
