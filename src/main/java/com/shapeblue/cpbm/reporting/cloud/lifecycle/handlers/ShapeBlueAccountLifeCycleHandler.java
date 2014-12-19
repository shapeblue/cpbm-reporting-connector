package com.shapeblue.cpbm.reporting.cloud.lifecycle.handlers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.citrix.cpbm.platform.spi.AccountLifecycleHandler;
import com.citrix.cpbm.platform.spi.Connector;
import com.vmops.model.Tenant;
import com.vmops.service.TenantService;

/**
 * The Cloud Service's Account LifeCycle Handler.
 */
public class ShapeBlueAccountLifeCycleHandler implements AccountLifecycleHandler {

  @Autowired
  TenantService tenantService;

  public void initialize(Connector service) {

  }

  @Override
  public void restrict(Tenant tenant) {
    // TODO Auto-generated method stub

  }

  @Override
  public void suspend(Tenant tenant) {
    // TODO Auto-generated method stub

  }

  @Override
  public void reactivate(Tenant tenant) {
    // TODO Auto-generated method stub

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
    // TODO Auto-generated method stub

  }

  @Override
  public Map<String, String> getControls(Tenant tenant) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setControls(Tenant arg0, Map<String, String> arg1) {
    // TODO Auto-generated method stub

  }

}
