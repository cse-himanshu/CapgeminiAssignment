package com.example.spring_customer.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.spring_customer.model.Customer;
import com.example.spring_customer.repository.CustomerRepository;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomerDetails() {
        return customerRepository.findAll();
    }

    public void addCustomerDetails(Customer customer) {
        customerRepository.save(customer);
    }

    public void deleteCustomerDetail(Long id) {
        customerRepository.deleteById(id);
    }

    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id) 
                .orElseThrow(() -> new RuntimeException("Customer not found: " + id));
    }

    public void updateCustomerDetails(Long id, Customer customer) {
        Customer oldCustomer = getCustomerById(id);  
        oldCustomer.setName(customer.getName()); 
        oldCustomer.setBill(customer.getBill());  
        customerRepository.save(oldCustomer);   
    }
}