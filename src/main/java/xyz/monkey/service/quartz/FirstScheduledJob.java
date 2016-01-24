package xyz.monkey.service.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by mx on 16/1/24.
 */
public class FirstScheduledJob extends QuartzJobBean {


	private AuotherBean auotherBean;

	@Override
	protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
		System.out.println("I am FirstScheduledJob");
		this.auotherBean.printAnotherMessage();
	}

	public void setAuotherBean(AuotherBean auotherBean) {
		this.auotherBean = auotherBean;
	}

	public AuotherBean getAuotherBean() {
		return auotherBean;
	}
}
