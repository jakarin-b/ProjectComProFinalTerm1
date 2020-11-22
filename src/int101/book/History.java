package int101.book;
import int101.base.Food;
import int101.base.Personal;
import java.util.Arrays;

public class History {

private Personal[] historyPersona = new Personal[0];
private Food[] historyFood = new Food[0];
private Food[][] foodFromInfo = new Food[0][];
private String[] historyPass = new String[0];
private static int count=0 ;
private static int countS=0;
private int s =0;

public String [] getHistoryPass(){
    return historyPass.clone();
}

public void setCount(int set){
    this.s = count;
    this.count = set;

}

public void personInfo(Personal aa){

    while (count >= historyPersona.length){
        Personal[] p2 = new Personal[historyPersona.length+1];
        for(int i =0;i< historyPersona.length;i++){
            p2[i] = historyPersona[i];
        }
        historyPersona = p2;
    }
        historyPersona[count] = aa;

}
public void passInfo(String pp){
    while(count >= historyPass.length){
        String[] w2 = new String[historyPass.length+1];
        for(int i =0;i< historyPass.length;i++){
            w2[i] = historyPass[i];
        }
        historyPass = w2 ;
    }
        historyPass[count] = pp;

}

public void foodInfo(Food bb){

       if(countS == -1){
           Food[] f3 = new Food[0];
           this.historyFood = f3;
           countS = 0;
       }
    while(countS >= historyFood.length) {
        Food[] f2 = new Food[historyFood.length + 1];
        for (int i=0;i < historyFood.length;i++){
            f2[i]  = historyFood[i]  ;
        }
        historyFood = f2;
    }
        historyFood[countS] = bb;
        countS++;
}

public void foodEachPerson(){
    while(count >= foodFromInfo.length){
        Food[][] e4 = new Food[foodFromInfo.length +1][];
        for(int i=0;i< foodFromInfo.length;i++){
            e4[i] = foodFromInfo[i];
        }
        foodFromInfo = e4;
    }
        foodFromInfo[count] = this.historyFood;
        countS = -1;

}

public void historyFoodForEachOrder(){
    if(this.s != 0){
        System.out.println(Arrays.deepToString(foodFromInfo[count]));
        count = s;
        s = 0;
    }
    else{
        System.out.println(Arrays.deepToString(foodFromInfo[count]));
        count++;
    }
}


public void allHistory(){
     for(int i=0;i < historyPersona.length;i++){
         int k = 1;
         System.out.println("No."+(i+1) +" "+"Info" + ":" +  historyPersona[i] + "\n" + "List of Food" + ":"+Arrays.deepToString(foodFromInfo[i]));
     }
     }

}


