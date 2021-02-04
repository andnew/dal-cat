package org.dal.cat.plexus;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.unidal.lookup.ComponentTestCase;

import java.util.List;


public class TestPlexusContainerMain extends ComponentTestCase {

    protected Logger log = Logger.getLogger(TestPlexusContainerMain.class);

    @Test
    public void testHelloWorld() {

        try {
            HelloWorld service = lookup(HelloWorld.class, "helloworld");
            String msg = service.hello("aaaa");
            log.info(msg);

            HelloWorld service2 = lookup(HelloWorld.class, "helloworld2");
            msg = service2.hello("bbb");
            log.info("222===" + msg);

            List<HelloWorld> helloWorld3 = lookupList(HelloWorld.class);
            for (HelloWorld world : helloWorld3) {
                msg = world.hello("---" + System.currentTimeMillis());
                log.info(msg);
            }

        } catch (Exception e) {
            log.error("从容器中查找服务不存在失败!", e);
        }
    }


    @Test
    public void testHelloWorld3() {
        HelloWorld world = lookup(HelloWorld.class, "hello-world-3");
        String msg = world.hello("yong.wang");
        log.info(msg);
    }
}
