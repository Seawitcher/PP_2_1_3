package web.DAO;


import org.springframework.stereotype.Repository;
import web.model.Car;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;


@Repository
public class CarDAOImpl implements CarDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(Car car) {
        entityManager.persist(car);
    }

    @Override
    public List<Car> getList() {
        return entityManager.createQuery("select c from Car c", Car.class).getResultList();
    }

    @Override
    public Car getCar(int id) {
        return entityManager.find(Car.class, id);
    }

    @Override
    public void deleteCar(int id) {
        entityManager.remove(getCar(id));
    }

    @Override
    public void updateCar(Car car) {
        entityManager.merge(car);
    }
}
