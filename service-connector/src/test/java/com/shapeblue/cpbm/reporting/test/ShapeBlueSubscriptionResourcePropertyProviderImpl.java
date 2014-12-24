package com.shapeblue.cpbm.reporting.test;

import java.util.Random;

import com.citrix.cpbm.test.provider.SubscriptionResourcePropertyProvider;

public class ShapeBlueSubscriptionResourcePropertyProviderImpl implements SubscriptionResourcePropertyProvider {

 
  public String getPropertyVal(String resourceType, String propertyKey) {
    Random random = new Random();

    if (resourceType.equals("sample-type")) {
      if (propertyKey.equals("sample-name")) {
        String.valueOf("d" + random.nextInt(1000));
      }
    } else if (resourceType.equals("sample-type-2")) {
      if (propertyKey.equals("sample-name-2")) {
        String.valueOf("f" + random.nextInt(1000));
      } else if (propertyKey.equals("sample-type-3")) {
        String.valueOf("sample-name-3 : " + random.nextInt(1000));
      }
    }

    return null;
  }

}
