package eCommerce.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cart_table {
	
	public Cart_table() {
		super();
	}

	public Cart_table(int id, String title, int price_dis, int price_ori, int off, String color, String image1) {
		super();
		this.id = id;
		this.title = title;
		this.price_dis = price_dis;
		this.price_ori = price_ori;
		this.off = off;
		this.color = color;
		this.image1 = image1;
	}

	@Id
	private int id;
	private String title;
	private int price_dis;
	private int price_ori;
	private int off;
	private String color;
	private String image1;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice_dis() {
		return price_dis;
	}

	public void setPrice_dis(int price_dis) {
		this.price_dis = price_dis;
	}

	public int getPrice_ori() {
		return price_ori;
	}

	public void setPrice_ori(int price_ori) {
		this.price_ori = price_ori;
	}

	public int getOff() {
		return off;
	}

	public void setOff(int off) {
		this.off = off;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getImage1() {
		return image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	@Override
	public String toString() {
		return "Cart_table [id=" + id + ", title=" + title + ", price_dis=" + price_dis + ", price_ori=" + price_ori
				+ ", off=" + off + ", color=" + color + ", image1=" + image1 + "]";
	}

}
