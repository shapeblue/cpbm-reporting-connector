package com.shapeblue.cpbm.reporting.cloud.views;

import java.util.ArrayList;
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
		View returnView = new View("Reports", "http://google.com", View.ViewMode.IFRAME);
		List views = new ArrayList();
		views.add(returnView);
		return views;
	}

	@Override
	public View resolveSubscriptionDetailView(Subscription subscription) {
		View returnView = new View("USERSETTINGSVIEW", "/portal/portal/connector_resources/shapebluereports_fragment/reports?" + "tenant=" + subscription.getTenant().getUuid(), View.ViewMode.IFRAME);
		return returnView;
	}

	@Override
	public View resolveAccountSettingsView(Tenant tenant) {
		View returnView = new View("USERSETTINGSVIEW", "/portal/portal/connector_resources/shapebluereports_fragment/reports?" + "tenant=" + tenant.getUuid(), View.ViewMode.IFRAME);
		return returnView;
	}

	@Override
	public View resolveUserSettingsView(User user) {
		View returnView = new View("USERSETTINGSVIEW", "/portal/portal/connector_resources/shapebluereports_fragment/reports?" + "tenant=" + user.getTenant().getUuid(), View.ViewMode.IFRAME);
		return returnView;
	}

	@Override
	public View getConsoleView(User arg0) {
		// TODO Auto-generated method stub
		return null;
	}
}
