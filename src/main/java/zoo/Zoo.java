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
}
