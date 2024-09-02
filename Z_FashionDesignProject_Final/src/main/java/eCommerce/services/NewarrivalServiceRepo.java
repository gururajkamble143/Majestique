package eCommerce.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eCommerce.demo.DAO.NewarrivalRepo;
import eCommerce.demo.model.Newarrival_table;

@Service
public class NewarrivalServiceRepo {

	@Autowired
	private NewarrivalRepo narepo;
	
	public void saveNewarrival(int id, String title, int price_dis, int price_ori, int off, String style_name, String color, String category, String pattern, String image1, String image2, String image3, String image4, String image5) throws IOException
	{
		Newarrival_table natab = new Newarrival_table();

		natab.setId(id);
		natab.setTitle(title);
		natab.setPrice_dis(price_dis);
		natab.setPrice_ori(price_ori);
		natab.setOff(off);
		natab.setStyle_name(style_name);
		natab.setColor(color);
		natab.setCategory(category);
		natab.setPattern(pattern);
		natab.setImage1(image1);
		natab.setImage2(image2);
		natab.setImage3(image3);
		natab.setImage4(image4);
		natab.setImage5(image5);	
		narepo.save(natab);
	}
	
}
