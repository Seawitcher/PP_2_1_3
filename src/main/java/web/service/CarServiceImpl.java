package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
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
}
