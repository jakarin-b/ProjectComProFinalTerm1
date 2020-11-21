package int101.book;
import int101.base.Personal;
import java.util.Arrays;
import java.lang.reflect.Array;


public class History {
private Personal[] HistoryPersona = new Personal[10];
private static int count=0 ;
private Food[] HistoryFood = new Food[0];
private static int count2=0;
private Food[][] FoodFromInfo = new Food[10][0];
private static int count3 = 0;

public History(){
//    HistoryPersona = new Personal[10];

}
public Personal[] getHistoryPersona(){
    return HistoryPersona.clone();
}
public Food[] getHistoryFood(){
    return  HistoryFood.clone();
}

public void PersonInfo(Personal aa){

    if (count < HistoryPersona.length) {
        HistoryPersona[count] = aa;
        count++;
    }

}
public void FoodInfo(Food bb){
       if(count2 == -1){
           Food[] f3 = new Food[0];
           this.HistoryFood = f3;
           count2 = 0;
       }
    while(count2 >= HistoryFood.length) {
        Food[] f2 = new Food[HistoryFood.length + 1];
        for (int i=0;i < HistoryFood.length;i++){
            f2[i]  = HistoryFood[i]  ;
        }
        HistoryFood = f2;
    }
    if (count2 < HistoryFood.length) {
        HistoryFood[count2] = bb;
        count2++;
    }
}
public void FoodEachPerson(){
    if (count3 < FoodFromInfo.length){
        FoodFromInfo[count3] = this.HistoryFood;
        count3++;
        count2 = -1;
    }
}

    public void checkFood(){
            for (int j = 0; j < HistoryFood.length; j++) {
                System.out.println(HistoryFood[j]);
            }

        }
//        public void checkFood2(){
//        for(int i =0; i< count3; i++){
//            System.out.println(i+1 + "List"+ Arrays.deepToString(FoodFromInfo[i]));
//        }
//        }
    public void historyFoodForEachOrder(){
        System.out.println(Arrays.deepToString(FoodFromInfo[count3-1]));
        }

//    public void checkPerson(){
//    for(int i =0 ; i < HistoryPersona.length; i++){
//        System.out.println(HistoryPersona[i]);
//    }
//}

    public void allHistory(){
     for(int i=0;i < HistoryPersona.length;i++){
         int k = 1;
         System.out.println(i+k +"Info" + ":" +  HistoryPersona[i] + "\n" + "List of Food" + ":"+Arrays.deepToString(FoodFromInfo[i]));


     }
     }


}


