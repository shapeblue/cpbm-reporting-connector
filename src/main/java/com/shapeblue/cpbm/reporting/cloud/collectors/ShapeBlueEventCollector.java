package com.shapeblue.cpbm.reporting.cloud.collectors;

import java.util.Date;

import com.citrix.cpbm.platform.exception.EventCollectionException;
import com.citrix.cpbm.platform.model.EventResultSet;
import com.citrix.cpbm.platform.spi.Connector;
import com.citrix.cpbm.platform.spi.EventCollector;

/**
 * This Cloud Service's Event Collection Service.
 */
public class ShapeBlueEventCollector implements EventCollector {

	public void initialize(Connector service) {
    // TODO Auto-generated method stub
	}

	@Override
	public EventResultSet listEvents(String startMarker, Date endDate)
			throws EventCollectionException {
		// TODO Auto-generated method stub
		return null;
	}

}
