package com.shapeblue.cpbm.reporting.cloud.collectors;

import java.util.Date;

import com.citrix.cpbm.platform.exception.UsageCollectionException;
import com.citrix.cpbm.platform.model.UsageResultSet;
import com.citrix.cpbm.platform.spi.Connector;
import com.citrix.cpbm.platform.spi.TenantBasedUsageCollector;
import com.vmops.model.Tenant;

/**
 * The Cloud Service's Usage Collection Service.
 */
public class ShapeBlueUsageCollector extends TenantBasedUsageCollector {

	public void initialize(Connector service) {
    // TODO Auto-generated method stub
	}

	@Override
  public UsageResultSet collect(Tenant tenant, String startMarker, Date endDate)
			throws UsageCollectionException {
		// TODO Auto-generated method stub
		return null;
	}

  @Override
  public UsageResultSet inventory(Tenant tenant, String startMarker, Date billingPeriodStartDate)
      throws UsageCollectionException {
    // TODO Auto-generated method stub
    return null;
  }
}
