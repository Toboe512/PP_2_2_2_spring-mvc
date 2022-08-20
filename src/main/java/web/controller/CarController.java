package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/car")
    public String getCar(@RequestParam(value = "count", required = false) String count, ModelMap model) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Модель1", 1, "карсный"));
        cars.add(new Car("Модель2", 2, "чёрный"));
        cars.add(new Car("Модель3", 3, "зелёный"));
        cars.add(new Car("Модель4", 4, "белый"));
        cars.add(new Car("Модель5", 5, "синий"));

        model.addAttribute("cars", CarService.getCarByCount(cars, count));
        return "car";
    }
}
