package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private static final List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("testCar0", 100, 1992));
        cars.add(new Car("testCar1", 193, 1994));
        cars.add(new Car("testCar2", 200, 2001));
        cars.add(new Car("testCar3", 546, 2005));
        cars.add(new Car("testCar4", 764, 2007));
    }

    public static List<Car> getCountedCars(Integer count) {
             return cars.stream().limit(count).collect(Collectors.toList());
    }

    public static List<Car> getAllCars() {
        return cars;
    }
}

