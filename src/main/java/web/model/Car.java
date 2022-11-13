package web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;
@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "model")
    private String modelCar;
    @Column(name = "color")
    private String colorCar;


    public Car() {
    }

    public Car(int id, String modelCar, String colorCar) {
        this.id = id;
        this.modelCar = modelCar;
        this.colorCar = colorCar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", modelCar='" + modelCar + '\'' +
                ", colorCar='" + colorCar + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Objects.equals(modelCar, car.modelCar) && Objects.equals(colorCar, car.colorCar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, modelCar, colorCar);
    }
}
