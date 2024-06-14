import Transport.Bicycle;
import Transport.Car;
import Transport.Truck;
import service.ServiceStation;

import java.time.temporal.Temporal;

public class Main {
    public static void main(String[] args) {
        ServiceStation serviceStation = new ServiceStation();
        Car car = new Car("Audi", 4);
        Bicycle bicycle = new Bicycle("BMX", 2);
        Truck truck = new Truck("VAZ", 6);
        serviceStation.check(car);
        serviceStation.check(bicycle);
        serviceStation.check(truck);
    }
}