package int101.book;
import int101.base.Persona;

public class Booked {
    private Persona info;
    private String firstname;
    private String lastname;
    private long number;
    private History history;
    public Booked correctYourInfo(String firstname,String lastname,long number){
        this.firstname = firstname;
        this.lastname = lastname;
        this.number = number;
        this.history = new History();
        info = new Persona(firstname,lastname,number);
        this.history.PersonInfo(info);
        return this;
    }
    public void check(){
      this.history.check();
    }
    public Booked New(String firstname,String lastname,long number){
        this.firstname = firstname;
        this.lastname = lastname;
        this.number = number;
        this.history = new History();
        this.history.PersonInfo(new Persona(firstname,lastname,number));
        return this;
    }


}
