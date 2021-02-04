package org.dal.cat.report.page.home;

import org.dal.cat.report.ReportPage;
import org.unidal.web.mvc.view.BaseJspViewer;

public class JspViewer extends BaseJspViewer<ReportPage, Action, Context, org.dal.cat.report.page.home.Model> {
    @Override
    protected String getJspFilePath(Context ctx, org.dal.cat.report.page.home.Model model) {
        Action action = model.getAction();

        switch (action) {
            case VIEW:
            case CHECKPOINT:
            case THREAD_DUMP:
                return JspFile.VIEW.getPath();
        }

        throw new RuntimeException("Unknown action: " + action);
    }
}
