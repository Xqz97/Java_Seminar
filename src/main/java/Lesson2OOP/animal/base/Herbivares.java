package Lesson2OOP.animal.base;

import Lesson2OOP.animal.base.Animal;

public abstract class Herbivares extends Animal {
    public Herbivares(String name) {
        super(name);
    }
    @Override
    public String whatAnimalEat(){
        return "grass";
    }

}
