package obligatoriskopgave.programmering.repositories;

import obligatoriskopgave.programmering.models.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    public List<Owner> findAll();
}
