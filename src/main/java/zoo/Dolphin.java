package zoo;

public class Dolphin extends Animal{
    // Fields
    private String name;
    private String skinColor;
    private Boolean isMarine;

    // Constructors
    public Dolphin() {
    }

    public Dolphin(String  name, String skinColor, Boolean isMarine) {
        this.name =  name;
        this.skinColor = skinColor;
        this.isMarine = isMarine;
    }

    public Dolphin(String species, String gender, int age, String name, String skinColor, Boolean isMarine) {
        super(species, gender, age);
        this.name = name;
        this.skinColor = skinColor;
        this.isMarine = isMarine;
    }

    // Setters and Getters
    public void setName(String name) {
        this.name = name;
    }

    public void setskinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public void setMarine(Boolean marine) {
        isMarine = marine;
    }

    public String getName() {
        return name;
    }

    public String getskinColor() {
        return skinColor;
    }

    public Boolean getMarine() {
        return isMarine;
    }

    // ToString
    @Override
    public String toString() {
        return "Dolphin{" +
                "name='" + name + '\'' +
                ", skinColor='" + skinColor + '\'' +
                ", isMarine=" + isMarine +
                '}';
    }

    // Method:
    public void makeAMove() {
        System.out.println(this.getName()+" is swimming.");
    }

    public void makeASound() {
        System.out.println(this.getName()+" is humming.");
    }
}
