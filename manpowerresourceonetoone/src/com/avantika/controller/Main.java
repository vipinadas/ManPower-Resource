package com.avantika.controller;

import java.util.Scanner;

import com.avantika.dto.Address;
import com.avantika.dto.ManPowerResource;
import com.avantika.service.ManPowerService;
import com.avantika.service.ManPowerServiceImpl;

public class Main {
	 ManPowerService obj=new ManPowerServiceImpl();
	public static void main(String[] args) {
		Main object=new Main();
	   // object.create();
	    // object.getManPower();
	   // object.update();
	   object.delete();
	    
	}
	private void create()
	{
	ManPowerResource e1=new ManPowerResource();
	e1.setName("Ratheesh");    
    e1.setEmail("ratheesh@gmail.com");    
    Address address1=new Address();    
    address1.setAddressLine1("MSA-1,BTS-Road");    
    address1.setCity("Thituvananthapuram");    
    address1.setState("Kerala");    
    address1.setCountry("India");    
    address1.setPincode(695304);       
    e1.setAddress(address1); 
    address1.setEmployee(e1);
		obj.createEmployeeService(e1);
	}
	 
	private void getManPower() {
		System.out.println("enter the Man Id");
		Scanner sc = new Scanner(System.in);
		int mId = sc.nextInt();
		System.out.println(obj.retrieveManPower(mId));
		
	}
	private void update()
	{
		ManPowerResource e1=new ManPowerResource();
		e1.setEmployeeId(1010);
		e1.setName("AVANTIKA");    
	    e1.setEmail("avantika@gmail.com");    
	    Address address1=new Address();    
	    address1.setAddressLine1("G1,Lo nagar");    
	    address1.setCity("Ghaziabad");    
	    address1.setState("UP");    
	    address1.setCountry("India");    
	    address1.setPincode(205301);       
	    e1.setAddress(address1); 
	    address1.setEmployee(e1);
		obj.updateEmployeeService(e1);
		
	}
	private void delete()
	{
		System.out.println("enter the employee Id to delete");
		Scanner sc = new Scanner(System.in);
		int mId = sc.nextInt();
		 sc.close();
		obj.deleteManPowerResource(mId);
		
		
	}
	
	    
}
