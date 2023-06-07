package Lesson1OOP;

import java.util.ArrayList;
import java.util.List;

public class VendingMashine {
    private List<Product> listOfProduct = new ArrayList<>();
    private double cash = 0;

    public VendingMashine addProduct(Product prod) {
        listOfProduct.add(prod);
        return this;
    }

    public List<Product> getVending() {
        return listOfProduct;
    }

    public Product findProduct(String nameOfProduct) {
        for (Product product : listOfProduct) {
            if (nameOfProduct.equals(product.getProductName())) {
                return product;
            }
        }
        return null;
    }

    public double getCash() {
        return cash;
    }

    public Product saleProduct(String nameoOfSaleProduct) {
        Product foundedProduct = findProduct(nameoOfSaleProduct);
        if (foundedProduct != null) {
            cash += foundedProduct.getProductPrice();
            listOfProduct.remove(foundedProduct);
        }
        return foundedProduct;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Денег в автомате: ").append(cash).append(("\n"));
        for (Product product : listOfProduct
        ) {
            builder.append(product).append("\n");
        }
        return builder.toString();
    }
}
