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
    public Booked ListOfFood(){
        for(ListFood list : ListFood.values()){
            System.out.println(list);
        }
        return this;
    }
   public Booked OrderFood(){

        return this;
   }


}
