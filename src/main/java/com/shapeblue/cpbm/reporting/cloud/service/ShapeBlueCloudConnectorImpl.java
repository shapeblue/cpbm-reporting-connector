package com.shapeblue.cpbm.reporting.cloud.service;

import com.shapeblue.cpbm.reporting.cloud.connector.ShapeBlueMetadataRegistry;
import com.shapeblue.cpbm.reporting.cloud.collectors.ShapeBlueEventCollector;
import com.shapeblue.cpbm.reporting.cloud.collectors.ShapeBlueUsageCollector;
import com.shapeblue.cpbm.reporting.cloud.lifecycle.handlers.ShapeBlueAccountLifeCycleHandler;
import com.shapeblue.cpbm.reporting.cloud.lifecycle.handlers.ShapeBlueSubscriptionLifecycleHandler;
import com.shapeblue.cpbm.reporting.cloud.lifecycle.handlers.ShapeBlueUserLifeCycleHandler;
import com.shapeblue.cpbm.reporting.cloud.views.ShapeBlueViewResolver;

import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.citrix.cpbm.platform.admin.service.utils.ServiceInstanceConfiguration;
import com.citrix.cpbm.platform.spi.APIHandler;
import com.citrix.cpbm.platform.spi.AccountLifecycleHandler;
import com.citrix.cpbm.platform.spi.CloudConnector;
import com.citrix.cpbm.platform.spi.TenantBasedUsageCollector;
import com.citrix.cpbm.platform.spi.EventCollector;
import com.citrix.cpbm.platform.spi.MetadataRegistry;
import com.citrix.cpbm.platform.spi.SsoHandler;
import com.citrix.cpbm.platform.spi.SubscriptionLifecycleHandler;
import com.citrix.cpbm.platform.spi.UserLifecycleHandler;
import com.citrix.cpbm.platform.spi.ViewResolver;

public class ShapeBlueCloudConnectorImpl implements CloudConnector {

	private ServiceInstanceConfiguration serviceInstanceConfiguration;
	
	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private ShapeBlueMetadataRegistry metadataRegistry;
	@Autowired
	private ShapeBlueAccountLifeCycleHandler accountLifecycleHandler;
	@Autowired
	private ShapeBlueUserLifeCycleHandler userLifecycleHandler;
	@Autowired
	private ShapeBlueSubscriptionLifecycleHandler subscriptionLifecycleHandler;
	@Autowired
	private ShapeBlueUsageCollector tenantBasedUsageCollector;
	@Autowired
	private ShapeBlueEventCollector eventCollector;
	@Autowired
	private ShapeBlueViewResolver viewResolver;

	public void setServiceInstanceConfiguration(
			ServiceInstanceConfiguration serviceInstanceConfiguration) {
		this.serviceInstanceConfiguration = serviceInstanceConfiguration;
		metadataRegistry.initialize(this);
		accountLifecycleHandler.initialize(this);
		userLifecycleHandler.initialize(this);
		subscriptionLifecycleHandler.initialize(this);
		eventCollector.initialize(this);
		tenantBasedUsageCollector.initialize(this);
		viewResolver.initialize(this);
	}

	@Override
	public ServiceInstanceConfiguration getServiceInstanceConfiguration() {
		return serviceInstanceConfiguration;
	}

	@Override
	public MetadataRegistry getMetadataRegistry() {
		return metadataRegistry;
	}

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;

	}

	@Override
	public AccountLifecycleHandler getAccountLifeCycleHandler() {
		return accountLifecycleHandler;
	}

	@Override
	public UserLifecycleHandler getUserLifeCycleHandler() {
		return userLifecycleHandler;
	}

	@Override
	public SubscriptionLifecycleHandler getSubscriptionLifecycleHandler() {
		return subscriptionLifecycleHandler;
	}

	@Override
	public boolean getStatus() {
		return true;
	}

	@Override
	public TenantBasedUsageCollector getUsageCollector() {
		return tenantBasedUsageCollector;
	}

	@Override
	public EventCollector getEventCollector() {
		return eventCollector;
	}

	@Override
	public ViewResolver getViewResolver() {
		return viewResolver;
	}

	@Override
	public String getServiceInstanceUUID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServiceUUID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public APIHandler getAPIHandler(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> getAPIHandles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SsoHandler getSSOHandler() {
		// TODO Auto-generated method stub
		return null;
	}

}
