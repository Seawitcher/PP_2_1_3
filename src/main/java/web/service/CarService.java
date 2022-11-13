package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    public void add(Car car);

    public List<Car> getList();

    public Car getCar(int id);

    public void deleteCar(int id);

    public void updateCar(Car car);
}
