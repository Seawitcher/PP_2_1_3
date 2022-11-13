package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.Car;
import web.service.CarService;

@Controller
@RequestMapping("/")
public class CarsController {
    private CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    //    @GetMapping()
//    public String getCars(@RequestParam("count") int count, Model model) {
//
//    model.addAttribute("myCars", carService.getMyCarsList(count));
//        return "cars";
//    }
    @GetMapping
    public String getCars(Model model) {
        model.addAttribute("carList", carService.getList());
        return "car";
    }

    @GetMapping("/new")
    public String addCar(Model model) {
        Car car = new Car();
        model.addAttribute("car", car);
        return "car-info";
    }
}
