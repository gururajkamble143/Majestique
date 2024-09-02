package eCommerce.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eCommerce.demo.DAO.WomenjeansRepo;
import eCommerce.demo.model.Womenjeans_table;

@Service
public class WomenJeansServiceRepo {
	
	@Autowired
	private WomenjeansRepo wjrepo;
	
	public void saveWomenjeans(int id, String title, int price_dis, int price_ori, int off, String style_name, String color, String category, String pattern, String image1, String image2, String image3, String image4, String image5) throws IOException
	{
		Womenjeans_table wjtab = new Womenjeans_table();

		wjtab.setId(id);
		wjtab.setTitle(title);
		wjtab.setPrice_dis(price_dis);
		wjtab.setPrice_ori(price_ori);
		wjtab.setOff(off);
		wjtab.setStyle_name(style_name);
		wjtab.setColor(color);
		wjtab.setCategory(category);
		wjtab.setPattern(pattern);
		wjtab.setImage1(image1);
		wjtab.setImage2(image2);
		wjtab.setImage3(image3);
		wjtab.setImage4(image4);
		wjtab.setImage5(image5);	
		wjrepo.save(wjtab);
	}

}
