package org.dal.cat.report.page.home;

import org.dal.cat.report.ReportPage;
import org.unidal.lookup.annotation.Inject;
import org.unidal.web.mvc.PageHandler;
import org.unidal.web.mvc.annotation.InboundActionMeta;
import org.unidal.web.mvc.annotation.OutboundActionMeta;
import org.unidal.web.mvc.annotation.PayloadMeta;

import javax.servlet.ServletException;
import java.io.IOException;


public class Handler implements PageHandler<Context> {

    @Inject
    private JspViewer m_jspViewer;

    @Override
    @PayloadMeta(Payload.class)
    @InboundActionMeta(name = "home")
    public void handleInbound(Context ctx) throws ServletException, IOException {
    }

    @Override
    @OutboundActionMeta(name = "home")
    public void handleOutbound(Context ctx) throws ServletException, IOException {
        Model model = new Model(ctx);
        Payload payload = ctx.getPayload();

        switch (payload.getAction()) {
            case THREAD_DUMP:
                System.out.println("Home-----Handler---[thread-dump]");
                break;
            case VIEW:
                System.out.println("---VIEW");
                break;
            case CHECKPOINT:
                if ("127.0.0.1".equals(ctx.getHttpServletRequest().getRemoteAddr())) {
                    System.out.println("Home-----Handler---[CHECKPOINT]");
                }
                break;
            default:
                break;
        }

        model.setAction(payload.getAction());
        model.setPage(ReportPage.HOME);
        model.setDomain(payload.getDomain());
        model.setDate(payload.getDate());
        m_jspViewer.view(ctx, model);
    }
}
