package ExampleWithCar;

public class CarBuilder {
    String n = "Default";
    Transmission t = Transmission.MANUAL;
    int s = 120;

    CarBuilder buildMark(String n) {
        this.n = n;
        return this;
    }


    CarBuilder buildTransmission(Transmission t) {
        this.t = t;
        return this;
    }


    CarBuilder buildMaxSpeed(int s) {
        this.s = s;
        return this;
    }

    Car build() {
        Car car = new Car();
        car.setNameOfBrand(n);
        car.setTransmission(t);
        car.setMaxSpeed(s);
        return car;
    }

}