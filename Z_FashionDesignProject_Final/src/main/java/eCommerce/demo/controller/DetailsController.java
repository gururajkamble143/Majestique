package eCommerce.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import eCommerce.demo.DAO.BlazersRepo;
import eCommerce.demo.model.Blazers_table;

@Controller
public class DetailsController {
	
	@Autowired(required = true)
	private BlazersRepo brepo;


	@GetMapping("/details/{id}")
	public String getSpecificDetails(@PathVariable int id, Model model)
	{
		Blazers_table btab = brepo.findById(id).get();
		model.addAttribute("blazer", btab);
		return "SpecificProductDetails";
	}
	

}
