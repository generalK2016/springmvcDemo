package com.smart.webservice.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by shayuan on 2017/1/1.
 */
@WebService
public interface HelloWorldService {
    @WebMethod
    public String sayHello(@WebParam(name="username") String username);
}
