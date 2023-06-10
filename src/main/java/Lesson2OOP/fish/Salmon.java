package Lesson2OOP.fish;

import Lesson2OOP.aquarium.FishSwimmingSpeed;
import Lesson2OOP.fish.base.GoodFish;

public class Salmon extends GoodFish implements FishSwimmingSpeed {
    public Salmon(String name) {
        super(name);
    }

    @Override
    public String whereFishLive() {
        return "River";
    }

    @Override
    public String toString() {
        return String.format("Salmon: %s, Speed: %f", super.toString(), getFishSwimmingSpeed());
    }

    @Override
    public double getFishSwimmingSpeed() {
        return 70.0;
    }
}
