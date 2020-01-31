package gr.codehub.B2BEnterprise.service;

import gr.codehub.B2BEnterprise.model.Customer;
import gr.codehub.B2BEnterprise.model.Product;
import gr.codehub.B2BEnterprise.repository.Customers;
import gr.codehub.B2BEnterprise.repository.Products;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface IServices {
    public Products showProducts(String filename) throws FileNotFoundException;
    public Customers showCustomers(String filename) throws FileNotFoundException;
    public String showWelcomeMessage(String filename) throws IOException;
    public Product getProductById(String filename, int id) throws FileNotFoundException;
    public Customer getCustomerById(String filename, int id) throws FileNotFoundException;
}
