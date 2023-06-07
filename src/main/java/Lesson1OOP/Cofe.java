package Lesson1OOP;

public class Cofe {
    private String cofeName;
    private double cofeVolume;
    private double cofeTempreture;
    private double cofeCost;

    public Cofe(String cofeName, double cofeVolume, double cofeTempreture, double cofeCost) {
        this.cofeName = cofeName;
        this.cofeVolume = cofeVolume;
        this.cofeTempreture = cofeTempreture;
        this.cofeCost = cofeCost;
    }

    @Override
    public String toString() {
        return String.format("Кофе: %s, Объем: %f, Температура: %f, Цена: %f", cofeName, cofeVolume, cofeTempreture, cofeCost);
    }

    public double getCofeCost() {
        return cofeCost;
    }

    public double getCofeTempreture() {
        return cofeTempreture;
    }

    public double getCofeVolume() {
        return cofeVolume;
    }

    public String getCofeName() {
        return cofeName;
    }
}
