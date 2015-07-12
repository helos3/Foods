package itlab.foods;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private String name;
    private String category;

    public Product(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Products {
    public List<Product> products;

    Products() {
        initializeData();
    }

    private void initializeData() {
        products = new ArrayList<>();
        products.add(new Product("Баклажан", "Молоко"));
        products.add(new Product("Макароны", "Помидоры"));
        products.add(new Product("Грибы", "Спайсы"));
    }
}