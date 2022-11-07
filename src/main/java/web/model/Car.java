package web.model;

import java.util.Objects;

public class Car {
    private int id;
    private String modelCar;
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
