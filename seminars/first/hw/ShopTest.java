package seminars.first.hw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {
    public static void main(String[] args) {

    /*
     1. Проверить, что магазин хранит верный список продуктов (количество продуктов, состав корзины)
     2. Проверить, что магазин возвращает верный самый дорого продукт getMostExpensiveProduct
     3. Проверить, что магазин возвращает верный отсортированный по цене список продуктов
    */
        Product product1 = new Product();
        product1.setTitle("apple");
        product1.setCost(100);

        Product product2 = new Product();
        product2.setTitle("banana");
        product2.setCost(80);

        Product product3 = new Product();
        product3.setTitle("melon");
        product3.setCost(150);

        Product product4 = new Product();
        product4.setTitle("potato");
        product4.setCost(30);

        List<Product> products = new ArrayList<Product>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        Shop shop = new Shop();
        shop.setProducts(products);

        // Проверка, что метод getSortedListProducts сортирует продукты по цене
        assertThat(shop.getSortedListProducts().stream().map(x -> x.getCost())).isSorted();

        // Проверка, что метод getMostExpensiveProduct, возвращает продукт с максимальной ценой
        assertThat(shop.getMostExpensiveProduct()).isEqualTo(product3);

    }
}




