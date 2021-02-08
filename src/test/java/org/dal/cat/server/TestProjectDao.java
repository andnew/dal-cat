package org.dal.cat.server;

import org.dal.cat.core.dal.Project;
import org.dal.cat.service.ProjectService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.unidal.lookup.logging.Logger;
import org.unidal.lookup.ComponentTestCase;
import org.unidal.lookup.logging.LoggerManager;

import java.util.Date;
import java.util.List;

public class TestProjectDao extends ComponentTestCase {

    protected Logger log;

    @Before
    public void log() {
        try {
            LoggerManager lgm = getContainer().lookup(LoggerManager.class);
            log = lgm.getLoggerForComponent("loger");
//            log = getContainer().getLogger();
        }catch (Exception ex){
            log.error("加载log出错!");
        }
    }


    @Test
    public void findAllProject() {
        log.info("测试日志");
        try {
            ProjectService service = lookup(ProjectService.class);

            List<Project> list = service.findAll();

            if (null == list || 0 == list.size()) {
                log.warn("没有项目");
            } else {
                for (Project proj : list) {
                    log.info(proj.toString());
                }
            }

        } catch (Exception ex) {
            log.error("发生异常", ex);
        }
    }

    @Test
    public void insert() {
        log.info("insert test case");

        try {
            ProjectService service = lookup(ProjectService.class);

            Project project = new Project();
            project.setBu("bu===").setCmdbDomain("1===")
                    .setCmdbProductline("111==")
                    .setLevel(1222)
                    .setDomain("22222")
                    .setEmail("aaa@a.com")
                    .setCreationDate(new Date());


            boolean bool = service.insert(project);
            Assert.assertEquals(true, bool);

        } catch (Exception ex) {
            log.error("插入失败", ex);
        }

    }
}
