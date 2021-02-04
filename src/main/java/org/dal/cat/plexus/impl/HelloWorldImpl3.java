package org.dal.cat.plexus.impl;

import org.dal.cat.plexus.HelloWorld;
import org.unidal.lookup.annotation.Named;

@Named(type = HelloWorld.class, value = "hello-world-3")
public class HelloWorldImpl3 implements HelloWorld {


    @Override
    public String hello(String name) {


        return "hello-world-3," + name;
    }
}
