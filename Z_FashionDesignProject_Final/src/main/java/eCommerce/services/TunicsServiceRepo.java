package eCommerce.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eCommerce.demo.DAO.TunicsRepo;
import eCommerce.demo.model.Tunics_table;

@Service
public class TunicsServiceRepo {
	
	@Autowired
	private TunicsRepo turepo;
	
	public void saveTunics(int id, String title, int price_dis, int price_ori, int off, String style_name, String color, String category, String pattern, String image1, String image2, String image3, String image4, String image5) throws IOException
	{
		Tunics_table tutab = new Tunics_table();

		tutab.setId(id);
		tutab.setTitle(title);
		tutab.setPrice_dis(price_dis);
		tutab.setPrice_ori(price_ori);
		tutab.setOff(off);
		tutab.setStyle_name(style_name);
		tutab.setColor(color);
		tutab.setCategory(category);
		tutab.setPattern(pattern);
		tutab.setImage1(image1);
		tutab.setImage2(image2);
		tutab.setImage3(image3);
		tutab.setImage4(image4);
		tutab.setImage5(image5);	
		turepo.save(tutab);
	}

}
