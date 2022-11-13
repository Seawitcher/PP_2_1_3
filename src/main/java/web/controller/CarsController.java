package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarsController {
    private CarService carService;
@Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String getCars(@RequestParam("count") int count, Model model) {

    model.addAttribute("myCars", carService.getMyCarsList(count));
        return "cars";
    }
    @GetMapping("/user")
    public String getCars(Model model) {
        model.addAttribute("carList", carService.getList());
        return "cars";
    }

    @GetMapping("/new")
    public String addCar(Model model) {
        model.addAttribute("car", new Car());
        return "new_car";
    }
}
