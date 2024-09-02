package eCommerce.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import eCommerce.demo.DAO.NewarrivalRepo;
import eCommerce.demo.model.Newarrival_table;


@Controller
public class NewArrivalDetailsController {

	@Autowired(required = true)
	private NewarrivalRepo nrepo;


	@GetMapping("/newarrdetails/{id}")
	public String getSpecificDetails(@PathVariable int id, Model model)
	{
		Newarrival_table ntab = nrepo.findById(id).get();
		model.addAttribute("arrival", ntab);
		return "specificnewarrivaldetails";
	}
	
}
