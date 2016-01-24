package xyz.monkey.service.quartz;

import org.springframework.stereotype.Component;

/**
 * Created by mx on 16/1/24.
 */
@Component("myBean")
public class Mybean {
	
	public void printsMessage() {
		System.out.println("I am MyBean. I am called by MethodInvokingJobDetailFactoryBean using SimpleTriggerFactoryBean");
	}
}
