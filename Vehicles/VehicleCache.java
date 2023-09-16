package Vehicles;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehicleCache {

    private final Map<String, Vehicle> cache = new HashMap<>();

    public VehicleCache() {
        Car car = new Car("Bugatti", "Chiron", "Blue", 261, new GpsSystem());
        Bus bus = new Bus("Mercedes", "Setra", "White", 48);

        cache.put("Bugatti Chiron", car);
        cache.put("Mercedes Setra", bus);
    }

    public Vehicle get(String key) {
        return (Vehicle) cache.get(key).clone();
    }

    public void put(List<Vehicle> vehicles) {
        vehicles.forEach(vehicle -> cache.put(vehicle.getBrand() + " " + vehicle.getModel(), vehicle));
    }

}
