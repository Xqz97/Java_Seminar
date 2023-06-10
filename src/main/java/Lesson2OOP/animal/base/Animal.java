package Lesson2OOP.animal.base;

import Lesson2OOP.zoo.Soundable;

public abstract class Animal implements Soundable {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String howAnimalSound();
    public abstract String whatAnimalEat();

    @Override
    public String toString() {
        return String.format("Name of animal: %s, Food: %s", name, whatAnimalEat());
    }
}
