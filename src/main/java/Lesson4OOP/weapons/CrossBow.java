package Lesson4OOP.weapons;

public class CrossBow implements Ranged{
    @Override
    public int distance() {
        return 10;
    }

    @Override
    public int damage() {
        return 8;
    }

    public String toString() {
        return String.format("CrossBow: %d , Distance: %d ", damage(), distance());
    }
}
