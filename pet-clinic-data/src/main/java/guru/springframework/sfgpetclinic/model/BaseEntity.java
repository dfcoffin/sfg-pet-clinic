package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Created by REMI Networks
 * User: don
 * Date: 8/4/18
 * Time: 3:14 PM
 **/
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
