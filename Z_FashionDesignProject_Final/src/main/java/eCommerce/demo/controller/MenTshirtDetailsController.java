package eCommerce.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import eCommerce.demo.DAO.TshirtRepo;
import eCommerce.demo.model.tshirts_table;

@Controller
public class MenTshirtDetailsController {

	@Autowired(required = true)
	private TshirtRepo trepo;


	@GetMapping("/tshirtsdetails/{id}")
	public String getSpecificDetails(@PathVariable int id, Model model)
	{
		tshirts_table ttab = trepo.findById(id).get();
		model.addAttribute("tshirt", ttab);
		return "specifictshirtdetails";
	}
	
}
