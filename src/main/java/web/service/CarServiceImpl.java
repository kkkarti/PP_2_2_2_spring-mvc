package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Lada", "VAZ", 2008));
        cars.add(new Car("BWM", "E34", 1999));
        cars.add(new Car("Honda", "Civic", 2006));
        cars.add(new Car("Porshe", "911", 2022));
        cars.add(new Car("Citroen", "C4", 2012));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, count);
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}
