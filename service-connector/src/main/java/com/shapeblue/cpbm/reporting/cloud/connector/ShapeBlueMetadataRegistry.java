package com.shapeblue.cpbm.reporting.cloud.connector;

import java.util.List;
import java.util.Map;

import com.citrix.cpbm.platform.spi.Connector;
import com.citrix.cpbm.platform.spi.FilterComponent;
import com.citrix.cpbm.platform.spi.MetadataRegistry;
import com.citrix.cpbm.platform.spi.ResourceComponent;

/**
 * The Cloud Service's Metadata Registry.
 */
public class ShapeBlueMetadataRegistry implements MetadataRegistry {

	public void initialize(Connector service) {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, String> getResourceTypeValues(String tenantHandle,
			String userHandle, String name, Map<String, String> context,
			Map<String, String> filters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FilterComponent> getFilterValues(String tenantHandle,
			String userHandle, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> getDiscriminatorValues(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResourceComponent> getResourceComponentValues(
			String resourceType, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResourceComponent> getResourceComponentValues(
			String resourceType, String name, String tenantHandle,
			String userHandle, Map<String, String> context,
			Map<String, String> filters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResourceComponent getResourceComponent(String resourceType,
			String resourceComponent, String componentValue) {
		// TODO Auto-generated method stub
		return null;
	}

}
