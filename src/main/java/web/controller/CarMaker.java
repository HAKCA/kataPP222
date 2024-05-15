package web.controller;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarMaker {

    private final List<Car> cars = new ArrayList<>();

    public CarMaker() {
        cars.addAll(Arrays.asList(
                new Car("Lada", "2107", 1998),
                new Car("Chevrolet", "Camaro", 2010),
                new Car("BWM", "X5", 2020),
                new Car("Volvo", "S90", 2023),
                new Car("Hyundai", "Palisade I", 2021)
        ));
    }

    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
