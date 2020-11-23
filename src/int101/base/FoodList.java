package int101.base;

/**
 * This class is keep List of food.
 * List of food is keep in type array String.
 */
public class FoodList {
    private String[] foodlist = new String[]{"FRIED_CHICKEN", "HAMBURGER", "FRIEND_FRIES", "OMLETS", "STEAK", "FRIED_RICE"};
    public String[] coppyListOfFood() {
        return foodlist.clone();
    }

    /**
     *  Method is show all list of food.
     */
    public void getListOfFood() {
        for (int i = 0; i < foodlist.length; i++) {
            System.out.println(i+1+"."+foodlist[i]);
            if (i>foodlist.length) break;
        }
    }
}
