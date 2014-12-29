package com.shapeblue.cpbm.reporting.cloud.lifecycle.handlers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.citrix.cpbm.platform.spi.AccountLifecycleHandler;
import com.citrix.cpbm.platform.spi.Connector;
import com.vmops.model.Tenant;
import com.vmops.service.TenantService;
import org.apache.log4j.Logger;

/**
 * The Cloud Service's Account LifeCycle Handler.
 */
public class ShapeBlueAccountLifeCycleHandler implements AccountLifecycleHandler {

  @Autowired
  TenantService tenantService;

  private Map<Tenant, Map<String, String>> tenantControls = new HashMap<Tenant, Map<String, String>>();

  private Logger logger = Logger.getLogger(ShapeBlueAccountLifeCycleHandler.class);

  public void initialize(Connector service) {
  }

  @Override
  public void restrict(Tenant tenant) {
      logger.info("Restrict/lock cloud account for tenant: " + tenant.getName());
  }

  @Override
  public void suspend(Tenant tenant) {
      logger.info("Suspend cloud account for tenant: " + tenant.getName());
  }

  @Override
  public void reactivate(Tenant tenant) {
     logger.info("Reactivate cloud account for tenant: " + tenant.getName());
  }

  @Override
  public void terminate(Tenant tenant) {
    // TODO Auto-generated method stub

  }

  @Override
  public void update(Tenant tenant) {
    // TODO Auto-generated method stub

  }

  @Override
  public void register(Tenant tenant, Map<String, String> accountConfig) {
  }

  @Override
  public Map<String, String> getControls(Tenant tenant) {
      Map controls = tenantControls.get(tenant);
      if (controls == null)
          return new HashMap<String, String>();
      return controls;
  }

  @Override
  public void setControls(Tenant tenant, Map<String, String> controls) {
      tenantControls.put(tenant, controls);
  }

}
