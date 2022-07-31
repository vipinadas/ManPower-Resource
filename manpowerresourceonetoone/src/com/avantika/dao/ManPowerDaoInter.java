package com.avantika.dao;
import com.avantika.dto.ManPowerResource;
public interface ManPowerDaoInter {
	void createEmployeeDao(ManPowerResource employee);

	ManPowerResource retrieveManPowerDao(int mId);

	void updateEmployee(ManPowerResource e1);

	void deleteEmployee(int mId);
}
