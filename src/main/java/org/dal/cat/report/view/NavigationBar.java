package org.dal.cat.report.view;

import org.dal.cat.report.ReportPage;
import org.unidal.web.mvc.Page;

public class NavigationBar {
	public Page[] getSystemPages() {
		return new Page[] {
		};
	}

	public Page[] getVisiblePages() {
		return new Page[] {

		ReportPage.WEB,

		ReportPage.APP,

		ReportPage.METRIC,

		ReportPage.TRANSACTION,

		ReportPage.EVENT,

		ReportPage.PROBLEM,

		ReportPage.HEARTBEAT,

		ReportPage.CROSS,

		ReportPage.CACHE,

		ReportPage.DEPENDENCY,

		ReportPage.STATE,

		ReportPage.LOGVIEW

		};
	}
}
