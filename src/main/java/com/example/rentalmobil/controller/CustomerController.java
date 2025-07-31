package com.example.rentalmobil.controller;

import com.example.rentalmobil.model.CustomerModel;
import com.example.rentalmobil.repositories.CustomerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String getCustomers(Model model) {
        model.addAttribute("customers", repository.getCustomers());
        return "customers"; // Renders customers.html
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("customerModel", new CustomerModel());
        return "customer-form"; // Renders customer-form.html
    }

    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable("id") int id, Model model) {
        model.addAttribute("customerModel", repository.findCustomerById(id));
        return "customer-form";
    }

    @PostMapping("/save")
    public String saveOrUpdateCustomer(@ModelAttribute CustomerModel customer) {
        if (customer.getIdCustomer() == 0) {
            repository.addCustomer(customer);
        } else {
            repository.updateCustomer(customer);
        }
        return "redirect:/customers";
    }

    @PostMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable("id") int id) {
        repository.deleteCustomer(id);
        return "redirect:/customers";
    }
}