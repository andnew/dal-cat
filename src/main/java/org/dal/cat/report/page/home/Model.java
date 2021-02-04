package org.dal.cat.report.page.home;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.dal.cat.mvc.AbstractReportModel;
import org.dal.cat.report.ReportPage;
import org.dal.cat.report.ReportPage;

public class Model extends AbstractReportModel<Action, ReportPage, Context> {
	private String m_content;

	private String m_domain;

	public Model(Context ctx) {
		super(ctx);
	}

	public String getContent() {
		return m_content;
	}

	@Override
	public Action getDefaultAction() {
		return Action.VIEW;
	}

	@Override
	public String getDomain() {
		return m_domain;
	}

	@Override
	public Collection<String> getDomains() {
		return Collections.emptySet();
	}

	@Override
	public List<String> getIps() {
		return new ArrayList<String>();
	}

	public void setContent(String content) {
		m_content = content;
	}

	public void setDomain(String domain) {
		m_domain = domain;
	}
}
