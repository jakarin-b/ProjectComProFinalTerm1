package int101.book;
import int101.base.Personal;
import java.util.Scanner;

public class Booked {
    private Personal info;
   public Food InfoFood ;
    private Food check;
    private ListFood list;
    private String firstname;
    private String lastname;
    private String number;
    private History historyP = new History();
    private History historyF = new History();
    private String food;
    private Scanner scn = new Scanner(System.in);
    private int amount;
    int count = 0;

    public Booked() {

    }
    public void start(){}
    public void Infd(){

    }

    public void EnterYourInfo() {
        System.out.println("Enter your information");
        this.firstname = scn.next();
        this.lastname = scn.next();
        this.number = scn.next();
        info = new Personal(this.firstname, this.lastname, this.number);
        this.historyP.PersonInfo(info);
        this.historyP.checkPerson();
    }
//    String food,int amount
    public void EnterYourFood() {
        System.out.println("Enter your food");
        this.food = scn.next();
        System.out.println("Enter your amount");
        this.amount = scn.nextInt();
//this.food = food;
//this.amount = amount;
///ยังไม่เสร็จนะ if(count >= 1){
////            this.InfoFood = null;
////            count = 0;
////        }
////        count++;
//
        this.InfoFood = new Food(this.food, this.amount);
        InfoFood.checkFood(this.food,this.amount);
            this.historyF.FoodInfo(InfoFood);
            this.historyF.checkFood();

        }
        public void checked(){}

       public void check(){
            this.historyP.checkPerson();
       }

    }

