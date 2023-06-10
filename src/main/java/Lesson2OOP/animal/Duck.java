package Lesson2OOP.animal;

import Lesson2OOP.animal.base.Birds;
import Lesson2OOP.zoo.SpeedFlyOfAnimal;
import Lesson2OOP.zoo.SpeedMoveOfAnimal;

public class Duck extends Birds implements SpeedMoveOfAnimal, SpeedFlyOfAnimal {
    public Duck(String name) {
        super(name);
    }

    @Override
    public String howAnimalSound() {
        return "Cra-Cra";
    }

    @Override
    public String whatAnimalEat() {
        return "All of Food";
    }

    @Override
    public int getSomeSpeed() {
        return 40;
    }

    @Override
    public String toString() {
        return String.format("Duck: %s, Speed: %d, Speed of Fly: %d", super.toString(), getSomeSpeed(), getSomeSpeedOfFly());
    }

    @Override
    public int getSomeSpeedOfFly() {
        return 80;
    }
}
