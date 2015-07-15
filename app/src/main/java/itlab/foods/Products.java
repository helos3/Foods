package itlab.foods;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Рушан on 15.07.2015.
 */
public class Products {
    public List<Product> defProducts, custProducts;

    public Products() {
        initializeData();
    }

    private void initializeData() {
        custProducts = new ArrayList<>();
        defProducts = new ArrayList<>();
        defProducts.add(new Product("values.r,", "йцу"));
        defProducts.add(new Product("ыфв", "asd"));
        defProducts.add(new Product("фыв", "zxc"));
        defProducts.add(new Product("qwe", "qwe"));
        defProducts.add(new Product("asd", "asd"));
        defProducts.add(new Product("zxc", "zxc"));
        defProducts.add(new Product("qwe", "qwe"));
        defProducts.add(new Product("asd", "asd"));
        defProducts.add(new Product("zxc", "zxc"));
        defProducts.add(new Product("qwe", "qwe"));
        defProducts.add(new Product("asd", "asd"));
        defProducts.add(new Product("zxc", "zxc"));
    }

    public List<Product> getDefProducts() {
        return defProducts;
    }
    public List<Product> getCustProducts() {return custProducts;}

}