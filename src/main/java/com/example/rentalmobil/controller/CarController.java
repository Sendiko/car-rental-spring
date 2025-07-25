package com.example.rentalmobil.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.rentalmobil.model.CarModel;

@Controller
public class CarController {
    
    /* www.rentaljava.com */ 
    /* https://www.rentaljava.com/ */ 
    @RequestMapping("/")
    public String display(Model model) {
        ArrayList<CarModel> cars = CarModel.getCarList();
        model.addAttribute("cars", cars);
        return "index";
    }

    /* www.rentaljava.com */ 
    /* https://www.rentaljava.com/greeting */
    @RequestMapping("/greeting")
    public String greeting(Model model) {
        /* Membuat sebuah variable bernama greeting dengan value "Halo, Sendiko" */
        model.addAttribute("greeting", "Halo, Indah");
        return "greeting"; /* Menampilkan file greeting.jsp */
    }

    @RequestMapping("/form")
    public String showCarForm() {
        return "form";
    }

}
