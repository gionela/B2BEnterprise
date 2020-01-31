package gr.codehub.B2BEnterprise.repository;

import gr.codehub.B2BEnterprise.model.Product;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data

public class Products {
    private List<Product> products;

    public Products() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
