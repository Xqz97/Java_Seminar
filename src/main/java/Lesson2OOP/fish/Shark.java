package Lesson2OOP.fish;

import Lesson2OOP.animal.base.Predator;
import Lesson2OOP.aquarium.FishSwimmingSpeed;
import Lesson2OOP.fish.base.EvilFish;

public class Shark extends EvilFish implements FishSwimmingSpeed {
    public Shark(String name) {
        super(name);
    }

    @Override
    public String whereFishLive() {
        return "Sea";
    }

    @Override
    public String toString() {
        return String.format("Shark: %s, Speed: %f", super.toString(), getFishSwimmingSpeed());
    }

    @Override
    public double getFishSwimmingSpeed() {
        return 80.0;
    }
}
