package org.dal.cat.report.page.home;

import org.dal.cat.mvc.AbstractReportPayload;
import org.dal.cat.report.ReportPage;
import org.unidal.web.mvc.ActionContext;
import org.unidal.web.mvc.payload.annotation.FieldMeta;

public class Payload extends AbstractReportPayload<Action, ReportPage> {
	@FieldMeta("op")
	private Action m_action;

	@FieldMeta("docName")
	private String m_docName = "user";

	@FieldMeta("subDocName")
	private String m_subDocName;

	public Payload() {
		super(ReportPage.HOME);
	}

	@Override
	public Action getAction() {
		return m_action;
	}

	public String getDocName() {
		return m_docName;
	}

	public String getSubDocName() {
		return m_subDocName;
	}

	public void setAction(String action) {
		m_action = Action.getByName(action, Action.VIEW);
	}

	public void setDocName(String docName) {
		m_docName = docName;
	}

	@Override
	public void setPage(String page) {
		m_page = ReportPage.getByName(page, ReportPage.HOME);
	}

	public void setSubDocName(String subDocName) {
		m_subDocName = subDocName;
	}
	
	@Override
	public void validate(ActionContext<?> ctx) {
		if (m_action == null) {
			m_action = Action.VIEW;
		}
	}
}
