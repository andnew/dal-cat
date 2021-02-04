package org.dal.cat.server;

import org.eclipse.jetty.servlets.GzipFilter;
import org.eclipse.jetty.webapp.WebAppContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.unidal.test.jetty.JettyServer;

import javax.servlet.DispatcherType;
import java.util.EnumSet;

@RunWith(JUnit4.class)
public class ServerRun extends JettyServer {

        public static void main(String[] args) throws Exception {
            ServerRun server = new ServerRun();
            server.startServer();
            server.startWebApp();
            server.stopServer();
        }

        @Override
        protected String getContextPath() {
            return "/cat";
        }

        @Override
        protected int getServerPort() {
            return 2281;
        }

        @Override
        protected void postConfigure(WebAppContext context) {
            context.addFilter(GzipFilter.class, "/*", EnumSet.of(DispatcherType.REQUEST));
        }

        @Test
        public void startWebApp() throws Exception {
            // open the page in the default browser
            display("/cat/r");
            waitForAnyKey();
        }
    }
