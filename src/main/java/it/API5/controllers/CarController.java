package it.API5.controllers;

import it.API5.entities.CarDTO;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;


@RestController
@RequestMapping("/car")
public class CarController {

    @GetMapping(value = "/newCar")
    public String newCar(@RequestParam(required = false) CarDTO car, @RequestParam String id, @RequestParam String modelName, @RequestParam double price ){
        car = new CarDTO(id, modelName, price);
        return car.toString();
    }

    @PostMapping(value = "/CarInfo")
    public String getCarInfo(@Valid @RequestBody CarDTO car,HttpServletResponse responce){
        if(responce != null){
            System.out.println("ok");
        }
        return car.toString();
    }
}
