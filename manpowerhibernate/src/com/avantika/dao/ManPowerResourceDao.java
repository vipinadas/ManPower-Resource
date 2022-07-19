package com.avantika.dao;

import com.avantika.dto.ManPowerResource;

public interface ManPowerResourceDao {

	void createManPowerResourceDao(ManPowerResource mpr);

	ManPowerResource retrieveManPowerDao(int mId);

	void updateManPowerResource(ManPowerResource mpr);

	void deleteManPowerResourceDao(int mId);
	void checkManPowerResourceDao();

	
}
