package animals;

import java.sql.SQLOutput;

public class AnimalApp {

    public static void main(String[] args) {
        // oof - can not make a new instance of Animal itself
        // Animal is abstract!
//        Animal animal = new Animal()

        int numLegs = 4;
        String prefClimate = "In the house";

        Animal animal1 = new Dog(numLegs, prefClimate);

        System.out.println(animal1.getAnimalInfo());

        Animal animal2 = new Fish ("sub-Tropical", true);

        System.out.println(animal2.getAnimalInfo());

        Animal animal3 = new Cat( 3, "Where the dogs are not");

        System.out.println(animal3.getAnimalInfo());

    }



    // ENCAPSULATION - placing related code into classes
    // ABSTRACTION - obfuscate code from *where* it is being used
    // INHERITANCE - objects can *inherit* behaviors and data from other objects
    // POLYMORPHISM (many forms) - objects can stand in for other objects


}
