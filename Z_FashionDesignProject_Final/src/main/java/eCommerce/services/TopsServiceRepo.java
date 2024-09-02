package eCommerce.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eCommerce.demo.DAO.TopsRepo;
import eCommerce.demo.model.Tops_table;

@Service
public class TopsServiceRepo {
	
	@Autowired
	private TopsRepo torepo;
	
	public void saveTops(int id, String title, int price_dis, int price_ori, int off, String style_name, String color, String category, String pattern, String image1, String image2, String image3, String image4, String image5) throws IOException
	{
		Tops_table totab = new Tops_table();

		totab.setId(id);
		totab.setTitle(title);
		totab.setPrice_dis(price_dis);
		totab.setPrice_ori(price_ori);
		totab.setOff(off);
		totab.setStyle_name(style_name);
		totab.setColor(color);
		totab.setCategory(category);
		totab.setPattern(pattern);
		totab.setImage1(image1);
		totab.setImage2(image2);
		totab.setImage3(image3);
		totab.setImage4(image4);
		totab.setImage5(image5);	
		torepo.save(totab);
	}

}
