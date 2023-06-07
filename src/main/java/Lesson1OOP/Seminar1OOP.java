package Lesson1OOP;

public class Seminar1OOP {
    public static void main(String[] args) {
        VendingMashine oneOfvendingMashine = new VendingMashine();
        oneOfvendingMashine.addProduct(new Chocolate("Alpen Gold", 100, "Молочный", "Темный", 1000))
                .addProduct(new Product("Пиво", 240)).addProduct(new Cheese("ДорБлю", 100, "Старый", 250));

        System.out.println(oneOfvendingMashine);
        Product productForSearch = oneOfvendingMashine.findProduct("Пиво");
        System.out.println(productForSearch);
        System.out.println("______________________________________________");
        Product productForSale = oneOfvendingMashine.saleProduct("Alpen Gold");
        System.out.println(productForSale);
        System.out.println(oneOfvendingMashine.getCash());
        System.out.println(oneOfvendingMashine);
    }

}
