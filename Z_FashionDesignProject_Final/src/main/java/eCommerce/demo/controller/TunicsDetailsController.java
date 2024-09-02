package eCommerce.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import eCommerce.demo.DAO.TunicsRepo;
import eCommerce.demo.model.Tunics_table;

@Controller
public class TunicsDetailsController {
	
	@Autowired(required = true)
	private TunicsRepo trepo;


	@GetMapping("/tunicsdetails/{id}")
	public String getSpecificDetails(@PathVariable int id, Model model)
	{
		Tunics_table ttab = trepo.findById(id).get();
		model.addAttribute("tunic", ttab);
		return "specifictunicsdetails";
	}

}
