package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Set;

/**
 * Created by REMI Networks
 * User: don
 * Date: 8/4/18
 * Time: 10:05 PM
 **/
@Controller
public class VetController {

	private final VetService vetService;

	public VetController(VetService vetService) {
		this.vetService = vetService;
	}

	@RequestMapping({"/vets", "/vets/index", "vets/index.html", "/vets.html"})
	String listVets(Model model) {

		model.addAttribute("vets", vetService.findAll());

		return "vets/index";
	}

	@GetMapping("/api/vets")
	public @ResponseBody
	Set<Vet> getVetsJson() {

		return vetService.findAll();
	}
}
