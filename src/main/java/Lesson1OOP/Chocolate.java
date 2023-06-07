package Lesson1OOP;

public class Chocolate extends Product {
    private String chocoColor;
    private String chocoType;
    private int chocoCalories;

    public Chocolate(String productName, double productPrice, String chocoColor, String chocoType, int chocoCalories) {
        super(productName, productPrice);
        this.chocoColor = chocoColor;
        this.chocoType = chocoType;
        this.chocoCalories = chocoCalories;
    }
    @Override
    public String toString() {
        return String.format("Шоколад: %s, Вкус: %s, Цвет: %s, Каллории: %d", super.toString(), chocoType, chocoColor, chocoCalories);
    }
}
