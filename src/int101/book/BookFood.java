
package int101.book;


public class BookFood {
    private Food food[];
    private int numberOfMenu;
    
    public BookFood(int size) {
        food = new Food[size>0 ? size :100];
    }
    public BookFood chooseMenu(Food trx){
        if (numberOfMenu < food.length) {
            food[numberOfMenu++] = trx;
            return this;
        }
        return null;
    }    
    public BookFood ListOfFood(){
        for(ListFood list : ListFood.values()){
            System.out.println(list);
        }
        return this;
    }
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < numberOfMenu; i++) {
            result += food[i];
        }
        return null;
    }
    
    }
    


