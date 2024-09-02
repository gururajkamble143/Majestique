package eCommerce.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import eCommerce.demo.DAO.WomenshirtsRepo;
import eCommerce.demo.model.Womenshirts_table;
import eCommerce.services.WomenShirtsSeviceRepo;

@Controller
public class WomenShirtsController {
	
	@Autowired(required = true)
	private WomenshirtsRepo wsrepo;
	
	@Autowired(required = true)
	private WomenShirtsSeviceRepo womenshirtsServiceRepo;

	@GetMapping("/womenshirts")
	public String mainAdmin()
	{   
		return "AdminWomenshirtsFillingForm";
	}
	
	
	@PostMapping("/addwomenshirts")
	public String saveProductString(@RequestParam("id") int id, 
									@RequestParam("title") String title, @RequestParam("price_dis") int price_dis,
									@RequestParam("price_ori") int price_ori, @RequestParam("off") int off,
									@RequestParam("style_name") String style_name, @RequestParam("color") String color,
									@RequestParam("category") String category, @RequestParam("pattern") String pattern,
									@RequestParam("image1") String image1, @RequestParam("image2") String image2,
									@RequestParam("image3") String image3, @RequestParam("image4") String image4,
									@RequestParam("image5") String image5)
	{
		try {
			womenshirtsServiceRepo.saveWomenshirts(id, title, price_dis, price_ori, off, style_name, color, category, pattern, image1, image2, image3, image4, image5);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "AdminWomenshirtsFillingForm";
	}
	
	@GetMapping("/getWomenshirts")
	public String getAllWomenshirts(Model model)
	{
		List<Womenshirts_table> listwomenshirts = wsrepo.findAll();
		model.addAttribute("listwomenshirts", listwomenshirts);
		return "getwomenshirtsproducts";
	}

}
