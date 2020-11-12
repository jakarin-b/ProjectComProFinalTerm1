package int101.book;
import int101.base.Personal;
import java.util.Scanner;

public class Booked {
    private Personal info;
    private Food InfoFood;
    private ListFood list;
    private String firstname;
    private String lastname;
    private String number;
    private History historyP = new History();
    private History historyF = new History();
    private String food;

    private int amount;
    public Booked(){
     
    }
    public void EnterYourInfo(){
        System.out.println("Enter your information");
        Scanner fn = new Scanner(System.in);
        this.firstname = fn.next();
        Scanner ln = new Scanner(System.in);
        this.lastname = ln.next();
        Scanner nm = new Scanner(System.in);
        this.number = nm.next();

        info = new Personal(this.firstname,this.lastname,this.number);
        this.historyP.PersonInfo(info);
    }
public void EnterYourFood(){
    System.out.println("Enter your food");
    Scanner fd = new Scanner(System.in);
    this.food = fd.next();
    System.out.println("Enter your amount");
    Scanner am = new Scanner(System.in);
    this.amount = am.nextInt();
    for(int i = 0;i<=10;i++){
        if(this.food= list)
    }
    this.InfoFood = new Food(this.food,this.amount);
    this.historyF.FoodInfo(InfoFood);


}


    public void check(){
      this.historyP.checkPerson();
    }

}
