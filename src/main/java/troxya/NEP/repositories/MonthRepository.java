package troxya.NEP.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import troxya.NEP.entities.Month;

import java.util.List;

@Repository
public interface MonthRepository extends CrudRepository<Month, Long> {

}
