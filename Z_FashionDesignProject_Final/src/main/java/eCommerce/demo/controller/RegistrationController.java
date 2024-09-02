package eCommerce.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import eCommerce.demo.DAO.RegistrationRepo;
import eCommerce.demo.model.Registration_table;
import eCommerce.services.RegistrationServiceRepo;

@Controller
public class RegistrationController {
	
	@Autowired(required = true)
	private RegistrationRepo rrepo;
	
	@Autowired(required = true)
	private RegistrationServiceRepo registrationServiceRepo;
	
	@GetMapping("/registration")
	public String mainAdmin1()
	{   
		return "RegistrationForm";
	}
	
	@PostMapping("/adduser")
	public String saveProductString(@RequestParam("email") String email, @RequestParam("name") String name, 
									@RequestParam("lane") String lane, @RequestParam("taluka") String taluka,
									@RequestParam("district") String district, @RequestParam("state") String state,
									@RequestParam("pincode") int pincode, @RequestParam("pass") String pass,
									@RequestParam("repass") String repass)
	{
		try {
			registrationServiceRepo.saveRegistration(name, email, lane, taluka, district, state, pincode, pass, repass);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "LoginForm";
	}
	
	@GetMapping("/getUser")
	public String getAllUsers(Model model)
	{
		List<Registration_table> listuser = rrepo.findAll();
		model.addAttribute("listuser", listuser);
		return "LoginForm";
	}
	
	
	
	
	
	@GetMapping("/login")
	public String mainAdmin2()
	{   
		return "LoginForm";
	}

}
