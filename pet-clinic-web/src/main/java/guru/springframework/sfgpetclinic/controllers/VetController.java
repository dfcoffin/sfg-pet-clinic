package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by REMI Networks
 * User: don
 * Date: 8/4/18
 * Time: 10:05 PM
 **/
@Controller
public class VetController {


    @RequestMapping({"/vets", "/vets/index", "vets/index.html"})
    String listVets() {

        return "vets/index";
    }
}
