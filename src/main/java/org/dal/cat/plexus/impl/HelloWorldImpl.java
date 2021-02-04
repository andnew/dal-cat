package org.dal.cat.plexus.impl;

import org.dal.cat.plexus.HelloWorld;
import org.unidal.lookup.extension.Initializable;
import org.unidal.lookup.extension.InitializationException;

public class HelloWorldImpl implements HelloWorld, Initializable {

    @Override
    public String hello(String name) {
        return "hello "+ name +" , 你好！！！";
    }

    @Override
    public void initialize() throws InitializationException {
        System.out.println("---------");
    }
}
