package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAOImpl implements CarDAO{
    private static int CAR_ID;

    private final List<Car> myCars;

    {
        myCars = new ArrayList<>();
        myCars.add(new Car(++CAR_ID,"Chevrolet","Silver"));
        myCars.add(new Car(++CAR_ID,"Toyota","Red"));
        myCars.add(new Car(++CAR_ID,"Subaru","Black"));
        myCars.add(new Car(++CAR_ID,"Ford","Red"));
        myCars.add(new Car(++CAR_ID,"Suzuki","Blue"));
    }
@Override
    public List<Car> getMyCarsList(int i) {
        if(i <=0) {
            return myCars;
        }
        return myCars.stream().limit(i).collect(Collectors.toList());
    }
}
