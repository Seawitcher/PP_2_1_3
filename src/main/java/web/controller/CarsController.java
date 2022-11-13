package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping
    public String getCars(Model model) {
        model.addAttribute("carList", carService.getList());
        return "car";
    }

    @GetMapping("/newAddCar")
    public String addNewCar(Model model) {
        Car car = new Car();
        model.addAttribute("car", car);
        return "car_info";
    }

    @PostMapping
    public String saveNewCar (@ModelAttribute("car") Car car) {
        carService.add(car);
        return "redirect:/";
    }
    @DeleteMapping("delete/{id}")
    public String deleteCar(@PathVariable("id") int id) {
        carService.deleteCar(id);
        return "redirect:/";
    }
    @GetMapping("/updateCar/{id}")
    public String updateCar(Model model, @PathVariable("id") int id) {

        model.addAttribute("car", carService.getCar(id));
        return "car_info";
    }
    @PatchMapping("{id}")
    public String carSaveUpdate(@PathVariable("id") int id, @ModelAttribute("car") Car car) {
        carService.updateCar(car);
        return "redirect:/";
    }

}
