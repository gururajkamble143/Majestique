package eCommerce.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eCommerce.demo.DAO.TrousersRepo;
import eCommerce.demo.model.Trousers_table;

@Service
public class TrousersServiceRepo {
	
	@Autowired
	private TrousersRepo trrepo;
	
	public void saveTrousers(int id, String title, int price_dis, int price_ori, int off, String style_name, String color, String category, String pattern, String image1, String image2, String image3, String image4, String image5) throws IOException
	{
		Trousers_table trtab = new Trousers_table();

		trtab.setId(id);
		trtab.setTitle(title);
		trtab.setPrice_dis(price_dis);
		trtab.setPrice_ori(price_ori);
		trtab.setOff(off);
		trtab.setStyle_name(style_name);
		trtab.setColor(color);
		trtab.setCategory(category);
		trtab.setPattern(pattern);
		trtab.setImage1(image1);
		trtab.setImage2(image2);
		trtab.setImage3(image3);
		trtab.setImage4(image4);
		trtab.setImage5(image5);	
		trrepo.save(trtab);
	}

}
