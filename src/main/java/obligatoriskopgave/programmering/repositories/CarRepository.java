package obligatoriskopgave.programmering.repositories;

import obligatoriskopgave.programmering.models.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {

    public List<Car> findAll();

    public Car save(Car car);
}
