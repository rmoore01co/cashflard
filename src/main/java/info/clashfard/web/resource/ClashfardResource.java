/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 */
package info.clashfard.web.resource;

import info.clashfard.domain.Clashfard;
import info.clashfard.service.ClashfardService;
import info.clashfard.web.dto.ClashfardDto;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/clashfard")
@Consumes({MediaType.TEXT_PLAIN, MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
public class ClashfardResource {

	@Autowired
	private ClashfardService clashfardService;

	@GET
	@Produces({"application/xml", "application/json"})
	public Clashfard getOne(@PathParam("id") final Long id) {
		return clashfardService.find(id);
	}

	@POST
	@Consumes({"application/xml", "application/json"})
	public void save(final ClashfardDto dto) {
		// TODO: implement - for now, this is only here to test out jaxrs-to-raml plugin
	}
}
