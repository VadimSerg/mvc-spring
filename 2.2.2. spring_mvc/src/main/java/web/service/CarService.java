package web.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.buffer.LimitedDataBufferList;
import org.springframework.stereotype.Service;
import web.controller.CarController;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

   @Autowired
   private CarController carController;

   public List<Car> getListCars(Integer count){

      // Integer number = ((count==null)||count>=cars.size()||count==0) ? cars.size() : count;
//        Integer number=((count!=null) && count < cars.size())? count : cars.size();
//        List<Car> carList = cars.subList(0, number);
//        return carList;
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota",1800,20));
        cars.add(new Car("BMV", 1000, 10));
        cars.add(new Car("Mazda",4500,78));
        cars.add(new Car("Hammer", 3000, 90));
        cars.add(new Car("Mercedes",120, 45));
        return ((count!=null) && count < cars.size())? cars.subList(0,count) : cars;
    }
}
