package int101.book;
import int101.base.Personal;

public class Booked {
    private Personal info;
    private String firstname;
    private String lastname;
    private String number;
    private History history;
    public Booked correctYourInfo(String firstname,String lastname,String number){
        this.firstname = firstname;
        this.lastname = lastname;
        this.number = number;
        this.history = new History();
        info = new Personal(firstname,lastname,number);
        this.history.PersonInfo(info);
        return this;
    }
    public void check(){
      this.history.check();
    }
    


}
