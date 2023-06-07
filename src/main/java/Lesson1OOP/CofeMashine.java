package Lesson1OOP;

import java.util.ArrayList;
import java.util.List;

public class CofeMashine {
    private List<Cofe> listOfCofe = new ArrayList<>();
    private double money = 0;

    public CofeMashine addCofe(Cofe cofe) {
        listOfCofe.add(cofe);
        return this;
    }
    public List<Cofe> getListOfCofe(){
        return listOfCofe;
    }
    // Функция поиска по имени кофе, чтобы потом продать.
    public Cofe findCofe(String nameOfCofe){
        for (Cofe cofe: listOfCofe) {
            if (nameOfCofe.equals(cofe.getCofeName())){
                return cofe;
            }
        }
        return null;
    }
    public double getMoney(){
        return money;
    }

    public Cofe saleCofe(String nameOfSaleCofe) {
        Cofe foundedCofe = findCofe(nameOfSaleCofe);
        if (foundedCofe != null) {
            money += foundedCofe.getCofeCost();
            listOfCofe.remove(foundedCofe);
        }
        return foundedCofe;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Денег в автомате: ").append(money).append(("\n"));
        for (Cofe cofe : listOfCofe
        ) {
            builder.append(cofe).append("\n");
        }
        return builder.toString();
    }
}
