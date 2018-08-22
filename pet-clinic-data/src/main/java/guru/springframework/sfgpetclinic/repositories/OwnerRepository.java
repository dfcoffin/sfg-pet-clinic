package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by REMI Networks
 * User: don
 * Date: 8/22/18
 * Time: 1:33 PM
 **/
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
