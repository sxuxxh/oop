/*
    Program to practice OOP concepts - isA relationship
 */

package zoo;

public class Animal implements AnimalImplementationGuide{
    // Fields
    private String species;
    private String gender;
    private int age;

    // Constructors
    public Animal() {
    }

    public Animal(String species, String gender, int age) {
        this.species = species;
        this.gender = gender;
        this.age = age;
    }

    // Setters and Getters
    public void setSpecies(String species) {
        this.species = species;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    // ToString
    @Override
    public String toString() {
        return "Animal: \n" +
                "species: " + species + '\n' +
                "gender: " + gender + '\n' +
                "age: " + age;
    }

    // Method: animal makeAMove() implementation
    public void makeAMove() {
        System.out.println("Animals are making moves.");
    }

    // Method: animal makeASound() implementation
    public void makeASound() {
        System.out.println("Animals are making sounds.");
    }

    // Method: check isLand animal
    public static Boolean isLand(String species) {
        Boolean ret = false;
        if (species.equals("land")) {
            ret = true;
        } else {
            ret = false;
        }
        return ret;
    }
}
