package int101.book;
import int101.base.Personal;

public class Checked {
private String[] food;
private FoodList j = new FoodList();
private History his = new History();


public  Checked(){

}
    public boolean checkFood(String foodRecepit){
        this.food = j.coppyListOfFood();
        for(int i = 0; i < food.length; i++) {
            if(foodRecepit.equals(this.food[i])) {
                return true;
            }
        }
        System.out.println("please try again");
        return false;
    }
    //  แก้ด้วยขรั่บ
//    public void arrayFood (){
//    this.ff = his.getHistoryFood();
//    for(int i =0;i<ff.length;i++){
//        System.out.println(ff[i]);
//    }
//    }
}
