package com.example.rentalmobil.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.rentalmobil.model.CustomerModel;


@Controller
public class CustomerController {
    
    @RequestMapping("/customers")
    public String getCustomers(Model model) {
        List<CustomerModel> customers = CustomerModel.getCustomers();
        model.addAttribute("customers", customers);
        return "customers";
    }
    

}
