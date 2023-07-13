import java.util.ArrayList;

public class Farm {

    private String name;
    private ArrayList<Chicken> chickens;
    private int eggsForSale;

    public Farm(String name){
        this.name = name;
        this.chickens = new ArrayList<>();
        this.eggsForSale = 0;

    }
    public String getName(){
        return this.name;
    }
    public int getChickenCount(){
        return this.chickens.size();
    }

    public void addChicken(Chicken newChicken){
        chickens.add(newChicken);
    }

    public int getEggsForSale(){
        return this.eggsForSale;
    }
    public void setEggsForSale(int amount){
        this.eggsForSale = amount;
    }

    public ArrayList<Chicken> getChickens(){
        return this.chickens;
    }

}
