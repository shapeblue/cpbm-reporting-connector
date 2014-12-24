package com.shapeblue.cpbm.reporting.test;

import java.util.HashMap;
import java.util.Map;

import com.citrix.cpbm.platform.admin.service.utils.ServiceInstanceConfiguration;
import com.citrix.cpbm.platform.admin.service.utils.ServiceInstanceProperty;
import com.citrix.cpbm.test.provider.AbstractTestConfigurationProvider;

public class ShapeBlueTestConfigurationImpl extends AbstractTestConfigurationProvider {
	
	private static ServiceInstanceConfiguration serviceInstanceConfiguration;
	
	public ServiceInstanceConfiguration getServiceInstanceConfiguration() {
		
		if(serviceInstanceConfiguration == null ) {
			Map<String, ServiceInstanceProperty> map = new HashMap<String, ServiceInstanceProperty>();
	        ServiceInstanceProperty serviceInstanceProperty = new ServiceInstanceProperty();
	        serviceInstanceProperty.setValue("sample-value");
	        map.put("sampleKey",  serviceInstanceProperty);
	        serviceInstanceConfiguration = new ServiceInstanceConfiguration ();
	        serviceInstanceConfiguration.setInstanceProperties(map);
	        serviceInstanceConfiguration.setInstanceUUID("sample-12345abc");
		}
		
        return serviceInstanceConfiguration;
	}

}
