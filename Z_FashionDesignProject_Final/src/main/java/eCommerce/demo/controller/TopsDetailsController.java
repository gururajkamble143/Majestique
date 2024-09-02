package eCommerce.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import eCommerce.demo.DAO.TopsRepo;
import eCommerce.demo.model.Tops_table;

@Controller
public class TopsDetailsController {
	
	@Autowired(required = true)
	private TopsRepo trepo;


	@GetMapping("/topsdetails/{id}")
	public String getSpecificDetails(@PathVariable int id, Model model)
	{
		Tops_table ttab = trepo.findById(id).get();
		model.addAttribute("top", ttab);
		return "specifictopsdetails";
	}

}
