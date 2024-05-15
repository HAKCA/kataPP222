package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    CarMaker carMaker = new CarMaker();

    @GetMapping("/cars")
    public String loadCars(@RequestParam(value = "count", required = false,
            defaultValue = "5") Integer count, Model model) {
        List<Car> cars = new ArrayList<>();
        model.addAttribute("cars", carMaker.getCars(count));
        return "cars";
    }

}
