package com.marflo.basic.docker.backend.webservice;

import com.marflo.basic.docker.backend.model.exception.ErrorMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Stateless
@Path("/counter-service/counters")
public class CounterServiceImpl implements CounterService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CounterServiceImpl.class);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCounters() {
        try {
            LOGGER.info("getCounters");
            return Response.ok().build();
        } catch (Exception e) {
            LOGGER.error("Unexpected exception, error: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ErrorMessage.UNEXPECTED_EXCEPTION.getDescription()).build();
        }
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addCounter() {
        try {
            LOGGER.info("addCounter");
            return Response.ok().build();
        } catch (Exception e) {
            LOGGER.error("Unexpected exception, error: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ErrorMessage.UNEXPECTED_EXCEPTION.getDescription()).build();
        }
    }

    @GET
    @Path("{counterId}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getCounter(@PathParam("counterId") Long counterId) {
        try {
            LOGGER.info("getCounter");
            return Response.ok().build();
        } catch (Exception e) {
            LOGGER.error("Unexpected exception, error: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ErrorMessage.UNEXPECTED_EXCEPTION.getDescription()).build();
        }
    }

    @POST
    @Path("{counterId}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response incrementCounter(@PathParam("counterId") Long counterId) {
        try {
            LOGGER.info("incrementCounter");
            return Response.ok().build();
        } catch (Exception e) {
            LOGGER.error("Unexpected exception, error: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ErrorMessage.UNEXPECTED_EXCEPTION.getDescription()).build();
        }
    }
}
