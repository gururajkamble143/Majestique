package eCommerce.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import eCommerce.demo.DAO.TrousersRepo;
import eCommerce.demo.model.Trousers_table;

@Controller
public class TrousersDetailsController {
	
	@Autowired(required = true)
	private TrousersRepo trepo;


	@GetMapping("/trousersdetails/{id}")
	public String getSpecificDetails(@PathVariable int id, Model model)
	{
		Trousers_table ttab = trepo.findById(id).get();
		model.addAttribute("trouser", ttab);
		return "specifictrousersdetails";
	}

}
