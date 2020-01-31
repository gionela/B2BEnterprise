package gr.codehub.B2BEnterprise.controller;

import gr.codehub.B2BEnterprise.model.Customer;
import gr.codehub.B2BEnterprise.model.Product;
import gr.codehub.B2BEnterprise.repository.Customers;
import gr.codehub.B2BEnterprise.repository.Products;
import gr.codehub.B2BEnterprise.service.IServices;
import gr.codehub.B2BEnterprise.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.io.IOException;

@RestController
public class ServicesController {
    @Autowired
    IServices iService;

    @GetMapping
    public String getHello() throws IOException {
        return iService.showWelcomeMessage("intro.txt");
    }

    @GetMapping("products")
    public Products getProductsController() throws FileNotFoundException {
        return iService.showProducts("products.csv");
    }

    @GetMapping("products/{id}")
    public Product getProductByIdController(@PathVariable int id) throws FileNotFoundException {
        return iService.getProductById("products.csv", id);
    }

    @GetMapping("customers")
    public Customers getCustomersController() throws FileNotFoundException {
        return iService.showCustomers("customers.csv");
    }

    @GetMapping("customers/{id}")
    public Customer getCustomerByIdController(@PathVariable int id) throws FileNotFoundException {
        return iService.getCustomerById("customers.csv", id);
    }
}
