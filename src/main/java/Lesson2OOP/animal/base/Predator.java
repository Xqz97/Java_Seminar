package Lesson2OOP.animal.base;

import Lesson2OOP.animal.base.Animal;

public abstract class Predator extends Animal {
    public Predator(String name) {
        super(name);
    }
    @Override
    public String whatAnimalEat(){
        return "meat";
    }
}
