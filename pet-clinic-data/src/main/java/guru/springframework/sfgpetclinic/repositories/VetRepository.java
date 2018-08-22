package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by REMI Networks
 * User: don
 * Date: 8/22/18
 * Time: 1:36 PM
 **/
public interface VetRepository extends CrudRepository<Vet, Long> {
}
