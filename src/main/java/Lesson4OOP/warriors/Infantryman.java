package Lesson4OOP.warriors;

import Lesson4OOP.protect.Protection;
import Lesson4OOP.weapons.Melee;

public class Infantryman extends Warrior<Melee, Protection>{
    public Infantryman(String name, int healthPoint, Melee weapon, Protection shield) {
        super(name, healthPoint, weapon, shield) ;
    }
    @Override
    public String toString() {
        return String.format("Infantryman: %s", super.toString());
    }
}
