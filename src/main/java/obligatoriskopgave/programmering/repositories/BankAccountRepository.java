package obligatoriskopgave.programmering.repositories;

import obligatoriskopgave.programmering.models.BankAccount;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BankAccountRepository extends CrudRepository<BankAccount, Long> {
     List<BankAccount> findAllBy();

     BankAccount save(BankAccount bankAccount);
}
