package com.example.rentalmobil.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.rentalmobil.model.CarModel;
import com.example.rentalmobil.repositories.CarRepository;


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
    public String showAddForm(Model model) {
        model.addAttribute("carModel", new CarModel());
        return "form";
    }

    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable("id") int id, Model model) {
        CarModel car = repository.findCarById(id);
        model.addAttribute("carModel", car);
        return "form"; // We re-use the same form.html
    }

    @PostMapping("/form")
    public String saveOrUpdateCar(@ModelAttribute CarModel carModel) {
        if (carModel.getIdMobil() == 0) {
            carModel.setAvailable(true);
            logger.info("Adding new car: {}", carModel);
            repository.addCar(carModel);
        }
        else {
            logger.info("Updating car with ID {}: {}", carModel.getIdMobil(), carModel);
            repository.updateCar(carModel);
        }
        return "redirect:/";
    }

    @PostMapping("/delete/{id}")
    public String deleteCar(@PathVariable("id") int id) {
        logger.info("Deleting car with ID {}", id);
        repository.deleteCar(id);
        return "redirect:/";
    }

}
