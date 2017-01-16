package com.smart.webservice.service;


import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by shayuan on 2017/1/1.
 */
@WebService(endpointInterface="com.smart.webservice.service.HelloWorldService",serviceName="helloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService{
    public String sayHello(@WebParam(name="userName") String userName) {
        System.out.println("user");
        System.out.println("HelloWorldServiceImpl.sayHello("+userName+")");
        return "Hello "+userName;
    }
}
