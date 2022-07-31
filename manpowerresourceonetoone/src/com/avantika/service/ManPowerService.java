package com.avantika.service;
import com.avantika.dto.ManPowerResource;
public interface ManPowerService {
	void createEmployeeService(ManPowerResource employee);
	ManPowerResource retrieveManPower(int mId) ;
	void updateEmployeeService(ManPowerResource e1);
	void deleteManPowerResource(int mId);
}
