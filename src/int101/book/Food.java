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
    ListFood[] food = ListFood.values();
    private  String[] names = new String[food.length];
    int count;
    
    public Food(ListFood list,int amount){
        this.list = list;
        this.amount = amount;

for(int i=0;i< food.length;i++){
    names[i] = food[i].name();
}
    }
    public Food checkfood(){
        for(int i = 0;i< names.length;i++) {
            System.out.println(names[i]);
        }
        return this;
    }

//    public Food(ListFood list,int amount){
//        this.list = list;
//        this.amount = amount;
//    }
//    public Food foodList(){
//        for(int i = 0;i<=food.length;i++){
//            System.out.println(food[i]);
//        }
//        return this;
//    }
    @Override
    public String toString() {
        return "Food{" + "list=" + list + ", amount=" + amount + '}';
    }
    
}
