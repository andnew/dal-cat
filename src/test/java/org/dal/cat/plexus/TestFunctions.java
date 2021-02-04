package org.dal.cat.plexus;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.unidal.formatter.Formatter;
import org.unidal.lookup.ComponentTestCase;

import java.util.Date;

public class TestFunctions extends ComponentTestCase {

    protected Logger log = Logger.getLogger(TestFunctions.class);

    @Test
    public void dateFormat() {
        log.info("data format =====");
        try {
            Formatter fmt = getContainer().lookup(Formatter.class,"java.util.Date");
            String datestr = fmt.format("yyyy-MM-dd", new Date());
            log.info(datestr);
        } catch (Exception ex) {
            log.info("加载模块失败!", ex);
        }
    }
}
