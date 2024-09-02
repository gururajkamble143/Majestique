package eCommerce.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import eCommerce.demo.DAO.DressesRepo;
import eCommerce.demo.model.Dresses_table;

@Controller
public class DressesDetailsController {
	
	@Autowired(required = true)
	private DressesRepo drepo;


	@GetMapping("/dressesdetails/{id}")
	public String getSpecificDetails(@PathVariable int id, Model model)
	{
		Dresses_table dtab = drepo.findById(id).get();
		model.addAttribute("dress", dtab);
		return "specificdressesdetails";
	}

}
