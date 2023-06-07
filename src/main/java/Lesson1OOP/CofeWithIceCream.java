package Lesson1OOP;

public class CofeWithIceCream extends Cofe{
    private String iceCreamTaste;
    private double numOfIceCreamScoops;

    public CofeWithIceCream(String cofeName, double cofeVolume, double cofeTempreture, double cofeCost, String iceCreamTaste, double numOfIceCreamScoops) {
        super(cofeName, cofeVolume, cofeTempreture, cofeCost);
        this.iceCreamTaste = iceCreamTaste;
        this.numOfIceCreamScoops = numOfIceCreamScoops;
    }
    @Override
    public String toString() {
        return String.format("Кофе с мороженным: %s, Вкус мороженного: %s, Кол-во шариков: %f", super.toString(), iceCreamTaste, numOfIceCreamScoops);
    }
}
