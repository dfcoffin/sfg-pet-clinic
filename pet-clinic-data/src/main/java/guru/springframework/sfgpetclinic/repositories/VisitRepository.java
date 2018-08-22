package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by REMI Networks
 * User: don
 * Date: 8/22/18
 * Time: 1:37 PM
 **/
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
