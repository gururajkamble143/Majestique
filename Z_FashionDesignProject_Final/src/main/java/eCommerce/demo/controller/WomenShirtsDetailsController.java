package eCommerce.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import eCommerce.demo.DAO.WomenshirtsRepo;
import eCommerce.demo.model.Womenshirts_table;

@Controller
public class WomenShirtsDetailsController {
	
	@Autowired(required = true)
	private WomenshirtsRepo wrepo;


	@GetMapping("/wshirtsdetails/{id}")
	public String getSpecificDetails(@PathVariable int id, Model model)
	{
		Womenshirts_table wtab = wrepo.findById(id).get();
		model.addAttribute("wshirt", wtab);
		return "specificwomenshirtsdetails";
	}

}
