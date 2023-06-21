package Lesson4OOP.weapons;

public class Axe implements Melee{
    @Override
    public int damage() {
        return 10;
    }

    public String toString() {
        return String.format("Axe: %d ", damage());
    }
}
