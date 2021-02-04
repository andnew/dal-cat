package org.dal.cat.server;

import org.junit.Before;
import org.junit.Test;
import org.unidal.lookup.logging.Logger;
import org.unidal.lookup.ComponentTestCase;

public class TestProjectDao extends ComponentTestCase {

    protected Logger log;

    @Before
    public void log() {
        log = getContainer().getLogger();
    }


    @Test
    public void findAllProject() {
        log.info("测试日志");



    }
}
