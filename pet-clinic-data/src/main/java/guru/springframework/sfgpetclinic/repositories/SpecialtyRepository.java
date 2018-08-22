package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by REMI Networks
 * User: don
 * Date: 8/22/18
 * Time: 1:36 PM
 **/
public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
