package eCommerce.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eCommerce.demo.DAO.TshirtRepo;
import eCommerce.demo.model.tshirts_table;

@Service
public class TshirtsServiceRepo {
	
	@Autowired
	private TshirtRepo tsrepo;
	
	public void saveTshirts(int id, String title, int price_dis, int price_ori, int off, String style_name, String color, String category, String pattern, String image1, String image2, String image3, String image4, String image5) throws IOException
	{
		tshirts_table tstab = new tshirts_table();

		tstab.setId(id);
		tstab.setTitle(title);
		tstab.setPrice_dis(price_dis);
		tstab.setPrice_ori(price_ori);
		tstab.setOff(off);
		tstab.setStyle_name(style_name);
		tstab.setColor(color);
		tstab.setCategory(category);
		tstab.setPattern(pattern);
		tstab.setImage1(image1);
		tstab.setImage2(image2);
		tstab.setImage3(image3);
		tstab.setImage4(image4);
		tstab.setImage5(image5);	
		tsrepo.save(tstab);
	}

}
