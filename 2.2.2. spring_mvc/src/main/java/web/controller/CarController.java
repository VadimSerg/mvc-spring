package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



@Controller
public class CarController {

    @Autowired
    CarService carService;
    //List<Car> carList = carService.getListCars(5);


    @GetMapping(value = "/cars")
    public String getAllCars(@RequestParam(value = "count",required = false) Integer count,Model model){

        model.addAttribute("cars",carService.getListCars(count));
        return "cars";
    }
}
