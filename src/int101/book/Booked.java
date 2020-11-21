package int101.book;
import int101.base.Personal;
import java.util.Scanner;

public class Booked {
    private Personal info;
    public Food InfoFood;
    private String firstname;
    private String lastname;
    private String number;
    private History history = new History();
    private Scanner scn = new Scanner(System.in);
    private Checked ch;
    private FoodList lst;
    private boolean plusF = false;
    private int f;
    private int amount;
    private String food;

    public Booked() {

    }

    public void EnterYourInfo() {
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
        this.history.PersonInfo(info);

    }

    //    String food,int amount
    public void addFood() {
        this.ch = new Checked();
        this.lst = new FoodList();
        while (true){
            while (true) {
                System.out.println("Please choose your food");
                lst.getListOfFood();
                System.out.println("Please enter menu name:");
                this.food = scn.next();
                System.out.println("Choose your amount of food.");
                this.amount = scn.nextInt();
                if (this.ch.checkFood(this.food)) {
                    this.InfoFood = new Food();
                    this.InfoFood.setFoodOrder(this.food, this.amount);
                    this.history.FoodInfo(InfoFood);
                    break;
                }

            }
            if (again()) {
                break;
            }
    }
        this.history.FoodEachPerson();
    }

    public boolean again() {
        System.out.println("Do you want to order more?");
        System.out.println("1 yes 2 no");
        int i;
        i = scn.nextInt();
        switch (i) {
            case 1:
                this.plusF = false;
                break;
            case 2:
                this.plusF = true;
                break;
            default:
                System.out.println("please try again");

        }
        return this.plusF;
    }
    public void allInfoForEachPerson(){
        System.out.println("Your information");
        System.out.println("Name:"+this.firstname +"\n"+ "Lastname:"+this.lastname +"\n"+ "Phone:"+this.number);
        history.historyFoodForEachOrder();
    }
    public void allHistoryInfo(){
        this.history.allHistory();

    }

}
