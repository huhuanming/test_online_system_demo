package com.thoughtworks.gaia.system.endpoint;

import com.thoughtworks.gaia.product.entity.Product;
import com.thoughtworks.gaia.system.service.SystemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by hwwei on 16/11/4.
 */
@Component
@Path("system")
@Api(value = "system", description = "Access to system resource")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SystemEndpoint {

    @Autowired
    private SystemService systemService;


    @Path("/")
    @ApiOperation(value = "Get status by id", response = boolean.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Get product successfully"),
            @ApiResponse(code = 404, message = "No product matches given id")
    })
    @GET
    public Response getStatus() {
        boolean st = systemService.getOpenStatus();
        return Response.ok(st).build();
    }

    @Path("/{status}")
    @ApiOperation(value = "update status ", response = Product.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Get product successfully"),
            @ApiResponse(code = 404, message = "No product matches given id")
    })
    @PUT
    public Response updateStatus(@PathParam("status") boolean status) {
        systemService.updateOpenStatus(status);
        return Response.noContent().build();
    }
}
