package int101.book;

public class FoodList {
    private String[] foodlist = new String[]{"FRIED_CHICKEN","HAMBURGER","FRIEND_FRIES","OMLETS","STEAK","FRIED_RICE"};
    public  FoodList (){

    }
    public String[] getListOfFood(){
        return foodlist.clone();
    }
}
