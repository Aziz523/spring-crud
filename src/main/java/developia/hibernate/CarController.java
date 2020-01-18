package developia.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @RequestMapping("/cars")
    public String getCars(Model model){
        Iterable<Car> cars = carRepository.findAll();
        model.addAttribute("cars", cars);
        return "cars";
    }
}