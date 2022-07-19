package com.avantika.controller;
import java.util.Date;
import java.util.Scanner;

import com.avantika.dto.ManPowerResource;
import com.avantika.service.ManPowerResourceService;
import com.avantika.service.ManPowerResourceServiceImpl;

public class ManPowerResourceController {
	ManPowerResourceService service = new ManPowerResourceServiceImpl();
	public static void main(String[] args) {
		ManPowerResourceController obj = new ManPowerResourceController();
		obj.insertManPower();
	   // obj.getManPower();
		//obj.editManPower();
		//obj.deleteManPower();
		//obj.checkmanPowerCriteria();
		
	}
	
	private void checkmanPowerCriteria() {
		service.checkManPowerResourceServce();
		
	}
	private void deleteManPower() {
		System.out.println("enter the Man Id to delete");
		Scanner sc = new Scanner(System.in);
		int mId = sc.nextInt();
		 sc.close();
		service.deleteManPowerResource(mId);
		
	}
	private void editManPower() {
		ManPowerResource mpr=new ManPowerResource(1011,"Anu",new Date(1992,05,10),"MS Nivas",1020564570,"catene",20000.00d);
		service.upManPowerResource(mpr);
		
	}
	private void getManPower() {
		System.out.println("enter the Man Id");
		Scanner sc = new Scanner(System.in);
		int mId = sc.nextInt();
		System.out.println(service.retrieveManPower(mId));
		
	}
	private void insertManPower() {
		System.out.println("Enter the Allowance amount");
		Scanner sc = new Scanner(System.in);
		int alownce = sc.nextInt();
		 sc.close();
		ManPowerResource mpr1=new ManPowerResource("Arun",new Date(1991,05,03),"RR Nivas",1020304570,"cleanning",10000.00d);
		service.createManPowerResourceService(mpr1,alownce);
		ManPowerResource mpr2=new ManPowerResource("Rathu",new Date(1992,05,02),"SS villa",1020304450,"Mess",20000.00d);
		service.createManPowerResourceService(mpr2,alownce);
		ManPowerResource mpr3=new ManPowerResource("Aami",new Date(1991,10,03),"Symphony",1110304570,"Plumping",30000.00d);
		service.createManPowerResourceService(mpr3,alownce);
		ManPowerResource mpr4=new ManPowerResource("Arun",new Date(1991,05,03),"RR Nivas",1020304570,"cleanning",10000.00d);
		service.createManPowerResourceService(mpr4,alownce);
	}
}
