package com.example.rentalmobil.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.rentalmobil.model.TransactionModel;


@Controller
public class TransactionController {

    @RequestMapping("/transactions")
    public String getTransactions(Model model) {
        return "transactions";
    }
    

}
