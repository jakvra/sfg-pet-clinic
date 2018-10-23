package guru.springframewor.sfgpetclinic.services;

import guru.springframewor.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
