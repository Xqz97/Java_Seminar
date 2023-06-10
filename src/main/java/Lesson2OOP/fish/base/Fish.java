package Lesson2OOP.fish.base;

import Lesson2OOP.aquarium.Location;

public abstract class Fish implements Location {
    protected String name;

    public Fish(String name) {
        this.name = name;
    }

    public abstract String whereFishLive();
    public abstract String whatFishEat();

    @Override
    public String toString() {
        return String.format("Fish: %s, Food: %s", name, whatFishEat());
    }
}
