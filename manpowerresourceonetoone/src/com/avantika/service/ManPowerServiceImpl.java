package com.avantika.service;

import com.avantika.dao.ManPowerDao;
import com.avantika.dao.ManPowerDaoInter;
import com.avantika.dto.ManPowerResource;

public class ManPowerServiceImpl  implements ManPowerService{
	ManPowerDaoInter obj=new ManPowerDao();
	@Override
	public void createEmployeeService(ManPowerResource employee) {
		obj.createEmployeeDao(employee);
		
	}
	@Override
	public ManPowerResource retrieveManPower(int mId) {
		return obj.retrieveManPowerDao(mId);
		
	}
	@Override
	public void updateEmployeeService(ManPowerResource e1) {
		obj.updateEmployee(e1);
		
	}
	@Override
	public void deleteManPowerResource(int mId) {
		obj.deleteEmployee(mId);
		
	}
	
	

}
