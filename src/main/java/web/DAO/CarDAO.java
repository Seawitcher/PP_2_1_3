package web.DAO;

import web.model.Car;

import java.util.List;

public interface CarDAO {
   List<Car> getMyCarsList(int i);
   public void add(Car car);
   public List<Car> getList();
}
