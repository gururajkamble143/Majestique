package eCommerce.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eCommerce.demo.DAO.CartRepo;
import eCommerce.demo.model.Cart_table;

@Service
public class CartServiceRepo {
	
	@Autowired
	private CartRepo crepo;
	
	public void saveTunics(int id, String title, int price_dis, int price_ori, int off, String color, String image1) throws IOException
	{
		Cart_table ctab = new Cart_table();

		ctab.setId(id);
		ctab.setTitle(title);
		ctab.setPrice_dis(price_dis);
		ctab.setPrice_ori(price_ori);
		ctab.setOff(off);
		ctab.setColor(color);
		ctab.setImage1(image1);
			
		crepo.save(ctab);
	}


}
