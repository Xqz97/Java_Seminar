package Lesson1OOP;

public class HomeWork {
    public static void main(String[] args) {
        CofeMashine oneOfCofeMashine = new CofeMashine();
        oneOfCofeMashine.addCofe(new Cofe("Американо", 250, 85, 180))
                .addCofe(new Cofe("Капучино", 340, 75, 390))
                .addCofe(new Cofe("Латте", 340, 75, 420))
                .addCofe(new CofeWithIceCream("Макиато с мороженным", 420, 45, 540, "Ванильное", 2));

        System.out.println(oneOfCofeMashine);
        Cofe cofeForSale = oneOfCofeMashine.saleCofe("Латте");
        System.out.println(cofeForSale);
        System.out.println(oneOfCofeMashine.getMoney());
        System.out.println(oneOfCofeMashine);
        }
}
