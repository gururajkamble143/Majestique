package eCommerce.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eCommerce.demo.DAO.WomenshirtsRepo;
import eCommerce.demo.model.Womenshirts_table;

@Service
public class WomenShirtsSeviceRepo {
	
	@Autowired
	private WomenshirtsRepo wsrepo;
	
	public void saveWomenshirts(int id, String title, int price_dis, int price_ori, int off, String style_name, String color, String category, String pattern, String image1, String image2, String image3, String image4, String image5) throws IOException
	{
		Womenshirts_table wstab = new Womenshirts_table();

		wstab.setId(id);
		wstab.setTitle(title);
		wstab.setPrice_dis(price_dis);
		wstab.setPrice_ori(price_ori);
		wstab.setOff(off);
		wstab.setStyle_name(style_name);
		wstab.setColor(color);
		wstab.setCategory(category);
		wstab.setPattern(pattern);
		wstab.setImage1(image1);
		wstab.setImage2(image2);
		wstab.setImage3(image3);
		wstab.setImage4(image4);
		wstab.setImage5(image5);	
		wsrepo.save(wstab);
	}

}
