package eCommerce.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eCommerce.demo.DAO.DressesRepo;
import eCommerce.demo.model.Dresses_table;

@Service
public class DressesServiceRepo {
	
	@Autowired
	private DressesRepo drepo;
	
	public void saveDresses(int id, String title, int price_dis, int price_ori, int off, String style_name, String color, String category, String pattern, String image1, String image2, String image3, String image4, String image5) throws IOException
	{
		Dresses_table dtab = new Dresses_table();

		dtab.setId(id);
		dtab.setTitle(title);
		dtab.setPrice_dis(price_dis);
		dtab.setPrice_ori(price_ori);
		dtab.setOff(off);
		dtab.setStyle_name(style_name);
		dtab.setColor(color);
		dtab.setCategory(category);
		dtab.setPattern(pattern);
		dtab.setImage1(image1);
		dtab.setImage2(image2);
		dtab.setImage3(image3);
		dtab.setImage4(image4);
		dtab.setImage5(image5);	
		drepo.save(dtab);
	}

}
