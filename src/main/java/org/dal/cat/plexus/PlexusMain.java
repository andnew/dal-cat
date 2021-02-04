package org.dal.cat.plexus;

import org.unidal.lookup.ContainerLoader;
import org.unidal.lookup.PlexusContainer;


public class PlexusMain {

    public static void test(){
        try {
            PlexusContainer container = ContainerLoader.getDefaultContainer();
            System.setProperty("devMode", "true");
            HelloWorld helloWorld = container.lookup(HelloWorld.class);
            System.out.println(helloWorld.hello("sss"));

        } catch (Exception ex) {
            System.out.println("获取对象失败\n"+ex);
        }
    }

    public static void main(String[] args) {
        test();
    }
}
