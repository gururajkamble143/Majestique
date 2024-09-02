package eCommerce.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eCommerce.demo.DAO.MenjeansRepo;
import eCommerce.demo.model.Menjeans_table;

@Service
public class MenjeansServiceRepo {

	@Autowired
	private MenjeansRepo mjrepo;
	
	public void saveMenjeans(int id, String title, int price_dis, int price_ori, int off, String style_name, String color, String category, String pattern, String image1, String image2, String image3, String image4, String image5) throws IOException
	{
		Menjeans_table mjtab = new Menjeans_table();

		mjtab.setId(id);
		mjtab.setTitle(title);
		mjtab.setPrice_dis(price_dis);
		mjtab.setPrice_ori(price_ori);
		mjtab.setOff(off);
		mjtab.setStyle_name(style_name);
		mjtab.setColor(color);
		mjtab.setCategory(category);
		mjtab.setPattern(pattern);
		mjtab.setImage1(image1);
		mjtab.setImage2(image2);
		mjtab.setImage3(image3);
		mjtab.setImage4(image4);
		mjtab.setImage5(image5);	
		mjrepo.save(mjtab);
	}
}
