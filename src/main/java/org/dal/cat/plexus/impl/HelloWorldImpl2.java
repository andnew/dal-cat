package org.dal.cat.plexus.impl;

import org.dal.cat.plexus.HelloWorld;

public class HelloWorldImpl2  implements HelloWorld {

    @Override
    public String hello(String name) {
        return "22===hello "+ name +" , 你好！！！";
    }
}
