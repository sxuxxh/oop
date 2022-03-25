package zoo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Greeting
        Zoo myZoo = new Zoo("\"DC ZOO\"","\"Zoo Park, Washington D.C. 20001\"",new ArrayList<Animal>());
        System.out.println("Welcome to "+myZoo.getName()+ " locates at "+myZoo.getAddress());

        // Animal Land
        System.out.println("\nYou are visiting Animal Land...");
        Animal myAnimal = new Animal("land","male",10);
        System.out.println("Say 'Hi' to animals.");
        myAnimal.makeAMove();
        myAnimal.makeASound();

        // Birds' Garden
        System.out.println("\nYou are visiting Birds' Garden...");
        Bird myBird = new Bird("air","male",1,"Mango","Rainbow");
        System.out.println("Say 'Hi' to "+myBird.toString());
        myBird.makeAMove();
        myBird.makeASound();

        // Dolphin Pool
        System.out.println("\nYou are visiting Dolphin Pool...");
        Dolphin myDolphin = new Dolphin("water","female",10,"Flipper","grey",true);
        System.out.println("Say 'Hi' to "+myDolphin.toString());
        myDolphin.makeAMove();
        myDolphin.makeASound();
        // Flipper giving birth
        Dolphin dolphinBaby = myDolphin.giveBirth();
        dolphinBaby.setGender("male");
        dolphinBaby.setAge(0);
        dolphinBaby.setSpecies("water");
        dolphinBaby.setskinColor("grey");
        dolphinBaby.setMarine(false);
        // Name baby
        dolphinBaby.setName("Finny");
        System.out.println("Look! Flipper just gave birth to her new baby "+dolphinBaby.getName()+ "!!");

        // Lion Mountain
        System.out.println("\nYou are visiting Lion Mountain...");
        Lion myLion = new Lion("water","male",15,"Simba","brown",true);
        System.out.println("Say 'Hi' to "+myLion.toString());
        myLion.makeAMove();
        myLion.makeASound();

        // Zoo residents
        System.out.println("\nOn behalf of the following zoo residents you have visited, Thank you and See You Again!!");
        myZoo.animals.add((Animal)myBird);
        myZoo.animals.add((Animal)myDolphin);
        myZoo.animals.add((Animal)dolphinBaby);
        myZoo.animals.add((Animal)myLion);
        myZoo.listAnimals(myZoo.animals);
    }
}
