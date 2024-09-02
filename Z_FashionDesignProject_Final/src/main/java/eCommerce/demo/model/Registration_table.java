package eCommerce.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Registration_table {

	public Registration_table(String name, String email, String lane, String taluka, String district,
			String state, int pincode, String pass, String repass) {
		super();
		this.name = name;
		this.email = email;
		this.lane = lane;
		this.taluka = taluka;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
		this.pass = pass;
		this.repass = repass;
	}

	public Registration_table() {
		super();
	} 
	
	@Id
	private String email;
	
	private String name;
	private String lane;
	private String taluka;
	private String district;
	private String state;
	private int pincode;
	private String pass;
	private String repass;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLane() {
		return lane;
	}
	public void setLane(String lane) {
		this.lane = lane;
	}
	public String getTaluka() {
		return taluka;
	}
	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getRepass() {
		return repass;
	}
	public void setRepass(String repass) {
		this.repass = repass;
	}
	
	@Override
	public String toString() {
		return "Registration_table [name=" + name + ", email=" + email + ", lane=" + lane + ", taluka="
				+ taluka + ", district=" + district + ", state=" + state + ", pincode=" + pincode + ", pass=" + pass
				+ ", repass=" + repass + "]";
	}
	
	
}
