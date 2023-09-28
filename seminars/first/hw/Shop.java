package seminars.first.hw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * @return отсортированный по возрастанию и цене список продуктов
     */
    public List<Product> getSortedListProducts() {
        return this.products.stream()
                .sorted((Product a,Product b) -> Integer.compare(a.getCost(),b.getCost()))
                .collect(Collectors.toList());
    }

    /**
     * @return самый дорогой продукт
     */
    public Product getMostExpensiveProduct() {
        return this.products.stream()
                .max((Product a,Product b) -> Integer.compare(a.getCost(),b.getCost()))
                .orElseThrow();
    }

    public void print(List<Product> products){
        for (Product product:
                products) {
            System.out.print(product.getCost() + " ");
        }
        System.out.println();
    }
}