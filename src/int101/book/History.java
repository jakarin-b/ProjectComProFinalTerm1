package int101.book;
import int101.base.Food;
import int101.base.Personal;
import java.util.Arrays;

/**
 * This class is keep history of user from class Booked
 */
public class History {

private Personal[] historyPersona = new Personal[0];
private Food[] historyFood = new Food[0];
private Food[][] foodFromInfo = new Food[0][];
private String[] historyPass = new String[0];
private static int count=0 ;
private static int countS=0;
private int s =0;

    /**
     * @return array of historyPass
     */
public String [] getHistoryPass(){
    return historyPass.clone();
}

    /**
     * set count to same as No of user
     * @param set No of user
     */
public void setCount(int set){
    this.s = count;
    this.count = set;

}

    /**
     * This method keep history of person from all user to used it
     * If count >= historyPersona.length . add index of array 1
     * add all info to array historyPersona in index of count
     * @param aa type firstname,lastname,phonenumber from class Personal
     */
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

    /** This method keep history of password from all user to used it
     * If count >= historyPass.length . add index of array 1
     * add all info to array historyPass in index of count
     * @param pp (type String form class Booked)
     */
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

    /**
     * This method keep history of food from each user to put it
     * If countS >= foodInfo.length . add index of array 1
     * add all info to array foodInfo in index of countS
     * @param bb (types list,amount from class Food)
     */
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

    /**
     * This method keep history of food from all user to used it
     * If count >= foodEachPerson.length . add index of array 1
     * add all info to array foodEachPerson in index of countS
     * set countS to -1
     */
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

    /**
     * This method show all user to order food
     * if s = 0 sout array of foodFromInfo[count] and set count = s and set s = 0
     * else sout array of foodFromInfo[count] and set count++
     */
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


    /**
     * This method show all information of person and order for all user to used it.
     */
public void allHistory(){
    if(historyPersona.length == 0){
        System.out.println("No one has booked.\n\n");
    }
    else {
        for (int i = 0; i < historyPersona.length; i++) {

            int k = 1;
            System.out.println("No." + (i + 1) + " " + "Info" + ":" + historyPersona[i] + "\n" + "List of Food" + ":" + Arrays.deepToString(foodFromInfo[i]));
        }
    }
     }

}


