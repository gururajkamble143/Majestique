package eCommerce.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eCommerce.demo.DAO.RegistrationRepo;
import eCommerce.demo.model.Registration_table;

@Service
public class RegistrationServiceRepo {
	
	@Autowired
	private RegistrationRepo regrepo;
	
	public void saveRegistration(String name, String email, String lane, String taluka, String district, String state, int pincode, String pass, String repass) throws IOException
	{
		Registration_table regtab = new Registration_table();
		
		regtab.setName(name);
		regtab.setEmail(email);
		regtab.setLane(lane);
		regtab.setTaluka(taluka);
		regtab.setDistrict(district);
		regtab.setState(state);
		regtab.setPincode(pincode);
		regtab.setPass(pass);
		regtab.setRepass(repass);
			
		regrepo.save(regtab);
	}

}
