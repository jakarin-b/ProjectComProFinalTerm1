package int101.book;
import int101.base.Food;
import int101.base.FoodList;
import int101.base.Personal;
import java.util.Scanner;


/**
 * This class is keep all method for used in class menu
 */
public class Booked {
    private Personal info;
    public Food infoFood;
    private FoodList lst;
    private History history = new History();
    private String firstname;
    private String lastname;
    private String number;
    private int f;
    private int amount;
    private boolean ch = false;
    private String[] ps;
    private String food;
    private String[] listofFood;
    private String password ;
    private Scanner scn = new Scanner(System.in);

    /**
     * This method is operator to receive information from uer.
     * When user input information finish.System ask user for confirm.
     * If 1.(yes) link all attribute to class Food.
     * Create obj class History name info(parameter of name,lastname,phonenumber).
     * Call method personInfo(parameter of obj name info)
     * else 2.(no) run system in method again(use while loop)
     *
     */
    public void enterYourInfo() {
        do {
        System.out.println("Enter your information");
        System.out.println("Name:");
        this.firstname = scn.next();
        System.out.println("Lastname");
        this.lastname = scn.next();
        System.out.println("Phone:");
        this.number = scn.next();
            System.out.println("Name:"+this.firstname +"\n"+ "Lastname:"+this.lastname +"\n"+ "Phone:"+this.number);
            System.out.println("Confirm your information?\n" + "1.yes 2.no");
            this.f = scn.nextInt();
        }while(this.f !=1);
        info = new Personal(this.firstname, this.lastname, this.number);
        this.history.personInfo(info);

    }

    /**
     * This class is user to create password in type string.
     * when user input information finish.Call method passInfo from class History
     */
      public void createPassword(){
            System.out.println("Please create your password");
            this.password = scn.next();
        history.passInfo(this.password);
          System.out.println("Complete to create password");
      }

    /**
     * This class is user to choose food and amount food to add in order.
     * Call method getListOfFood from class Foodlist to run all list of food.
     * Call method checkFood to check that the information matches or not.
     * If true.Create new obj class Food name info.
     * Call method setOrderFood(type food,amount)
     * Call method foodInfo(type info) and break;
     * Call method again for check true or false.
     * If true run system again(use while loop).
     * If false call method foodEachPerson from class history
     */
    public void addFood() {
        this.lst = new FoodList();
        while (true){
            while (true) {
                System.out.println("Please choose your food");
                lst.getListOfFood();
                System.out.println("Please enter menu name:");
                this.food = scn.next();
                System.out.println("Choose your amount of food.");
                this.amount = scn.nextInt();
                if (checkFood(this.food)) {
                    this.infoFood = new Food();
                    this.infoFood.setFoodOrder(this.food, this.amount);
                    this.history.foodInfo(infoFood);
                    break;
                }
            }
            if (again()) {
                break;
            }
                    }
        this.history.foodEachPerson();
    }

    /**
     * This class is check true or false from answer of user.
     * If true this.ch is false
     * If false this.ch is true
     * @return this.ch
     */
    public boolean again() {
        System.out.println("Do you want to order more?");
        System.out.println("1 yes 2 no");
        int i;
        i = scn.nextInt();
        switch (i) {
            case 1:
                this.ch = false;
                break;
            case 2:
                this.ch = true;
                break;
            default:
                System.out.println("please try again");
        }
        return this.ch;
    }

    /**
     * This class show all information from user after user finish order
     * Call attribute of firstname,lastname,phone number
     * Call method allHistoryFoodForEachOrder from class History
     *
     */
    public void allInfoForEachPerson(){
        System.out.println("Your information");
        System.out.println("Name:"+this.firstname +"\n"+ "Lastname:"+this.lastname +"\n"+ "Phone:"+this.number);
        history.historyFoodForEachOrder();
    }

    /**
     * This method show list for all information of user to used it.
     * Call method allHistory from class History
     */
    public void allHistoryInfo(){
        this.history.allHistory();

    }

    /**
     * This method is user to change information for these user
     * User input to No. want to change.
     * User input password of user
     * Call method checkPassword(type this.f,this.password) for check it match?
     * If true call method setCount(f-1)
     * Call method enterYourPerson
     * run all info again
     * If false sout "please try again"
     */
    public void changeYourInfo(){
        System.out.println("please enter your No.to change");
        this.f = scn.nextInt();
        System.out.println("please enter your password");
        this.password = scn.next();
        if(checkPassword(this.f,this.password)){
            history.setCount(f-1);
            enterYourInfo();
            System.out.println("Thank you");
            allInfoForEachPerson();
        }
        else{
            System.out.println("please try again.");
        }
    }
    /**
     * This method is user to change information for these user
     * User input to No. want to change.
     * User input password of user
     * Call method checkPassword(type this.f,this.password) for check it match?
     * If true call method setCount(f-1)
     * Call method addFood
     * run all info again
     * If false sout "please try again"
     */
    public void changeYourOrder(){
        System.out.println("please enter your No.to change");
        this.f = scn.nextInt();
        System.out.println("please enter your password");
        this.password = scn.next();
        if(checkPassword(this.f,this.password)){
            history.setCount(f-1);
            addFood();
            System.out.println("Thank you");
            allInfoForEachPerson();
        }
    }

    /**
     * This method is check type for user input to match with list of food(use for loop)
     * @param foodRecpit input for user to order food
     * @return If math return true , not return false
     */
    public boolean checkFood(String foodRecpit){
        this.listofFood = lst.coppyListOfFood();
        for(int i=0;i<listofFood.length;i++){
            if(foodRecpit.equals(listofFood[i])) {
                return true;
            }
        }
        System.out.println("please try again");
        return false;
    }

    /**
     * This method is check type for user input to match with password(use for loop)
     * @param no No of user
     * @param passCh Pass of user
     * @return If true return true ,not return false
     */
    public boolean checkPassword(int no,String passCh){
        this.ps = history.getHistoryPass();
        if(no-1 > ps.length){
            return false;
        }
        else if(ps[no-1].equals(passCh)){
            return true;
        }
        else {
            return false;
        }
    }

}
