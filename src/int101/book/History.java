package int101.book;
import int101.base.Personal;
public class History {
private Personal[] HistoryPersona = new Personal[10];
private static int count=0 ;
private Food[] HistoryFood = new Food[10];
private static int count2=0;
public History(){
//    HistoryPersona = new Personal[10];

}
public void PersonInfo(Personal aa){
    if (count < HistoryPersona.length) {
        HistoryPersona[count] = aa;
        count++;

    }

}
public void FoodInfo(Food bb){
    if(count2 < HistoryFood.length){
        HistoryFood[count2] = bb;
        count2++;
    }

}

    public void checkFood(){
            for (int j = 0; j < count2; j++) {
                System.out.println(HistoryFood[j]);
            }

        }
public void checkPerson(){
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


