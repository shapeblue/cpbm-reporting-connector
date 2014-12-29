package com.shapeblue.cpbm.reporting.cloud.lifecycle.handlers;

import java.util.HashMap;
import java.util.Map;

import com.citrix.cpbm.platform.spi.Connector;
import com.citrix.cpbm.platform.spi.UserLifecycleHandler;
import com.vmops.model.User;

/**
 * The Cloud Service's User Lifecycle Handler.
 */
public class ShapeBlueUserLifeCycleHandler implements UserLifecycleHandler {

  private Map<User, Map<String, String>> userControls = new HashMap<User, Map<String, String>>();

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
      Map controls = userControls.get(user);
      if (controls == null)
        return new HashMap<String, String>();
      return controls;
  }

  @Override
  public void setControls(User user, Map<String, String> controls) {
      userControls.put(user, controls);
  }

}
