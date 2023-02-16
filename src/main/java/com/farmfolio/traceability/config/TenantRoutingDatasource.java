package com.farmfolio.traceability.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.util.StringUtils;

public class TenantRoutingDatasource extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		if (!StringUtils.hasLength(com.farmfolio.traceability.config.TenantContext.getCurrentTenant())) {
			return "default";
		}
		return com.farmfolio.traceability.config.TenantContext.getCurrentTenant();
	}

}
