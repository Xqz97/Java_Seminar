package Lesson4OOP.weapons;

public class Bow implements Ranged{
    @Override
    public int distance() {
        return 7;
    }

    @Override
    public int damage() {
        return 10;
    }

    public String toString() {
        return String.format("Bow: %d , Distance: %d ", damage(), distance());
    }
}
