package eCommerce.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import eCommerce.demo.DAO.WomenjeansRepo;
import eCommerce.demo.model.Womenjeans_table;

@Controller
public class WomenJeansDetailsController {
	
	@Autowired(required = true)
	private WomenjeansRepo wrepo;


	@GetMapping("/wjeansdetails/{id}")
	public String getSpecificDetails(@PathVariable int id, Model model)
	{
		Womenjeans_table wtab = wrepo.findById(id).get();
		model.addAttribute("wjeans", wtab);
		return "specificwomenjeansdetails";
	}

}
