/*
    Program to practice OOP concepts - Interface
 */

package zoo;

public interface AnimalImplementationGuide{
    void makeAMove();
    void makeASound();

    default Animal giveBirth() {
        Animal baby = new Animal();
        baby.setAge(0);
        return baby;
    };
}
