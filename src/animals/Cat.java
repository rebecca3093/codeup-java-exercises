package animals;

public class Cat extends Animal{
    private boolean needsTuna = true;
    private boolean wantsAttention = false;

    public Cat(int numberOfLegs, String prefurredClimate){
    super(numberOfLegs, prefurredClimate);

    }
    @Override
    public String getAnimalInfo(){
        return "Cat Details : /n" +
                "Number of Legs: " + numberOfLegs + "/n" +
                "Preferred Climate: " + preferredClimate + "/n";

    }
}




