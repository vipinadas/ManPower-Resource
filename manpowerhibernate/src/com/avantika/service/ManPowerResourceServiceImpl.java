package com.avantika.service;

import com.avantika.dao.ManPowerResourceDao;
import com.avantika.dao.ManPowerResourceDaoImpl;
import com.avantika.dto.ManPowerResource;
public class ManPowerResourceServiceImpl implements ManPowerResourceService  {
ManPowerResourceDao obj=new ManPowerResourceDaoImpl();
	@Override
	public void createManPowerResourceService(ManPowerResource mpr,int alownce) {
		double salary = mpr.getmSalary();
		double gst = (18/100)*salary;
		double actualSalary = salary + gst+alownce;
		mpr.setmSalary(actualSalary);
		obj.createManPowerResourceDao(mpr);
	}
	@Override
	public ManPowerResource retrieveManPower(int mId) {
		return obj.retrieveManPowerDao(mId);
		
	}
	@Override
	public void upManPowerResource(ManPowerResource mpr) {
		obj.updateManPowerResource(mpr);
		
	}
	@Override
	public void deleteManPowerResource(int mId) {
		obj.deleteManPowerResourceDao(mId);
		
	}
	@Override
	public void checkManPowerResourceServce() {
		obj.checkManPowerResourceDao();
		
	}
	

}
