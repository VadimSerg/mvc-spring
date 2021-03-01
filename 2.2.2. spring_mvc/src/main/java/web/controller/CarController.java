package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



@Controller
//@RequestMapping("/cars")
public class CarController {

    @Autowired
    CarService carService= new CarService();
    //List<Car> carList = carService.getListCars();
    List<Car> carList= carService.getSubListCar(6);

    @GetMapping(value = "/cars")
  //  @RequestMapping(value = "/cars")
    public String advertiseAcar(Model model){
        model.addAttribute("cars",carList);
        return "cars";
    }



}
