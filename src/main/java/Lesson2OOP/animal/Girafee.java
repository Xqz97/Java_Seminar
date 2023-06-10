package Lesson2OOP.animal;

import Lesson2OOP.animal.base.Herbivares;
import Lesson2OOP.zoo.SpeedMoveOfAnimal;

public class Girafee extends Herbivares implements SpeedMoveOfAnimal {
    public Girafee(String name) {
        super(name);
    }

    @Override
    public String howAnimalSound(){
        return "like Giragge";
    }

    @Override
    public String toString() {
        return String.format("Giraffe: %s Speed: %d", super.toString(), getSomeSpeed());
    }

    @Override
    public int getSomeSpeed() {
        return 9;
    }
}
