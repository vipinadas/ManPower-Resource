package com.avantika.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name="emp220")
public class ManPowerResource {
	@Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
    @PrimaryKeyJoinColumn  
private int employeeId;    
private String name,email;    
@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)  
private Address address;

public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
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
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
//public ManPowerResource(String name, String email, Address address) {
//	super();
//	this.name = name;
//	this.email = email;
//	this.address = address;
//}
@Override
public String toString() {
	return "ManPowerResource [employeeId=" + employeeId + ", name=" + name + ", email=" + email + ", address=" + address
			+ "]";
} 

}
