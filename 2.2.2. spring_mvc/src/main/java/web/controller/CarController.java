package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", required = false) Integer count , Model model) {
        if (count != null) {
            model.addAttribute("cars", CarService.getCountedCars(count));
        } else {
            model.addAttribute("cars", CarService.getAllCars());
        }
        return "cars";
    }
}
