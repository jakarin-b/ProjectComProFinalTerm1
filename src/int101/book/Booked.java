package int101.book;
import int101.base.Personal;

public class Booked {
    private Personal info;
    private String firstname;
    private String lastname;
    private String number;
    private History history = new History();
    public Booked(){
     
    }
    public void correctYourInfo(String firstname,String lastname,String number){
        info = new Personal(firstname,lastname,number);
        this.history.PersonInfo(info);
    }
    public void check(){
      this.history.check();
    }
    


}
