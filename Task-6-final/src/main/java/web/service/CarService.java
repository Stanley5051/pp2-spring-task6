package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2020));
        cars.add(new Car("BMW", "X5", 2021));
        cars.add(new Car("Audi", "A6", 2019));
        cars.add(new Car("Mercedes", "E-Class", 2021));
        cars.add(new Car("Lexus", "RX 350", 2020));
    }

    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}

