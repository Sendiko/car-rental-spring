package com.example.rentalmobil.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.rentalmobil.model.CarModel;
import com.example.rentalmobil.repositories.CarRepository;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class CarController {
    private static final Logger logger = LoggerFactory.getLogger(CarController.class);
    private final CarRepository repository;

    public CarController(CarRepository repository) {
        this.repository = repository;
    }

    /* www.rentaljava.com */
    /* https://www.rentaljava.com/ */
    @RequestMapping("/")
    public String display(Model model) {
        model.addAttribute("cars", repository.getCars());
        return "index";
    }

    @GetMapping("/form")
    public String showCarForm(Model model) {
        model.addAttribute("carModel", new CarModel());
        return "form";
    }

    @PostMapping("/form")
    public String addCar(@ModelAttribute CarModel carModel) {
        carModel.setAvailable(true);
        logger.info("Received carModel from form: {}", carModel);
        repository.addCar(carModel);

        return "redirect:/";
    }

}
