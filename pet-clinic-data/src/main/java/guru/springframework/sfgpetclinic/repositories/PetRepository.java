package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by REMI Networks
 * User: don
 * Date: 8/22/18
 * Time: 1:34 PM
 **/
public interface PetRepository extends CrudRepository<Pet, Long> {
}
