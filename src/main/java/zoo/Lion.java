/*
    Program to practice OOP concepts - isA relationship to Animal
 */

package zoo;

public class Lion extends Animal{
    // Fields
    private String name;
    private String maneColor;
    private Boolean isWild;

    // Constructors
    public Lion() {
    }

    public Lion(String name, String maneColor, Boolean isWild) {
        this.name = name;
        this.maneColor = maneColor;
        this.isWild = isWild;
    }

    public Lion(String species, String gender, int age, String name, String maneColor, Boolean isWild) {
        super(species, gender, age);
        this.name = name;
        this.maneColor = maneColor;
        this.isWild = isWild;
    }

    //Setters and Getters
    public void setName(String name) {
        this.name = name;
    }

    public void setManeColor(String maneColor) {
        this.maneColor = maneColor;
    }

    public void setWild(Boolean wild) {
        isWild = wild;
    }

    public String getName() {
        return name;
    }

    public String getManeColor() {
        return maneColor;
    }

    public Boolean getWild() {
        return isWild;
    }

    // ToString
    @Override
    public String toString() {
        return "Lion: \n" +
                "name: " +  name + '\n' +
                "maneColor: " + maneColor + '\n' +
                "isWild: " + isWild;
    }

    // Method: Lion makeAMove() implementation
    @Override
    public void makeAMove() {
        System.out.println(this.getName()+" is pouncing.");
    }

    // Method: Lion makeASound() implementation
    @Override
    public void makeASound() {
        System.out.println(this.getName()+" is roaring.");
    }
}
