package org.dal.cat.plexus;

public interface HelloWorld {

    static final String ROLE = HelloWorld.class.getName();

    /**
     * 向某人打招呼
     * @param name 某人
     * @return
     */
    String hello(String name);
}
