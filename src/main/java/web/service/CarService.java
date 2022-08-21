package web.service;

import web.models.Car;

import java.util.List;

public class CarService {

    public static List<Car> getCarByCount(List<Car> cars, String count) {
        return (count != null) ? cars.stream().limit(Integer.parseInt(count)).toList() : cars;
    }
}
