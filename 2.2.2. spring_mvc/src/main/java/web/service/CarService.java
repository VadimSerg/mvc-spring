package web.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.controller.CarController;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

//   @Autowired
  // CarController carController;

   List<Car> cars = new ArrayList<>();

   public  CarService() {
       cars.add(new Car("Toyota",1800,20));
       cars.add(new Car("BMV", 1000, 10));
       cars.add(new Car("Mazda",4500,78));
       cars.add(new Car("Hammer", 3000, 90));
       cars.add(new Car("Mercedes",120, 45));
   }

    public List<Car> getListCars(){
     return cars;

   }


   public List<Car> getSubListCar(int number) {

        int count = (number>0)&&(number<=cars.size())?number:cars.size();
        List<Car> subListCar =cars.subList(0,count);
        return  subListCar;
   }


}
