package seminars.first.hw;

import java.util.Comparator;

public class Product{
    private int cost; // Стоимость продукта
    private String title; // Название

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.getTitle();
    }
}