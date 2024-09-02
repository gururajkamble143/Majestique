package eCommerce.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Blazers_table {
	
	public Blazers_table() {
		super();
	}
	public Blazers_table(int id, String title, int price_dis, int price_ori, int off, String style_name,
			String color, String category, String pattern, String image1, String image2, String image3, String image4,
			String image5) {
		super();
		this.id = id;
		this.title = title;
		this.price_dis = price_dis;
		this.price_ori = price_ori;
		this.off = off;
		this.style_name = style_name;
		this.color = color;
		this.category = category;
		this.pattern = pattern;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.image4 = image4;
		this.image5 = image5;
	}
	
	@Id
	private int id;
	private String title;
	private int price_dis;
	private int price_ori;
	private int off;
	private String style_name;
	private String color;
	private String category;
	private String pattern;
	private String image1;
	private String image2;
	private String image3;
	private String image4;
	private String image5;
	
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
	public String getStyle_name() {
		return style_name;
	}
	public void setStyle_name(String style_name) {
		this.style_name = style_name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public String getImage1() {
		return image1;
	}
	public void setImage1(String image1) {
		this.image1 = image1;
	}
	public String getImage2() {
		return image2;
	}
	public void setImage2(String image2) {
		this.image2 = image2;
	}
	public String getImage3() {
		return image3;
	}
	public void setImage3(String image3) {
		this.image3 = image3;
	}
	public String getImage4() {
		return image4;
	}
	public void setImage4(String image4) {
		this.image4 = image4;
	}
	public String getImage5() {
		return image5;
	}
	public void setImage5(String image5) {
		this.image5 = image5;
	}
	@Override
	public String toString() {
		return "Blazers_table [id=" + id + ", title=" + title + ", price_dis=" + price_dis + ", price_ori=" + price_ori
				+ ", off=" + off + ", style_name=" + style_name + ", color=" + color + ", category=" + category
				+ ", pattern=" + pattern + ", image1=" + image1 + ", image2=" + image2 + ", image3=" + image3
				+ ", image4=" + image4 + ", image5=" + image5 + "]";
	}

}
