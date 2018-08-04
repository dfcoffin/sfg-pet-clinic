package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 * Created by REMI Networks
 * User: don
 * Date: 8/4/18
 * Time: 3:03 PM
 **/
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
