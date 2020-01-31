package gr.codehub.B2BEnterprise.service;

import gr.codehub.B2BEnterprise.model.Customer;
import gr.codehub.B2BEnterprise.model.Product;
import gr.codehub.B2BEnterprise.repository.Customers;
import gr.codehub.B2BEnterprise.repository.Products;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.Scanner;

@Service
public class Services implements IServices {

    @Override
    public Products showProducts(String filename) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filename));
        Products products = new Products();
        products.getProducts().clear();
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] words = line.split(",");
            Product product = new Product(Integer.parseInt(words[0].trim()), words[1], Double.parseDouble(words[2].trim()), Integer.parseInt(words[3].trim()));
            products.addProduct(product);
        }
        return products;
    }
    @Override
    public Customers showCustomers(String filename) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filename));
        Customers customers = new Customers();
        customers.getCustomers().clear();
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] words = line.split(",");
            Customer customer = new Customer(Integer.parseInt(words[0].trim()), words[1], words[2], words[3]);
            customers.addCustomer(customer);
        }
        return customers;
    }

    @Override
    public String showWelcomeMessage(String filename) throws IOException {
        File file = new File(filename);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st = br.readLine();

        while (st != null) {
            st += "<br>" + br.readLine();//Cheating to change line
            break;
        }
        return st;
    }

    @Override
    public Product getProductById(String filename, int id) throws FileNotFoundException {
        Products products = showProducts(filename);
        return products.getProducts()
                .stream()
                .filter(product1 -> product1.getId() == id)
                .findFirst().get();
    }

    @Override
    public Customer getCustomerById(String filename, int id) throws FileNotFoundException {
        Customers customers = showCustomers(filename);
        return customers.getCustomers()
                .stream()
                .filter(customer -> customer.getId() == id)
                .findFirst()
                .get();
    }
}
