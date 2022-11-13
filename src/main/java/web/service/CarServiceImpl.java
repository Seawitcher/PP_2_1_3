package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.DAO.CarDAO;
import web.model.Car;

import java.util.List;

//@Component
@Service
public class CarServiceImpl implements CarService {

    private CarDAO carDAO;

    @Autowired
    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getMyCarsList(int i) {
        return carDAO.getMyCarsList(i);
    }

    @Override
    @Transactional
    public void add(Car car) {
        carDAO.add(car);
    }

    @Override
    @Transactional
    public List<Car> getList() {
        return carDAO.getList();
    }

    @Override
    @Transactional
    public Car getCar(int id) {
        return carDAO.getCar(id);
    }
    @Override
    @Transactional
    public void deleteCar(int id) {
        carDAO.deleteCar(id);
    }
    @Override
    @Transactional
    public void updateCar(Car car) {
        carDAO.updateCar(car);
    }
}
