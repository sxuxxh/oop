package zoo;

public class Bird extends Animal{
    // Fields
    private String name;
    private String beakColor;

    // Constructors
    public Bird() {
    }
    public Bird(String name, String beakColor) {
        this.name = name;
        this.beakColor = beakColor;
    }
    public Bird(String species, String gender, int age, String name, String beakColor) {
        super(species, gender, age);
        this.name = name;
        this.beakColor = beakColor;
    }

    // Setters and Getters
    public void setName(String name) {
        this.name = name;
    }

    public void setBeakColor(String beakColor) {
        this.beakColor = beakColor;
    }

    public String getBeakColor() {
        return beakColor;
    }

    public String getName() {
        return name;
    }

    // ToString
    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", beakColor='" + beakColor + '\'' +
                '}';
    }

    // Method:
    public void makeAMove() {
        System.out.println(this.getName()+" is flying.");
    }

    // Method:
    public void makeASound() {
        System.out.println(this.getName()+" is chirping.");
    }

}
