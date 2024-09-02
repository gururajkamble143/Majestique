package eCommerce.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import eCommerce.demo.DAO.TopsRepo;
import eCommerce.demo.model.Tops_table;
import eCommerce.services.TopsServiceRepo;

@Controller
public class TopsController {
	
	@Autowired(required = true)
	private TopsRepo torepo;
	
	@Autowired(required = true)
	private TopsServiceRepo topsServiceRepo;

	@GetMapping("/tops")
	public String mainAdmin()
	{   
		return "AdminTopsFillingForm";
	}
	
	
	@PostMapping("/addtops")
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
			topsServiceRepo.saveTops(id, title, price_dis, price_ori, off, style_name, color, category, pattern, image1, image2, image3, image4, image5);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "AdminTopsFillingForm";
	}
	
	@GetMapping("/getTops")
	public String getAllTops(Model model)
	{
		List<Tops_table> listtops = torepo.findAll();
		model.addAttribute("listtops", listtops);
		return "gettopsproducts";
	}

}
