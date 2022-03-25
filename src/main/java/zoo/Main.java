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
        System.out.println("Say 'Hi' to "+myAnimal.toString());
        myAnimal.makeAMove();
        myAnimal.makeASound();

        // Birds' Garden
        System.out.println("\nYou are visiting Birds' Garden...");
        Bird myBird = new Bird("Mango","Rainbow");
        System.out.println("Say 'Hi' to "+myBird.toString());
        myBird.makeAMove();
        myBird.makeASound();

        // Dolphin Pool
        System.out.println("\nYou are visiting Dolphin Pool...");
        Dolphin myDolphin = new Dolphin("Flipper","grey",true);
        System.out.println("Say 'Hi' to "+myDolphin.toString());
        myDolphin.makeAMove();
        myDolphin.makeASound();

        // Lion Mountain
        System.out.println("\nYou are visiting Lion Mountain...");
        Lion myLion = new Lion("Simba","brown",true);
        System.out.println("Say 'Hi' to "+myLion.toString());
        myLion.makeAMove();
        myLion.makeASound();

        // Zoo residents
        System.out.println("\nOn behalf of the following zoo residents you have visited, Thank you and Goodbye!!");
        myZoo.animals.add((Animal)myBird);
        myZoo.animals.add((Animal)myDolphin);
        myZoo.animals.add((Animal)myLion);
        System.out.println(myZoo.animals);
    }
}
