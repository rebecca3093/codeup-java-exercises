package animals;

public class Fish extends Animal{

    private boolean isSaltWater;

    public Fish(String preferredClimate, boolean isSaltWater){
        //super(preferredClimate);
        this. isSaltWater = isSaltWater;
    }

    private boolean isSaltWater(){
        return isSaltWater;
    }

    public void setSaltWater (boolean saltwater){
        isSaltWater = saltwater;
    }

    @Override
    public String getAnimalInfo(){
        return "Fish Details: \n" +
                "Preferred Climate: " + preferredClimate + "\n" +
                "Water Habitat: " + (isSaltWater ? "saltwater" : "freshwater");
    }
}
