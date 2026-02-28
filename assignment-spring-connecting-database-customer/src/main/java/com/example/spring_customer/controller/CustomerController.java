package com.example.spring_customer.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.spring_customer.model.Customer;
import com.example.spring_customer.service.CustomerService;

@Controller
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/getCustomers")
    public String getCustomer(Model model) {
        List<Customer> customers = customerService.getAllCustomerDetails();
        model.addAttribute("customers", customers);
        return "customers";
    }

    @PostMapping("/deleteCustomer/{id}")
    public String deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomerDetail(id);
        return "redirect:/getCustomers";
    }

    @GetMapping("/showAddForm")
    public String showAddForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "addCustomer";
    }

    @PostMapping("/addCustomer")
    public String addCustomer(@ModelAttribute Customer customer) {
        customerService.addCustomerDetails(customer);
        return "redirect:/getCustomers";
    }

    @GetMapping("/showEditForm/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Customer customer = customerService.getCustomerById(id);   
        model.addAttribute("customer", customer);
        return "editCustomer";
    }

    @PostMapping("/editCustomer/{id}")
    public String editCustomer(@PathVariable Long id, @ModelAttribute Customer customer) { 
        customerService.updateCustomerDetails(id, customer); 
        return "redirect:/getCustomers";
    }
}