package com.springboot_sample.springboot_sample.repository;

import java.util.ArrayList;

public class CityRepository {

    ArrayList<String> city = new ArrayList<>();

    public CityRepository(){
        this.city.add("Chisinau");
        this.city.add("Balti");
        this.city.add("Ungheni");
        this.city.add("Singerei");
    }

    public String create(String cityName){
        this.city.add(cityName);
        return "City created";
    }

    public String read(Integer id){
        try{
            return id +":" + this.city.get(id);
        } catch (Exception exception){
            return "Not found";
        }
    }

    public String readAll() { return this.city.toString();}

    public String update(Integer id, String cityName){
        try {
            this.city.set(id, cityName);
            return "City updated";
        } catch (Exception exception){
            return "City not found";
        }
    }

    public String delete(Integer id){
        try {
            this.city.remove(this.city.get(id));
            return "City deleted";
        } catch (Exception exception){
            return "City not found";
        }
    }
}
