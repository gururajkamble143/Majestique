package eCommerce.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import eCommerce.demo.DAO.ShirtsRepo;
import eCommerce.demo.model.Shirts_table;

@Controller
public class MenShirtsDetailsController {
	
	@Autowired(required = true)
	private ShirtsRepo srepo;


	@GetMapping("/shirtsdetails/{id}")
	public String getSpecificDetails(@PathVariable int id, Model model)
	{
		Shirts_table stab = srepo.findById(id).get();
		model.addAttribute("shirt", stab);
		return "specificshirtsdetails";
	}

}
