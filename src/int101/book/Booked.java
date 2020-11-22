package int101.book;
import int101.base.Food;
import int101.base.Personal;
import java.util.Scanner;


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
      public void createPassword(){
            System.out.println("Please create your password");
            this.password = scn.next();
        history.passInfo(this.password);
          System.out.println("Complete to create password");
      }

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
    public void allInfoForEachPerson(){
        System.out.println("Your information");
        System.out.println("Name:"+this.firstname +"\n"+ "Lastname:"+this.lastname +"\n"+ "Phone:"+this.number);
        history.historyFoodForEachOrder();
    }
    public void allHistoryInfo(){
        this.history.allHistory();

    }
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
