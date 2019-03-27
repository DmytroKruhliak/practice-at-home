package ExampleWithCar;

public class Main {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .buildMark("Mercedes")
                .buildTransmission(Transmission.AUTO)
                .buildMaxSpeed(280)
                .build()
                ;
        System.out.println(car.toString());
    }
}
