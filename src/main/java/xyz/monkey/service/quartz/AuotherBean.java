package xyz.monkey.service.quartz;

import org.springframework.stereotype.Component;

/**
 * Created by mx on 16/1/24.
 */
@Component("auotherBean")
public class AuotherBean {

	public void printAnotherMessage() {
		System.out.println("I am AnotherBean. I am called by Quartz jobBean using CronTriggerFactoryBean");
	}
}
