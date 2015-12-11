package com.marflo.basic.docker.backend.webservice;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

public interface CounterService {
    Response getCounters();
    Response addCounter();
    Response getCounter(@PathParam("counterId") Long counterId);
    Response incrementCounter(@PathParam("counterId") Long counterId);
}
