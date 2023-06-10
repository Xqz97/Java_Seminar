package Lesson2OOP.fish;

import Lesson2OOP.aquarium.FishSwimmingSpeed;
import Lesson2OOP.fish.base.GoodFish;

public class Omul extends GoodFish implements FishSwimmingSpeed {
    public Omul(String name) {
        super(name);
    }

    @Override
    public String whereFishLive() {
        return "Lake";
    }
    @Override
    public String toString() {
        return String.format("Omul: %s, Speed: %f", super.toString(), getFishSwimmingSpeed());
    }

    @Override
    public double getFishSwimmingSpeed() {
        return 50.0;
    }
}
