/*
    Program to practice OOP concepts - hasA relationship
 */

package zoo;

import java.util.ArrayList;

public class Zoo {
    // Fields
    private String name;
    private String address;
    ArrayList<Animal> animals;

    // Constructors
    public Zoo() {
    }

    public Zoo(String name, String address, ArrayList<Animal> animals) {
        this.name = name;
        this.address = address;
        this.animals = animals;
    }

    // Setters and Getters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAnimals(ArrayList<Animal> animals, Animal animal) {
        this.animals.add(animal);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    // ToString
    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", animals=" + animals +
                '}';
    }

    // List animals
    public void listAnimals(ArrayList<Animal> animals) {
        for (Animal animal: animals
             ) {
            if (animal instanceof Bird) {
                System.out.println("Bird: ");
                System.out.println("Name: "+((Bird) animal).getName());
                System.out.println("Species: "+ animal.getSpecies());
                System.out.println("Age: "+ String.valueOf(animal.getAge()));
                System.out.println("BeakColor: "+((Bird) animal).getBeakColor());
                System.out.println("===================");
            }
            if (animal instanceof Dolphin) {
                System.out.println("Dolphin: ");
                System.out.println("Name: "+((Dolphin) animal).getName());
                System.out.println("Species: "+ animal.getSpecies());
                System.out.println("Age: "+ String.valueOf(animal.getAge()));
                System.out.println("SkinColor: "+((Dolphin) animal).getskinColor());
                System.out.println("===================");
            }
            if (animal instanceof Lion) {
                System.out.println("Lion: ");
                System.out.println("Name: "+((Lion) animal).getName());
                System.out.println("Species: "+ animal.getSpecies());
                System.out.println("Age: "+ String.valueOf(animal.getAge()));
                System.out.println("ManeColor: "+((Lion) animal).getManeColor());
                System.out.println("===================");
            }
        }
    }
}
