package com.shapeblue.cpbm.reporting.cloud.lifecycle.handlers;

import com.citrix.cpbm.platform.spi.Connector;
import com.citrix.cpbm.platform.spi.SubscriptionLifecycleHandler;
import com.vmops.model.Subscription;

/**
 * The Cloud Service's Subscription Lifecycle Handler.
 */
public class ShapeBlueSubscriptionLifecycleHandler implements
		SubscriptionLifecycleHandler {
	public void initialize(Connector service) {

	}

	@Override
	public void provision(Subscription subscription) {
		// TODO Auto-generated method stub

	}

	@Override
	public void destroy(Subscription subscription) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean validate(Subscription subscription) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update(Subscription subscription) {
		// TODO Auto-generated method stub

	}

}
