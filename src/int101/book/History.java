package int101.book;
import int101.base.Persona;
public class History {
private Persona HistoryPersona[];
private int count ;
public History(){
    HistoryPersona = new Persona[10];
}
public History PersonInfo(Persona aa){
    if (count < HistoryPersona.length) {
        HistoryPersona[count] = aa;
        count++;
        return this;
    }
    return null;
}
public void check(){
    for(int i =0 ; i < HistoryPersona.length; i++){
        System.out.println(HistoryPersona[i]);
    }

}
    @Override
    public String toString() {

        String j = "History";
        for(int i = 0 ;i<count;i++){
            j+="\n"+HistoryPersona[i];
        }
        return j;
    }
}


