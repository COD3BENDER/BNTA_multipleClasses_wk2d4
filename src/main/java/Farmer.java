public class Farmer {

    private String name;
    private int collectedEggs;

    public Farmer (String name){
        this.name = name;
        this.collectedEggs = 0;

    }

    public String getName(){
        return this.name;
    }
    public int getCollectedEggs(){
        return this.collectedEggs;
    }

    public void collectEggs(Farm farm){
        // loop through chickens on the farm
        //count num of eggs available
        //Add those eggs to the eggsForSale
        // Set all chicken eggs to 0
        int totalEggs = 0;
        for (Chicken chicken: farm.getChickens()){
            totalEggs += chicken.getEggs();
            chicken.setEggs(0);
        }
        this.collectedEggs = totalEggs;
    }
    public void assignEggsForSale(Farm farm){
        farm.setEggsForSale(this.collectedEggs - 2);
        this.collectedEggs = 2;
    }

}
