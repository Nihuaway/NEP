package troxya.NEP.repositories;

import org.springframework.data.repository.CrudRepository;
import troxya.NEP.entities.Expense;

public interface ExpenseRepository extends CrudRepository<Expense, Long> {
}
