package com.springboot_sample.springboot_sample.controller;

import com.springboot_sample.springboot_sample.repository.CityRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityController {
    CityRepository cityRepository = new CityRepository();

    @PostMapping("city")
    public String create(@RequestParam String cityName) {
        return  cityRepository.create(cityName);
    }

    @GetMapping("city/{id}")
    public String read(@PathVariable Integer id) {
        return  cityRepository.read(id);
    }

    @GetMapping("city")
    public String readAll() {
        return cityRepository.readAll();
    }

    @PutMapping("city")
    public String update(@PathVariable Integer id, @RequestParam String cityName){
        return cityRepository.update(id, cityName);
    }

    @DeleteMapping("city/{id}")
    public String delete(@PathVariable Integer id ) {
        return cityRepository.delete(id);
    }
}
