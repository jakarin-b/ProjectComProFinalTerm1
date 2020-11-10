package int101.book;
import int101.base.Personal;
public class History {
private Personal HistoryPersona[];
private static int count=0 ;
public History(){
    HistoryPersona = new Personal[10];
}
public History PersonInfo(Personal aa){
    if (count < HistoryPersona.length) {
        HistoryPersona[count] = aa;
        count++;
        return this;
    }
    return null;
}
public void check(){
    for(int i =0 ; i < count; i++){
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


