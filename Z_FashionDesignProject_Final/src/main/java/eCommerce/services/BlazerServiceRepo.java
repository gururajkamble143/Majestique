package eCommerce.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import eCommerce.demo.DAO.BlazersRepo;
import eCommerce.demo.model.Blazers_table;

@Service
public class BlazerServiceRepo {
	
	@Autowired
	private BlazersRepo brepo;
	
	public void saveBlazer(int id, String title, int price_dis, int price_ori, int off, String style_name, String color, String category, String pattern, String image1, String image2, String image3, String image4, String image5) throws IOException
	{
		Blazers_table btab = new Blazers_table();

		btab.setId(id);
		btab.setTitle(title);
		btab.setPrice_dis(price_dis);
		btab.setPrice_ori(price_ori);
		btab.setOff(off);
		btab.setStyle_name(style_name);
		btab.setColor(color);
		btab.setCategory(category);
		btab.setPattern(pattern);
		btab.setImage1(image1);
		btab.setImage2(image2);
		btab.setImage3(image3);
		btab.setImage4(image4);
		btab.setImage5(image5);	
		brepo.save(btab);
		
	}

}
