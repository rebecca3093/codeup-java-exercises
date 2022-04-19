import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {

    public static String[] adjectives = {"funny", "prompt", "prickly", "amazing", "incredible", "outdated", "presine", "jubial", "comical", "exuberant"};
    public static String[] nouns = {"desk", "guitar", "house", "car", "lawnmower", "duck", "chair", "poster", "event", "candle"};

    public static void main(String[] args){
        System.out.println("Your server name is: ");

    }

    public static String getRandomWord(String[] wordArray){
        Random random = new Random();
        int randomIndex = random.nextInt(wordArray.length);
        return wordArray[randomIndex];
    }
}
