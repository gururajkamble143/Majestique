package eCommerce.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import eCommerce.demo.DAO.BlazersRepo;
import eCommerce.demo.DAO.CartRepo;
import eCommerce.demo.model.Cart_table;

@Controller
public class CartController {
	
	@Autowired(required = true)
	private CartRepo crepo;
	
	@Autowired(required = true)
	private BlazersRepo brepo;
	
	
	
	/*
	 * @GetMapping("/cart") public String addtocart() { return "addtocart"; }
	 */
	
	@GetMapping("/getCart")
	public String getAllCart(Model model)
	{
		List<Cart_table> listcart = crepo.findAll();
		model.addAttribute("listcart", listcart);
		System.out.println(listcart);
		return "addtocart";
	}
	
	@GetMapping("/items")
	public String getItems(Model model) 
	{
	    long itemCount = crepo.count();
	    model.addAttribute("itemCount", itemCount);
	    return "items";
	}
	
	@GetMapping("/addtocart")
	public String Cart() 
	{
		
	    return "aboutus.html";
	}

}
