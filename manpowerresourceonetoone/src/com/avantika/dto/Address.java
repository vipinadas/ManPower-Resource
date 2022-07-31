package com.avantika.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity  
@Table(name="address220") 
public class Address {
	@Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
private int addressId;    
private String addressLine1,city,state,country;    
private int pincode;    
  
@OneToOne(targetEntity=ManPowerResource.class)  
private ManPowerResource employee;

//public Address(String addressLine1, String city, String state, String country, int pincode, ManPowerResource employee) {
//	super();
//	this.addressLine1 = addressLine1;
//	this.city = city;
//	this.state = state;
//	this.country = country;
//	this.pincode = pincode;
//	this.employee = employee;
//}

public int getAddressId() {
	return addressId;
}

@Override
public String toString() {
	return "Address [addressId=" + addressId + ", addressLine1=" + addressLine1 + ", city=" + city + ", state=" + state
			+ ", country=" + country + ", pincode=" + pincode + ", employee=" + employee + "]";
}

public void setAddressId(int addressId) {
	this.addressId = addressId;
}

public String getAddressLine1() {
	return addressLine1;
}

public void setAddressLine1(String addressLine1) {
	this.addressLine1 = addressLine1;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public int getPincode() {
	return pincode;
}

public void setPincode(int pincode) {
	this.pincode = pincode;
}

public ManPowerResource getEmployee() {
	return employee;
}

public void setEmployee(ManPowerResource employee) {
	this.employee = employee;
} 


}
