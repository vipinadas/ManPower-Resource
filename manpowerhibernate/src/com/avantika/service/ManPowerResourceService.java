package com.avantika.service;

import com.avantika.dto.ManPowerResource;

public interface ManPowerResourceService {

	void createManPowerResourceService(ManPowerResource mpr,int alownce);

	ManPowerResource retrieveManPower(int mId);

	void upManPowerResource(ManPowerResource mpr);

	void deleteManPowerResource(int mId);

	void checkManPowerResourceServce();

	

}
