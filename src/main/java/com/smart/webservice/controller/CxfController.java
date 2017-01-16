package com.smart.webservice.controller;

import com.smart.domain.User;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by shayuan on 2017/1/1.
 */
@Component("restSample")
public class CxfController {
    @GET
    @Path("/order")
    @Produces({ MediaType.APPLICATION_JSON })
    public User findUser() {
        User user = new User();
        user.setUserName("zouhao");
        user.setPassword("zouhao");
        return user;
    }


}
