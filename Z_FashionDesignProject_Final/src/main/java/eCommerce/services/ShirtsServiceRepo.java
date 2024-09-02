package eCommerce.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eCommerce.demo.DAO.ShirtsRepo;
import eCommerce.demo.model.Shirts_table;

@Service
public class ShirtsServiceRepo {

	@Autowired
	private ShirtsRepo srepo;
	
	public void saveShirts(int id, String title, int price_dis, int price_ori, int off, String style_name, String color, String category, String pattern, String image1, String image2, String image3, String image4, String image5) throws IOException
	{
		Shirts_table stab = new Shirts_table();

		stab.setId(id);
		stab.setTitle(title);
		stab.setPrice_dis(price_dis);
		stab.setPrice_ori(price_ori);
		stab.setOff(off);
		stab.setStyle_name(style_name);
		stab.setColor(color);
		stab.setCategory(category);
		stab.setPattern(pattern);
		stab.setImage1(image1);
		stab.setImage2(image2);
		stab.setImage3(image3);
		stab.setImage4(image4);
		stab.setImage5(image5);	
		srepo.save(stab);
		
	}
	
}
