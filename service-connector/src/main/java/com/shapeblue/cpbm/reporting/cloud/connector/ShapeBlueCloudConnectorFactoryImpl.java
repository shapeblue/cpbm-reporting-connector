package com.shapeblue.cpbm.reporting.cloud.connector;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.citrix.cpbm.platform.spi.CloudConnector;
import com.citrix.cpbm.platform.spi.CloudConnectorFactory;

import com.citrix.cpbm.platform.admin.service.utils.ServiceInstanceConfiguration;

public class ShapeBlueCloudConnectorFactoryImpl implements
  CloudConnectorFactory<CloudConnector>, ApplicationContextAware {

	private static final Logger logger = Logger
      .getLogger(ShapeBlueCloudConnectorFactoryImpl.class);

  ApplicationContext applicationContext;

  public void setApplicationContext(ApplicationContext applicationContext)
      throws BeansException {
    this.applicationContext = applicationContext;
  }

  @Override
  public CloudConnector initialize(
      ServiceInstanceConfiguration serviceInstanceConfiguration) {
		logger.debug("Initializing CloudConnectorFactory ...");
		CloudConnector cloudConnector = (CloudConnector) 
		    applicationContext.getBean("cloudConnector");
    cloudConnector
        .setServiceInstanceConfiguration(serviceInstanceConfiguration);
    return cloudConnector;
  }

  @Override
  public com.citrix.cpbm.platform.spi.CloudConnectorFactory.ConnectorType getConnectorType() {
    return CloudConnectorFactory.ConnectorType.CLOUD;
  }

}