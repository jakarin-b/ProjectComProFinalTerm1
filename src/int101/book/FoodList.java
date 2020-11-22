package int101.book;

public class FoodList {
    private String[] foodlist = new String[]{"FRIED_CHICKEN", "HAMBURGER", "FRIEND_FRIES", "OMLETS", "STEAK", "FRIED_RICE"};

    public String[] coppyListOfFood() {
        return foodlist.clone();
    }

    public void getListOfFood() {
        for (int i = 0; i < foodlist.length; i++) {
            System.out.println(i+1+"."+foodlist[i]);
            if (i>foodlist.length) break;
        }
    }
}
