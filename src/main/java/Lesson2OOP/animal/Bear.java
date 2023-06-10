package Lesson2OOP.animal;

import Lesson2OOP.animal.base.Predator;
import Lesson2OOP.zoo.SpeedMoveOfAnimal;

public class Bear extends Predator implements SpeedMoveOfAnimal {
    public Bear(String name) {
        super(name);
    }

    @Override
    public String howAnimalSound() {
        return "Rawr";
    }

    @Override
    public String toString() {
        return String.format("Bear: %s, Speed: %d", super.toString(), getSomeSpeed());
    }

    @Override
    public int getSomeSpeed() {
        return 25;
    }
}
