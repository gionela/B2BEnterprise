package gr.codehub.B2BEnterprise.repository;

import gr.codehub.B2BEnterprise.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor

public class Customers {
    List<Customer> customers;

    public Customers() {
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
}
