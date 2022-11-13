package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getMyCarsList(int i);
    public void add(Car car);
    public List<Car> getList();
}
