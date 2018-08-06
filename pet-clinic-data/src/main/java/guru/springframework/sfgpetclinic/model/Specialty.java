package guru.springframework.sfgpetclinic.model;

/**
 * Created by REMI Networks
 * User: don
 * Date: 8/5/18
 * Time: 7:06 PM
 **/
public class Specialty extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
