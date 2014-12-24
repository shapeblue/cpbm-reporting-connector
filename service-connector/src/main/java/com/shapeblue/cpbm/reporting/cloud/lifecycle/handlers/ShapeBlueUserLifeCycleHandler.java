package com.shapeblue.cpbm.reporting.cloud.lifecycle.handlers;

import java.util.Map;

import com.citrix.cpbm.platform.spi.Connector;
import com.citrix.cpbm.platform.spi.UserLifecycleHandler;
import com.vmops.model.User;

/**
 * The Cloud Service's User Lifecycle Handler.
 */
public class ShapeBlueUserLifeCycleHandler implements UserLifecycleHandler {

  public void initialize(Connector service) {

  }

  @Override
  public void register(User user) {
    // TODO Auto-generated method stub

  }

  @Override
  public void lock(User user) {
    // TODO Auto-generated method stub

  }

  @Override
  public void disable(User user) {
    // TODO Auto-generated method stub

  }

  @Override
  public void unlock(User user) {
    // TODO Auto-generated method stub

  }

  @Override
  public void enable(User user) {
    // TODO Auto-generated method stub

  }

  @Override
  public void terminate(User user) {
    // TODO Auto-generated method stub

  }

  @Override
  public void update(User user) {
    // TODO Auto-generated method stub

  }

  @Override
  public Map<String, String> getControls(User user) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setControls(User arg0, Map<String, String> arg1) {
    // TODO Auto-generated method stub

  }

}
