package com.shapeblue.cpbm.reporting.cloud.views;

import java.util.List;

import com.citrix.cpbm.platform.spi.Connector;
import com.citrix.cpbm.platform.spi.View;
import com.citrix.cpbm.platform.spi.ViewResolver;
import com.vmops.model.Subscription;
import com.vmops.model.Tenant;
import com.vmops.model.User;

/**
 * The Cloud Service's View Resolver.
 */
public class ShapeBlueViewResolver implements ViewResolver {

	public void initialize(Connector service) {

	}

	@Override
	public List<View> listResourceViews(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public View resolveSubscriptionDetailView(Subscription subscription) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public View resolveAccountSettingsView(Tenant tenant) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public View resolveUserSettingsView(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public View getConsoleView(User arg0) {
		// TODO Auto-generated method stub
		return null;
	}
}
