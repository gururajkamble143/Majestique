package eCommerce.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import eCommerce.demo.DAO.MenjeansRepo;
import eCommerce.demo.model.Menjeans_table;

@Controller
public class MenJeansDetailsController {
	
	@Autowired(required = true)
	private MenjeansRepo mrepo;


	@GetMapping("/menjeansdetails/{id}")
	public String getSpecificDetails(@PathVariable int id, Model model)
	{
		Menjeans_table mtab = mrepo.findById(id).get();
		model.addAttribute("mjeans", mtab);
		return "specificmenjeansdetails";
	}

}
