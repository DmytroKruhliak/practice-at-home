package ExampleWithCar;

public class Car {
    private String nameOfBrand;
    private Transmission transmission;
    private int maxSpeed;

    public void setNameOfBrand(String nameOfBrand) {
        this.nameOfBrand = nameOfBrand;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nameOfBrand='" + nameOfBrand + '\'' +
                ", transmission=" + transmission +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
